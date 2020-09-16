import java.util.Scanner;

public class Exercise3 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Height : ");
		double h = s.nextDouble();
		System.out.print("Weight : ");
		double w = s.nextDouble();
		
		h *= 25.4;
		w *= 25.4;
		
		double a = h*w;
		
		System.out.printf("%n%,.2f square millimeters.", a);
		
	}

}
