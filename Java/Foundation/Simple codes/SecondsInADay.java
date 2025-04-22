public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above

        int totalSeconds = 24 * 60 * 60;
        int hoursInSeconds = 14 * 60 * 60;
        int minutesInSeconds = 34 * 60;
        int currentTotalSeconds = hoursInSeconds + minutesInSeconds + currentSeconds;
        int remainingSeconds = totalSeconds -currentTotalSeconds;
        System.out.println("Total seconds in a day: " + totalSeconds + " seconds.");
        System.out.println(currentHours + ":" + currentMinutes + ":" + currentSeconds + " = " + currentTotalSeconds + " seconds.");
        System.out.println("Total remaining seconds: " + remainingSeconds + " seconds.");
    }
}
