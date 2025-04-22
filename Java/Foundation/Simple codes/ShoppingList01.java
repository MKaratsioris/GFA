import java.util.ArrayList;

public class ShoppingList01 {
    public static void main(String[] args) {
//        We are going to represent a shopping list by a list containing strings.
//
//        (1)Create a list with the following items:
//                eggs, milk, fish, apples, bread and chicken

//        (2) Create an application which prints out the answers to the following questions:
//                - Do we have milk in the shopping list? (yes/no)
//                - Do we have bananas in the shopping list? (yes/no)

//        The full output of your main method should be the following:
//
//                yes
//                no
        ArrayList<String> buy = new ArrayList<String>();

        buy.add("eggs");
        buy.add("milk");
        buy.add("fish");
        buy.add("apples");
        buy.add("bread");
        buy.add("chicken");

        shoppingList(buy, "milk");
        shoppingList(buy, "bananas");


    }

    public static void shoppingList(ArrayList<String> list, String str) {
        boolean belongs = false;
        for (String item : list) {
            if (item == str) {
                belongs = true;
            }
        }
        if (belongs) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
