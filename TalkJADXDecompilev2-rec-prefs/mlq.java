package p000;

import java.util.Iterator;

final class mlq<E> implements mmt<E> {
    private final Iterator<? extends E> f27891a;
    private boolean f27892b;
    private E f27893c;

    public mlq(Iterator<? extends E> it) {
        this.f27891a = (Iterator) bm.m6122a((Object) it);
    }

    public boolean hasNext() {
        return this.f27892b || this.f27891a.hasNext();
    }

    public E next() {
        if (!this.f27892b) {
            return this.f27891a.next();
        }
        E e = this.f27893c;
        this.f27892b = false;
        this.f27893c = null;
        return e;
    }

    public void remove() {
        bm.m6151b(!this.f27892b, (Object) "Can't remove after you've peeked at next");
        this.f27891a.remove();
    }

    public E mo3881a() {
        if (!this.f27892b) {
            this.f27893c = this.f27891a.next();
            this.f27892b = true;
        }
        return this.f27893c;
    }
}
