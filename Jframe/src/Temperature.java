import java.awt.Color;

import javax.swing.*;
import java.awt.event.*;
public class Temperature extends JFrame{
	
	//Private Level Attributes
	private JPanel pnlConverter;
	private JLabel lblCelsiusPrompt;
	private JTextField txtCelsius;
	private JButton btnConvert;
	
	//constructor
	public Temperature() {	
	
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
	  pnlConverter.setBackground(Color.BLUE);
	 
	  //create a label
	  lblCelsiusPrompt = new JLabel("Enter Celsius temperature");
	  
	  //create a text box
	  txtCelsius = new JTextField(5); // number is the width of the text field (5 chars)
	 
	  // create a button
	  btnConvert = new JButton("Convert");// sets button text to "Convert"
	  
	  //add action listener to the button
	  btnConvert.addActionListener(new btnController());
	  
	  //add objects to the panel
	  pnlConverter.add(lblCelsiusPrompt);
	  pnlConverter.add(txtCelsius);
	  pnlConverter.add(btnConvert); 

	 }
 
 private class btnController implements ActionListener {

	 // override the 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double celciusTemp;
		double fahrenheit = 0.0;
		String tempString = txtCelsius.getText();
		celciusTemp = Double.parseDouble(tempString);
		fahrenheit = 9.0 / 5.0 * celciusTemp + 32;
		
		JOptionPane.showMessageDialog(null, "Converted " + celciusTemp + " Celsius to " + fahrenheit +" Fahrenheit");
		
	}
	 
 }
 
 
	public static void main(String[] args) {
		
		Temperature temp1 = new Temperature();
		
	}

	// set the text in the title bar
}
