import java.util.Scanner;

public class URI1011 {

	public static void main(String[] args) {
		double R, volumeOfSphere;
		
		Scanner sc = new Scanner(System.in);
		R = sc.nextDouble();
		
		volumeOfSphere = (3.14159 * R * R * R * 4/3);
		
		System.out.printf("VOLUME = %.3f%n", volumeOfSphere);
	}
}
