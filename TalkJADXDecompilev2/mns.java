package defpackage;

import java.util.Comparator;
import java.util.List;

enum mns extends mnq {
    mns(String str, int i) {
        super(str, 1);
    }

    <E> int a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
        int size = list.size() - 1;
        while (i < size) {
            int i2 = ((i + size) + 1) >>> 1;
            if (comparator.compare(list.get(i2), e) > 0) {
                size = i2 - 1;
            } else {
                i = i2;
            }
        }
        return i;
    }
}
