package self.sunng.javase8quest.c2.q4;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by abc on 16/3/2.
 */
public class Quest4 {
    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16};
        System.out.println(String.valueOf(Stream.of(values).count()));
        System.out.println(String.valueOf(IntStream.of(1, 4, 9, 16).average().getAsDouble()));
    }
}
