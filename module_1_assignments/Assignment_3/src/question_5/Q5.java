package question_5;

class InvalidCountryException extends RuntimeException{
	public InvalidCountryException(String message) {
		super(message);
	}
}

public class Q5 {
	static void registerUser(String userName, String userCountry) {
		if(!userCountry.equals("India")) {
			throw new InvalidCountryException("Only Indian National can register");
		}
		System.out.println("User registration done successfully");
	}
	
	public static void main(String[] args) {
		String name = "Komal";
		String countryName = "India";
		registerUser(name, countryName);
		
		String name2 = "Sara";
		String country2 = "USA";
		registerUser(name2, country2);
	}
}