import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class Example13_03 extends JFrame implements ActionListener {
    private JTextField enterField;
    private JTextArea outputArea;
    // set up GUI
    public Example13_03()
    {
        super( "Testing class File" );
        enterField = new JTextField("Enter file or directory name here" );
        enterField.addActionListener( this );
        outputArea = new JTextArea();      
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.add( outputArea );
        Container container = getContentPane();
        container.add( enterField, BorderLayout.NORTH );
        container.add( scrollPane, BorderLayout.CENTER );
        setSize( 400, 400 );
        setVisible( true );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
    } // end constructor

	public void actionPerformed( ActionEvent actionEvent )
    {
        File name = new File( actionEvent.getActionCommand() );
        // if name exists, output information about it
        if ( name.exists() ) {
            outputArea.setText( name.getName() + " exists\n" + 
                (name.isFile() ? "is a file\n" : "is not a file\n" )+
                (name.isDirectory() ? "is a directory\n" : "is not a directory\n")+
                (name.isAbsolute() ? "is absolute path\n" : "is not absolute path\n")+
 		        "Last modified: " + name.lastModified() + "\nLength: " + 
                name.length() + "\nPath: " + name.getPath() + "\nAbsolute path: " + 
                name.getAbsolutePath() + "\nParent: " + name.getParent() 
            );
            // output information if name is a file
            if ( name.isFile() ) {
                // append contents of file to outputArea
                try {
                    BufferedReader input = new BufferedReader( new FileReader( name ) );
                    StringBuffer buffer = new StringBuffer();
                    String text;
                    outputArea.append( "\n\n" );
                    while ( ( text = input.readLine() ) != null ) 
                        buffer.append( text + "\n" );
                    outputArea.append( buffer.toString() );
                }
                // process file processing problems
                catch( IOException ioException ) {
                    JOptionPane.showMessageDialog( this, "FILE ERROR",
                        "FILE ERROR", JOptionPane.ERROR_MESSAGE );
                }
            } // end if
            // output directory listing
            else if ( name.isDirectory() ) {
                String directory[] = name.list();
                outputArea.append( "\n\nDirectory contents:\n");
                for ( int i = 0; i < directory.length; i++ )
                    outputArea.append( directory[ i ] + "\n" );
            }
        } // end outer if
        // not file or directory, output error message
        else {
            JOptionPane.showMessageDialog( this,
                actionEvent.getActionCommand() + " Does Not Exist",
                "ERROR", JOptionPane.ERROR_MESSAGE );
        }       
    } // end method actionPerformed

    public static void main( String args[] ) {
        new Example13_03();
    }
} // end class FileTest


