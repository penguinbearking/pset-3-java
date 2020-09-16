import java.util.Scanner;

public class Exercise5 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("%-11s: ","Homework");
		double h1 = s.nextInt();
		System.out.printf("%-11s: ", "Homework 2");
		double h2 = s.nextInt();
		System.out.printf("%-11s: ", "Homework 3");
		double h3 = s.nextInt();
		System.out.printf("%-11s: ", "Quiz 1");
		double q1 = s.nextInt();
		System.out.printf("%-11s: ", "Quiz 2");
		double q2 = s.nextInt();
		System.out.printf("%-11s: ", "Test 1");
		double t1 = s.nextInt();
		
		double h = (h1+h2+h3)/3;
		double q = (q1+q2)/2;
		
		double g = (h*.15+q*.35+t1*.5);
				
		System.out.printf("%n%.2f%%.", g);
	}

}
