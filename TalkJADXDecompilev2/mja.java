package defpackage;

import java.util.Iterator;
import java.util.NavigableSet;

final class mja<E> extends mlf<E> {
    private final mlf<E> c;

    public /* synthetic */ Iterator descendingIterator() {
        return c();
    }

    public /* synthetic */ NavigableSet descendingSet() {
        return b();
    }

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    mja(mlf<E> mlf_E) {
        super(mms.a(mlf_E.comparator()).c());
        this.c = mlf_E;
    }

    public boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    public int size() {
        return this.c.size();
    }

    public mny<E> a() {
        return this.c.c();
    }

    mlf<E> a(E e, boolean z) {
        return this.c.d(e, z).b();
    }

    mlf<E> a(E e, boolean z, E e2, boolean z2) {
        return this.c.b(e2, z2, e, z).b();
    }

    mlf<E> b(E e, boolean z) {
        return this.c.c(e, z).b();
    }

    public mlf<E> b() {
        return this.c;
    }

    public mny<E> c() {
        return this.c.a();
    }

    mlf<E> U_() {
        throw new AssertionError("should never be called");
    }

    public E lower(E e) {
        return this.c.higher(e);
    }

    public E floor(E e) {
        return this.c.ceiling(e);
    }

    public E ceiling(E e) {
        return this.c.floor(e);
    }

    public E higher(E e) {
        return this.c.lower(e);
    }

    int a(Object obj) {
        int a = this.c.a(obj);
        return a == -1 ? a : (size() - 1) - a;
    }

    boolean e() {
        return this.c.e();
    }
}
