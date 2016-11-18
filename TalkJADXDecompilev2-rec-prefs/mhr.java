package p000;

import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

public final class mhr<K, V> extends mhn<K, V> {
    final int f27752b;

    mhr(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
        super(referenceQueue, v, referenceEntry);
        this.f27752b = i;
    }

    public int mo3746a() {
        return this.f27752b;
    }

    public mhi<K, V> mo3747a(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        return new mhr(referenceQueue, v, referenceEntry, this.f27752b);
    }
}
