package self.sunng.javase8quest.c1.q9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by abc on 16/3/1.
 */
public interface Collection2<T> extends Collection {
    default void forEachId(Consumer<T> action, Predicate<T> filter) {
        Objects.requireNonNull(filter);
        final Iterator<T> each = iterator();
        while (each.hasNext()) {
            T element = each.next();
            if (filter.test(element)) {
                action.accept(element);
            }
        }
    }
}
