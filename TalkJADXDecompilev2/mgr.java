package defpackage;

import com.google.common.cache.LocalCache;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public final class mgr extends mgc<K> {
    final /* synthetic */ LocalCache c;

    public mgr(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
        this.c = localCache;
        super(localCache, concurrentMap);
    }

    public Iterator<K> iterator() {
        return new mgq(this.c);
    }

    public boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public boolean remove(Object obj) {
        return this.a.remove(obj) != null;
    }
}
