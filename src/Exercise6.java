import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("%-10s: ", "Wage");
		double wage = s.nextDouble();
		System.out.printf("%-10s: ", "Monday");
		double a = s.nextInt();
		System.out.printf("%-10s: ", "Tuesday");
		double b = s.nextInt();
		System.out.printf("%-10s: ", "Wednesday");
		double c = s.nextInt();
		System.out.printf("%-10s: ", "Thursday");
		double d = s.nextInt();
		System.out.printf("%-10s: ", "Friday");
		double e = s.nextInt();
		System.out.printf("%-10s: ", "Saturday");
		double f = s.nextInt();
		System.out.printf("%-10s: ", "Sunday");
		double g = s.nextInt();
		
		double total = wage*(a+b+c+d+e+f+g);
		
		System.out.printf("%n$%,.2f.", total);
		
		
	}
	
}
