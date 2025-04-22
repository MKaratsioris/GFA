import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Collections;


public class ProductDatabase {
    public static void main(String[] args) {

//        We are going to represent our products in a map where the keys are strings representing the product's
//        name and the values are numbers representing the product's price.
//
//        (1) Create a map with the following key-value pairs:
//
//            Product name (key)	Price (value)
//                    Eggs	        200
//                    Milk	        200
//                    Fish	        400
//                    Apples	    150
//                    Bread	        50
//                    Chicken	    550
//
//        (2) Create an application which prints out the answers to the following questions:
//
//              -  How much is the fish?
//              -  What is the most expensive product?
//              -  What is the average price?
//              -  How many products' price is below 300?
//              -  Is there anything we can buy for exactly 125?
//              -  What is the cheapest product?
//        -----------------------------------------------------------
//              - Which products cost less than 201? (just the name)
//              - Which products cost more than 150? (name + price)
//
//        The full output of your main method should be the following:
//
//                        400
//                        Chicken
//                        258.33334
//                        4
//                        no
//                        Bread
//        ------------------------------------
//                        Apples
//                        Eggs
//                        Milk
//                        Bread
//                        Fish 400
//                        Chicken 550
//                        Eggs 200
//                        Milk 200

        HashMap<String, Integer> pricesMap = new HashMap<>();
        pricesMap.put("Eggs", 200);
        pricesMap.put("Milk", 200);
        pricesMap.put("Fish", 400);
        pricesMap.put("Apples", 150);
        pricesMap.put("Bread", 50);
        pricesMap.put("Chicken", 550);

        costItem(pricesMap, "Fish");
        compareItems(pricesMap, "most expensive");
        averagePrice(pricesMap);
        numProductsBelowLimit(pricesMap, 300);
        uniquePrice(pricesMap, 125);
        compareItems(pricesMap, "cheapest");
        compareItems(pricesMap, "less", 201);
        compareItems(pricesMap, "more", 150);
    }

    public static void costItem(HashMap<String, Integer> priceMap, String str) {
        System.out.println(priceMap.get(str));
    }

    public static void compareItems(HashMap<String, Integer> priceMap, String str) {
//         str = "most expensive" or "cheapest"
        boolean bool = false;
        // sorting out the values and storing the last value which is the max value.
        Set<String> keySet = priceMap.keySet();
        ArrayList<Integer> prices = new ArrayList<>(priceMap.values());
        ArrayList<String> mostExpensiveItems = new ArrayList<>();
        ArrayList<String> cheapestItems = new ArrayList<>();
        Collections.sort(prices);
        int index = 0;

        if (str.equals("most expensive")) {
            bool = true;
            index = prices.get(prices.size() - 1);
        } else if (str.equals("cheapest")) {
            index = prices.get(0);
        } else {
            System.out.println("Please, specify if you need:");
            System.out.println("   -  \"most expensive\"");
            System.out.println("   -  \"cheapest\"");
        }

        // Store all items that has the max value
        for (String key : keySet) {
            if (priceMap.get(key) == index) {
                mostExpensiveItems.add(key);
            }
        }

        // Store all items that has the min value
        for (String key : keySet) {
            if (priceMap.get(key) == index) {
                cheapestItems.add(key);
            }
        }

        // Print the list
        if (bool) {
            for (String item : mostExpensiveItems) {
                System.out.println(item + "  ");
            }
        } else {
            for (String item : cheapestItems) {
                System.out.println(item + "  ");
            }
        }
    }

    public static void averagePrice(HashMap<String, Integer> priceMap) {
        Set<String> keySet = priceMap.keySet();
        int sum = 0;

        for (String key : keySet) {
            sum += priceMap.get(key);
        }
        System.out.println((float)sum/keySet.size());
    }

    public static void numProductsBelowLimit(HashMap<String, Integer> priceMap, int upLimit) {
        Set<String> keySet = priceMap.keySet();
        int count = 0;

        for (String key : keySet) {
            if (priceMap.get(key) < upLimit) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void uniquePrice(HashMap<String, Integer> priceMap, int price) {
        Set<String> keySet = priceMap.keySet();
        int count = 0;

        for (String key : keySet) {
            if (priceMap.get(key) == price) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }

    public static void compareItems(HashMap<String, Integer> priceMap, String str, int limit) {
//        str = "more" or "less"
        boolean bool = false;
        // sorting out the values and storing the last value which is the max value.
        Set<String> keySet = priceMap.keySet();
        ArrayList<Integer> prices = new ArrayList<>(priceMap.values());
        ArrayList<String> lessExpensiveItems = new ArrayList<>();
        HashMap<String, Integer> moreExpensiveItems = new HashMap<>();
        Collections.sort(prices);

        if (str.equals("less")) {
            for (String key : keySet) {
                if (priceMap.get(key) < limit) {
                    lessExpensiveItems.add(key);
                }
            }
        } else if (str.equals("more")) {
            bool = true;
            for (String key : keySet) {
                if (priceMap.get(key) > limit) {
                    moreExpensiveItems.put(key, priceMap.get(key));
                }
            }
        } else {
            System.out.println("In comparison to the the provided price, please specify if you need to search for items that cost:");
            System.out.println("   -  \"more\"");
            System.out.println("   -  \"less\"");
        }

        Set<String> keySetExpensive = moreExpensiveItems.keySet();

        // Print the list
        if (bool) {
            for (String key : keySetExpensive) {
                Integer value = moreExpensiveItems.get(key);
                System.out.println(key + "  " + value);
            }
        } else {
            for(String item : lessExpensiveItems) {
                System.out.println(item);
            }
        }
    }
}
