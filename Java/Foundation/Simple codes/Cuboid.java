public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // For example: if the 3 sides are 10, 10, and 10, then you program should
        // produce the following output:
        //
        // Surface Area: 600
        // Volume: 1000

        double x = 10;
        double y = 10;
        double z = 10;
        double s = 2 * (x * y + x * z + y * z);
        double v = x * y * z;
        System.out.println("The sides are:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("Surface = " + s);
        System.out.println("Volume = " + v);
    }
}