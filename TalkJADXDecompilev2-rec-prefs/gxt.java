package p000;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;

public final class gxt<E> extends AbstractSet<E> {
    private final ky<E, E> f16359a = new ky();

    private boolean m18925a(gxt<? extends E> gxt__extends_E) {
        int size = size();
        this.f16359a.m28015a(gxt__extends_E.f16359a);
        return size() > size;
    }

    public boolean add(E e) {
        if (this.f16359a.containsKey(e)) {
            return false;
        }
        this.f16359a.put(e, e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        return collection instanceof gxt ? m18925a((gxt) collection) : super.addAll(collection);
    }

    public void clear() {
        this.f16359a.clear();
    }

    public boolean contains(Object obj) {
        return this.f16359a.containsKey(obj);
    }

    public Iterator<E> iterator() {
        return this.f16359a.keySet().iterator();
    }

    public boolean remove(Object obj) {
        if (!this.f16359a.containsKey(obj)) {
            return false;
        }
        this.f16359a.remove(obj);
        return true;
    }

    public int size() {
        return this.f16359a.size();
    }
}
