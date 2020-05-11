package zadania.sety;

import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class CountSet<E> extends TreeSet<E> {

    public static AtomicInteger count = new AtomicInteger(0);
    @Override
    public boolean add(E e) {

        count.incrementAndGet();

        return super.add(e);
    }
}
