package self.sunng.javase8quest.c1.q1;

import java.util.Arrays;

/**
 * Created by abc on 16/3/1.
 */
public class Quest1 {

    public static void main(String[] args) {
        Object[] data = new Object[10];
        for(int i = 0; i < data.length; i++) {
            data[i] = i;
        }

        System.out.println("outer thread id : " + Thread.currentThread().getId());
        Arrays.sort(data, (Object first, Object second) -> {
            System.out.println("inner thread id : " + Thread.currentThread().getId());
            return (int) first < (int) second ? 1 : -1;
        });

        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
