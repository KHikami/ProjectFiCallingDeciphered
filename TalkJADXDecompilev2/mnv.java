package defpackage;

import java.util.Comparator;
import java.util.List;

enum mnv extends mnq {
    mnv(String str, int i) {
        super(str, 4);
    }

    public <E> int a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
        return c.a(comparator, e, list, i) - 1;
    }
}
