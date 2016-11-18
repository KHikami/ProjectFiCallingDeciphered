package defpackage;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

public final class mho<K, V> extends mhm<K, V> {
    volatile long a = Long.MAX_VALUE;
    ReferenceEntry<K, V> b = LocalCache.i();
    ReferenceEntry<K, V> c = LocalCache.i();

    mho(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
        super(referenceQueue, k, i, referenceEntry);
    }

    public long getWriteTime() {
        return this.a;
    }

    public void setWriteTime(long j) {
        this.a = j;
    }

    public ReferenceEntry<K, V> getNextInWriteQueue() {
        return this.b;
    }

    public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        this.b = referenceEntry;
    }

    public ReferenceEntry<K, V> getPreviousInWriteQueue() {
        return this.c;
    }

    public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        this.c = referenceEntry;
    }
}