public class Practice1 {
    public static void main(String[] args) {

        // Convert the given pseudocode into Java code

        int javaPrep = 2;
        int aptitudePrep = 1;
        int totalDays = 5;

        int weeklyAptitudePrep = aptitudePrep * totalDays;
        int total = weeklyAptitudePrep + (javaPrep * totalDays);

        System.out.println("Java: " + (javaPrep * totalDays));
        System.out.println("Aptitude: " + weeklyAptitudePrep);
        System.out.println("Total: " + total);
    }
}
