package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class gvd<T> implements Iterator<T> {
    public final gux<T> a;
    public int b = -1;

    public gvd(gux<T> gux_T) {
        this.a = (gux) gwb.L((Object) gux_T);
    }

    public boolean hasNext() {
        return this.b < this.a.a() + -1;
    }

    public T next() {
        if (hasNext()) {
            gux gux = this.a;
            int i = this.b + 1;
            this.b = i;
            return gux.a(i);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.b);
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
