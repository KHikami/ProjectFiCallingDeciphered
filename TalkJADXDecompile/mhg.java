import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;

public final class mhg<K, V> extends mhe<K, V> {
    volatile long a;
    ReferenceEntry<K, V> b;
    ReferenceEntry<K, V> c;

    mhg(K k, int i, ReferenceEntry<K, V> referenceEntry) {
        super(k, i, referenceEntry);
        this.a = Long.MAX_VALUE;
        this.b = LocalCache.i();
        this.c = LocalCache.i();
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
