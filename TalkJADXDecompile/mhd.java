import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;

public final class mhd<K, V> extends mhe<K, V> {
    volatile long a;
    ReferenceEntry<K, V> b;
    ReferenceEntry<K, V> c;
    volatile long d;
    ReferenceEntry<K, V> e;
    ReferenceEntry<K, V> f;

    mhd(K k, int i, ReferenceEntry<K, V> referenceEntry) {
        super(k, i, referenceEntry);
        this.a = Long.MAX_VALUE;
        this.b = LocalCache.i();
        this.c = LocalCache.i();
        this.d = Long.MAX_VALUE;
        this.e = LocalCache.i();
        this.f = LocalCache.i();
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

    public long getWriteTime() {
        return this.d;
    }

    public void setWriteTime(long j) {
        this.d = j;
    }

    public ReferenceEntry<K, V> getNextInWriteQueue() {
        return this.e;
    }

    public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        this.e = referenceEntry;
    }

    public ReferenceEntry<K, V> getPreviousInWriteQueue() {
        return this.f;
    }

    public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        this.f = referenceEntry;
    }
}
