import java.util.Scanner;

public class URI1040 {

	public static void main(String[] args) {
		float A, B, C, D, E, average;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		D = sc.nextFloat();
		
		average = ((A*2) + (B*3) + (C*4)+ (D*1)) / 10;
		
		if (average >= 7.0) {
			System.out.println("Aluno aprovado.");
		}
		else if (average < 5.0) {
			System.out.println("Aluno reprovado.");
		}
		
		if(average >= 5.0 && average <= 6.9) {
				System.out.printf("Media: %.1f%n", average);
				System.out.print("Aluno em exame.\n");
				E = sc.nextFloat();
				System.out.printf("Nota do exame: %.1f%n", E);
				
				float reAverage = (E + average) / 2;
				
					if (reAverage  >= 5.0) {
						System.out.println("Aluno aprovado.");
					}
					else {
						System.out.println("Aluno reprovado.");
				}
				System.out.printf("Media final: %.1f%n", reAverage);
			}
	}
}
