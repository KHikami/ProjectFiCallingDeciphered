package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class icj implements Set<K> {
    final /* synthetic */ ich a;

    icj(ich ich) {
        this.a = ich;
    }

    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends K> collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.a.c();
    }

    public boolean contains(Object obj) {
        return this.a.a(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        Map b = this.a.b();
        for (Object containsKey : collection) {
            if (!b.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.a.a() == 0;
    }

    public Iterator<K> iterator() {
        return new ici(this.a, 0);
    }

    public boolean remove(Object obj) {
        int a = this.a.a(obj);
        if (a < 0) {
            return false;
        }
        this.a.b(a);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        Map b = this.a.b();
        int size = b.size();
        for (Object remove : collection) {
            b.remove(remove);
        }
        return size != b.size();
    }

    public boolean retainAll(Collection<?> collection) {
        Map b = this.a.b();
        int size = b.size();
        Iterator it = b.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != b.size();
    }

    public int size() {
        return this.a.a();
    }

    public Object[] toArray() {
        return this.a.c(0);
    }

    public <T> T[] toArray(T[] tArr) {
        return this.a.a((Object[]) tArr, 0);
    }

    public boolean equals(Object obj) {
        return ich.a((Set) this, obj);
    }

    public int hashCode() {
        int i = 0;
        for (int a = this.a.a() - 1; a >= 0; a--) {
            Object a2 = this.a.a(a);
            i += a2 == null ? 0 : a2.hashCode();
        }
        return i;
    }
}
