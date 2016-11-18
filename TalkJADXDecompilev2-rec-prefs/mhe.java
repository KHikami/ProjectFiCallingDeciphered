package p000;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;

public class mhe<K, V> extends mgd<K, V> {
    final K f27714g;
    final int f27715h;
    final ReferenceEntry<K, V> f27716i;
    volatile mhi<K, V> f27717j = LocalCache.f8695r;

    mhe(K k, int i, ReferenceEntry<K, V> referenceEntry) {
        this.f27714g = k;
        this.f27715h = i;
        this.f27716i = referenceEntry;
    }

    public K getKey() {
        return this.f27714g;
    }

    public mhi<K, V> getValueReference() {
        return this.f27717j;
    }

    public void setValueReference(mhi<K, V> mhi_K__V) {
        this.f27717j = mhi_K__V;
    }

    public int getHash() {
        return this.f27715h;
    }

    public ReferenceEntry<K, V> getNext() {
        return this.f27716i;
    }
}
