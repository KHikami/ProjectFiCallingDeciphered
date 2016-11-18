package p000;

import com.google.common.cache.LocalCache;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.concurrent.ConcurrentMap;

public abstract class mgc<T> extends AbstractSet<T> {
    final ConcurrentMap<?, ?> f27660a;
    final /* synthetic */ LocalCache f27661b;

    mgc(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
        this.f27661b = localCache;
        this.f27660a = concurrentMap;
    }

    public int size() {
        return this.f27660a.size();
    }

    public boolean isEmpty() {
        return this.f27660a.isEmpty();
    }

    public void clear() {
        this.f27660a.clear();
    }

    public Object[] toArray() {
        return LocalCache.m10507a((Collection) this).toArray();
    }

    public <E> E[] toArray(E[] eArr) {
        return LocalCache.m10507a((Collection) this).toArray(eArr);
    }
}
