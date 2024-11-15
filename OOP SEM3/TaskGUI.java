/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskgui;

/**
 *
 * @author User
 */
import java.awt.*;
import javax.swing.*;

public class TaskGUI extends JFrame {
    private JTextArea Textbox1;
    private JButton fancyButton;
    private JLabel label1;
    private JTextField textField1 = new JTextField(20);
    private JRadioButton b1, b2, b3;
    private JCheckBox cb1, cb2;
    private JButton plainButton = new JButton("Submit Order");

    public TaskGUI() {
        super("Testing JLabel");
        setLayout(null); // No layout manager

        // Load and resize the image
        Icon Ayam = new ImageIcon(new ImageIcon("src/TaskGUI/Ayam.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        fancyButton = new JButton("", Ayam);
        fancyButton.setBounds(20, 20, 150, 150); // Position at the top
        add(fancyButton);

        // Initialize and set the JTextArea
        Textbox1 = new JTextArea("Ayam Viral");
        Textbox1.setBounds(20, 180, 250, 50); // Adjust position
        Textbox1.setBackground(Color.DARK_GRAY);
        Textbox1.setForeground(Color.red);
        Textbox1.setFont(new Font("Bookman", Font.ITALIC, 16));
        add(Textbox1);

        // Initialize and set the JLabel
        label1 = new JLabel("Nama");
        label1.setBounds(20, 240, 100, 30); // Adjust position
        add(label1);

        // Initialize and set the JTextField
        textField1.setBounds(20, 270, 200, 30); // Adjust position
        add(textField1);

        // Initialize radio buttons
        b1 = new JRadioButton("Ayam Spicy");
        b2 = new JRadioButton("Ayam Original");
        b3 = new JRadioButton("Ayam Mix");

        // Set positions for radio buttons
        b1.setBounds(20, 310, 200, 30);
        b2.setBounds(20, 340, 200, 30);
        b3.setBounds(20, 370, 200, 30);

        add(b1);
        add(b2);
        add(b3);

        // Initialize checkboxes
        cb1 = new JCheckBox("Set");
        cb2 = new JCheckBox("Ala Carte");

        // Set positions for checkboxes
        cb1.setBounds(20, 400, 100, 30);
        cb2.setBounds(20, 430, 100, 30);
        
        add(cb1);
        add(cb2);

        // Set position for the plain button
        plainButton.setBounds(20, 460, 150, 30);
        add(plainButton);

        // Set frame size and visibility
        setSize(300, 550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TaskGUI application = new TaskGUI();
    }
}

