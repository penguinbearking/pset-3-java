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
		
		int totalPeople = students+teachers;

		int buses = (totalPeople+cap-1)/cap;
		int overflow = totalPeople%cap;
		
		System.out.printf("%n%-20s: %d", "Buses required", buses);
		System.out.printf("%n%-20s: %d", "Overflow passengers", overflow);
		
	}

}
