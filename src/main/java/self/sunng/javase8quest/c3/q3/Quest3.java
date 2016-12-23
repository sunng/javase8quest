package self.sunng.javase8quest.c3.q3;

import java.util.function.Predicate;

/**
 * Created by abc on 16/3/4.
 */
public class Quest3 {
    public static void main(String[] args) {
        int i = 0;
//        assert i == 1;
//        modAssert((x) -> i == 1);
        modAssert((x) -> i == 1, "i is not 1");
    }

    public static <T> void modAssert(Predicate<T> predicate) {
        if(!predicate.test(null))
            throw new AssertionError();
    }

    public static <T> void modAssert(Predicate<T> predicate, Object reason) {
        if(!predicate.test(null))
            throw new AssertionError(reason);
    }
}
