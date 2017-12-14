import java.util.Scanner;
public class URI1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		int total = 0, totalC = 0, totalR = 0, totalS = 0;
		float totalCP, totalRP, totalSP;
		
		for(int i=1; i <= n; i++) {
			int x = sc.nextInt();
			String ch = sc.next();
			total += x;
			
			if(ch.equals("C")) {
				totalC += x;
			}
			else if (ch.equals("R")) {
				totalR =+ x;
			}
			else if (ch.equals("S")) {
				totalS =+ x;
			}
		}
		totalCP = (float)(totalC * 100.0) / total;
		totalRP = (float)(totalR * 100.0) / total;
		totalSP = (float)(totalS * 100.0) / total;
		
		System.out.println("Total: " + total);
		System.out.println("Total de coelhos: " + totalC);
		System.out.println("Total de ratos: " + totalR);
		System.out.println("Total de sapos: " + totalS);
		
		System.out.printf("Percentual de coelhos: %.2f", totalCP);
		System.out.printf("%" + "\n");
		System.out.printf("Percentual de ratos: %.2f", totalRP);
		System.out.printf("%" + "\n");
		System.out.printf("Percentual de sapos: %.2f", totalSP);
		System.out.printf("%" + "\n");
	}

}
