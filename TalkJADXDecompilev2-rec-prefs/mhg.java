package p000;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;

public final class mhg<K, V> extends mhe<K, V> {
    volatile long f27728a = Long.MAX_VALUE;
    ReferenceEntry<K, V> f27729b = LocalCache.m10510i();
    ReferenceEntry<K, V> f27730c = LocalCache.m10510i();

    mhg(K k, int i, ReferenceEntry<K, V> referenceEntry) {
        super(k, i, referenceEntry);
    }

    public long getWriteTime() {
        return this.f27728a;
    }

    public void setWriteTime(long j) {
        this.f27728a = j;
    }

    public ReferenceEntry<K, V> getNextInWriteQueue() {
        return this.f27729b;
    }

    public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27729b = referenceEntry;
    }

    public ReferenceEntry<K, V> getPreviousInWriteQueue() {
        return this.f27730c;
    }

    public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27730c = referenceEntry;
    }
}
