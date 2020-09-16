import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("%-11s: ", "Fahrenheit");
		double f = s.nextDouble();
		
		double c = (f-32)*5/9;
		double k = c+273.15;
		
		System.out.printf("%n%-11s: %,.2f", "Celsius", c);
		System.out.printf("%n%-11s: %,.2f", "Kelvin", k);
		
	}
	
}
