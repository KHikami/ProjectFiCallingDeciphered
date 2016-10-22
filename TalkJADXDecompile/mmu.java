import java.util.ListIterator;

class mmu<E> extends mjf<E> {
    private final mjk<E> a;
    private final mjq<? extends E> b;

    public /* synthetic */ ListIterator listIterator(int i) {
        return a(i);
    }

    mmu(mjk<E> mjk_E, mjq<? extends E> mjq__extends_E) {
        this.a = mjk_E;
        this.b = mjq__extends_E;
    }

    mjk<E> b() {
        return this.a;
    }

    public mnz<E> a(int i) {
        return this.b.a(i);
    }

    int a(Object[] objArr, int i) {
        return this.b.a(objArr, i);
    }

    public E get(int i) {
        return this.b.get(i);
    }

    mmu(mjk<E> mjk_E, Object[] objArr) {
        this((mjk) mjk_E, mjq.b(objArr, objArr.length));
    }
}
