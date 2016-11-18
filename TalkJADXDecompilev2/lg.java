package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class lg implements Set<Entry<K, V>> {
    final /* synthetic */ le a;

    lg(le leVar) {
        this.a = leVar;
    }

    public boolean addAll(Collection<? extends Entry<K, V>> collection) {
        int a = this.a.a();
        for (Entry entry : collection) {
            this.a.a(entry.getKey(), entry.getValue());
        }
        return a != this.a.a();
    }

    public void clear() {
        this.a.c();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        int a = this.a.a(entry.getKey());
        if (a >= 0) {
            return la.a(this.a.a(a, 1), entry.getValue());
        }
        return false;
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
        return this.a.a() == 0;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new li(this.a);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.a.a();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public <T> T[] toArray(T[] tArr) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        return le.a((Set) this, obj);
    }

    public int hashCode() {
        int a = this.a.a() - 1;
        int i = 0;
        while (a >= 0) {
            int i2;
            Object a2 = this.a.a(a, 0);
            Object a3 = this.a.a(a, 1);
            int hashCode = a2 == null ? 0 : a2.hashCode();
            if (a3 == null) {
                i2 = 0;
            } else {
                i2 = a3.hashCode();
            }
            a--;
            i += i2 ^ hashCode;
        }
        return i;
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }
}
