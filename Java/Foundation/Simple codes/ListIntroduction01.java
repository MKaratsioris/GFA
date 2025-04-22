import java.util.ArrayList;

public class ListIntroduction01 {
    public static void main(String[] args) {
//            We are going to play with lists. Feel free to use the built-in methods where possible.
//                (0) Create an empty list which will contain names (strings)

//                (1) Print out the number of elements in the list

//                (2) Add "William" to the list

//                (3) Print out whether the list is empty or not

//                (4) Add "John" to the list

//                (5) Add "Amanda" to the list

//                (6) Print out the number of elements in the list

//                (7) Print out the 3rd element

//                (8) Iterate through the list and print out each name
//                        William
//                        John
//                        Amanda

//                (9) Iterate through the list and print
//                    1. William
//                    2. John
//                    3. Amanda

//                (10) Remove the 2nd element

//                (11) Iterate through the list in a reversed order and print out each name
//                        Amanda
//                        William

//                (12) Remove all elements

//                (13) Print out the number of elements in the list

//                The full output of your main method should be the following:
//                    0
//                    false
//                    3
//                    Amanda
//                    William
//                    John
//                    Amanda
//                    1. William
//                    2. John
//                    3. Amanda
//                    Amanda
//                    William
//                    0

//         (0)
        ArrayList<String> names = new ArrayList<>();

//         (1)
        System.out.println(names.size());

//         (2)
        names.add("William");
//        names.add(0, "William");

//         (3)
        System.out.println(names.isEmpty());

//         (4)
        names.add("John");

//         (5)
        names.add("Amanda");

//         (6)
        System.out.println(names.size());

//         (7)
        System.out.println(names.get(2));

//         (8)
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
        for (String str : names) {
            System.out.println(str);
        }

//         (9)
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i+1) + ". " + names.get(i));
        }

//         (10)
        names.remove(1);

//         (11)
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

//         (12)
        names.removeAll(names);

//         (13)
        System.out.println(names.size());

    }
}


