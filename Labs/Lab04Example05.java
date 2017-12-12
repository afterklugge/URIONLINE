import java.util.*;

public class Lab04Example05 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Month? ");
        int month = scan.nextInt();
        
        System.out.print("Year? ");
        int year = scan.nextInt();
        
 
        if (month < 1 || 12 < month) {
            System.out.println(month + " is incorrect number of a month");
        } else {
            int r = 0;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    r = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    r = 30;
                    break;
                default:
                    r = 28;
                    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                        ++r;
                    }
                    break;
            }
            System.out.println("Number of days: " + r);
        }
    }
}