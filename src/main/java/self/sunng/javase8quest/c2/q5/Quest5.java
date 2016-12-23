package self.sunng.javase8quest.c2.q5;

import java.util.stream.Stream;

/**
 * Created by abc on 16/3/2.
 */
public class Quest5 {
    public static void main(String[] args) {
        double a = 25214903917d;
        double c = 11;
        double m = Math.pow(2, 48);
        Stream<Long> endlessRandom = Stream.iterate(77823146789d, (n) -> (n * a + c) % m).map((d) -> d.longValue());
        endlessRandom.limit(10).forEach((x) -> System.out.println(x));
    }
}
