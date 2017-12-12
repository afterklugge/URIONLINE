import java.util.*;

public class Lab04Example04 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Complexity level (0-5)? ");
        int level = scan.nextInt();
        
        String msg = "You are ";
        switch (level) {
            case 0:
                msg += "total newbie";
                break;
            case 1:
                msg += "beginner";
                break;
            case 2:
            case 3:
                msg +=  "experienced gamer";
                break;
            case 4:
            case 5:
                msg += "pro gamer";
                break;
            default:
                msg = "Incorrect number of level";
                break;
        }
        
        System.out.println(msg);
    }
}