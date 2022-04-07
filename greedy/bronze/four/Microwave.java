package greedy.bronze.four;

import java.util.*;

public class Microwave {
    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);

        int time = scan.nextInt();
        int [] timers = {300, 60, 10};
        int [] counts = new int[3];

        for (int i = 0; i < 3; ++i) {
            counts[i] = time / timers[i];
            time %= timers[i];
        }

        if (time == 0) {
            System.out.println(counts[0] + " " + counts[1] + " " + counts[2]);
        } else {
            System.out.println(-1);
        }
    }
}
