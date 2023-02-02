package userinterface;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.*;

public class MyFirstPage extends Frame implements ActionListener{ 
    //extends = inherit Frame functions, variables, etc..
    //to pop up a window
    
    private Label labelWelcome = new Label("Welcome to my first page");
    private TextField tfInput = new TextField("Hello", 15);
    private TextArea taMsg = new TextArea("Hello", 3, 30);
    private Button bExit = new Button("Exit");
    private Button bClick = new Button("Click");
    private List lst = new List(4, false); 
        //2nd argument states if multiple is possible
    private Choice c = new Choice();
    private Dialog d = new Dialog(this, "", true);
    private FlowLayout f = new FlowLayout(); // side by side
    private BorderLayout b = new BorderLayout(); // has 5 postions, nsew
    private GridLayout g = new GridLayout(); //table form
    
    public MyFirstPage(){
        add(labelWelcome); //Frame.add()
        add(tfInput);
        add(taMsg);
        add(bExit);
        
        lst.add("Apple");
        lst.add("Banana");
        lst.add("Kiwi");
        lst.add("Orange");
        add(lst);
        
        c.add("Red");
        c.add("Green");
        c.add("Blue");
        
        add(c);
        add(bClick);
        
        bExit.addActionListener(this); //need to add 'implements ActionListener'
        
        tfInput.setEditable(false); //user cannot edit/add to the text field
        setSize(300, 500); //Frame.setSize() etc
        setLocationRelativeTo(null); //center window on screen
        //setLocation(100,100); //set window location on the screen
        setTitle("My First Page");
        setLayout(f);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bExit){
            System.exit(0);
        }else if(e.getSource() == bClick){
            //d.show();
            MySecondPage sp = new MySecondPage();
    }
}
