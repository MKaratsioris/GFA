import java.util.*;

public class JosephusProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of players: ");
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());

        System.out.println(getWinningSeat(numberOfPlayers));
    }

    public static int getWinningSeat(int n) {
        // Any number can be written as a sum of powers of the number 2, i.e.
        // N = Sum_{n} ( 2^(i) ) = 2^(a) + b.
        // In the Josephus problem, we observe that if the total number of players
        // is a pure power of 2, i.e. 4 or 8 or 16, then the winner will be the player
        // that started. Thus, for a random N, the winning player is the one sitting in
        // the (2*b+1)-th seat. So, we have to find the biggest power of 2 for a
        // given number and then subtract it from the number itself to find b.

        int a = 0;

        // Find the greatest power of 2 that fits inside the given number
        for (int i = 0; i < n; i++) {
            if (n < Math.pow(2.0,i)) {
                a = i - 1;
                break;
            }
        }

        // The winning seat
        double b = 2 * (n - Math.pow( 2 , a )) + 1;

        return (int)b;
    }
}