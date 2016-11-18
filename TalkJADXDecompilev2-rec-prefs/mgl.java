package p000;

import com.google.common.cache.LocalCache.ReferenceEntry;

enum mgl extends mge {
    mgl(String str, int i) {
        super(str, 6);
    }

    <K, V> ReferenceEntry<K, V> mo3770a(mgv<K, V> mgv_K__V, K k, int i, ReferenceEntry<K, V> referenceEntry) {
        return new mho(mgv_K__V.f27697h, k, i, referenceEntry);
    }

    <K, V> ReferenceEntry<K, V> mo3771a(mgv<K, V> mgv_K__V, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        ReferenceEntry<K, V> a = super.mo3771a(mgv_K__V, referenceEntry, referenceEntry2);
        m32034b(referenceEntry, a);
        return a;
    }
}
