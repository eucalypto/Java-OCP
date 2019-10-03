package daily._10_02;

import java.util.ArrayList;
import java.util.List;

/**
 * -Calculate Average without using the API
 * - take positive numbers and concatenate them in a string
 * spositiven zahlen als string konkatenieren: 1234556....
 * - folgendes ausrechnen: 1 - 2 -3-4-5-....
 */
public class Task2 {
    // Streams, statefulness, ordered, unordered associative

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            ints.add(2 * i);
            ints.add(-i);
        }

        System.out.println(ints.stream().mapToInt(x -> x).sum());

        // Sum integers:
        int sum = ints.stream()
                .parallel()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);


        // Naive average without helper class:

        // We need to keep track of how many objects there are this "state" has to be saved
        // for all elements in the stream, making this poorly parallel-izable.


        // Average with helper class for parallelization
        double average = ints.stream()
                .parallel()
                .map(Average::new)
                .reduce((a, b) -> a.add(b))
                // .reduce(AverageHelper::add)
                .get().getAverage();

        System.out.println(average);
        System.out.println(ints.stream().mapToInt(x -> x).average().getAsDouble());

        // Concat positive numbers
        String concat = ints.stream().parallel()
                .filter(x -> x > 0)
                .map(x -> x.toString())
                .reduce("", (a, b) -> a + b);
        System.out.println(concat);

        // Subtract positive numbers:
        int res = ints.stream()
                // .parallel()
                .filter(x -> x > 0)
                .reduce(0, (a, b) -> a - b);
        // .mapToInt(x -> x).sum();
        System.out.println(res);
    }
}

class Average {
    private long sum;
    private long count;
    private double average;

    public Average(long sum) {
        this.sum = sum;
        this.count = 1;
        average = (double) sum;
    }

    public Average(long sum, long count) {
        this.sum = sum;
        this.count = count;
        average = (double) sum / (double) count;
    }

    public long getSum() {
        return sum;
    }

    public long getCount() {
        return count;
    }

    public double getAverage() {
        return average;
    }

    public Average add(Average other) {
        return new Average(
                this.getSum() + other.getSum(),
                this.getCount() + other.getCount()
        );
    }

}
