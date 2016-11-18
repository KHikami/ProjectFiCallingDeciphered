package defpackage;

import com.google.common.cache.LocalCache.ReferenceEntry;

enum mha extends mgy {
    mha(String str, int i) {
        super(str, 1);
    }

    <K, V> mhi<K, V> a(mgv<K, V> mgv_K__V, ReferenceEntry<K, V> referenceEntry, V v, int i) {
        if (i == 1) {
            return new mgx(mgv_K__V.i, v, referenceEntry);
        }
        return new mhp(mgv_K__V.i, v, referenceEntry, i);
    }
}
