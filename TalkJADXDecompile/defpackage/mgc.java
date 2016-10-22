package defpackage;

import com.google.common.cache.LocalCache;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.concurrent.ConcurrentMap;

/* renamed from: mgc */
public abstract class mgc<T> extends AbstractSet<T> {
    final ConcurrentMap<?, ?> a;
    final /* synthetic */ LocalCache b;

    mgc(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
        this.b = localCache;
        this.a = concurrentMap;
    }

    public int size() {
        return this.a.size();
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public void clear() {
        this.a.clear();
    }

    public Object[] toArray() {
        return LocalCache.a((Collection) this).toArray();
    }

    public <E> E[] toArray(E[] eArr) {
        return LocalCache.a((Collection) this).toArray(eArr);
    }
}
