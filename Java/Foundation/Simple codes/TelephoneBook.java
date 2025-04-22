import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;

public class TelephoneBook {
    public static void main(String[] args) {
//        We are going to represent our contacts in a map where both the keys and values are strings.
//
//        (1) Create a map with the following key-value pairs:
//
//            Name (key)	        Phone number (value)
//            William A. Lathan	    405-709-1865
//            John K. Miller	    402-247-8568
//            Hortensia E. Foster	606-481-6467
//            Amanda D. Newland	    319-243-5613
//            Brooke P. Askew	    307-687-2982
//
//        (2) Create an application which prints out the answers to the following questions:
//
//          - What is John K. Miller's phone number?
//          - Whose phone number is 307-687-2982?
//          - Do we know Chris E. Myers' phone number? (yes/no)
//          - The full output of your main method should be the following:
//
//            402-247-8568
//            Brooke P. Askew
//            no
        HashMap<String,String> namesTelephonesMap = new HashMap<String,String>();

        namesTelephonesMap.put("William A. Lathan", "405-709-1865");
        namesTelephonesMap.put("John K. Miller", "402-247-8568");
        namesTelephonesMap.put("Hortensia E. Foster", "606-481-6467");
        namesTelephonesMap.put("Amanda D. Newland", "319-243-5613");
        namesTelephonesMap.put("Brooke P. Askew", "307-687-2982");

        telephoneBook(namesTelephonesMap, "John K. Miller");
        telephoneBook(namesTelephonesMap, "307-687-2982");
        telephoneBook(namesTelephonesMap, "Chris E. Myer");
    }

    public static void telephoneBook(HashMap<String, String> map, String str) {
        Set<String> keySet = map.keySet();
        boolean belongs = false;
        for (String key : keySet) {
            if (key == str) {
                belongs = true;
            }
        }

        ArrayList<String> valueList = new ArrayList<String>(map.values());
        for (String value : valueList) {
            if (value == str) {
            belongs = true;
            }
        }

        if (belongs) {
            for(String key : keySet) {
                String value = map.get(key);
                if (str == value) {
                    System.out.println(key);
                } else if (str == key) {
                    System.out.println(value);
                }
            }
        } else {
            System.out.println("no");
        }
    }
}
