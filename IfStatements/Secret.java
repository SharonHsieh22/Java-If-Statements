import java.util.Scanner;

class Secret {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        
        System.out.println("What's the password?");
        System.out.print("Password: ");
        answer = sc.nextLine();
        if("dragon".equals(answer)) {
            System.out.println("CORRECT! My secret is: I am Batman");
        }
        else {
            System.out.println("INCORRECT! My secret is still safe...");
        }
    }
}