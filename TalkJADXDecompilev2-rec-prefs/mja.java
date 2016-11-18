package p000;

import java.util.Iterator;
import java.util.NavigableSet;

final class mja<E> extends mlf<E> {
    private final mlf<E> f27812c;

    public /* synthetic */ Iterator descendingIterator() {
        return mo3817c();
    }

    public /* synthetic */ NavigableSet descendingSet() {
        return mo3815b();
    }

    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    mja(mlf<E> mlf_E) {
        super(mms.m32221a(mlf_E.comparator()).mo3888c());
        this.f27812c = mlf_E;
    }

    public boolean contains(Object obj) {
        return this.f27812c.contains(obj);
    }

    public int size() {
        return this.f27812c.size();
    }

    public mny<E> mo3806a() {
        return this.f27812c.mo3817c();
    }

    mlf<E> mo3813a(E e, boolean z) {
        return this.f27812c.m32277d(e, z).mo3815b();
    }

    mlf<E> mo3814a(E e, boolean z, E e2, boolean z2) {
        return this.f27812c.m32272b(e2, z2, e, z).mo3815b();
    }

    mlf<E> mo3816b(E e, boolean z) {
        return this.f27812c.m32274c(e, z).mo3815b();
    }

    public mlf<E> mo3815b() {
        return this.f27812c;
    }

    public mny<E> mo3817c() {
        return this.f27812c.mo3806a();
    }

    mlf<E> U_() {
        throw new AssertionError("should never be called");
    }

    public E lower(E e) {
        return this.f27812c.higher(e);
    }

    public E floor(E e) {
        return this.f27812c.ceiling(e);
    }

    public E ceiling(E e) {
        return this.f27812c.floor(e);
    }

    public E higher(E e) {
        return this.f27812c.lower(e);
    }

    int mo3812a(Object obj) {
        int a = this.f27812c.mo3812a(obj);
        return a == -1 ? a : (size() - 1) - a;
    }

    boolean mo3822e() {
        return this.f27812c.mo3822e();
    }
}
