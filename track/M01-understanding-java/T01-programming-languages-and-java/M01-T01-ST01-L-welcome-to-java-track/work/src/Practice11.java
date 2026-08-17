import java.util.Scanner;

public class Practice11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double income = sc.nextDouble();
        double rent = sc.nextDouble();
        double food = sc.nextDouble();
        double travel = sc.nextDouble();
        double total = rent + food + travel;
        double remaining = income - total;
        System.out.println("Total expense: " + total);
        System.out.println("Remaining: " + remaining);
        if (remaining >= 0) {
            System.out.println("Status:" + "Within budget");
        } else {
            System.out.println("Status: Over budget");
        }

        // Read income and expenses
        // Calculate and display the budget details

        sc.close();
    }
}
