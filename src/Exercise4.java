import java.util.Scanner;

public class Exercise4 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Height : ");
		double h = s.nextDouble();
		System.out.print("Width : ");
		double w = s.nextDouble();
		
		h *= 2.54;
		w *= 2.54;
		
		double p = 2*(w+h);
		
		System.out.printf("%n%,.2f centimeters.", p);
		
	}

}
