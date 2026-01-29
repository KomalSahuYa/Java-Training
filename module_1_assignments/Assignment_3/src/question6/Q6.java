package question6;

class InvalidAgeException extends RuntimeException{
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class Q6 {
	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Wrong arguments, need name and age");
			return;
		}
		
		String name = args[0];
		int age;
		
		try {
			age = Integer.parseInt(args[1]);
			
			if(age < 18 || age >= 60) {
				throw new InvalidAgeException("InvalidAgeException: Age must be b/w 18 and 60");
			}
			
			System.out.println("Name: "+ name + " Age: " + age);
		} catch (NumberFormatException e) {
			System.out.println("age must be a number");
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
