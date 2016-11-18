package p000;

import com.google.common.cache.LocalCache;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public final class mhj extends AbstractCollection<V> {
    final /* synthetic */ LocalCache f27732a;
    private final ConcurrentMap<?, ?> f27733b;

    public mhj(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
        this.f27732a = localCache;
        this.f27733b = concurrentMap;
    }

    public int size() {
        return this.f27733b.size();
    }

    public boolean isEmpty() {
        return this.f27733b.isEmpty();
    }

    public void clear() {
        this.f27733b.clear();
    }

    public Iterator<V> iterator() {
        return new mhh(this.f27732a);
    }

    public boolean contains(Object obj) {
        return this.f27733b.containsValue(obj);
    }

    public Object[] toArray() {
        return LocalCache.m10507a((Collection) this).toArray();
    }

    public <E> E[] toArray(E[] eArr) {
        return LocalCache.m10507a((Collection) this).toArray(eArr);
    }
}
