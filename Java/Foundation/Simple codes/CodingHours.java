public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        int codeDailyHours = 6;

        // The semester is 17 weeks long
        int semesterWeeks = 17;

        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int var1 = codeDailyHours * 5 * semesterWeeks;
        System.out.println("An attendee in Green Fox Academy, codes on average, " + var1 + " hours per semester.");

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        double var2 = ( (double)var1 / (52 * semesterWeeks) ) * 100;
        System.out.println("The coding hours are taking " + var2 + " % of the total semester time.");
    }
}
