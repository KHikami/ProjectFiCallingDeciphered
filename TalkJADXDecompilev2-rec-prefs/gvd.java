package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class gvd<T> implements Iterator<T> {
    public final gux<T> f16204a;
    public int f16205b = -1;

    public gvd(gux<T> gux_T) {
        this.f16204a = (gux) gwb.m1419L((Object) gux_T);
    }

    public boolean hasNext() {
        return this.f16205b < this.f16204a.mo2074a() + -1;
    }

    public T next() {
        if (hasNext()) {
            gux gux = this.f16204a;
            int i = this.f16205b + 1;
            this.f16205b = i;
            return gux.mo2075a(i);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f16205b);
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
