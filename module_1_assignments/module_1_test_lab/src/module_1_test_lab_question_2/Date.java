package module_1_test_lab_question_2;

public class Date {
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date() {
		day=0;
		month=0;
		year=0;
		
		
	}
	public Date(Date obj) {
		this.day=obj.day;
		this.month=obj.month;
		this.year=obj.year;
		
	}
	
	public void input() {
		
		
	}
	
	public void print() {
	    System.out.println(toString());
	}
	@Override
	public String toString() {
	    return day + "/" + month+"/"+year;
	}

}
