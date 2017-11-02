import java.util.Scanner;
public class URI1050 {

	public static void main(String[] args) {
		int code;
		
		Scanner sc = new Scanner(System.in);
		code = sc.nextInt();
		
		if (code == 61) {
			System.out.printf("Brasilia\n");
		}
		else if(code == 71) {
			System.out.printf("Salvador\n");
		}
		else if(code == 11) {
			System.out.printf("Sao Paulo\n");
		} 
		else if(code == 21) {
			System.out.printf("Rio de Janeiro\n");
		}
		else if(code == 32) {
			System.out.printf("Juiz de Fora\n");
		}
		else if(code == 19) {
			System.out.printf("Campinas\n");
		}
		else if(code == 27) {
			System.out.printf("Vitoria\n");
		}
		else if(code == 31) {
			System.out.printf("Belo Horizonte\n");
		}
		else {
			System.out.printf("DDD nao cadastrado\n");
		}
	}

}
