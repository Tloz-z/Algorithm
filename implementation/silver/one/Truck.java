package implementation.silver.one;

import java.util.*;

public class Truck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        int length = scan.nextInt();
        int maxWeight = scan.nextInt();
        Queue<Integer> trucks = new LinkedList<>();
        for (int i = 0; i < count; ++i) {
            trucks.offer(scan.nextInt());
        }

        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < length; ++i) {
            bridge.offer(0);
        }

        int time = 0;
        int weight = 0;
        while (!trucks.isEmpty()) {
            time++;
            weight -= bridge.poll();
            int truck = trucks.peek();
            if (weight + truck > maxWeight) {
                bridge.offer(0);
            } else {
                bridge.offer(trucks.poll());
                weight += truck;
            }
        }

        System.out.println(time + length);
    }
}
