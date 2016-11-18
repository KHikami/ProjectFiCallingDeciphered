package p000;

import java.util.Comparator;
import java.util.List;

enum mnu extends mnq {
    mnu(String str, int i) {
        super(str, 3);
    }

    public <E> int mo3898a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
        return b.mo3898a(comparator, e, list, i) + 1;
    }
}
