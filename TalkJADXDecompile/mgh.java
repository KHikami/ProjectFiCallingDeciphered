import com.google.common.cache.LocalCache.ReferenceEntry;

enum mgh extends mge {
    mgh(String str, int i) {
        super(2, (byte) 0);
    }

    <K, V> ReferenceEntry<K, V> a(mgv<K, V> mgv_K__V, K k, int i, ReferenceEntry<K, V> referenceEntry) {
        return new mhg(k, i, referenceEntry);
    }

    <K, V> ReferenceEntry<K, V> a(mgv<K, V> mgv_K__V, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        ReferenceEntry<K, V> a = super.a(mgv_K__V, referenceEntry, referenceEntry2);
        b(referenceEntry, a);
        return a;
    }
}
