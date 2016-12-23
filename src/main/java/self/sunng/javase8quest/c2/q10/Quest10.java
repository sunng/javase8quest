package self.sunng.javase8quest.c2.q10;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * Created by abc on 16/3/3.
 */
public class Quest10 {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger();
        Stream<Double> stream = Stream.of(1d, 2d, 3d);
        double avg = stream.reduce((x, y) -> {
            count.incrementAndGet();
            return x + y;
        }).orElse(0d) / count.doubleValue();
        System.out.println(avg);
    }
}
