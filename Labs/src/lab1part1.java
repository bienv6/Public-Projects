import java.io.File;
import java.io.IOException;
import java.util.*;

public class lab1part1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean [] isPassing = new boolean [100];
		double [] scores = new double [100];
		int length = getData(scores);
		
		getData(scores);		
		processPass(isPassing, scores, length);
		
		System.out.print("Scores \t\t Passing?\n---------------------------\n");
			for (int i =0; i<length; i++){
					System.out.println(scores[i]+ "\t\t" + isPassing[i]);
		}

	}
	
	public static int getData(double [] scores) throws IOException {
			int numOfRecords=0;
			File myFile = new File("lab1data.txt");
			Scanner  outFile = new Scanner(myFile);
			
			while(outFile.hasNext()) {
				scores[numOfRecords]=outFile.nextDouble();
			    numOfRecords++;
				}
		return numOfRecords;	
	}
	
	public static void processPass(boolean isPassing [], double scores [], int length) {
		for(int i =0; i<length; i++) {
			if(scores[i]>=60) {
				isPassing[i]=true;
				}
			else {isPassing[i]=false;}
		}
	}
	
	
}
