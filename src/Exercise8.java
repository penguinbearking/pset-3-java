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
		
		double totalPeople = students+teachers;

		double buses = totalPeople / (double)cap;
        double overflow = (cap * ((((totalPeople - .5) % cap) + .5) / (double)cap)) + .0000000001;


        buses += ((((cap - (int) overflow) % cap) / (double)cap));
        buses = (int)(buses);
        overflow = (int)(overflow);
		
		System.out.printf("%n%-20s: %d", "Buses required", (int)buses);
		System.out.printf("%n%-20s: %d", "Overflow passengers", (int)overflow);
		
	}

}
