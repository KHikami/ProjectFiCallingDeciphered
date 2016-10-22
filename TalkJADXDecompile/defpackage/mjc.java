package defpackage;

import java.util.Iterator;

/* renamed from: mjc */
public class mjc<E> implements Iterable<E> {
    final /* synthetic */ Iterable a;
    final /* synthetic */ met b;
    private final mfa<Iterable<E>> c;

    protected mjc() {
        this.c = mdv.a;
    }

    public String toString() {
        return gwb.a((Iterable) this.c.a(this));
    }

    public mjc(Iterable iterable, met met) {
        this.a = iterable;
        this.b = met;
        this();
    }

    public Iterator<T> iterator() {
        return mlj.a(this.a.iterator(), this.b);
    }
}
