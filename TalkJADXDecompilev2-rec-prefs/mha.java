package p000;

import com.google.common.cache.LocalCache.ReferenceEntry;

enum mha extends mgy {
    mha(String str, int i) {
        super(str, 1);
    }

    <K, V> mhi<K, V> mo3773a(mgv<K, V> mgv_K__V, ReferenceEntry<K, V> referenceEntry, V v, int i) {
        if (i == 1) {
            return new mgx(mgv_K__V.f27698i, v, referenceEntry);
        }
        return new mhp(mgv_K__V.f27698i, v, referenceEntry, i);
    }
}
