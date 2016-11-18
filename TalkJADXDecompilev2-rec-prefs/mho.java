package p000;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

public final class mho<K, V> extends mhm<K, V> {
    volatile long f27747a = Long.MAX_VALUE;
    ReferenceEntry<K, V> f27748b = LocalCache.m10510i();
    ReferenceEntry<K, V> f27749c = LocalCache.m10510i();

    mho(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
        super(referenceQueue, k, i, referenceEntry);
    }

    public long getWriteTime() {
        return this.f27747a;
    }

    public void setWriteTime(long j) {
        this.f27747a = j;
    }

    public ReferenceEntry<K, V> getNextInWriteQueue() {
        return this.f27748b;
    }

    public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27748b = referenceEntry;
    }

    public ReferenceEntry<K, V> getPreviousInWriteQueue() {
        return this.f27749c;
    }

    public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27749c = referenceEntry;
    }
}
