package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class mlf<E> extends mli<E> implements NavigableSet<E>, mnl<E> {
    final transient Comparator<? super E> f27810a;
    transient mlf<E> f27811b;

    abstract int mo3812a(Object obj);

    abstract mlf<E> mo3813a(E e, boolean z);

    abstract mlf<E> mo3814a(E e, boolean z, E e2, boolean z2);

    public abstract mny<E> mo3806a();

    abstract mlf<E> mo3816b(E e, boolean z);

    public abstract mny<E> mo3817c();

    public /* synthetic */ Iterator descendingIterator() {
        return mo3817c();
    }

    public /* synthetic */ NavigableSet descendingSet() {
        return mo3815b();
    }

    public /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        return m32274c(obj, z);
    }

    public /* synthetic */ SortedSet headSet(Object obj) {
        return m32273c(obj);
    }

    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    public /* synthetic */ NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return m32272b(obj, z, obj2, z2);
    }

    public /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return m32270b(obj, obj2);
    }

    public /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        return m32277d(obj, z);
    }

    public /* synthetic */ SortedSet tailSet(Object obj) {
        return m32276d(obj);
    }

    int m32265a(Object obj, Object obj2) {
        return this.f27810a.compare(obj, obj2);
    }

    mlf(Comparator<? super E> comparator) {
        this.f27810a = comparator;
    }

    public Comparator<? super E> comparator() {
        return this.f27810a;
    }

    public mlf<E> m32273c(E e) {
        return m32274c(e, false);
    }

    public mlf<E> m32274c(E e, boolean z) {
        return mo3813a(bm.m6122a((Object) e), z);
    }

    public mlf<E> m32270b(E e, E e2) {
        return m32272b(e, true, e2, false);
    }

    public mlf<E> m32272b(E e, boolean z, E e2, boolean z2) {
        bm.m6122a((Object) e);
        bm.m6122a((Object) e2);
        bm.m6137a(this.f27810a.compare(e, e2) <= 0);
        return mo3814a(e, z, e2, z2);
    }

    public mlf<E> m32276d(E e) {
        return m32277d(e, true);
    }

    public mlf<E> m32277d(E e, boolean z) {
        return mo3816b(bm.m6122a((Object) e), z);
    }

    public E lower(E e) {
        return mlj.m32466b(m32274c(e, false).mo3817c(), null);
    }

    public E floor(E e) {
        return mlj.m32466b(m32274c(e, true).mo3817c(), null);
    }

    public E ceiling(E e) {
        return gwb.m1631a(m32277d(e, true), null);
    }

    public E higher(E e) {
        return gwb.m1631a(m32277d(e, false), null);
    }

    public E first() {
        return mo3806a().next();
    }

    public E last() {
        return mo3817c().next();
    }

    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public mlf<E> mo3815b() {
        mlf<E> mlf_E = this.f27811b;
        if (mlf_E != null) {
            return mlf_E;
        }
        mlf_E = U_();
        this.f27811b = mlf_E;
        mlf_E.f27811b = this;
        return mlf_E;
    }

    mlf<E> U_() {
        return new mja(this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    Object writeReplace() {
        return new mlh(this.f27810a, toArray());
    }

    static <E> mnd<E> m32263a(Comparator<? super E> comparator) {
        if (mmo.f27910a.equals(comparator)) {
            return mnd.f27940c;
        }
        return new mnd(mna.f27928a, comparator);
    }
}
