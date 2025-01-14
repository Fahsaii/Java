import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example09_02 implements ActionListener{
    JFrame window;
    Container c;
    JPanel panelForm, panelCommand, panelResult;
    JLabel labelId, labelName,labelSurname;
    JTextField idField, nameField,surnameField;
    JButton btnSave, btnClear;
    JTextArea textArea;
    JScrollPane scroll; 
    Font myFont = new Font("Consolas", Font.BOLD, 18);
        public Example09_02() {
        window = new JFrame("Program Student Info");
        c = window.getContentPane();
        c.setLayout(new FlowLayout());
        createPanelForm();
        createPanelCommand();
        createPanelResult();
        window.setSize( 400, 350);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createPanelForm() {
        panelForm = new JPanel();
        panelForm.setPreferredSize(new Dimension( 350, 100));
        panelForm.setLayout(new FlowLayout());
        labelId = new JLabel("     Enter your Id : ");
        labelId.setFont( myFont);
        panelForm.add( labelId);
        idField = new JTextField(10);
        idField.setFont( myFont);
        panelForm.add( idField);

        labelName = new JLabel("   Enter your Name : ");
        labelName.setFont( myFont);
        panelForm.add( labelName);
        nameField = new JTextField(10);
        nameField.setFont( myFont);
        panelForm.add( nameField);

        labelSurname = new JLabel("Enter your Surname : ");
        labelSurname.setFont( myFont);
        panelForm.add( labelSurname);
        surnameField = new JTextField(10);
        surnameField.setFont( myFont);
        panelForm.add( surnameField);
        window.add( panelForm);
    }

    private void createPanelCommand() { 
        panelCommand = new JPanel();
        panelCommand.setPreferredSize(new Dimension( 300, 40));
        panelCommand.setLayout(new FlowLayout());

        btnSave = new JButton(" Save ");
        btnSave.setFont( myFont);
        btnSave.addActionListener(this);
        panelCommand.add( btnSave);
        btnClear = new JButton(" Clear ");
        btnClear.setFont( myFont);
        btnClear.addActionListener(this);
        panelCommand.add( btnClear);
        window.add( panelCommand);
    }
    
    private void createPanelResult() {
        panelResult = new JPanel();
        panelResult.setPreferredSize(new Dimension( 350, 150));
        panelResult.setLayout(new FlowLayout());
        textArea = new JTextArea(6, 30 );
        textArea.setFont( myFont);
        scroll = new JScrollPane( textArea );
        panelResult.add( scroll);
        window.add( panelResult);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // write satement to save data in TextArea 
    }
    public static void main(String [] args) {
        new Example09_02();
    }
}
