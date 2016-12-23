package self.sunng.javase8quest.c3.q1;

import java.util.function.Supplier;
import java.util.logging.Level;

/**
 * Created by abc on 16/3/3.
 */
public class Quest1 {

    private static Level logLevel = Level.FINEST;
    public static void main(String[] args) {
        int[] a = new int[11];
        for(int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        int index = 10;
        logIF(Level.FINEST, () -> index == 10, () -> {
            System.out.println("in log content init.");
            return "a[10] = " + a[10];
        });
    }

    public static void logIF(Level level, Supplier<Boolean> condition, Supplier<String> logContent) {
        if(level.intValue() >= logLevel.intValue()) {
            if(condition.get()) {
                System.out.println(logContent.get());
            }
        }
    }

}
