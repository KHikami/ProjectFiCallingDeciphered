package defpackage;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;

/* renamed from: mge */
public enum mge {
    STRONG,
    STRONG_ACCESS,
    STRONG_WRITE,
    STRONG_ACCESS_WRITE,
    WEAK,
    WEAK_ACCESS,
    WEAK_WRITE,
    WEAK_ACCESS_WRITE;
    
    static final mge[] i;

    abstract <K, V> ReferenceEntry<K, V> a(mgv<K, V> mgv_K__V, K k, int i, ReferenceEntry<K, V> referenceEntry);

    static {
        i = new mge[]{STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};
    }

    <K, V> ReferenceEntry<K, V> a(mgv<K, V> mgv_K__V, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        return a(mgv_K__V, referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
    }

    <K, V> void a(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry2.setAccessTime(referenceEntry.getAccessTime());
        LocalCache.a(referenceEntry.getPreviousInAccessQueue(), (ReferenceEntry) referenceEntry2);
        LocalCache.a((ReferenceEntry) referenceEntry2, referenceEntry.getNextInAccessQueue());
        ReferenceEntry referenceEntry3 = mgu.INSTANCE;
        referenceEntry.setNextInAccessQueue(referenceEntry3);
        referenceEntry.setPreviousInAccessQueue(referenceEntry3);
    }

    <K, V> void b(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry2.setWriteTime(referenceEntry.getWriteTime());
        LocalCache.b(referenceEntry.getPreviousInWriteQueue(), (ReferenceEntry) referenceEntry2);
        LocalCache.b((ReferenceEntry) referenceEntry2, referenceEntry.getNextInWriteQueue());
        ReferenceEntry referenceEntry3 = mgu.INSTANCE;
        referenceEntry.setNextInWriteQueue(referenceEntry3);
        referenceEntry.setPreviousInWriteQueue(referenceEntry3);
    }
}
