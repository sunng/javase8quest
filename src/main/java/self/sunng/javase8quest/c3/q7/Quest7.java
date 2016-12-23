package self.sunng.javase8quest.c3.q7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by abc on 16/3/4.
 */
public class Quest7 {
    public static void main(String[] args) {
        String[] sss = new String[3];
        sss[0] = "a";
        sss[1] = "aa";
        sss[2] = "aaa";
        Stream.of(sss).forEach(System.out::println);
        Arrays.sort(sss, getStringComparator());
        Stream.of(sss).forEach(System.out::println);
    }

    public static Comparator<String> getStringComparator() {
        return (x, y) -> {
            if(x.length() == y.length())
                return 0;
            else if(x.length() > y.length())
                return -1;
            else
                return 1;
        };
    }
}
