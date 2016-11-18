package defpackage;

import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

public interface mhi<K, V> {
    int a();

    mhi<K, V> a(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry);

    void a(V v);

    ReferenceEntry<K, V> b();

    boolean c();

    boolean d();

    V get();
}
