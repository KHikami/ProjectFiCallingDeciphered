import com.google.common.cache.LocalCache;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;

public final class mgo extends mgc<Entry<K, V>> {
    final /* synthetic */ LocalCache c;

    public mgo(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
        this.c = localCache;
        super(localCache, concurrentMap);
    }

    public Iterator<Entry<K, V>> iterator() {
        return new mgn(this.c);
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object key = entry.getKey();
        if (key == null) {
            return false;
        }
        key = this.c.get(key);
        if (key == null || !this.c.f.a(entry.getValue(), key)) {
            return false;
        }
        return true;
    }

    public boolean remove(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object key = entry.getKey();
        if (key == null || !this.c.remove(key, entry.getValue())) {
            return false;
        }
        return true;
    }
}
