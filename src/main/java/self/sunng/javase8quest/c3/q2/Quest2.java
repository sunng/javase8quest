package self.sunng.javase8quest.c3.q2;

import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/**
 * Created by abc on 16/3/4.
 */
public class Quest2 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(false);
        withLock(lock, System.out::println, 1);
    }

    public static <T> void withLock(ReentrantLock lock, Consumer<T> consumer, T t) {
        lock.lock();
        try {
            consumer.accept(t);
        } finally {
            lock.unlock();
        }
    }
}
