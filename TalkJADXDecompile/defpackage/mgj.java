package defpackage;

import com.google.common.cache.LocalCache.ReferenceEntry;

/* renamed from: mgj */
enum mgj extends mge {
    mgj(String str, int i) {
        super(4, (byte) 0);
    }

    <K, V> ReferenceEntry<K, V> a(mgv<K, V> mgv_K__V, K k, int i, ReferenceEntry<K, V> referenceEntry) {
        return new mhm(mgv_K__V.h, k, i, referenceEntry);
    }
}
