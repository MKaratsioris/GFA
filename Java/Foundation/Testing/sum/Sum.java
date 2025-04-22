package sum;

import java.util.ArrayList;

public class Sum {

    public int addition(ArrayList<Integer> numbers) {
        int sum = 0;
        if (numbers == null) {
            sum = 0;
        } else {
            for (Integer num : numbers) {
                sum += num;
            }
        }
        return sum;
    }

}
