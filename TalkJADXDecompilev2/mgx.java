package defpackage;

import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class mgx<K, V> extends SoftReference<V> implements mhi<K, V> {
    final ReferenceEntry<K, V> a;

    mgx(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        super(v, referenceQueue);
        this.a = referenceEntry;
    }

    public int a() {
        return 1;
    }

    public ReferenceEntry<K, V> b() {
        return this.a;
    }

    public void a(V v) {
    }

    public mhi<K, V> a(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        return new mgx(referenceQueue, v, referenceEntry);
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return true;
    }
}
