package p000;

import java.util.Collection;
import java.util.Iterator;

final class lj implements Collection<V> {
    final /* synthetic */ le f25075a;

    lj(le leVar) {
        this.f25075a = leVar;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends V> collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f25075a.mo3689c();
    }

    public boolean contains(Object obj) {
        return this.f25075a.mo3687b(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f25075a.mo3681a() == 0;
    }

    public Iterator<V> iterator() {
        return new lf(this.f25075a, 1);
    }

    public boolean remove(Object obj) {
        int b = this.f25075a.mo3687b(obj);
        if (b < 0) {
            return false;
        }
        this.f25075a.mo3685a(b);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        int i = 0;
        int a = this.f25075a.mo3681a();
        boolean z = false;
        while (i < a) {
            if (collection.contains(this.f25075a.mo3683a(i, 1))) {
                this.f25075a.mo3685a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        int i = 0;
        int a = this.f25075a.mo3681a();
        boolean z = false;
        while (i < a) {
            if (!collection.contains(this.f25075a.mo3683a(i, 1))) {
                this.f25075a.mo3685a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public int size() {
        return this.f25075a.mo3681a();
    }

    public Object[] toArray() {
        return this.f25075a.m28171b(1);
    }

    public <T> T[] toArray(T[] tArr) {
        return this.f25075a.m28168a((Object[]) tArr, 1);
    }
}
