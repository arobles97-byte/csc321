import java.util.Scanner;

public class aroblesLab4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1) Joke");
        System.out.println("2) Quote");
        System.out.println("3) Saying");
        System.out.println("4) Exit");
        System.out.print("Enter your choice (1-4): ");

        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Why did the chicken cross the road? To get to the other side.");
        } 
        else if (choice == 2) {
            System.out.println("Believe in yourself — you’re doing great.");
        } 
        else if (choice == 3) {
            System.out.println("Practice makes progress, not perfection.");
        } 
        else if (choice == 4) {
            System.out.println("Goodbye!");
        } 
        else {
            System.out.println("Invalid choice. Please run the program again.");
        }

        input.close();
    }
}
