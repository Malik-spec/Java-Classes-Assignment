
public class Triangle {
	int side1 = 5;
	int side2 = 4;
	int side3 = 3;
	Triangle(){
		
	}
double area = 0.5* side2 * side3;
int perimeter =side1 + side2 + side3;


	public static void main(String[] args) {
		Triangle t = new Triangle();
		// The triangle is a right angled triangle so the area will be 0.5*base*height
		System.out.println("The Area of the triangle is: " +t.area);
		System.out.println("The Perimeter of the triangle is: " +t.perimeter);
		

	}

}
