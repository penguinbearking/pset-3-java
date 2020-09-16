import java.util.Scanner;

public class Exercise8 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("%-9s: ", "Students");
		int students = s.nextInt();
		System.out.printf("%-9s: ", "Teachers");
		int teachers = s.nextInt();
		System.out.printf("%-9s: ", "Capacity");
		int cap = s.nextInt();

		int buses = (students+teachers)/cap + ((students+teachers)%cap != 0);
		int overflow = (int) ((students+teachers)%cap);
		
		System.out.printf("%n%-20s: %d", "Buses required", buses);
		System.out.printf("%n%-20s: %d", "Overflow passengers", overflow);
		
	}

}
