import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {
    public static void main(String[] args) {
//        We are going to represent our expenses in a list containing integers.
//
//        (1) Create a list with the following items:
//             500, 1000, 1250, 175, 800 and 120

//        (2) Create an application which prints out the answers to the following questions:
//                - How much did we spend?
//                - Which was our greatest expense?
//                - Which was our cheapest spending?
//                - What was the average amount of our spendings? (print this as a float value)
//
//        The full output of your main method should be the following:
//
//                3845
//                1250
//                120
//                640.8333

        ArrayList<Integer> expenses = new ArrayList<Integer>();

        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);

        financeApp(expenses);

    }

    public static void financeApp(ArrayList<Integer> list) {
        int sumExpenses = 0;
        int maxExpense = list.get(0);
        int minExpense = list.get(0);
        float averageExpense;

        for (int i = 0; i < list.size(); i++) {
            sumExpenses += list.get(i);
            if (list.get(i) > maxExpense) {
                maxExpense = list.get(i);
            }
            if (list.get(i) < minExpense) {
                minExpense = list.get(i);
            }
        }

        averageExpense = (float)sumExpenses / list.size();

        System.out.println(sumExpenses);
        System.out.println(maxExpense);
        System.out.println(minExpense);
        System.out.println(averageExpense);
    }
}
