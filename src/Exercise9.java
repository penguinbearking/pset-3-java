import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.printf("%-9s: ", "Amount");
		double a = s.nextDouble();
		
		int q = (int) ((a-a%0.25)/0.25);
		a -= (q*0.25);
		int d = (int) ((a-a%0.10)/0.10);
		a -= (d*0.10);
		int n = (int) ((a-a%0.05)/0.05);
		a -= (n*0.05);
		int p = (int) (a*100);
		
		
		
		System.out.printf("%n%-9s: %d", "Quarters", q);
		System.out.printf("%n%-9s: %d", "Dimes", d);
		System.out.printf("%n%-9s: %d", "Nickels", n);
		System.out.printf("%n%-9s: %d", "Pennies", p);
		
		
		
	}
	
}
