package p000;

import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

public class mhf<K, V> implements mhi<K, V> {
    final V f27727a;

    mhf(V v) {
        this.f27727a = v;
    }

    public V get() {
        return this.f27727a;
    }

    public int mo3746a() {
        return 1;
    }

    public ReferenceEntry<K, V> mo3749b() {
        return null;
    }

    public mhi<K, V> mo3747a(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        return this;
    }

    public boolean mo3750c() {
        return false;
    }

    public boolean mo3751d() {
        return true;
    }

    public void mo3748a(V v) {
    }
}
