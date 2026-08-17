import java.util.Scanner;

public class Practice13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int prac_days = sc.nextInt();
        int days = prac_days;
        int total_solved = 0;

        while (prac_days > 0) {
            int daily_cnt = sc.nextInt();
            total_solved += daily_cnt;
            prac_days--;
        }

        double average = (double) total_solved / days;
        System.out.println("Learner: " + name);
        System.out.println("Total solved: " + total_solved);
        System.out.println("Daily average: " + average);

        if (average >= 5.0) {
            System.out.println("Status: Consistent");
        } else {
            System.out.println("Status: Needs consistency");
        }
    }
}
