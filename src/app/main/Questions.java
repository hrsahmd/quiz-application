package app.main;

import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Questions {
	
	  public void setQuestion(int id, JLabel label, JRadioButton answer1, JRadioButton answer2, JRadioButton answer3, JRadioButton answer4) {
		  
		  int questionId = id;
		  
		  switch (questionId) {
		  	case 1:
			  label.setText(id + ". Which one among these is not a datatype?");
			  answer1.setText("Float");
			  answer2.setText("int");
			  answer3.setText("boolean");
			  answer4.setText("char");
			  break;
		  	case 2:
		  		label.setText(id + ". Which class is available to all the class automatically?");
				  answer1.setText("Swing");
				  answer2.setText("Applet");
				  answer3.setText("Object");
				  answer4.setText("ActionEvent");
		  		break;
		  	case 3:
		  		label.setText(id + ". Which package is directly available to our class without importing it?");
				  answer1.setText("Swing");
				  answer2.setText("Applet");
				  answer3.setText("Net");
				  answer4.setText("lang");
		  		break;
		  	case 4:
		  		label.setText(id + ". String class is defined in which package?");
				  answer1.setText("lang");
				  answer2.setText("Swing");
				  answer3.setText("Applet");
				  answer4.setText("awt");
		  		break;
		  	case 5:
		  		label.setText(id + ". Which institute is best for Java coaching?");
				  answer1.setText("Buchalka");
				  answer2.setText("ZTM");
				  answer3.setText("Guru99");
				  answer4.setText("TutorialsPoint");
		  		break;
		  	case 6:
		  		label.setText(id + ". Which one among these is not a keyword?");
				  answer1.setText("Class");
				  answer2.setText("int");
				  answer3.setText("get");
				  answer4.setText("if");
		  		break;
		  	case 7:
		  		label.setText(id + ". Which one among these is not a class?");
				  answer1.setText("Swing");
				  answer2.setText("actionPerformed");
				  answer3.setText("ActionEvent");
				  answer4.setText("Button");
		  		break;
		  	case 8:
		  		label.setText(id + ". Which one among these is not a function of Object class?");
				  answer1.setText("toString");
				  answer2.setText("finalize");
				  answer3.setText("equals");
				  answer4.setText("getDocumentBase");
		  		break;
		  	case 9:
		  		label.setText(id + ". Which function is not present in Applet class?");
				  answer1.setText("init");
				  answer2.setText("main");
				  answer3.setText("start");
				  answer4.setText("destroy");
		  		break;
		  	case 10:
		  		label.setText(id + ". Which one among these is not a valid component?");
				  answer1.setText("JButton");
				  answer2.setText("JList");
				  answer3.setText("JButtonGroup");
				  answer4.setText("JTextArea");
		  		break;
		  }
		  
	  }
	  

	  public boolean checkResults(int questionId, JRadioButton answer1, JRadioButton answer2, JRadioButton answer3, JRadioButton answer4) {
		  switch (questionId) {

		  	case 1:
		  		return (answer1.isSelected());
		  		
		  	case 2:
		  		return (answer3.isSelected());
		  		
		  	case 3:
		  		return (answer4.isSelected());
		  		
		  	case 4:
		  		return (answer1.isSelected());
		  		
		  	case 5:
		  		return (answer1.isSelected());
		  		
		  	case 6:
		  		return (answer3.isSelected());
		  		
		  	case 7:
		  		return (answer2.isSelected());
		  		
		  	case 8:
		  		return (answer4.isSelected());
		  		
		  	case 9:
		  		return (answer2.isSelected());
		  		
		  	case 10:
		  		return (answer3.isSelected());		  		  
		  }
		  
		  return false;
	  }

}
