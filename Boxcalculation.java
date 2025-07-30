package day2;

public class Boxcalculation {
     public static void main(String[] args) {
	     Box box = new Box(15, 12, 6);

	     double volume = box.getVolume();
	     System.out.println("The volume of the box is: " + volume);
	 }
	}


class Box {
	double width;
	double height;
	double depth;
	
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
 }

	double getVolume() {
		return width * height * depth;
 }
    
}
