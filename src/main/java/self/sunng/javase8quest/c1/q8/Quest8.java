package self.sunng.javase8quest.c1.q8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abc on 16/3/1.
 */
public class Quest8 {
    public static void main(String[] args) {
        String[] names = {"Peter", "Paul", "Mary"};
        List<Runnable> runners = new ArrayList<>();
        for(String name : names)
            runners.add(() -> System.out.println(name));

//        for(int i = 0; i < names.length; i++)
//            runners.add(() -> System.out.println(names[i]));

        for(Runnable runnable : runners)
            runnable.run();
    }
}
