package p000;

import java.util.Comparator;

final class mky<E> extends mmu<E> implements mnl<E> {
    /* synthetic */ mjk mo3870b() {
        return m32415g();
    }

    mky(mlf<E> mlf_E, mjq<E> mjq_E) {
        super((mjk) mlf_E, (mjq) mjq_E);
    }

    private mlf<E> m32415g() {
        return (mlf) super.mo3870b();
    }

    public Comparator<? super E> comparator() {
        return m32415g().comparator();
    }

    public int indexOf(Object obj) {
        int a = m32415g().mo3812a(obj);
        return (a < 0 || !get(a).equals(obj)) ? -1 : a;
    }

    public int lastIndexOf(Object obj) {
        return indexOf(obj);
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    mjq<E> mo3872b(int i, int i2) {
        return new mnd(super.mo3872b(i, i2), comparator()).mo3807f();
    }
}
