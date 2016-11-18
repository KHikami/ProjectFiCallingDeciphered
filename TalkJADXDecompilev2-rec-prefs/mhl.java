package p000;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

public final class mhl<K, V> extends mhm<K, V> {
    volatile long f27740a = Long.MAX_VALUE;
    ReferenceEntry<K, V> f27741b = LocalCache.m10510i();
    ReferenceEntry<K, V> f27742c = LocalCache.m10510i();
    volatile long f27743d = Long.MAX_VALUE;
    ReferenceEntry<K, V> f27744e = LocalCache.m10510i();
    ReferenceEntry<K, V> f27745f = LocalCache.m10510i();

    mhl(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
        super(referenceQueue, k, i, referenceEntry);
    }

    public long getAccessTime() {
        return this.f27740a;
    }

    public void setAccessTime(long j) {
        this.f27740a = j;
    }

    public ReferenceEntry<K, V> getNextInAccessQueue() {
        return this.f27741b;
    }

    public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27741b = referenceEntry;
    }

    public ReferenceEntry<K, V> getPreviousInAccessQueue() {
        return this.f27742c;
    }

    public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27742c = referenceEntry;
    }

    public long getWriteTime() {
        return this.f27743d;
    }

    public void setWriteTime(long j) {
        this.f27743d = j;
    }

    public ReferenceEntry<K, V> getNextInWriteQueue() {
        return this.f27744e;
    }

    public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27744e = referenceEntry;
    }

    public ReferenceEntry<K, V> getPreviousInWriteQueue() {
        return this.f27745f;
    }

    public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27745f = referenceEntry;
    }
}
