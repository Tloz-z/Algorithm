package implementation.silver.four;

import java.util.*;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();

        for (int i = 0; i < total; ++i) {
            int count = scan.nextInt();
            int search = scan.nextInt();
            LinkedList<int[]> list = new LinkedList<>();
            for (int j = 0; j < count; j++) {
                int [] item = new int[2];
                item[0] = j;
                item[1] = scan.nextInt();
                list.add(item);
            }

            int result = 0;
            while (true) {
                int [] candidate = list.get(0);
                boolean flag = false;
                for (int j = 1; j < list.size(); ++j) {
                    if (candidate[1] < list.get(j)[1]) {
                        list.remove(0);
                        list.addLast(candidate);
                        flag = true;
                        break;
                    }
                }

                if (flag == true) {
                    continue;
                }

                list.remove(0);
                result++;
                if (candidate[0] == search) {
                    break;
                }
            }

            System.out.println(result);
        }
    }
}
