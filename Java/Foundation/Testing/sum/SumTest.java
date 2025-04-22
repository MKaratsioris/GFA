package sum;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void addition() {
        Sum sum = new Sum();
        ArrayList<Integer> numbs0 = new ArrayList<>();
        ArrayList<Integer> numbs1 = new ArrayList<>();
        ArrayList<Integer> numbs5 = new ArrayList<>();
        ArrayList<Integer> numbs10 = new ArrayList<>();
        ArrayList<Integer> numbsNull = null;
        numbs1.add(1);
        numbs5.add(1);
        numbs5.add(2);
        numbs5.add(3);
        numbs5.add(4);
        numbs5.add(5);
        numbs10.add(1);
        numbs10.add(2);
        numbs10.add(3);
        numbs10.add(4);
        numbs10.add(5);
        numbs10.add(6);
        numbs10.add(7);
        numbs10.add(8);
        numbs10.add(9);
        numbs10.add(10);
        assertEquals(0, sum.addition(numbs0));
        assertEquals(1, sum.addition(numbs1));
        assertEquals(15, sum.addition(numbs5));
        assertEquals(55, sum.addition(numbs10));
        assertEquals(0, sum.addition(numbsNull));
    }



}