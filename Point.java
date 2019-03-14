/*
Represents a point.
*/

public class Point {
	private double xcor;
	private double ycor;
	private double adjoinedLimit; 
	
	//Constructors
	//Constructs a point that has a default location.
    public Point(){
        xcor = 0.5;
        ycor = -(Math.sqrt(3)/2.0);
    }
	//Constructs a point that has a location given by the user.
	public Point(double xcor, double ycor){
		this.xcor = xcor;
		this.ycor = ycor;
		
	}
	//Constructs a point with respect to a given point.
	public Point(Point relativePoint, double xcorOffset, double ycorOffset){
		xcor = relativePoint.xcor + xcorOffset;
		ycor = relativePoint.ycor + ycorOffset;		
	}
	
	//toString method
	
	public String toString(){
		return ("(" + xcor + ", " + ycor + ")");
	}
	
	//Equals Method
	
	public boolean equals(Point otherPoint){
		return ((xcor == otherPoint.xcor)&&(ycor == otherPoint.ycor));
	}
	
	//Getters and Setters
	
	public void setAdjoinedLimit(double adjoinedLimit){
		this.adjoinedLimit = adjoinedLimit;
	}
	
	public double getAdjoinedLimit(){
		return adjoinedLimit; 
		
	}
	
	//Methods 
	
	public boolean adjoins( Point other) {
        return ((Math.abs(other.xcor - xcor) < adjoinedLimit) && (Math.abs(other.ycor - ycor)< adjoinedLimit));
    }
	

	
	
}