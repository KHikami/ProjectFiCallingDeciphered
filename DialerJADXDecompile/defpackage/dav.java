package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: dav */
final class dav extends dbn {
    private boolean a;
    private /* synthetic */ Object b;

    dav(Object obj) {
        this.b = obj;
    }

    public final boolean hasNext() {
        return !this.a;
    }

    public final Object next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b;
    }
}
