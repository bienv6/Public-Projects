import java.util.Scanner;

public class TestApp extends Temperature{
	
	//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
			//this is a separate Program that you'll lmake by extending the temperature class. 
//			_______________________________________________

		
			// string to hold the user input
			private String userInput;

			 
			//constructor that calls the super class constructor
			public TestApp(double temp){
			 super(temp);
			}

			/*method that will take user input and return temp in celsius
			public double AppTest(){
			scanner to read the users input
			Scanner scanner = new Scanner( System.in );
			 
			 
			 loop that will repeat if user enters anything other than a number
			do{
			 
			 
			System.out.print( "Enter number in Fahrenheit:  " );  
			parse the user's String into a double number
			 
			 userInput = scanner.next();

			  }
			while(  userInput.isNan());

			
			return  getCelsius();

			}
			
			*/

			public static void main(String arg[]){

			TestApp tester1 = new TestApp(45);

			System.out.println(tester1.getFahrenheit());
			System.out.println(tester1.getKelvin());
			System.out.println(tester1.getCelsius());



	}


	
}
