package defpackage;

import java.util.Comparator;
import java.util.List;

/* renamed from: mnq */
public enum mnq {
    ANY_PRESENT,
    LAST_PRESENT,
    FIRST_PRESENT,
    FIRST_AFTER,
    LAST_BEFORE;

    public abstract <E> int a(Comparator<? super E> comparator, E e, List<? extends E> list, int i);
}
