import java.util.Scanner;

public class Practice10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int no_of_days = scanner.nextInt();
        int total = 0;

        for (int i = 0; i < no_of_days; i++) {
            int problem = scanner.nextInt();
            total += problem;
        }

        System.out.println("Total solved: " + total);

        if (total >= 20) {
            System.out.println("Status: " + "Strong progress");
        } else if (total >= 10 && total <= 19) {
            System.out.println("Status: " + "Keep improving");
        } else {
            System.out.println("Status: " + "Needs more practice");
        }

        // Calculate the total and display the progress status

        scanner.close();
    }
}
