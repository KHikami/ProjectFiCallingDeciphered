package p000;

import java.util.Iterator;

abstract class mnw<F, T> implements Iterator<T> {
    final Iterator<? extends F> f27889b;

    abstract T mo3880a(F f);

    mnw(Iterator<? extends F> it) {
        this.f27889b = (Iterator) bm.m6122a((Object) it);
    }

    public final boolean hasNext() {
        return this.f27889b.hasNext();
    }

    public final T next() {
        return mo3880a(this.f27889b.next());
    }

    public final void remove() {
        this.f27889b.remove();
    }
}
