package self.sunng.javase8quest.c6.q3;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

/**
 * Created by abc on 16/3/8.
 */
public class Quest3 {
    public static void main(String[] args) {
        AtomicLong al = new AtomicLong();
        LongAdder la = new LongAdder();
        LongAccumulator lacc = new LongAccumulator(Long::sum, 0);

        int threadNumber = 100;
        int exeTimes = 100000;
        final CountDownLatch countDownLatch1 = new CountDownLatch(threadNumber);

        long startTime= System.currentTimeMillis();

        for(int i = 0; i < threadNumber; i++) {
            new Thread(() -> {
                for(int j = 0; j < exeTimes; j++) {
                    al.incrementAndGet();
//                    al.get();
                }
                countDownLatch1.countDown();
            }).start();
        }

        try {
            countDownLatch1.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(al.get());

        System.out.println("执行总时间:"+(System.currentTimeMillis() - startTime));

        final CountDownLatch countDownLatch2 = new CountDownLatch(threadNumber);
        startTime= System.currentTimeMillis();

        for(int i = 0; i < threadNumber; i++) {
            new Thread(() -> {
                for(int j = 0; j < exeTimes; j++) {
                    la.increment();
//                    la.sum();
                }
                countDownLatch2.countDown();
            }).start();
        }

        try {
            countDownLatch2.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(la.longValue());
        System.out.println("执行总时间:"+(System.currentTimeMillis() - startTime));

        final CountDownLatch countDownLatch3 = new CountDownLatch(threadNumber);
        startTime= System.currentTimeMillis();

        for(int i = 0; i < threadNumber; i++) {
            new Thread(() -> {
                for(int j = 0; j < exeTimes; j++) {
                    lacc.accumulate(1);
//                    lacc.get();
                }
        countDownLatch3.countDown();
            }).start();
        }

        try {
            countDownLatch3.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(lacc.get());
        System.out.println("执行总时间:"+(System.currentTimeMillis() - startTime));
    }
}
