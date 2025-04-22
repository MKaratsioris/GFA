public class DefineBasicInfo {
    public static void main(String[] args) {
        // Define several things as a variable then print their values
        // Your name as a string
        String name = "Michalis Karatsioris";

        // Your age as an integer
        int age = 38;

        // Your height in meters as a double
        double height = 1.85;

        // Whether you are married or not as a boolean
        boolean married = false;

        System.out.print("My name is " + name + " and ");
        System.out.println("I am " + age + " years young. ");
        System.out.print("I am " + height + " meters short and ");
        if (married) {
            System.out.print("I am happily married!");
        } else {
            System.out.print("I am not married yet!");
        }


    }
}