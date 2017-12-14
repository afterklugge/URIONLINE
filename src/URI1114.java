import java.util.Scanner;

public class URI1114 {

	public static void main(String[] args) {
		int isPassword;
		
		Scanner sc = new Scanner(System.in);
		
		while(((isPassword = sc.nextInt()) != 2002)) {
				System.out.println("Senha Invalida" + "");
		}
		System.out.println("Acesso Permitido" + "");
		
	}

}
