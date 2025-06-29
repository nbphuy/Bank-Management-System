package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {

        setTitle("AUTOMATE TELLER MACHINE (ATM)");

        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("assets/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM"); // Greetings message
        text.setFont(new Font("Roboto Mono", Font.BOLD, 20));
        text.setBounds(200, 40, 400, 40);
        add(text);

        // Label "Card number"
        JLabel cardno = new JLabel("Card No:"); // Greetings message
        cardno.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cardno.setBounds(120, 150, 150, 40);
        add(cardno);

        // Card number field
        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        cardTextField.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(cardTextField);

        // Label "Pin"
        JLabel pin = new JLabel("Pin"); // Greetings message
        pin.setFont(new Font("Times New Roman", Font.BOLD, 20));
        pin.setBounds(120, 220, 250, 40);
        add(pin);

        // Pin passcode field
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 250, 30);
        add(pinTextField);


        // BUTTON "SIGN IN"
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        // BUTTON "CLEAR"
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (e.getSource() == login) {

        } else if (e.getSource() == signup) {

        }
    }

    public static void main(String[] args) {
        new Login();

    }
}
