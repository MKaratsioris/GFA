import java.util.Set;
import java.util.HashMap;

public class ShoppingList02 {
    public static void main(String[] args) {
//        (1) Represent the following products with their prices:
//
//                Product	       Price
//                Milk	            1.07
//                Rice	            1.59
//                Eggs	            3.14
//                Cheese	        12.60
//                Chicken Breasts	9.40
//                Apples	        2.31
//                Tomato	        2.58
//                Potato	        1.75
//                Onion	            1.10
//
//        (2) Represent Bob's shopping list:
//
//                Product	      Amount
//                Milk	            3
//                Rice	            2
//                Eggs	            2
//                Cheese	        1
//                Chicken Breasts	4
//                Apples	        1
//                Tomato	        2
//                Potato	        1
//
//        (3) Represent Alice's shopping list:
//
//                Product	      Amount
//                Rice	            1
//                Eggs	            5
//                Chicken Breasts	2
//                Apples	        1
//                Tomato	        10
//
//        (4) Create an application which prints out the answers to the following questions:
//
//               - How much does Bob pay?
//               - How much does Alice pay?
//               - Who buys more Rice?
//               - Who buys more Potato?
//               - Who buys more Ham?
//               - Who buys more Apples?
//               - Who buys more of different products?
//               - Who buys more items? (more pieces)
//
//        The full output of your main method should be the following:
//
//            72.09
//            64.2
//            Bob
//            Bob
//            no one
//            no one
//            Bob
//            Alice

        HashMap<String, Double> pricesMap = new HashMap<>();
        pricesMap.put("Milk", 1.07);
        pricesMap.put("Rice", 1.59);
        pricesMap.put("Eggs", 3.14);
        pricesMap.put("Cheese", 12.60);
        pricesMap.put("Chicken Breasts", 9.40);
        pricesMap.put("Apples", 2.31);
        pricesMap.put("Tomato", 2.58);
        pricesMap.put("Potato", 1.75);
        pricesMap.put("Onion", 1.10);

        HashMap<String, Integer> bobMap = new HashMap<>();
        bobMap.put("Milk", 3);
        bobMap.put("Rice", 2);
        bobMap.put("Eggs", 2);
        bobMap.put("Cheese", 1);
        bobMap.put("Chicken Breasts", 4);
        bobMap.put("Apples", 1);
        bobMap.put("Tomato", 2);
        bobMap.put("Potato", 1);


        HashMap<String, Integer> aliceMap = new HashMap<>();
        aliceMap.put("Rice", 1);
        aliceMap.put("Eggs", 5);
        aliceMap.put("Chicken Breasts", 2);
        aliceMap.put("Apples", 1);
        aliceMap.put("Tomato", 10);

        shopping(pricesMap, bobMap);
        shopping(pricesMap, aliceMap);
        comparison("Rice", bobMap, aliceMap);
        comparison("Potato", bobMap, aliceMap);
        comparison("Ham", bobMap, aliceMap);
        comparison("Apples", bobMap, aliceMap);
        differentProducts(bobMap, aliceMap);
        moreItems(bobMap, aliceMap);

    }
    public static void shopping(HashMap<String, Double> pricesMap, HashMap<String, Integer> personMap) {
        Set<String> pricesKeySet = pricesMap.keySet();
        Set<String> personKeySet = personMap.keySet();

        Double cost = 0.0;
        for (String item1 : pricesKeySet) {
            Double pricesValue = pricesMap.get(item1);
            for (String item2 : personKeySet) {
                Integer personValue = personMap.get(item2);
                if (item1.equals(item2)) {
                    cost += pricesValue * personValue;
                }
            }
        }
        System.out.println(cost);
    }

    public static void comparison(String str, HashMap<String, Integer> person1Map, HashMap<String, Integer> person2Map) {
        Set<String> person1KeySet = person1Map.keySet();
        Set<String> person2KeySet = person2Map.keySet();

        boolean person1 = false;
        boolean person2 = false;
        boolean both = false;

        for (String item1 : person1KeySet) {
            for (String item2 : person2KeySet) {
                if (item1.equals(str) && item2.equals(str)) {
                    both = true;
                } else if (item1.equals(str)) {
                    person1 = true;
                } else if (item2.equals(str)) {
                    person2 = true;
                }
            }
        }

        if (both) {
            Integer value1 = person1Map.get(str);
            Integer value2 = person2Map.get(str);
            if (value1.equals(value2)) {
                System.out.println("no one");
//                System.out.println("both buy the same");
            } else if (value1 > value2) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        } else if (person1) {
            System.out.println("Bob");
        } else if (person2) {
            System.out.println("Alice");
        } else {
            System.out.println("no one");
        }
    }

    public static void differentProducts(HashMap<String, Integer> person1Map, HashMap<String, Integer> person2Map) {
        Set<String> person1KeySet = person1Map.keySet();
        Set<String> person2KeySet = person2Map.keySet();
        int person1 = 0;
        int person2 = 0;

        for (String item1 : person1KeySet) {
            for (String item2 : person2KeySet) {
                if (item1.equals(item2)) {
                    person1++;
                }
            }
        }

        for (String item2 : person2KeySet) {
            for (String item1 : person1KeySet) {
                if (item2.equals(item1)) {
                    person2++;
                }
            }
        }

        if ((person1KeySet.size() - person1) > (person2KeySet.size() - person2)) {
            System.out.println("Bob");
        } else if ((person1KeySet.size() - person1) < (person2KeySet.size() - person2)) {
            System.out.println("Alice");
        } else {
            System.out.println("no one");
        }

    }

    public static void moreItems(HashMap<String, Integer> person1Map, HashMap<String, Integer> person2Map) {
        Set<String> person1KeySet = person1Map.keySet();
        Set<String> person2KeySet = person2Map.keySet();
        int sum1 = 0;
        int sum2 = 0;

        for (String key : person1KeySet) {
            sum1 += person1Map.get(key);
        }

        for (String key : person2KeySet) {
            sum2 += person2Map.get(key);
        }

        if (sum1 > sum2) {
            System.out.println("Bob");
        } else if (sum1 < sum2) {
            System.out.println("Alice");
        } else {
            System.out.println("no one");
        }

    }
}
