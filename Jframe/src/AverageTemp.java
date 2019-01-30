import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.*;
import java.awt.event.*;

public class AverageTemp extends JFrame{
	private JPanel pnlConverter;
	private JLabel label;
	private JLabel label2;
	private JLabel label3;
	private JTextField field1;
	private JTextField field2;
	private JTextField field3;
	private JTextField ans;
	private JButton btnAvg;
	
	AverageTemp(){
		// set a text in title bar
		 setTitle("Temperature Converter");
		
		 //Give the window a size;
		 setSize(400,400);
		
		 //Close the window when the close button is clicked
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 
		 //Call buildPanel method
		 buildPanel();
		 
		 
		 //add panel Frame
		 this.add(pnlConverter);
		 
		 
		 //display the window
		 setVisible(true);
		 
		 
		 
		}
	
	 public void buildPanel() {
		 
		 //create instance of JPanel
		  pnlConverter = new JPanel();
		
		  //set background color of panel
		  pnlConverter.setBackground(Color.RED);
		 
		  //create labels for 3 values
		  label = new JLabel(" value 1 ");
		  label2 = new JLabel(" value 2");
		  label3 = new JLabel(" value 3");


		  
		  //create 3 text box fields for numbers
		  field1 = new JTextField("0", 5); // number is the width of the text field (5 chars)
		  
		  field2 = new JTextField("0", 5);
		  
		  field3 = new JTextField("0", 5);
		  
		  ans = new JTextField(5);
		  
		 
		  // create a button
		  btnAvg = new JButton("Caluclate AVG");// sets button text to "Convert"
		  
		  //add action listener to the button
		  btnAvg.addActionListener(new ActionListener() {
			 
			  @Override
				public void actionPerformed(ActionEvent e) {
				  double sum, fahrenheit;
				  sum = Double.parseDouble(field1.getText()) + Double.parseDouble(field2.getText()) + Double.parseDouble(field3.getText());
				  sum = sum/3;
				  fahrenheit = 9.0 / 5.0 * sum + 32;
				  ans.setText(Double.toString(fahrenheit));
				  
				 JOptionPane.showMessageDialog(null, " The average Temp in farenheit is " + fahrenheit);
			  }

			
		  });
		  
		  //add objects to the panel
		  pnlConverter.add(label);
		  pnlConverter.add(field1);
		 
		  pnlConverter.add(label2);
		  pnlConverter.add(field2);
		 
		  pnlConverter.add(label3);
		  pnlConverter.add(field3);
		  
		  pnlConverter.add(btnAvg); 
		  
		  pnlConverter.add(ans); 
		  

		 }
	 

	
		
	

public static void main(String[] args) {
	
	AverageTemp temp1 = new AverageTemp();
	
}

// set the text in the title bar
}



