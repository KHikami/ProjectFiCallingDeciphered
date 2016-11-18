package p000;

import java.util.Comparator;
import java.util.List;

public enum mnq {
    ANY_PRESENT,
    LAST_PRESENT,
    FIRST_PRESENT,
    FIRST_AFTER,
    LAST_BEFORE;

    public abstract <E> int mo3898a(Comparator<? super E> comparator, E e, List<? extends E> list, int i);
}
