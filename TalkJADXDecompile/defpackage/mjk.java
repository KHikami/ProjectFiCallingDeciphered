package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: mjk */
public abstract class mjk<E> extends AbstractCollection<E> implements Serializable {
    public abstract mny<E> a();

    public abstract boolean contains(Object obj);

    abstract boolean e();

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    mjk() {
    }

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return mmr.a;
        }
        Object[] objArr = new Object[size];
        a(objArr, 0);
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        bm.a((Object) tArr);
        int size = size();
        if (tArr.length < size) {
            tArr = gwb.a((Object[]) tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
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

    public mjq<E> f() {
        switch (size()) {
            case wi.w /*0*/:
                return mna.a;
            case wi.j /*1*/:
                return mjq.a(a().next());
            default:
                return new mmu(this, toArray());
        }
    }

    int a(Object[] objArr, int i) {
        Iterator a = a();
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
