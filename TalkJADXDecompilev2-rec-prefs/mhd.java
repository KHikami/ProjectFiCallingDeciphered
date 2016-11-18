package p000;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;

public final class mhd<K, V> extends mhe<K, V> {
    volatile long f27721a = Long.MAX_VALUE;
    ReferenceEntry<K, V> f27722b = LocalCache.m10510i();
    ReferenceEntry<K, V> f27723c = LocalCache.m10510i();
    volatile long f27724d = Long.MAX_VALUE;
    ReferenceEntry<K, V> f27725e = LocalCache.m10510i();
    ReferenceEntry<K, V> f27726f = LocalCache.m10510i();

    mhd(K k, int i, ReferenceEntry<K, V> referenceEntry) {
        super(k, i, referenceEntry);
    }

    public long getAccessTime() {
        return this.f27721a;
    }

    public void setAccessTime(long j) {
        this.f27721a = j;
    }

    public ReferenceEntry<K, V> getNextInAccessQueue() {
        return this.f27722b;
    }

    public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27722b = referenceEntry;
    }

    public ReferenceEntry<K, V> getPreviousInAccessQueue() {
        return this.f27723c;
    }

    public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27723c = referenceEntry;
    }

    public long getWriteTime() {
        return this.f27724d;
    }

    public void setWriteTime(long j) {
        this.f27724d = j;
    }

    public ReferenceEntry<K, V> getNextInWriteQueue() {
        return this.f27725e;
    }

    public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27725e = referenceEntry;
    }

    public ReferenceEntry<K, V> getPreviousInWriteQueue() {
        return this.f27726f;
    }

    public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f27726f = referenceEntry;
    }
}
