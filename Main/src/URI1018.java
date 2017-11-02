import java.util.Scanner;


public class URI1018 {

 public static void main(String[] args) {
  int notes, aux;

     Scanner sc = new Scanner(System.in);
     notes = sc.nextInt();

     System.out.printf("%d\n", notes);
     System.out.printf("%d nota(s) de R$ 100,00\n", notes/100);
     aux = (notes%100);


     System.out.printf("%d nota(s) de R$ 50,00\n", aux/50);
     aux = (aux%50);

     System.out.printf("%d nota(s) de R$ 20,00\n", aux/20);
     aux = (aux%20);

     System.out.printf("%d nota(s) de R$ 10,00\n", aux/10);
     aux = (aux%10);

     System.out.printf("%d nota(s) de R$ 5,00\n", aux/5);
     aux = (aux%5);

     System.out.printf("%d nota(s) de R$ 2,00\n", aux/2);
     aux = (aux%2);

     System.out.printf("%d nota(s) de R$ 1,00\n", aux/1);

 }
}