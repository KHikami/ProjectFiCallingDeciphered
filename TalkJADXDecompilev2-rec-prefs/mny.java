package p000;

import java.util.Iterator;

public abstract class mny<E> implements Iterator<E> {
    protected mny() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
