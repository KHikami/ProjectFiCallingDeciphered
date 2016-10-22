package defpackage;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;

/* renamed from: mhe */
public class mhe<K, V> extends mgd<K, V> {
    final K g;
    final int h;
    final ReferenceEntry<K, V> i;
    volatile mhi<K, V> j;

    mhe(K k, int i, ReferenceEntry<K, V> referenceEntry) {
        this.j = LocalCache.r;
        this.g = k;
        this.h = i;
        this.i = referenceEntry;
    }

    public K getKey() {
        return this.g;
    }

    public mhi<K, V> getValueReference() {
        return this.j;
    }

    public void setValueReference(mhi<K, V> mhi_K__V) {
        this.j = mhi_K__V;
    }

    public int getHash() {
        return this.h;
    }

    public ReferenceEntry<K, V> getNext() {
        return this.i;
    }
}
