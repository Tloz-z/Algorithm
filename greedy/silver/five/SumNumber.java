package greedy.silver.five;

import java.util.*;

public class SumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long sum = 0;
        long count = 1;

        while (sum <= num) {
            sum += count;
            count++;
        }

        System.out.println(count - 2);
    }
}
