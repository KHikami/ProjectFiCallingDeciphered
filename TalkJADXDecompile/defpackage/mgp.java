package defpackage;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: mgp */
public abstract class mgp<T> implements Iterator<T> {
    int b;
    int c;
    mgv<K, V> d;
    AtomicReferenceArray<ReferenceEntry<K, V>> e;
    ReferenceEntry<K, V> f;
    mhs g;
    mhs h;
    final /* synthetic */ LocalCache i;

    mgp(LocalCache localCache) {
        this.i = localCache;
        this.b = localCache.d.length - 1;
        this.c = -1;
        d();
    }

    private void d() {
        this.g = null;
        if (!a() && !b()) {
            while (this.b >= 0) {
                mgv[] mgvArr = this.i.d;
                int i = this.b;
                this.b = i - 1;
                this.d = mgvArr[i];
                if (this.d.b != 0) {
                    this.e = this.d.f;
                    this.c = this.e.length() - 1;
                    if (b()) {
                        return;
                    }
                }
            }
        }
    }

    boolean a() {
        if (this.f != null) {
            this.f = this.f.getNext();
            while (this.f != null) {
                if (a(this.f)) {
                    return true;
                }
                this.f = this.f.getNext();
            }
        }
        return false;
    }

    boolean b() {
        while (this.c >= 0) {
            AtomicReferenceArray atomicReferenceArray = this.e;
            int i = this.c;
            this.c = i - 1;
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i);
            this.f = referenceEntry;
            if (referenceEntry != null && (a(this.f) || a())) {
                return true;
            }
        }
        return false;
    }

    boolean a(ReferenceEntry<K, V> referenceEntry) {
        try {
            long a = this.i.o.a();
            Object key = referenceEntry.getKey();
            Object a2 = this.i.a((ReferenceEntry) referenceEntry, a);
            if (a2 != null) {
                this.g = new mhs(this.i, key, a2);
                return true;
            }
            this.d.b();
            return false;
        } finally {
            this.d.b();
        }
    }

    public boolean hasNext() {
        return this.g != null;
    }

    mhs c() {
        if (this.g == null) {
            throw new NoSuchElementException();
        }
        this.h = this.g;
        d();
        return this.h;
    }

    public void remove() {
        bm.b(this.h != null);
        this.i.remove(this.h.getKey());
        this.h = null;
    }
}
