package greedy.bronze.three;

import java.util.*;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt() == true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            System.out.println(Math.max(c - b, b - a) - 1);
        }
    }
}