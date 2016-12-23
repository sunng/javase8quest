package self.sunng.javase8quest.c2.q1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by abc on 16/3/2.
 */
public class Quest1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a b c d e f g aa bb cc dd ee ff gg aaa bbb ccc".split(" "));
        System.out.println(words.stream().parallel().filter((word) -> {
            System.out.println("Tid : " + Thread.currentThread().getId());
            return word.length() > 1;
        }).count());
    }
}
