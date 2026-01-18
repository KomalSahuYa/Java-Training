//Q5. Next Date Calculator
//Requirements
//
//Input day, month, year from the user.
//Validate the date.
//Compute the next day’s date manually.
//Display both dates.
//Sample Output
//
//Enter day: 31
//Enter month: 12
//Enter year: 2022
//Today: 31/12/2022
//Next Date: 1/1/2023
//Validations Required
//
//Correct days for each month
//Leap year logic:
//(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
//Month-end transitions
//Year-end transition


package question5;
import java.util.Scanner;


public class nextdate {
	int day,month,year;
	public nextdate() {
		day=0;
		month=0;
		year=0;
	};
	
	public void nextdatevalid(int d,int m,int y) {
		
	}
	public void inputdate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		day=sc.nextInt();
		System.out.println("Enter the month");
		month=sc.nextInt();
		System.out.println("Enter the year");
		year=sc.nextInt();
		sc.close();
		
		
		
	}
	
	public boolean isLeapYear(int y) {
		return (y%4==0 && y%100 !=0) || (y%400 ==0);
	}
	
	public int getDaysinMonth(int m,int y) {
		if(m==2) {
			if(isLeapYear(y)) {
				return 29;
			}
			else {
				return 28;
			}
		}
		if(m==4 || m==6 || m==9 || m==11 ) {
			return 30;
		}
		return 31;
	}
	
	public boolean validDate() {
		if(year<=0) return false;
		if(month<1 || month>12) return false;
		if(day<1 || day>getDaysinMonth(month,year)) return false;
		
		return true;
	}
	public void printDate() {
		System.out.println(day+"/"+month+"/"+year);
	}
	
	public void calculate() {
		day++;
		if(day > getDaysinMonth(month,year)) {
			day=1;
			month++;
			if(month>12) {
				month=1;
				year++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		nextdate d = new nextdate();   

	    d.inputdate();                 

	    if(d.validDate()) {            
	        System.out.print("Today: ");
	        d.printDate();

	        d.calculate();             

	        System.out.print("Next Date: ");
	        d.printDate();
	    }
	    else {
	        System.out.println("Invalid Date Entered");
	    }
	}
		
	}

