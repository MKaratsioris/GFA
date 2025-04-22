public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        double bmi = massInKg / (heightInM * heightInM);
        System.out.println("Weight: " + massInKg + " kg.");
        System.out.println("Height: " + heightInM + " m.");
        if (bmi <= 18.4) {
            System.out.println("BMI: " + (int)(bmi + 0.5) + " (Underweight)");
        } else if (bmi < 25) {
            System.out.println("BMI: " + (int)(bmi + 0.5) + " (Normal)");
        } else {
            System.out.println("BMI: " + (int)(bmi + 0.5) + " (Overweight)");
        }
    }
}