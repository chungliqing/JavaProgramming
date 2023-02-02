
package userinterface;

import java.awt.*;

public class MySecondPage extends Frame{
    private FlowLayout f = new FlowLayout(); // side by side
    private BorderLayout b = new BorderLayout(); // has 5 postions, nsew
    private GridLayout g = new GridLayout(2, 2, 10 , 10); //table form
    private Button b1 = new Button("Button 1");
    private Button b2 = new Button("Button 2");
    private Button b3 = new Button("Button 3");
    private Button b4 = new Button("Button 4");
    private Panel northPane = new Panel();
    private Panel southPane = new Panel();
    private TextArea ta = new TextArea();
    
    public MySecondPage(){
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setSize(400,500);
        setLayout(g);
        setVisible(true);
        
        /* BorderLayout
        setSize(400,500);
        setLayout(b);
        
        add("East", b1);
        add("South", b2);
        add("West", b3);
        add("North", b4);
        add("Center", b5);
        setVisible(true);
        
        */
        
        /*
        northPanel.add(ta);
        
        southPanel.add("East", b1);
        southPanel.add("South", b2);
        southPanel.add("West", b3);
        southPanel.add("North", b4);
        southPanel.add("Center", b5);
        southPanel.a
        
        add("North", northPanel);
        add("south", southPanel);
        
        
        
        */
        
    }
    
}
