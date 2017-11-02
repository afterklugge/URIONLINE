import java.util.Scanner;
public class URI1070 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		  
		int i, X, howManyOdd = 6;
		X = sc.nextInt();
		for( i = X; i < (X+(howManyOdd*2)) ; i+=2) {
			int odd;
			if(i % 2 == 0){
				odd = i + 1;
				System.out.printf("%d\n", odd);
		    }else{
		    	odd = i;
		    	System.out.printf("%d\n", odd);
		   }
		}
	}
}
