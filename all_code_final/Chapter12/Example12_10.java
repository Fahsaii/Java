import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example12_10 extends JFrame implements ActionListener {
    private ImageIcon image1, image2, image3;   
    private JPanel guiPanel, graphicsPanel;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6;
    private int imageNo;
   
    public Example12_10() {
        super("Example 12-10 Draw image on JPanel");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        guiPanel = new JPanel();
        guiPanel.setPreferredSize(new Dimension(500, 50));
        guiPanel.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        btn1 = new JButton("Oval");
        btn1.addActionListener(this);
        guiPanel.add(btn1);
        btn2 = new JButton("Rectangle");
        btn2.addActionListener(this);
        guiPanel.add(btn2);
        btn3 = new JButton("Logo");
        btn3.addActionListener(this);
        guiPanel.add(btn3);
        btn4 = new JButton("Cat");
        btn4.addActionListener(this);
        guiPanel.add(btn4);
        btn5 = new JButton("Boat");
        btn5.addActionListener(this);        
        guiPanel.add(btn5);
        btn6 = new JButton("Clear");
        btn6.addActionListener(this);
        guiPanel.add(btn6);
        graphicsPanel = new JPanel();
        graphicsPanel.setPreferredSize(new Dimension(320, 240));
        graphicsPanel.setBorder(BorderFactory.createLineBorder(Color.RED,3));
        c.add(guiPanel);
        c.add(graphicsPanel);
        loadImage();        
        setSize(640, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void loadImage() {
        image1 = new ImageIcon( this.getClass().getResource("images/logo.png" ));
        image2 = new ImageIcon( this.getClass().getResource("images/cat.png" ));
        image3 = new ImageIcon( this.getClass().getResource("images/boat.png" ));       
    }
    public void paint( Graphics g ) {      
        super.paint( g );
        Graphics g1 = graphicsPanel.getGraphics();
        if ( imageNo == 1) {
            g1.setColor(Color.GREEN); 
            g1.fillOval(100, 60, 120, 120);
        }
        else if ( imageNo == 2) {
            g1.setColor(Color.BLUE);  
            g1.fillRect(100, 60, 120, 120);
        }
        else if ( imageNo == 3)
            image1.paintIcon( graphicsPanel , g1, 0, 0 );
        else if ( imageNo == 4)
            image2.paintIcon( graphicsPanel , g1, 0, 0 );
        else if ( imageNo == 5)
            image3.paintIcon( graphicsPanel , g1, 0, 0 );
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1)  imageNo = 1;
        else if (e.getSource() == btn2)  imageNo = 2;
        else if (e.getSource() == btn3)  imageNo = 3;
        else if (e.getSource() == btn4)  imageNo = 4;
        else if (e.getSource() == btn5)  imageNo = 5;
        else imageNo = 0;
        repaint();
    }     
    public static void main(String[] args) {
        new Example12_10();
    }
}
