package p000;

import com.google.common.cache.LocalCache;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public final class mgr extends mgc<K> {
    final /* synthetic */ LocalCache f27683c;

    public mgr(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
        this.f27683c = localCache;
        super(localCache, concurrentMap);
    }

    public Iterator<K> iterator() {
        return new mgq(this.f27683c);
    }

    public boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public boolean remove(Object obj) {
        return this.a.remove(obj) != null;
    }
}
