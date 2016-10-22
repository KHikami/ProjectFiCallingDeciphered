package defpackage;

/* renamed from: mjm */
public abstract class mjm<E> {
    public abstract mjm<E> b(E e);

    static int a(int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i3 = ((i >> 1) + i) + 1;
        if (i3 < i2) {
            i3 = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    mjm() {
    }

    public mjm<E> a(E... eArr) {
        for (Object b : eArr) {
            b(b);
        }
        return this;
    }
}
