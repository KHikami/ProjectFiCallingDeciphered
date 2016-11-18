package defpackage;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;

public final class mhc<K, V> extends mhe<K, V> {
    volatile long a = Long.MAX_VALUE;
    ReferenceEntry<K, V> b = LocalCache.i();
    ReferenceEntry<K, V> c = LocalCache.i();

    mhc(K k, int i, ReferenceEntry<K, V> referenceEntry) {
        super(k, i, referenceEntry);
    }

    public long getAccessTime() {
        return this.a;
    }

    public void setAccessTime(long j) {
        this.a = j;
    }

    public ReferenceEntry<K, V> getNextInAccessQueue() {
        return this.b;
    }

    public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        this.b = referenceEntry;
    }

    public ReferenceEntry<K, V> getPreviousInAccessQueue() {
        return this.c;
    }

    public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        this.c = referenceEntry;
    }
}
