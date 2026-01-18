package question2;
import java.util.InputMismatchException;
import java.util.Scanner;



public class GradeValidationAvg {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		double avg=0.0;
	try {
		System.out.println("Enter the number of students: ");
		n=sc.nextInt();
		if(n<=0) {
			System.out.println("There are no students!!");
		}
		else {
			int grade[]=new int[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter the grade for student "+i+ ": ");
				grade[i]=sc.nextInt();
					while(grade[i]<0 || grade[i]>100) {
					System.out.println("Invalid Grade try again");
					System.out.println("Enter the grade for student "+i+ ": ");
					grade[i]=sc.nextInt();
					}
				avg+=grade[i];
				}
			System.out.println("Average: "+ avg/n);
			
		
	}
	}
	catch(InputMismatchException e) {
		System.out.println("Input type mismatch! Please enter an Integer");
		
		
	}
	
	catch(Exception e) {
		System.out.println("Program ran into unexpected errors");
	}
	finally {
		sc.close();
		
	}
		

}
	
}