package defpackage;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: mhm */
public class mhm<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {
    final int g;
    final ReferenceEntry<K, V> h;
    volatile mhi<K, V> i;

    mhm(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
        super(k, referenceQueue);
        this.i = LocalCache.r;
        this.g = i;
        this.h = referenceEntry;
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
        return this.i;
    }

    public void setValueReference(mhi<K, V> mhi_K__V) {
        this.i = mhi_K__V;
    }

    public int getHash() {
        return this.g;
    }

    public ReferenceEntry<K, V> getNext() {
        return this.h;
    }
}
