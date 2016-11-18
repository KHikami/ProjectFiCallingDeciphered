package defpackage;

import com.google.common.cache.LocalCache.ReferenceEntry;

enum mgg extends mge {
    mgg(String str, int i) {
        super(str, 1);
    }

    <K, V> ReferenceEntry<K, V> a(mgv<K, V> mgv_K__V, K k, int i, ReferenceEntry<K, V> referenceEntry) {
        return new mhc(k, i, referenceEntry);
    }

    <K, V> ReferenceEntry<K, V> a(mgv<K, V> mgv_K__V, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        ReferenceEntry<K, V> a = super.a(mgv_K__V, referenceEntry, referenceEntry2);
        a(referenceEntry, a);
        return a;
    }
}
