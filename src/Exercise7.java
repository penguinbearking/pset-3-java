import java.util.Scanner;

public class Exercise7 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("%-8s: ", "Salary");
		double salary = s.nextDouble();
		System.out.printf("%-8s: ", "401(k)");
		double k401 = s.nextDouble();
		System.out.printf("%-8s: ", "Federal");
		double federal = s.nextDouble();
		System.out.printf("%-8s: ", "State");
		double state = s.nextDouble();

		double paycheck = (salary * (1-k401/100) * (1-(state+federal)/100))/24;
		
		System.out.printf("%n$%,.2f.", paycheck);
	}

}