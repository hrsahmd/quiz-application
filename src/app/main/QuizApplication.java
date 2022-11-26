package app.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class QuizApplication implements ActionListener {
	  JFrame frame = new JFrame();
	  JButton button = new JButton();

	  QuizApplication(){
	    prepareGUI();
	    buttonEvent();
	  }

	  public void prepareGUI(){
	    frame.setTitle("Quiz Application");
	    frame.getContentPane().setLayout(null);
	    frame.setVisible(true);
	    frame.setBounds(500,360,500,360);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JLabel question1 = new JLabel();
	    int questionNo = 0;
	    question1.setText("Question " + questionNo + " : Which one of the following is not a datatype?");

	    JRadioButton answers1 = new JRadioButton();
	    JRadioButton answers2 = new JRadioButton();
	    JRadioButton answers3 = new JRadioButton();
	    JRadioButton answers4 = new JRadioButton();
	    answers1.setText("Float");
	    answers2.setText("int");
	    answers3.setText("boolean");
	    answers4.setText("String");

	    question1.setBounds(30,40,450,20);
	    answers1.setBounds(50,80,100,20);
	    answers2.setBounds(50,110,100,20);
	    answers3.setBounds(50,140,100,20);
	    answers4.setBounds(50,170,100,20);

	    frame.add(question1);
	    frame.add(answers1);
	    frame.add(answers2);
	    frame.add(answers3);
	    frame.add(answers4);
	    
	    button.setText("Next");
	    button.setBounds(100,240,100,30);
	    frame.add(button);
	  }

	  public void buttonEvent(){
		  button.addActionListener(this);
	    
	  }

	  @Override
	  public void actionPerformed(ActionEvent e) {
	    frame.getContentPane().setBackground(Color.pink);
	  }  
}
