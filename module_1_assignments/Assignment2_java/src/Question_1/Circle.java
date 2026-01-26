//Q1. Implement UML for Circle Class & Test It
//Requirements
//Using the provided UML (circle class diagram), implement:
//fields
//constructors
//methods (getters/setters or described methods)
//Create a test class that:
//creates Circle objects
//displays radius, area, and circumference
//tests multiple input values
//Notes
//Use Math.PI for calculations.
//Validate radius must be positive.

package Question_1;

class Circle {
	private double radius;
	private String color;
	
	Circle(){
		radius=1.0;
		color="red";
	}
	Circle(double r){
		setRadius(r);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		if (r <= 0) {
	        throw new IllegalArgumentException(
	            "Radius must be a positive number"
	        );
	    }
		radius=r;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	
	
	

}

