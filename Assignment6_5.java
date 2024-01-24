import java.util.*;
public class Assignment6_5 {
	
	public static double area(int n, Double side) {
		return (n*(side*side))/(4*Math.tan(Math.PI/n));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of sides(n)");
		int n = sc.nextInt();
		System.out.println("Enter the length of the sides");
		double side = sc.nextDouble();
		
		System.out.println("The area of the polygon is: "+area(n, side));
	}

}
