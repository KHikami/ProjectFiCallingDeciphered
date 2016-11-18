package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class mig extends mlz<K, Collection<V>> {
    final /* synthetic */ mic f27780a;

    mig(mic mic, Map<K, Collection<V>> map) {
        this.f27780a = mic;
        super(map);
    }

    public Iterator<K> iterator() {
        return new mih(this, m32199a().entrySet().iterator());
    }

    public boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) m32199a().remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f27780a.f27769b -= size;
            i = size;
        } else {
            i = 0;
        }
        return i > 0;
    }

    public void clear() {
        mlj.m32469d(iterator());
    }

    public boolean containsAll(Collection<?> collection) {
        return m32199a().keySet().containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this == obj || m32199a().keySet().equals(obj);
    }

    public int hashCode() {
        return m32199a().keySet().hashCode();
    }
}
