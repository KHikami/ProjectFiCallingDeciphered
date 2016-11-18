package p000;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class mhm<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {
    final int f27734g;
    final ReferenceEntry<K, V> f27735h;
    volatile mhi<K, V> f27736i = LocalCache.f8695r;

    mhm(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
        super(k, referenceQueue);
        this.f27734g = i;
        this.f27735h = referenceEntry;
    }

    public K getKey() {
        return get();
    }

    public long getAccessTime() {
        throw new UnsupportedOperationException();
    }

    public void setAccessTime(long j) {
        throw new UnsupportedOperationException();
    }

    public ReferenceEntry<K, V> getNextInAccessQueue() {
        throw new UnsupportedOperationException();
    }

    public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        throw new UnsupportedOperationException();
    }

    public ReferenceEntry<K, V> getPreviousInAccessQueue() {
        throw new UnsupportedOperationException();
    }

    public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        throw new UnsupportedOperationException();
    }

    public long getWriteTime() {
        throw new UnsupportedOperationException();
    }

    public void setWriteTime(long j) {
        throw new UnsupportedOperationException();
    }

    public ReferenceEntry<K, V> getNextInWriteQueue() {
        throw new UnsupportedOperationException();
    }

    public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        throw new UnsupportedOperationException();
    }

    public ReferenceEntry<K, V> getPreviousInWriteQueue() {
        throw new UnsupportedOperationException();
    }

    public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        throw new UnsupportedOperationException();
    }

    public mhi<K, V> getValueReference() {
        return this.f27736i;
    }

    public void setValueReference(mhi<K, V> mhi_K__V) {
        this.f27736i = mhi_K__V;
    }

    public int getHash() {
        return this.f27734g;
    }

    public ReferenceEntry<K, V> getNext() {
        return this.f27735h;
    }
}
