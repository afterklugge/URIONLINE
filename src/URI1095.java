
public class URI1095 {

	public static void main(String[] args) {
	
		int i = 1, j = 60;
		
		if(i == 1) {
			i = -2;
			for(int x = j; x >= 0; x = x - 5) {
				i = (i + 3);
				j = x;
				System.out.printf("I=%d J=%d\n", i, j);
			}
		}
	}
}
