package defpackage;

import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

public final class mhp<K, V> extends mgx<K, V> {
    final int b;

    mhp(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
        super(referenceQueue, v, referenceEntry);
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public mhi<K, V> a(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        return new mhp(referenceQueue, v, referenceEntry, this.b);
    }
}
