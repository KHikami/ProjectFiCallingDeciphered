package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: dbm */
abstract class dbm implements Iterator {
    private Iterator a;

    abstract Object a(Object obj);

    dbm(Iterator it) {
        this.a = (Iterator) cob.i((Object) it);
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return a(this.a.next());
    }

    public final void remove() {
        this.a.remove();
    }
}
