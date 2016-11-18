package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class lh implements Set<K> {
    final /* synthetic */ le f24990a;

    lh(le leVar) {
        this.f24990a = leVar;
    }

    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends K> collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f24990a.mo3689c();
    }

    public boolean contains(Object obj) {
        return this.f24990a.mo3682a(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        Map b = this.f24990a.mo3688b();
        for (Object containsKey : collection) {
            if (!b.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f24990a.mo3681a() == 0;
    }

    public Iterator<K> iterator() {
        return new lf(this.f24990a, 0);
    }

    public boolean remove(Object obj) {
        int a = this.f24990a.mo3682a(obj);
        if (a < 0) {
            return false;
        }
        this.f24990a.mo3685a(a);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        return le.m28159a(this.f24990a.mo3688b(), (Collection) collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return le.m28161b(this.f24990a.mo3688b(), collection);
    }

    public int size() {
        return this.f24990a.mo3681a();
    }

    public Object[] toArray() {
        return this.f24990a.m28171b(0);
    }

    public <T> T[] toArray(T[] tArr) {
        return this.f24990a.m28168a((Object[]) tArr, 0);
    }

    public boolean equals(Object obj) {
        return le.m28160a((Set) this, obj);
    }

    public int hashCode() {
        int i = 0;
        for (int a = this.f24990a.mo3681a() - 1; a >= 0; a--) {
            Object a2 = this.f24990a.mo3683a(a, 0);
            i += a2 == null ? 0 : a2.hashCode();
        }
        return i;
    }
}
