package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class mlf<E> extends mli<E> implements NavigableSet<E>, mnl<E> {
    final transient Comparator<? super E> a;
    transient mlf<E> b;

    abstract int a(Object obj);

    abstract mlf<E> a(E e, boolean z);

    abstract mlf<E> a(E e, boolean z, E e2, boolean z2);

    public abstract mny<E> a();

    abstract mlf<E> b(E e, boolean z);

    public abstract mny<E> c();

    public /* synthetic */ Iterator descendingIterator() {
        return c();
    }

    public /* synthetic */ NavigableSet descendingSet() {
        return b();
    }

    public /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        return c(obj, z);
    }

    public /* synthetic */ SortedSet headSet(Object obj) {
        return c(obj);
    }

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    public /* synthetic */ NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return b(obj, z, obj2, z2);
    }

    public /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    public /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        return d(obj, z);
    }

    public /* synthetic */ SortedSet tailSet(Object obj) {
        return d(obj);
    }

    int a(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    mlf(Comparator<? super E> comparator) {
        this.a = comparator;
    }

    public Comparator<? super E> comparator() {
        return this.a;
    }

    public mlf<E> c(E e) {
        return c(e, false);
    }

    public mlf<E> c(E e, boolean z) {
        return a(bm.a((Object) e), z);
    }

    public mlf<E> b(E e, E e2) {
        return b(e, true, e2, false);
    }

    public mlf<E> b(E e, boolean z, E e2, boolean z2) {
        bm.a((Object) e);
        bm.a((Object) e2);
        bm.a(this.a.compare(e, e2) <= 0);
        return a(e, z, e2, z2);
    }

    public mlf<E> d(E e) {
        return d(e, true);
    }

    public mlf<E> d(E e, boolean z) {
        return b(bm.a((Object) e), z);
    }

    public E lower(E e) {
        return mlj.b(c(e, false).c(), null);
    }

    public E floor(E e) {
        return mlj.b(c(e, true).c(), null);
    }

    public E ceiling(E e) {
        return gwb.a(d(e, true), null);
    }

    public E higher(E e) {
        return gwb.a(d(e, false), null);
    }

    public E first() {
        return a().next();
    }

    public E last() {
        return c().next();
    }

    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public mlf<E> b() {
        mlf<E> mlf_E = this.b;
        if (mlf_E != null) {
            return mlf_E;
        }
        mlf_E = U_();
        this.b = mlf_E;
        mlf_E.b = this;
        return mlf_E;
    }

    mlf<E> U_() {
        return new mja(this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    Object writeReplace() {
        return new mlh(this.a, toArray());
    }

    static <E> mnd<E> a(Comparator<? super E> comparator) {
        if (mmo.a.equals(comparator)) {
            return mnd.c;
        }
        return new mnd(mna.a, comparator);
    }
}
