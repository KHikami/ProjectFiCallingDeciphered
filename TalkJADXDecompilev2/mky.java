package defpackage;

import java.util.Comparator;

final class mky<E> extends mmu<E> implements mnl<E> {
    /* synthetic */ mjk b() {
        return g();
    }

    mky(mlf<E> mlf_E, mjq<E> mjq_E) {
        super((mjk) mlf_E, (mjq) mjq_E);
    }

    private mlf<E> g() {
        return (mlf) super.b();
    }

    public Comparator<? super E> comparator() {
        return g().comparator();
    }

    public int indexOf(Object obj) {
        int a = g().a(obj);
        return (a < 0 || !get(a).equals(obj)) ? -1 : a;
    }

    public int lastIndexOf(Object obj) {
        return indexOf(obj);
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    mjq<E> b(int i, int i2) {
        return new mnd(super.b(i, i2), comparator()).f();
    }
}
