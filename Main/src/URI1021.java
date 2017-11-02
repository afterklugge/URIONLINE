import java.util.Scanner;


public class URI1021 {

 public static void main(String[] args) {
	 int a;
	 double b;
	 Scanner sc = new Scanner(System.in);
	 
	 b = sc.nextDouble();
	 a = (int) b;
	 b = b - a;
	 
	 System.out.println("NOTAS: ");
	 
	 System.out.println(a / 100 + " nota(s) de R$ 100.00");
	 a %= 100;
	 System.out.println(a / 50 + " nota(s) de R$ 50.00");
	 a %= 50;
	 System.out.println(a / 20 + " nota(s) de R$ 20.00");
	 a %= 20;
	 System.out.println(a / 10 + " nota(s) de R$ 10.00");
	 a %= 10;
	 System.out.println(a / 5 + " nota(s) de R$ 5.00");
	 a %= 5;
	 System.out.println(a / 2 + " nota(s) de R$ 2.00");
	 
	 System.out.println("MOEDAS: ");
	 a %= 2;
	 b = b * 100;
	 a = (int) b;
	 
	 System.out.println(a / 100 + " moeda(s) de R$ 1.0");
	 a %= 100;
	 
	 System.out.println(a / 50 + " moeda(s) de R$ 0.50");
	 a %= 50;
	 
	 System.out.println(a / 20 + " moeda(s) de R$ 0.25");
	 a %= 20;
	 
	 System.out.println(a / 10 + " moeda(s) de R$ 0.10");
	 a %= 10;
	 
	 System.out.println(a / 5 + " moeda(s) de R$ 0.05");
	 a %= 5;
	 
	 System.out.println(a / 2 + " moeda(s) de R$ 0.01");
	 a %= 2;
	 
 }

}
