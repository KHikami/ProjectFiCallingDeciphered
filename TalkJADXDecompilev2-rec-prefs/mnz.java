package p000;

import java.util.ListIterator;

public abstract class mnz<E> extends mny<E> implements ListIterator<E> {
    protected mnz() {
    }

    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}
