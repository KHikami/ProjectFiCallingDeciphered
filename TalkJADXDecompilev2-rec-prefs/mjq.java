package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class mjq<E> extends mjk<E> implements List<E>, RandomAccess {
    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    public /* synthetic */ ListIterator listIterator() {
        return m32322c();
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        return mo3871a(i);
    }

    public /* synthetic */ List subList(int i, int i2) {
        return mo3855a(i, i2);
    }

    public static <E> mjq<E> m32313a(E e) {
        return new mnj(e);
    }

    public static <E> mjq<E> m32314a(Collection<? extends E> collection) {
        if (collection instanceof mjk) {
            mjq<E> f = ((mjk) collection).mo3807f();
            if (!f.mo3822e()) {
                return f;
            }
            Object[] toArray = f.toArray();
            return mjq.m32316b(toArray, toArray.length);
        }
        toArray = collection.toArray();
        toArray = mmr.m32524b(toArray, toArray.length);
        return mjq.m32316b(toArray, toArray.length);
    }

    public static <E> mjq<E> m32315a(E[] eArr) {
        switch (eArr.length) {
            case 0:
                return mna.f27928a;
            case 1:
                return new mnj(eArr[0]);
            default:
                Object[] objArr = (Object[]) eArr.clone();
                return new mna(mmr.m32524b(objArr, objArr.length));
        }
    }

    public static <E> mjq<E> m32316b(Object[] objArr, int i) {
        switch (i) {
            case 0:
                return mna.f27928a;
            case 1:
                return new mnj(objArr[0]);
            default:
                if (i < objArr.length) {
                    objArr = mmr.m32523a(objArr, i);
                }
                return new mna(objArr);
        }
    }

    mjq() {
    }

    public mny<E> mo3806a() {
        return m32322c();
    }

    public mnz<E> m32322c() {
        return mo3871a(0);
    }

    public mnz<E> mo3871a(int i) {
        return new mjr(this, size(), i);
    }

    public int indexOf(Object obj) {
        return obj == null ? -1 : ba.m4595b((List) this, obj);
    }

    public int lastIndexOf(Object obj) {
        return obj == null ? -1 : ba.m4625d((List) this, obj);
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public mjq<E> mo3855a(int i, int i2) {
        bm.m6127a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        switch (i3) {
            case 0:
                return mna.f27928a;
            case 1:
                return mjq.m32313a(get(i));
            default:
                return mo3872b(i, i2);
        }
    }

    mjq<E> mo3872b(int i, int i2) {
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

    public final mjq<E> mo3807f() {
        return this;
    }

    int mo3832a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public mjq<E> mo3856d() {
        return size() <= 1 ? this : new mjt(this);
    }

    public boolean equals(Object obj) {
        return ba.m4585a((List) this, obj);
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
