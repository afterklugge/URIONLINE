import java.util.*;

public class Lab08Problem03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("N: ");
		int n = scan.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < a.length; ++i) {
			System.out.print("Enter " + i + " element: ");
			a[i] = scan.nextInt();
		}
		
		System.out.println("Before reversing: ");
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		
		int p = 0;
		int q = a.length - 1;
		while (p < q) {
			int t = a[p];
			a[p] = a[q];
			a[q] = t;
			++p;
			--q;
		}
		
		System.out.println("After reversing: ");
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
