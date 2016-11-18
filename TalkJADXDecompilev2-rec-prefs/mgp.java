package p000;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

public abstract class mgp<T> implements Iterator<T> {
    int f27672b;
    int f27673c = -1;
    mgv<K, V> f27674d;
    AtomicReferenceArray<ReferenceEntry<K, V>> f27675e;
    ReferenceEntry<K, V> f27676f;
    mhs f27677g;
    mhs f27678h;
    final /* synthetic */ LocalCache f27679i;

    mgp(LocalCache localCache) {
        this.f27679i = localCache;
        this.f27672b = localCache.f8699d.length - 1;
        m32049d();
    }

    private void m32049d() {
        this.f27677g = null;
        if (!m32050a() && !m32052b()) {
            while (this.f27672b >= 0) {
                mgv[] mgvArr = this.f27679i.f8699d;
                int i = this.f27672b;
                this.f27672b = i - 1;
                this.f27674d = mgvArr[i];
                if (this.f27674d.f27691b != 0) {
                    this.f27675e = this.f27674d.f27695f;
                    this.f27673c = this.f27675e.length() - 1;
                    if (m32052b()) {
                        return;
                    }
                }
            }
        }
    }

    boolean m32050a() {
        if (this.f27676f != null) {
            this.f27676f = this.f27676f.getNext();
            while (this.f27676f != null) {
                if (m32051a(this.f27676f)) {
                    return true;
                }
                this.f27676f = this.f27676f.getNext();
            }
        }
        return false;
    }

    boolean m32052b() {
        while (this.f27673c >= 0) {
            AtomicReferenceArray atomicReferenceArray = this.f27675e;
            int i = this.f27673c;
            this.f27673c = i - 1;
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i);
            this.f27676f = referenceEntry;
            if (referenceEntry != null && (m32051a(this.f27676f) || m32050a())) {
                return true;
            }
        }
        return false;
    }

    boolean m32051a(ReferenceEntry<K, V> referenceEntry) {
        try {
            long a = this.f27679i.f8710o.mo3744a();
            Object key = referenceEntry.getKey();
            Object a2 = this.f27679i.m10512a((ReferenceEntry) referenceEntry, a);
            if (a2 != null) {
                this.f27677g = new mhs(this.f27679i, key, a2);
                return true;
            }
            this.f27674d.m32114b();
            return false;
        } finally {
            this.f27674d.m32114b();
        }
    }

    public boolean hasNext() {
        return this.f27677g != null;
    }

    mhs m32053c() {
        if (this.f27677g == null) {
            throw new NoSuchElementException();
        }
        this.f27678h = this.f27677g;
        m32049d();
        return this.f27678h;
    }

    public void remove() {
        bm.m6150b(this.f27678h != null);
        this.f27679i.remove(this.f27678h.getKey());
        this.f27678h = null;
    }
}
