package p000;

import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class mgx<K, V> extends SoftReference<V> implements mhi<K, V> {
    final ReferenceEntry<K, V> f27708a;

    mgx(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        super(v, referenceQueue);
        this.f27708a = referenceEntry;
    }

    public int mo3746a() {
        return 1;
    }

    public ReferenceEntry<K, V> mo3749b() {
        return this.f27708a;
    }

    public void mo3748a(V v) {
    }

    public mhi<K, V> mo3747a(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        return new mgx(referenceQueue, v, referenceEntry);
    }

    public boolean mo3750c() {
        return false;
    }

    public boolean mo3751d() {
        return true;
    }
}
