package self.sunng.javase8quest.c1.q4;

import java.io.File;
import java.util.Arrays;

/**
 * Created by abc on 16/3/1.
 */
public class Quest4 {
    public static void main(String[] args) {
        File[] files = new File[10];
        Arrays.sort(files, (File first, File second) -> {
            if(first.getAbsolutePath().equals(second.getAbsolutePath())) {
                return first.getName().compareTo(second.getName());
            } else {
                return first.getAbsolutePath().compareTo(second.getAbsolutePath());
            }
        }
        );
    }
}
