import java.util.Scanner;

public class Oopslinecomp {

	static double lengthCal() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the value of x= ");
		int x1 = sc.nextInt();
		System.out.println(" Enter the value of y= ");
		int y1 = sc.nextInt();
		System.out.println(" Enter the value of x= ");
		int x2 = sc.nextInt();
		System.out.println(" Enter the value of x= ");
		int y2 = sc.nextInt();
		sc.close();
		float Length = (float) Math.sqrt(((x2 - x1) ^ 2) + ((y2 - y1) ^ 2));
		System.out.println(Length);
		return Length;
	}

	public static void main(String[] args) {
		System.out.println("line comparision .");
		lengthCal();

	}

}
