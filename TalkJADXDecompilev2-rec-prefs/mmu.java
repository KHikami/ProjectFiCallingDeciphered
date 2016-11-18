package p000;

import java.util.ListIterator;

class mmu<E> extends mjf<E> {
    private final mjk<E> f27868a;
    private final mjq<? extends E> f27869b;

    public /* synthetic */ ListIterator listIterator(int i) {
        return mo3871a(i);
    }

    mmu(mjk<E> mjk_E, mjq<? extends E> mjq__extends_E) {
        this.f27868a = mjk_E;
        this.f27869b = mjq__extends_E;
    }

    mjk<E> mo3870b() {
        return this.f27868a;
    }

    public mnz<E> mo3871a(int i) {
        return this.f27869b.mo3871a(i);
    }

    int mo3832a(Object[] objArr, int i) {
        return this.f27869b.mo3832a(objArr, i);
    }

    public E get(int i) {
        return this.f27869b.get(i);
    }

    mmu(mjk<E> mjk_E, Object[] objArr) {
        this((mjk) mjk_E, mjq.m32316b(objArr, objArr.length));
    }
}
