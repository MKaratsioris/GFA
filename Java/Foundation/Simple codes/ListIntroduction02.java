import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction02 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<String>();

        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList<String> listB = new ArrayList<String>(listA);

        if(listA.indexOf("Durian") >= 0) {
            System.out.println(true);
        }

        listB.remove("Durian");

        listA.add(4, "Kiwifruit");


        System.out.println(listA.equals(listB));

        System.out.println(listA.indexOf("Avocado"));

        System.out.println(listB.indexOf("Durian"));

        listB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));

        System.out.println(listA.get(2));

        System.out.println(listA);

        System.out.println(listB);

    }
}
