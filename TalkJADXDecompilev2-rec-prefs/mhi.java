package p000;

import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

public interface mhi<K, V> {
    int mo3746a();

    mhi<K, V> mo3747a(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry);

    void mo3748a(V v);

    ReferenceEntry<K, V> mo3749b();

    boolean mo3750c();

    boolean mo3751d();

    V get();
}
