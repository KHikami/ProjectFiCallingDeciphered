package p000;

import java.util.Comparator;
import java.util.List;

enum mnt extends mnq {
    mnt(String str, int i) {
        super(str, 2);
    }

    <E> int mo3898a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = (i2 + i) >>> 1;
            if (comparator.compare(list.get(i3), e) < 0) {
                i2 = i3 + 1;
            } else {
                i = i3;
            }
        }
        return i2;
    }
}
