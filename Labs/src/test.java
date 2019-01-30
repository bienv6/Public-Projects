import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class test {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		
		
			boolean[] isPassing = new boolean[100];
			double[] scores = {65, 70, 80, 42, 50};
		
		processPass(isPassing, scores, scores.length);
		System.out.println("Scores \t\t Passing?\n_____________________");
		
		for (int a=0; a<scores.length; a++) {
			System.out.print(scores[a] + "\t\t" + isPassing[a] + "\n");
		}
		

	}
	
	static int count = 0;
	
	public static int getData(double scores[]) throws FileNotFoundException {
		
		
		
		Scanner readFile = new Scanner(new File("lab1data.txt"));
		
		while(readFile.hasNextInt()) {
			for (int i=0; i<scores.length; i++) {		
					scores[i]= 
					count++;
				}
			}
		readFile.close();
		return count;
		
	}
	
	public static void processPass(boolean[] isPassing, double[] scores, int	length) {
		
		for (int a = 0; a < length; a++) {
				if(scores[a] >= 60) {
						isPassing[a]= true;
					}
		}
	}

}
