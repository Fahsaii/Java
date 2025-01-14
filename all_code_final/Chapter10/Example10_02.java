import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example10_02 extends JFrame implements ActionListener {   
    Student std[];
    Subject sub[];
    String studentStr[], subjectStr[];
    Container container;
    JComboBox stdCombo, subCombo;
    JLabel stdLabel, subLabel;
    JButton addstdBtn, addsubBtn, saveBtn, clearBtn, cancleBtn;
    JTextField stdText;
    JTextArea subTextArea;
    JScrollPane subScroll;
    Register reg;
    int count = 0;
    public Example10_02() {
        super("Program Register ");
        container = getContentPane();
        container.setLayout(new FlowLayout());
        initStudent();
        initSubject();
        initGui();
        reg = new Register(new Student(), 5);
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void initStudent() {
        std = new Student[3];
        studentStr = new String[3];
        std[0] = new Student("6006021690010","AAAAAA","BBBBBBBBBBB");
        std[1] = new Student("6006021690036","DDDDDD","GGGGGGGGGG");
        std[2] = new Student("6006021690058","HHHHHH","KKKKKKKKKKK");
        for(int n = 0; n < std.length ; n++)
            studentStr[n] = std[n].toString();
    }
    public void initSubject() {
        sub = new Subject[5];
        subjectStr = new String[5];
        sub[0] = new Subject("060243103","Computer Programming", 3);
        sub[1] = new Subject("060243208","Data Structure", 3);
        sub[2] = new Subject("060243209","Database System", 3);
        sub[3] = new Subject("060243210","Data Communication", 3);
        sub[4] = new Subject("060243104","Object-oriented Programming", 3);
        for(int n = 0; n < sub.length ; n++)
            subjectStr[n] = sub[n].toString();
    }
    public void initGui() {
        stdLabel = new JLabel("Select Student : ");
        container.add(stdLabel);
        stdCombo = new JComboBox( studentStr );
        stdCombo.setMaximumRowCount(3);
        container.add(stdCombo);
        addstdBtn = new JButton("Add Student");
        addstdBtn.addActionListener(this);
        container.add(addstdBtn);

        stdText = new JTextField(40);
        stdText.setEditable(false);
        container.add(stdText);
        subLabel = new JLabel("Select Subject : ");
        container.add(subLabel);
        subCombo = new JComboBox( subjectStr ); 
        subCombo.setMaximumRowCount(5);
        container.add(subCombo);
        addsubBtn = new JButton("Add Subject");
        addsubBtn.setEnabled(false);
        addsubBtn.addActionListener(this);
        container.add(addsubBtn);
        subTextArea = new JTextArea(6,40);
        subTextArea.setEditable(false);        
        subScroll = new JScrollPane(subTextArea);
        container.add(subScroll);

        saveBtn = new JButton(" Save ");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(this);
        container.add(saveBtn);
        cancleBtn = new JButton(" Cancle ");
        cancleBtn.setEnabled(false);
        cancleBtn.addActionListener(this);
        container.add(cancleBtn);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == addstdBtn) {
            int n = stdCombo.getSelectedIndex();
            stdText.setText(std[n].toString());
            reg.setStudent(std[n]);
            addstdBtn.setEnabled(false);
            addsubBtn.setEnabled(true);
            saveBtn.setEnabled(true);
            cancleBtn.setEnabled(true);
        }
        else if (event.getSource() == addsubBtn) {
            int n = subCombo.getSelectedIndex();
            subTextArea.append(sub[n].toString()+"\n");
            reg.setSubject(sub[n], count);
            count++;
            if (count == 5 ) addsubBtn.setEnabled(false);
        }
        else if (event.getSource() == saveBtn) {
            String output="";
            output = "Student :" + reg.getStudent();
            output +=  "\nSubject:\n";
            for(int n = 0 ; n < count; n++) 
                output += reg.getSubject(n) + "\n";
            JOptionPane.showMessageDialog(this, output,
                "Registration Data",JOptionPane.INFORMATION_MESSAGE);
            resetBtn();
            count = 0;
        }
        else if (event.getSource() == cancleBtn) {
            stdText.setText("");
            subTextArea.setText("");
            count = 0;
            resetBtn(); 
        }
    }

    public void resetBtn() {
        addstdBtn.setEnabled(true);
        addsubBtn.setEnabled(false);
        saveBtn.setEnabled(false);
        cancleBtn.setEnabled(false);
        stdText.setText("");
        subTextArea.setText("");        
    }
    
    public static void main(String [] args ) {
        new Example10_02();
    } 
}


