import java.util.Scanner;

class GradeBot {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double out = 0;
        double score = 0;
        double percent = 0;
        
        System.out.print("What the test was out of: ");
        out = sc.nextDouble();
        System.out.print("Your score: ");
        score = sc.nextDouble();
        
        if(out <= 0 || score < 0 || score > out) {
            System.out.println("IMPOSSIBLE");
        } else {
            percent = (score/out) * 100;
            if(percent >= 86) {
                System.out.println("You got an A. Congratulations!");
            } else if(percent >= 73) {
                System.out.println("You got a B. Good work.");
            } else if(percent >= 67) {
                System.out.println("You got a C+. Keep studying!");
            } else if(percent >= 60) {
                System.out.println("You got a C. Aim higher!");
            } else if(percent>= 50) {
                System.out.println("You got a C-. Barely made it...");
            } else {
                System.out.println("You got an F. That's a fail, but keep on trying!");   
            }
        }
        
    }
}