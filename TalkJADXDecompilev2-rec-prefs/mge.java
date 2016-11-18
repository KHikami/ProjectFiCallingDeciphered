package p000;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;

public enum mge {
    STRONG,
    STRONG_ACCESS,
    STRONG_WRITE,
    STRONG_ACCESS_WRITE,
    WEAK,
    WEAK_ACCESS,
    WEAK_WRITE,
    WEAK_ACCESS_WRITE;
    
    static final mge[] f27670i = null;

    abstract <K, V> ReferenceEntry<K, V> mo3770a(mgv<K, V> mgv_K__V, K k, int i, ReferenceEntry<K, V> referenceEntry);

    static {
        f27670i = new mge[]{STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};
    }

    <K, V> ReferenceEntry<K, V> mo3771a(mgv<K, V> mgv_K__V, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        return mo3770a(mgv_K__V, referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
    }

    <K, V> void m32033a(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry2.setAccessTime(referenceEntry.getAccessTime());
        LocalCache.m10508a(referenceEntry.getPreviousInAccessQueue(), (ReferenceEntry) referenceEntry2);
        LocalCache.m10508a((ReferenceEntry) referenceEntry2, referenceEntry.getNextInAccessQueue());
        ReferenceEntry referenceEntry3 = mgu.INSTANCE;
        referenceEntry.setNextInAccessQueue(referenceEntry3);
        referenceEntry.setPreviousInAccessQueue(referenceEntry3);
    }

    <K, V> void m32034b(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry2.setWriteTime(referenceEntry.getWriteTime());
        LocalCache.m10509b(referenceEntry.getPreviousInWriteQueue(), (ReferenceEntry) referenceEntry2);
        LocalCache.m10509b((ReferenceEntry) referenceEntry2, referenceEntry.getNextInWriteQueue());
        ReferenceEntry referenceEntry3 = mgu.INSTANCE;
        referenceEntry.setNextInWriteQueue(referenceEntry3);
        referenceEntry.setPreviousInWriteQueue(referenceEntry3);
    }
}
