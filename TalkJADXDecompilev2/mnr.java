package defpackage;

import java.util.Comparator;
import java.util.List;

enum mnr extends mnq {
    mnr(String str, int i) {
        super(str, 0);
    }

    <E> int a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
        return i;
    }
}
