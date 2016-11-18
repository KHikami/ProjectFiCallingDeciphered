package p000;

import java.util.Iterator;

public class mjc<E> implements Iterable<E> {
    final /* synthetic */ Iterable f27816a;
    final /* synthetic */ met f27817b;
    private final mfa<Iterable<E>> f27818c;

    protected mjc() {
        this.f27818c = mdv.f27537a;
    }

    public String toString() {
        return gwb.m1664a((Iterable) this.f27818c.mo3732a(this));
    }

    public mjc(Iterable iterable, met met) {
        this.f27816a = iterable;
        this.f27817b = met;
        this();
    }

    public Iterator<T> iterator() {
        return mlj.m32457a(this.f27816a.iterator(), this.f27817b);
    }
}
