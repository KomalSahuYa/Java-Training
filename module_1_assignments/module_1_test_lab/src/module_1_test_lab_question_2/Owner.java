package module_1_test_lab_question_2;

public class Owner {
	private String name;
	private Date dob;
	private String nic;
	
	public Owner() {
		name="";
		dob=null;
		nic="";
				
	}

	public Owner(String name, Date dob, String nic) {
		super();
		this.name = name;
		this.dob = dob;
		this.nic = nic;
	}
	public Owner(Owner owner) {
		this.name=owner.name;
	}
	public void input() {
		
		
	}
	
	public void print() {
	    System.out.println(toString());
	}
	@Override
	public String toString() {
	    return name + " " + dob+" "+nic;
	}

}
