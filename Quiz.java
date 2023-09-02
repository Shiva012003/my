
package quiz.pkg1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline,back1;
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Quiz(String username) {
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("C:\\Users.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);*/
        
        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
        questions[0][0] = "Which of the following is the correct syntax to add the header file in the C++ program?";
        questions[0][1] = "#include<userdefined>";
        questions[0][2] = "#include \"userdefined.h";
        questions[0][3] = "<include> \"userdefined.h\"";
        questions[0][4] = "Both A and B";

        questions[1][0] = "Which of the following is the correct syntax to print the message in C++ language?";
        questions[1][1] = "cout <<\"Hello world!\"";
        questions[1][2] = "Cout << Hello world! ";
        questions[1][3] = "Out <<\"Hello world!;";
        questions[1][4] = "None of the above";

        questions[2][0] = "in c++ the continer which allocates double the size is?";
        questions[2][1] = "vector";
        questions[2][2] = "map";
        questions[2][3] = "set";
        questions[2][4] = "none of the above";

        questions[3][0] = "Which of the following features must be supported by any programming language to become a pure object-oriented programming language?";
        questions[3][1] = "Encapsulation";
        questions[3][2] = "polymerphism";
        questions[3][3] = "inheritance";
        questions[3][4] = "all of the above";

        questions[4][0] = "whic language is more preferble for developing games?";
        questions[4][1] = "c++";
        questions[4][2] = "java";
        questions[4][3] = "c";
        questions[4][4] = "kotlin";

        questions[5][0] = "use of set container in c++?";
        questions[5][1] = "removes duplicates";
        questions[5][2] = "wont remove duplicates";
        questions[5][3] = "inserts the values ";
        questions[5][4] ="none of the above";

        questions[6][0] = "The programming language that has the ability to create new data types is called___.";
        questions[6][1] = "overloader";
        questions[6][2] = "encaupusulated";
        questions[6][3] = "reperhensible";
        questions[6][4] = "extensible";

        questions[7][0] = "Which of the following is the correct syntax to read the single character to console in the C++ language?";
        questions[7][1] = "Read ch()";
        questions[7][2] = "Getline ch()";
        questions[7][3] = "get(ch)";
        questions[7][4] = "scanf(ch)";

        questions[8][0] = "Which one of the following represents the tab";
        questions[8][1] = "\n";
        questions[8][2] = "\t";
        questions[8][3] = "\r";
        questions[8][4] = "none of the above";

        questions[9][0] = " Which of the following statements is correct about the formal parameters in C++?";
        questions[9][1] = "Parameters with which functions are called";
        questions[9][2] = "Parameters which are used in the definition of the function";
        questions[9][3] = "Variables other than passed parameters in a function";
        questions[9][4] = "Variables that are never used in the function";
        
        
        answers[0][1] = "Both A and B";
        answers[1][1] = "cout <<\"Hello world!\"";
        answers[2][1] = "vector";
        answers[3][1] = "all of the above";
        answers[4][1] = "c++";
        answers[5][1] = "removes duplicates";
        answers[6][1] = "extensible";
        answers[7][1] = "get(ch)";
        answers[8][1] = "\t";
        answers[9][1] = "Parameters with which functions are called";
      
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.blue);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.yellow);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.ORANGE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.GREEN);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.PINK);
        next.addActionListener(this);
        add(next);
        
        
        
             
       back1=new JButton("back");
       back1.setBounds(915,270,120,25);
       back1.setBackground(new Color(30,144,254));
       back1.setForeground(Color.PINK);
       back1.addActionListener(this);
       add(back1);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.darkGray);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.MAGENTA);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
        else if(ae.getSource()==back1){
            setVisible(false);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.BLACK);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new Quiz("User");
    }
}