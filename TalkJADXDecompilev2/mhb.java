package defpackage;

import com.google.common.cache.LocalCache.ReferenceEntry;

enum mhb extends mgy {
    mhb(String str, int i) {
        super(str, 2);
    }

    <K, V> mhi<K, V> a(mgv<K, V> mgv_K__V, ReferenceEntry<K, V> referenceEntry, V v, int i) {
        if (i == 1) {
            return new mhn(mgv_K__V.i, v, referenceEntry);
        }
        return new mhr(mgv_K__V.i, v, referenceEntry, i);
    }
}