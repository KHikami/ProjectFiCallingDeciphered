package p000;

public abstract class mjm<E> {
    public abstract mjm<E> mo3840b(E e);

    static int m32349a(int i, int i2) {
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

    public mjm<E> mo3839a(E... eArr) {
        for (Object b : eArr) {
            mo3840b(b);
        }
        return this;
    }
}
