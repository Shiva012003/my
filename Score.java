
package quiz.pkg1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    Score(String name,int score){
         setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);*/
        
        JLabel heading = new JLabel("Thanku"+ name +"for playing quiz");
        heading.setBounds(100, 450, 50, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);
        
        JLabel c1 =new JLabel("your score " + score);
        c1.setBounds(350,200,300,30);
        c1.setFont(new Font("Tahoma",Font.PLAIN,26));
        c1.setBackground(Color.GREEN);
        add(c1);
        
        
         JButton submit = new JButton("playagain");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
    public static void main(String a[])
    {
        new Score("user",0);
    }
}
