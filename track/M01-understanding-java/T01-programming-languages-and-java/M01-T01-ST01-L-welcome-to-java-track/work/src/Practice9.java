
import java.util.*;

public class Practice9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();
        int solvedProblems = sc.nextInt();
        double assessmentProblems = sc.nextDouble();

        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assessment: " + 82.5);

        sc.close();
    }
}
