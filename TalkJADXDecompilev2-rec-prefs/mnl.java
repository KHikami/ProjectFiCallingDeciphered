package p000;

import java.util.Comparator;

public interface mnl<T> extends Iterable<T> {
    Comparator<? super T> comparator();
}
