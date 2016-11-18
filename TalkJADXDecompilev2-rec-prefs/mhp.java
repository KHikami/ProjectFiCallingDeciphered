package p000;

import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

public final class mhp<K, V> extends mgx<K, V> {
    final int f27750b;

    mhp(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
        super(referenceQueue, v, referenceEntry);
        this.f27750b = i;
    }

    public int mo3746a() {
        return this.f27750b;
    }

    public mhi<K, V> mo3747a(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        return new mhp(referenceQueue, v, referenceEntry, this.f27750b);
    }
}
