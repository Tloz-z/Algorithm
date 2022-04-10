package implementation.gold.five;

import java.util.*;

public class ConveyorBelt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        int limit = scan.nextInt();

        LinkedList<int[]> belt = new LinkedList<>();
        for (int i = 0; i < 2 * length; ++i) {
            int [] content = new int[2];
            content[0] = scan.nextInt();
            content[1] = 0;
            belt.addLast(content);
        }

        int result = 0;
        int count = 0;
        while (true) {
            result++;

            int [] temp = belt.removeLast();
            belt.addFirst(temp);

            if (belt.getFirst()[0] != 0) {
                belt.getFirst()[0]--;
                belt.getFirst()[1] = 1;
                if (belt.getFirst()[0] == 0) {
                    count++;
                }
            }
            if (belt.get(length - 1)[1] == 1) {
                belt.get(length - 1)[1] = 0;
            }

            for (int i = length - 2; i > 0; --i) {
                int [] current = belt.get(i);
                int [] next = belt.get(i + 1);
                if (current[1] == 1 && next[1] == 0 && next[0] != 0) {
                    current[1] = 0;
                    next[1] = 1;
                    next[0]--;
                    if (next[0] == 0) {
                        count++;
                    }
                    if (i + 1 == length - 1) {
                        next[1] = 0;
                    }
                }
            }

            if (count >= limit) {
                break;
            }
        }

        System.out.println(result);
    }
}
