package defpackage;

import java.util.Iterator;

/* renamed from: mnw */
abstract class mnw<F, T> implements Iterator<T> {
    final Iterator<? extends F> b;

    abstract T a(F f);

    mnw(Iterator<? extends F> it) {
        this.b = (Iterator) bm.a((Object) it);
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final T next() {
        return a(this.b.next());
    }

    public final void remove() {
        this.b.remove();
    }
}
