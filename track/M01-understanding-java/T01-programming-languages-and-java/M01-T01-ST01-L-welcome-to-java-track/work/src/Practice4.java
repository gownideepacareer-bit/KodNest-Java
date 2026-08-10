public class Practice4 {
    public static void main(String[] args) {

        int completedTopics = 17;
        int topics = 20;
        int learningHours = 3;
        int learningDays = 5;

        double percentage = (double) completedTopics * 100 / topics;

        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics: " + (topics - completedTopics));
        System.out.println("Weekly Learning Hours: " + (learningHours * learningDays));
        System.out.println("Progress Percentage: " + percentage);
    }
}
