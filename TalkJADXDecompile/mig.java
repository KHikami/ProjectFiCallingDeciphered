import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class mig extends mlz<K, Collection<V>> {
    final /* synthetic */ mic a;

    mig(mic mic, Map<K, Collection<V>> map) {
        this.a = mic;
        super(map);
    }

    public Iterator<K> iterator() {
        return new mih(this, a().entrySet().iterator());
    }

    public boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) a().remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.a.b -= size;
            i = size;
        } else {
            i = 0;
        }
        return i > 0;
    }

    public void clear() {
        mlj.d(iterator());
    }

    public boolean containsAll(Collection<?> collection) {
        return a().keySet().containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this == obj || a().keySet().equals(obj);
    }

    public int hashCode() {
        return a().keySet().hashCode();
    }
}
