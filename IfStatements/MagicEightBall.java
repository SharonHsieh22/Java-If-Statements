import java.util.Scanner;

public class MagicEightBall {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random()*20) + 1;
        
        System.out.println("Ask a yes or no question: ");
        sc.nextLine();
        
        if(num == 1) System.out.println("Definitely not.");
        else if(num == 2) System.out.println("Yeah but no.");
        else if(num == 3) System.out.println("Don't ask.");
        else if(num == 4) System.out.println("You don't want to know.");
        else if(num == 5) System.out.println("Without a doubt.");
        else if(num == 6) System.out.println("Maybe... not.");
        else if(num == 7) System.out.println("It is certain.");
        else if(num == 8) System.out.println("Certainly.");
        else if(num == 9) System.out.println("Yes.");
        else if(num == 10) System.out.println("No.");
        else if(num == 11) System.out.println("No comment.");
        else if(num == 12) System.out.println("Unlikely.");
        else if(num == 13) System.out.println("Ask again.");
        else if(num == 14) System.out.println("...");
        else if(num == 15) System.out.println("Hahahaha.");
        else if(num == 16) System.out.println("No but yeah.");
        else if(num == 17) System.out.println("Definitely.");
        else if(num == 18) System.out.println("Probably...");
        else if(num == 19) System.out.println("Don't ask again.");
        else if(num == 20) System.out.println("Doubtful.");
    }
}