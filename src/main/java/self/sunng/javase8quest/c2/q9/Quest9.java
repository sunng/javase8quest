package self.sunng.javase8quest.c2.q9;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by abc on 16/3/3.
 */
public class Quest9 <T> {
    public static <T> void main(String[] args) {
        Stream<ArrayList<T>> in = null;
        ArrayList<T> result1 = m1(in);
        ArrayList<T> result2 = m2(in);
        ArrayList<T> result3 = m3(in);

    }

    public static <T> ArrayList<T> m1(Stream<ArrayList<T>> in) {
        ArrayList<T> result = in.reduce(new ArrayList<T>(), (x, y) -> {
            x.addAll(y);
            return x;
        });

        return result;

    }

    public static <T> ArrayList<T> m2(Stream<ArrayList<T>> in) {
        ArrayList<T> result = new ArrayList<T>();
        in.flatMap(list -> list.stream()).forEach(x -> result.add(x));
        return result;
    }

    public static <T> ArrayList<T> m3(Stream<ArrayList<T>> in) {
        ArrayList<T> result = new ArrayList<T>();
        in.forEach(x -> result.addAll(x));
        return result;
    }
}
