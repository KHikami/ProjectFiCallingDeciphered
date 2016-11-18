package defpackage;

import com.google.common.cache.LocalCache;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public final class mhj extends AbstractCollection<V> {
    final /* synthetic */ LocalCache a;
    private final ConcurrentMap<?, ?> b;

    public mhj(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
        this.a = localCache;
        this.b = concurrentMap;
    }

    public int size() {
        return this.b.size();
    }

    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    public void clear() {
        this.b.clear();
    }

    public Iterator<V> iterator() {
        return new mhh(this.a);
    }

    public boolean contains(Object obj) {
        return this.b.containsValue(obj);
    }

    public Object[] toArray() {
        return LocalCache.a((Collection) this).toArray();
    }

    public <E> E[] toArray(E[] eArr) {
        return LocalCache.a((Collection) this).toArray(eArr);
    }
}
