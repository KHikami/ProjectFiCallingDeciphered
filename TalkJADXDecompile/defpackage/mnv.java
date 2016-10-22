package defpackage;

import java.util.Comparator;
import java.util.List;

/* renamed from: mnv */
enum mnv extends mnq {
    mnv(String str, int i) {
        super(4, (byte) 0);
    }

    public <E> int a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
        return c.a(comparator, e, list, i) - 1;
    }
}
