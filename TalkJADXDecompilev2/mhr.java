package defpackage;

import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

public final class mhr<K, V> extends mhn<K, V> {
    final int b;

    mhr(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
        super(referenceQueue, v, referenceEntry);
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public mhi<K, V> a(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        return new mhr(referenceQueue, v, referenceEntry, this.b);
    }
}
