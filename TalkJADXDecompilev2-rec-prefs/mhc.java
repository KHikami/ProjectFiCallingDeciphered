package p000;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;

public final class mhc<K, V> extends mhe<K, V> {
    volatile long f27718a = Long.MAX_VALUE;
    ReferenceEntry<K, V> f27719b = LocalCache.m10510i();
    ReferenceEntry<K, V> f27720c = LocalCache.m10510i();

    mhc(K k, int i, ReferenceEntry<K, V> referenceEntry) {
        super(k, i, referenceEntry);
    }

    public long getAccessTime() {
        return this.f27718a;
    }

    public void setAccessTime(long j) {
        this.f27718a = j;
    }

    public ReferenceEntry<K, V> getNextInAccessQueue() {
        return this.f27719b;
    }

    public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27719b = referenceEntry;
    }

    public ReferenceEntry<K, V> getPreviousInAccessQueue() {
        return this.f27720c;
    }

    public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27720c = referenceEntry;
    }
}
