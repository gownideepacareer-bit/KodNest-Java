public class Practice3 {

    public static void main(String[] args) {

        double principle = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double weight = 72.0;
        double height = 1.8;

        int marks1 = 78;
        int marks2 = 84;
        int marks3 = 69;
        int marks4 = 91;
        int marks5 = 88;

        double simpleInterest = principle * rate * time / 100.0;
        double totalAmount = principle + simpleInterest;
        double BMI = weight / (height * height);

        int totalMarks = (marks1 + marks2 + marks3 + marks4 + marks5);
        double percentage = totalMarks * 100.0 / 500;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + BMI);
        System.out.println("Total Marks: " + (marks1 + marks2 + marks3 + marks4 + marks5));
        System.out.println("Percentage: " + percentage);
    }
}
