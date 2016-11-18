package defpackage;

import java.util.Iterator;

final class mlq<E> implements mmt<E> {
    private final Iterator<? extends E> a;
    private boolean b;
    private E c;

    public mlq(Iterator<? extends E> it) {
        this.a = (Iterator) bm.a((Object) it);
    }

    public boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    public E next() {
        if (!this.b) {
            return this.a.next();
        }
        E e = this.c;
        this.b = false;
        this.c = null;
        return e;
    }

    public void remove() {
        bm.b(!this.b, (Object) "Can't remove after you've peeked at next");
        this.a.remove();
    }

    public E a() {
        if (!this.b) {
            this.c = this.a.next();
            this.b = true;
        }
        return this.c;
    }
}
