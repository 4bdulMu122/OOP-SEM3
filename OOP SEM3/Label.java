/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package label;

/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Label extends JFrame {
    private JLabel label1,label2;
    private JTextField textField1 = new JTextField(10);
    private JButton plainButton = new JButton("Plain Button");
    private JButton fancyButton;
    private JButton button1, button2;
    private JTextField TextA;
    private JTextArea Textbox1;
    private JRadioButton b1, b2, b3;
    private JCheckBox cb1, cb2 ;
    private JComboBox Combobox;

    public Label(){
       super("testing JLabel");
       Container container = getContentPane();
       container.setLayout(new FlowLayout());
       label1 = new JLabel("Hai Rabbit");
      // label1.setToolTipText("this is label1");
       container.add(label1);
       setSize(10,70);
       setVisible(true);
       
       Icon rabbit = new ImageIcon("src/Label/rabbit.jpeg");
       label2 = new JLabel("Ye Saya", rabbit,SwingConstants.LEFT);
       label2.setToolTipText("This is an animated rabbit");
       container.add(label2);
       
       container.add(textField1);
       
       container.add(plainButton);
       
       Icon Abbas = new ImageIcon("src/Label/meow.jpeg");
       fancyButton = new JButton("Fancy Button", Abbas);
       container.add(fancyButton);
       
       Icon milo = new ImageIcon("src/Label/milo.gif");
       button1 = new JButton("Milo", milo);
       button2 = new JButton("Nescafe");
       button1.setSize(100,20); 
       button2.setSize(20,20);
       button1.setLocation(30,20);
       button2.setLocation(20,20);
       add(button1); 
       add(button2);

       TextA = new JTextField ("Key in here");
       TextA.setSize(100,20);
       TextA.setLocation(20,20);
       TextA.setBackground(Color.BLACK); 
       TextA.setForeground(Color.WHITE);
       TextA.setFont(new Font("Courier",Font.ITALIC,15));
       add(TextA);
       
       Textbox1 = new JTextArea ("Multiple line");
       Textbox1.setSize(100,200);
       Textbox1.setLocation(20,20);
       Textbox1.setBackground(Color.DARK_GRAY);
       Textbox1.setForeground(Color.PINK);
       Textbox1.setFont(new
       Font("Bookman",Font.TRUETYPE_FONT,16));
       add(Textbox1);
       
       ButtonGroup group1 = new ButtonGroup();
       b1 = new JRadioButton("Hagen Dazz");
       b2 = new JRadioButton("Basken Robin");
       b3 = new JRadioButton("Walls");
       b1.setBounds(20,20,200,50);
       b2.setBounds(20,70,200,50);
       b3.setBounds(20,110,200,50);
       container.add(b1);
       container.add(b2);
       container.add(b3);
       
       cb1 = new JCheckBox("C");
       cb2 = new JCheckBox("JAVA");
       cb1.setBounds(20,20,200,50);
       cb2.setBounds(20,70,200,50);
       add(cb1);
       add(cb2);
       
       String names[]= {"kuih.gif","kuih1.gif","kuih3.gif"};
       Combobox = new JComboBox(names);
       Combobox.setMaximumRowCount(3);
       Combobox.setBounds(50,50,100,20);
       add(Combobox);
    }
    public static void main(String[] args) {
        Label application = new Label();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

