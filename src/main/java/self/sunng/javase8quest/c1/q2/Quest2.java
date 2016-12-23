package self.sunng.javase8quest.c1.q2;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by abc on 16/3/1.
 */
public class Quest2 {
    private static final String path = "/Users/abc";

    public static void main(String[] args) {

        impl1();
        impl2();
        impl3();
    }

    private static void impl1() {
        File file = new File(path);
        File[] result = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory())
                    return true;
                else
                    return false;
            }
        });

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i].getAbsolutePath());
        }
    }

    private static void impl2() {
        File file = new File(path);
        File[] result = file.listFiles((File pathname) -> {
            if(pathname.isDirectory())
                return true;
            else
                return false;
        });

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i].getAbsolutePath());
        }
    }

    private static void impl3() {
        File file = new File(path);
        File[] result = file.listFiles(Quest2::accept);

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i].getAbsolutePath());
        }
    }

    public static boolean accept(File pathname) {
        if(pathname.isDirectory())
            return true;
        else
            return false;
    }
}
