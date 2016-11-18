package p000;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

public final class mhk<K, V> extends mhm<K, V> {
    volatile long f27737a = Long.MAX_VALUE;
    ReferenceEntry<K, V> f27738b = LocalCache.m10510i();
    ReferenceEntry<K, V> f27739c = LocalCache.m10510i();

    mhk(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
        super(referenceQueue, k, i, referenceEntry);
    }

    public long getAccessTime() {
        return this.f27737a;
    }

    public void setAccessTime(long j) {
        this.f27737a = j;
    }

    public ReferenceEntry<K, V> getNextInAccessQueue() {
        return this.f27738b;
    }

    public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27738b = referenceEntry;
    }

    public ReferenceEntry<K, V> getPreviousInAccessQueue() {
        return this.f27739c;
    }

    public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27739c = referenceEntry;
    }
}
