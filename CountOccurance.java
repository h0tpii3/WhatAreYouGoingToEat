import java.util.*;
public class CountOccurance {
	
	
	public static void main(String[] args) {
		int count= 0;
		
		Scanner scanner= new Scanner(System.in);
		String toFind= args[0];
		String findIn= scanner.nextLine();
		
		while(findIn.contains(toFind)) {
			findIn=findIn.substring(findIn.indexOf(toFind)+2);
			count++;
		}
		
		System.out.println(count);
	

	}

}
