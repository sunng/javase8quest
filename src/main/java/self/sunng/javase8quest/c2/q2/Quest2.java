package self.sunng.javase8quest.c2.q2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by abc on 16/3/2.
 */
public class Quest2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a b c d e f g aa bb cc dd ee ff gg aaa bbb ccc".split(" "));
        words.stream().filter((word) -> {
            System.out.println("Tid : " + Thread.currentThread().getId());
            return word.length() > 1;
        }).limit(5).forEach((word) -> System.out.println(word));
    }
}
