package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class mjq<E> extends mjk<E> implements List<E>, RandomAccess {
    public /* synthetic */ Iterator iterator() {
        return a();
    }

    public /* synthetic */ ListIterator listIterator() {
        return c();
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        return a(i);
    }

    public /* synthetic */ List subList(int i, int i2) {
        return a(i, i2);
    }

    public static <E> mjq<E> a(E e) {
        return new mnj(e);
    }

    public static <E> mjq<E> a(Collection<? extends E> collection) {
        if (collection instanceof mjk) {
            mjq<E> f = ((mjk) collection).f();
            if (!f.e()) {
                return f;
            }
            Object[] toArray = f.toArray();
            return mjq.b(toArray, toArray.length);
        }
        toArray = collection.toArray();
        toArray = mmr.b(toArray, toArray.length);
        return mjq.b(toArray, toArray.length);
    }

    public static <E> mjq<E> a(E[] eArr) {
        switch (eArr.length) {
            case 0:
                return mna.a;
            case 1:
                return new mnj(eArr[0]);
            default:
                Object[] objArr = (Object[]) eArr.clone();
                return new mna(mmr.b(objArr, objArr.length));
        }
    }

    public static <E> mjq<E> b(Object[] objArr, int i) {
        switch (i) {
            case 0:
                return mna.a;
            case 1:
                return new mnj(objArr[0]);
            default:
                if (i < objArr.length) {
                    objArr = mmr.a(objArr, i);
                }
                return new mna(objArr);
        }
    }

    mjq() {
    }

    public mny<E> a() {
        return c();
    }

    public mnz<E> c() {
        return a(0);
    }

    public mnz<E> a(int i) {
        return new mjr(this, size(), i);
    }

    public int indexOf(Object obj) {
        return obj == null ? -1 : ba.b((List) this, obj);
    }

    public int lastIndexOf(Object obj) {
        return obj == null ? -1 : ba.d((List) this, obj);
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public mjq<E> a(int i, int i2) {
        bm.a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        switch (i3) {
            case 0:
                return mna.a;
            case 1:
                return mjq.a(get(i));
            default:
                return b(i, i2);
        }
    }

    mjq<E> b(int i, int i2) {
        return new mjv(this, i, i2 - i);
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final mjq<E> f() {
        return this;
    }

    int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public mjq<E> d() {
        return size() <= 1 ? this : new mjt(this);
    }

    public boolean equals(Object obj) {
        return ba.a((List) this, obj);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    Object writeReplace() {
        return new mju(toArray());
    }
}
