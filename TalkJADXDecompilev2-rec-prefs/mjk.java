package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public abstract class mjk<E> extends AbstractCollection<E> implements Serializable {
    public abstract mny<E> mo3806a();

    public abstract boolean contains(Object obj);

    abstract boolean mo3822e();

    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    mjk() {
    }

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return mmr.f27915a;
        }
        Object[] objArr = new Object[size];
        mo3832a(objArr, 0);
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        bm.m6122a((Object) tArr);
        int size = size();
        if (tArr.length < size) {
            tArr = gwb.m1961a((Object[]) tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo3832a(tArr, 0);
        return tArr;
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public mjq<E> mo3807f() {
        switch (size()) {
            case 0:
                return mna.f27928a;
            case 1:
                return mjq.m32313a(mo3806a().next());
            default:
                return new mmu(this, toArray());
        }
    }

    int mo3832a(Object[] objArr, int i) {
        Iterator a = mo3806a();
        while (a.hasNext()) {
            int i2 = i + 1;
            objArr[i] = a.next();
            i = i2;
        }
        return i;
    }

    Object writeReplace() {
        return new mju(toArray());
    }
}
