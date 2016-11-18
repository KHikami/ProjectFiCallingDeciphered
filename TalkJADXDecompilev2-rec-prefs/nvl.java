package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class nvl<E> extends AbstractList<E> implements nxb<E> {
    boolean f31132a = true;

    nvl() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(E e) {
        m36736c();
        return super.add(e);
    }

    public void add(int i, E e) {
        m36736c();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        m36736c();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        m36736c();
        return super.addAll(i, collection);
    }

    public void clear() {
        m36736c();
        super.clear();
    }

    public boolean mo3980a() {
        return this.f31132a;
    }

    public final void mo3981b() {
        this.f31132a = false;
    }

    public E remove(int i) {
        m36736c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        m36736c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        m36736c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        m36736c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        m36736c();
        return super.set(i, e);
    }

    protected void m36736c() {
        if (!this.f31132a) {
            throw new UnsupportedOperationException();
        }
    }
}
