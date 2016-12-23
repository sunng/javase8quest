package self.sunng.javase8quest.c2.q6;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by abc on 16/3/3.
 */
public class Quest6 {
    public static void main(String[] args) {
        characterStream("abcdefg").forEach(c -> System.out.println(c));
    }

    public static Stream<Character> characterStream(String s) {
        return IntStream.range(0, s.length()).mapToObj(i -> s.charAt(i));
    }
}
