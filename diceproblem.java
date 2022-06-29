package lab1;
import java.util.Random;
public class diceproblem {
	public static void main(String args[]) {
		
		Random rand= new Random();
		int upper=8;
		System.out.println("hi");
		for( int j=0; j<10; j++) {
			
		
		int i= rand.nextInt(upper);
		System.out.println(args[i]);
		
		}
	}

}
