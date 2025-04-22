import java.util.Set;
import java.util.HashMap;

public class MapIntroduction02 {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<String,String>();

        map.put("978-1-60309-452-8", "A Letter to Jo");
        map.put("978-1-60309-459-7", "Lupus");
        map.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        map.put("978-1-60309-461-0", "The Lab");

        Set<String> keySet = map.keySet();

        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(value + " (ISBN: " + key + ")");
        }

        map.remove(978-1-60309-444-3);

        map.remove(978-1-60309-461-0);

        map.put("978-1-60309-450-4", "They Called Us Enemy");
        map.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(map.containsKey("478-0-61159-424-8"));

        System.out.println(map.get("978-1-60309-453-5"));

    }
}
