package self.sunng.javase8quest.c2.q13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by abc on 16/3/3.
 */
public class Quest13 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a b c d e f g aa bb cc dd ee ff gg aaa bbb ccc".split(" "));
        Map<Integer, Long> result = words.stream().filter(x -> x.length() < 2).collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(result.get(1));
    }
}
