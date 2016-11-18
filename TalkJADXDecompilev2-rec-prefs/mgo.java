package p000;

import com.google.common.cache.LocalCache;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;

public final class mgo extends mgc<Entry<K, V>> {
    final /* synthetic */ LocalCache f27681c;

    public mgo(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
        this.f27681c = localCache;
        super(localCache, concurrentMap);
    }

    public Iterator<Entry<K, V>> iterator() {
        return new mgn(this.f27681c);
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
        key = this.f27681c.get(key);
        if (key == null || !this.f27681c.f8701f.a(entry.getValue(), key)) {
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
        if (key == null || !this.f27681c.remove(key, entry.getValue())) {
            return false;
        }
        return true;
    }
}
