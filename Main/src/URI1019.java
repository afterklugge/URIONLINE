import java.util.*;

public class URI1019 {

	public static void main(String[] args) {
		int n, x;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println(n/3600 + ":" + n%3600/60 + ":" + n%3600%60);
	}

}
