package defpackage;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

public final class mgv<K, V> extends ReentrantLock {
    final LocalCache<K, V> a;
    public volatile int b;
    long c;
    public int d;
    int e;
    public volatile AtomicReferenceArray<ReferenceEntry<K, V>> f;
    final long g;
    final ReferenceQueue<K> h;
    final ReferenceQueue<V> i;
    final Queue<ReferenceEntry<K, V>> j;
    final AtomicInteger k;
    final Queue<ReferenceEntry<K, V>> l;
    final Queue<ReferenceEntry<K, V>> m;

    private ReferenceEntry<K, V> a(K k, int i, ReferenceEntry<K, V> referenceEntry) {
        return this.a.p.a(this, bm.a((Object) k), i, referenceEntry);
    }

    private ReferenceEntry<K, V> a(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        if (referenceEntry.getKey() == null) {
            return null;
        }
        mhi valueReference = referenceEntry.getValueReference();
        Object obj = valueReference.get();
        if (obj == null && valueReference.d()) {
            return null;
        }
        ReferenceEntry<K, V> a = this.a.p.a(this, referenceEntry, referenceEntry2);
        a.setValueReference(valueReference.a(this.i, obj, a));
        return a;
    }

    private void a(ReferenceEntry<K, V> referenceEntry, K k, V v, long j) {
        mhi valueReference = referenceEntry.getValueReference();
        int v2 = this.a.j.v();
        bm.b(v2 >= 0, (Object) "Weights must be non-negative");
        referenceEntry.setValueReference(this.a.h.a(this, referenceEntry, v, v2));
        a((ReferenceEntry) referenceEntry, v2, j);
        valueReference.a(v);
    }

    private mti<V> a(K k, int i, mgs<K, V> mgs_K__V, u uVar) {
        mti<V> a = mgs_K__V.a(k, uVar);
        a.a(new mgw(this, k, i, mgs_K__V, a), gwb.aT());
        return a;
    }

    V a(K k, int i, mgs<K, V> mgs_K__V, mti<V> mti_V) {
        V v = null;
        try {
            v = gwb.a((Future) mti_V);
            if (v == null) {
                String valueOf = String.valueOf(k);
                throw new mfz(new StringBuilder(String.valueOf(valueOf).length() + 35).append("CacheLoader returned null for key ").append(valueOf).append(".").toString());
            }
            mgs_K__V.e();
            a((Object) k, i, (mgs) mgs_K__V, (Object) v);
            return v;
        } finally {
            if (v == null) {
                mgs_K__V.e();
                a((Object) k, i, (mgs) mgs_K__V);
            }
        }
    }

    private V a(ReferenceEntry<K, V> referenceEntry, K k, int i, V v, long j, u uVar) {
        if (!this.a.d() || j - referenceEntry.getWriteTime() <= this.a.m || referenceEntry.getValueReference().c()) {
            return v;
        }
        V a = a((Object) k, i, uVar, true);
        if (a != null) {
            return a;
        }
        return v;
    }

    private V a(K k, int i, u uVar, boolean z) {
        V v = null;
        mgs a = a((Object) k, i, true);
        if (a != null) {
            Future a2 = a((Object) k, i, a, uVar);
            if (a2.isDone()) {
                try {
                    v = gwb.a(a2);
                } catch (Throwable th) {
                }
            }
        }
        return v;
    }

    private mgs<K, V> a(K k, int i, boolean z) {
        lock();
        long a = this.a.o.a();
        c(a);
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = i & (atomicReferenceArray.length() - 1);
        ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
        ReferenceEntry referenceEntry2 = referenceEntry;
        while (referenceEntry2 != null) {
            Object key = referenceEntry2.getKey();
            if (referenceEntry2.getHash() == i && key != null && this.a.e.a(k, key)) {
                mhi valueReference = referenceEntry2.getValueReference();
                if (valueReference.c() || (z && a - referenceEntry2.getWriteTime() < this.a.m)) {
                    unlock();
                    m();
                    return null;
                }
                this.d++;
                mgs<K, V> mgs = new mgs(valueReference);
                referenceEntry2.setValueReference(mgs);
                unlock();
                m();
                return mgs;
            }
            try {
                referenceEntry2 = referenceEntry2.getNext();
            } catch (Throwable th) {
                unlock();
                m();
            }
        }
        this.d++;
        mhi mgs2 = new mgs();
        referenceEntry = a((Object) k, i, referenceEntry);
        referenceEntry.setValueReference(mgs2);
        atomicReferenceArray.set(length, referenceEntry);
        unlock();
        m();
        return mgs2;
    }

    private void c() {
        if (tryLock()) {
            try {
                d();
            } finally {
                unlock();
            }
        }
    }

    private void d() {
        if (this.a.g()) {
            e();
        }
        if (this.a.h()) {
            f();
        }
    }

    private void e() {
        int i = 0;
        while (true) {
            Reference poll = this.h.poll();
            if (poll != null) {
                this.a.a((ReferenceEntry) poll);
                int i2 = i + 1;
                if (i2 != 16) {
                    i = i2;
                } else {
                    return;
                }
            }
            return;
        }
    }

    private void f() {
        int i = 0;
        while (true) {
            Reference poll = this.i.poll();
            if (poll != null) {
                this.a.a((mhi) poll);
                int i2 = i + 1;
                if (i2 != 16) {
                    i = i2;
                } else {
                    return;
                }
            }
            return;
        }
    }

    private void g() {
        if (this.a.g()) {
            h();
        }
        if (this.a.h()) {
            i();
        }
    }

    private void h() {
        do {
        } while (this.h.poll() != null);
    }

    private void i() {
        do {
        } while (this.i.poll() != null);
    }

    private void b(ReferenceEntry<K, V> referenceEntry, long j) {
        if (this.a.f()) {
            referenceEntry.setAccessTime(j);
        }
        this.j.add(referenceEntry);
    }

    private void c(ReferenceEntry<K, V> referenceEntry, long j) {
        if (this.a.f()) {
            referenceEntry.setAccessTime(j);
        }
        this.m.add(referenceEntry);
    }

    private void a(ReferenceEntry<K, V> referenceEntry, int i, long j) {
        j();
        this.c += (long) i;
        if (this.a.f()) {
            referenceEntry.setAccessTime(j);
        }
        if (this.a.e()) {
            referenceEntry.setWriteTime(j);
        }
        this.m.add(referenceEntry);
        this.l.add(referenceEntry);
    }

    private void j() {
        while (true) {
            ReferenceEntry referenceEntry = (ReferenceEntry) this.j.poll();
            if (referenceEntry == null) {
                return;
            }
            if (this.m.contains(referenceEntry)) {
                this.m.add(referenceEntry);
            }
        }
    }

    private void a(long j) {
        if (tryLock()) {
            try {
                b(j);
            } finally {
                unlock();
            }
        }
    }

    private void b(long j) {
        j();
        ReferenceEntry referenceEntry;
        do {
            referenceEntry = (ReferenceEntry) this.l.peek();
            if (referenceEntry == null || !this.a.b(referenceEntry, j)) {
                do {
                    referenceEntry = (ReferenceEntry) this.m.peek();
                    if (referenceEntry == null || !this.a.b(referenceEntry, j)) {
                        return;
                    }
                } while (a(referenceEntry, referenceEntry.getHash(), mht.EXPIRED));
                throw new AssertionError();
            }
        } while (a(referenceEntry, referenceEntry.getHash(), mht.EXPIRED));
        throw new AssertionError();
    }

    private void a(Object obj, Object obj2, int i, mht mht) {
        this.c -= (long) i;
        mht.a();
        if (this.a.n != LocalCache.s) {
            this.a.n.offer(new mhz(obj, obj2, mht));
        }
    }

    private void a(ReferenceEntry<K, V> referenceEntry) {
        if (this.a.a()) {
            j();
            if (((long) referenceEntry.getValueReference().a()) <= this.g || a((ReferenceEntry) referenceEntry, referenceEntry.getHash(), mht.SIZE)) {
                while (this.c > this.g) {
                    ReferenceEntry k = k();
                    if (!a(k, k.getHash(), mht.SIZE)) {
                        throw new AssertionError();
                    }
                }
                return;
            }
            throw new AssertionError();
        }
    }

    private ReferenceEntry<K, V> k() {
        for (ReferenceEntry<K, V> referenceEntry : this.m) {
            if (referenceEntry.getValueReference().a() > 0) {
                return referenceEntry;
            }
        }
        throw new AssertionError();
    }

    private ReferenceEntry<K, V> a(int i) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        return (ReferenceEntry) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i);
    }

    private ReferenceEntry<K, V> d(Object obj, int i) {
        for (ReferenceEntry<K, V> a = a(i); a != null; a = a.getNext()) {
            if (a.getHash() == i) {
                Object key = a.getKey();
                if (key == null) {
                    c();
                } else if (this.a.e.a(obj, key)) {
                    return a;
                }
            }
        }
        return null;
    }

    private ReferenceEntry<K, V> a(Object obj, int i, long j) {
        ReferenceEntry<K, V> d = d(obj, i);
        if (d == null) {
            return null;
        }
        if (!this.a.b((ReferenceEntry) d, j)) {
            return d;
        }
        a(j);
        return null;
    }

    public V a(ReferenceEntry<K, V> referenceEntry, long j) {
        if (referenceEntry.getKey() == null) {
            c();
            return null;
        }
        V v = referenceEntry.getValueReference().get();
        if (v == null) {
            c();
            return null;
        } else if (!this.a.b((ReferenceEntry) referenceEntry, j)) {
            return v;
        } else {
            a(j);
            return null;
        }
    }

    public V a(Object obj, int i) {
        V v = null;
        try {
            if (this.b != 0) {
                long a = this.a.o.a();
                ReferenceEntry a2 = a(obj, i, a);
                if (a2 != null) {
                    Object obj2 = a2.getValueReference().get();
                    if (obj2 != null) {
                        b(a2, a);
                        v = a(a2, a2.getKey(), i, obj2, a, this.a.q);
                        b();
                    } else {
                        c();
                    }
                }
                return v;
            }
            b();
            return v;
        } finally {
            b();
        }
    }

    public boolean b(Object obj, int i) {
        boolean z = false;
        try {
            if (this.b != 0) {
                ReferenceEntry a = a(obj, i, this.a.o.a());
                if (a != null) {
                    if (a.getValueReference().get() != null) {
                        z = true;
                    }
                    b();
                }
            } else {
                b();
            }
            return z;
        } finally {
            b();
        }
    }

    public V a(K k, int i, V v, boolean z) {
        lock();
        try {
            int i2;
            ReferenceEntry referenceEntry;
            long a = this.a.o.a();
            c(a);
            if (this.b + 1 > this.e) {
                l();
                i2 = this.b;
            }
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
            for (referenceEntry = referenceEntry2; referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                Object key = referenceEntry.getKey();
                if (referenceEntry.getHash() == i && key != null && this.a.e.a(k, key)) {
                    mhi valueReference = referenceEntry.getValueReference();
                    V v2 = valueReference.get();
                    if (v2 == null) {
                        this.d++;
                        if (valueReference.d()) {
                            a((Object) k, (Object) v2, valueReference.a(), mht.COLLECTED);
                            a(referenceEntry, (Object) k, (Object) v, a);
                            i2 = this.b;
                        } else {
                            a(referenceEntry, (Object) k, (Object) v, a);
                            i2 = this.b + 1;
                        }
                        this.b = i2;
                        a(referenceEntry);
                        return null;
                    } else if (z) {
                        c(referenceEntry, a);
                        unlock();
                        m();
                        return v2;
                    } else {
                        this.d++;
                        a((Object) k, (Object) v2, valueReference.a(), mht.REPLACED);
                        a(referenceEntry, (Object) k, (Object) v, a);
                        a(referenceEntry);
                        unlock();
                        m();
                        return v2;
                    }
                }
            }
            this.d++;
            referenceEntry = a((Object) k, i, referenceEntry2);
            a(referenceEntry, (Object) k, (Object) v, a);
            atomicReferenceArray.set(length, referenceEntry);
            this.b++;
            a(referenceEntry);
            unlock();
            m();
            return null;
        } finally {
            unlock();
            m();
        }
    }

    private void l() {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = atomicReferenceArray.length();
        if (length < 1073741824) {
            int i = this.b;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
            this.e = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            int i2 = 0;
            while (i2 < length) {
                int i3;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i2);
                if (referenceEntry != null) {
                    ReferenceEntry next = referenceEntry.getNext();
                    int hash = referenceEntry.getHash() & length2;
                    if (next == null) {
                        atomicReferenceArray2.set(hash, referenceEntry);
                        i3 = i;
                    } else {
                        ReferenceEntry referenceEntry2;
                        ReferenceEntry referenceEntry3 = referenceEntry;
                        while (next != null) {
                            i3 = next.getHash() & length2;
                            if (i3 != hash) {
                                referenceEntry2 = next;
                            } else {
                                i3 = hash;
                                referenceEntry2 = referenceEntry3;
                            }
                            next = next.getNext();
                            referenceEntry3 = referenceEntry2;
                            hash = i3;
                        }
                        atomicReferenceArray2.set(hash, referenceEntry3);
                        referenceEntry2 = referenceEntry;
                        i3 = i;
                        while (referenceEntry2 != referenceEntry3) {
                            int i4;
                            int hash2 = referenceEntry2.getHash() & length2;
                            referenceEntry = a(referenceEntry2, (ReferenceEntry) atomicReferenceArray2.get(hash2));
                            if (referenceEntry != null) {
                                atomicReferenceArray2.set(hash2, referenceEntry);
                                i4 = i3;
                            } else {
                                b(referenceEntry2);
                                i4 = i3 - 1;
                            }
                            referenceEntry2 = referenceEntry2.getNext();
                            i3 = i4;
                        }
                    }
                } else {
                    i3 = i;
                }
                i2++;
                i = i3;
            }
            this.f = atomicReferenceArray2;
            this.b = i;
        }
    }

    public boolean a(K k, int i, V v, V v2) {
        lock();
        try {
            long a = this.a.o.a();
            c(a);
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntry2 = referenceEntry; referenceEntry2 != null; referenceEntry2 = referenceEntry2.getNext()) {
                Object key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() == i && key != null && this.a.e.a(k, key)) {
                    mhi valueReference = referenceEntry2.getValueReference();
                    Object obj = valueReference.get();
                    if (obj == null) {
                        if (valueReference.d()) {
                            int i2 = this.b;
                            this.d++;
                            ReferenceEntry a2 = a(referenceEntry, referenceEntry2, key, i, obj, valueReference, mht.COLLECTED);
                            int i3 = this.b - 1;
                            atomicReferenceArray.set(length, a2);
                            this.b = i3;
                        }
                        unlock();
                        m();
                        return false;
                    } else if (this.a.f.a(v, obj)) {
                        this.d++;
                        a((Object) k, obj, valueReference.a(), mht.REPLACED);
                        a(referenceEntry2, (Object) k, (Object) v2, a);
                        a(referenceEntry2);
                        unlock();
                        m();
                        return true;
                    } else {
                        c(referenceEntry2, a);
                        unlock();
                        m();
                        return false;
                    }
                }
            }
            unlock();
            m();
            return false;
        } catch (Throwable th) {
            unlock();
            m();
        }
    }

    public V a(K k, int i, V v) {
        lock();
        try {
            long a = this.a.o.a();
            c(a);
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntry2 = referenceEntry; referenceEntry2 != null; referenceEntry2 = referenceEntry2.getNext()) {
                Object key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() == i && key != null && this.a.e.a(k, key)) {
                    mhi valueReference = referenceEntry2.getValueReference();
                    Object obj = valueReference.get();
                    if (obj == null) {
                        if (valueReference.d()) {
                            int i2 = this.b;
                            this.d++;
                            ReferenceEntry a2 = a(referenceEntry, referenceEntry2, key, i, obj, valueReference, mht.COLLECTED);
                            int i3 = this.b - 1;
                            atomicReferenceArray.set(length, a2);
                            this.b = i3;
                        }
                        unlock();
                        m();
                        return null;
                    }
                    this.d++;
                    a((Object) k, obj, valueReference.a(), mht.REPLACED);
                    a(referenceEntry2, (Object) k, (Object) v, a);
                    a(referenceEntry2);
                    unlock();
                    m();
                    return obj;
                }
            }
            unlock();
            m();
            return null;
        } catch (Throwable th) {
            unlock();
            m();
        }
    }

    public V c(Object obj, int i) {
        lock();
        try {
            c(this.a.o.a());
            int i2 = this.b;
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntry2 = referenceEntry; referenceEntry2 != null; referenceEntry2 = referenceEntry2.getNext()) {
                Object key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() == i && key != null && this.a.e.a(obj, key)) {
                    mht mht;
                    mhi valueReference = referenceEntry2.getValueReference();
                    V v = valueReference.get();
                    if (v != null) {
                        mht = mht.EXPLICIT;
                    } else if (valueReference.d()) {
                        mht = mht.COLLECTED;
                    } else {
                        unlock();
                        m();
                        return null;
                    }
                    this.d++;
                    ReferenceEntry a = a(referenceEntry, referenceEntry2, key, i, v, valueReference, mht);
                    i2 = this.b - 1;
                    atomicReferenceArray.set(length, a);
                    this.b = i2;
                    return v;
                }
            }
            unlock();
            m();
            return null;
        } finally {
            unlock();
            m();
        }
    }

    private boolean a(K k, int i, mgs<K, V> mgs_K__V, V v) {
        lock();
        try {
            ReferenceEntry referenceEntry;
            long a = this.a.o.a();
            c(a);
            int i2 = this.b + 1;
            if (i2 > this.e) {
                l();
                i2 = this.b + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
            for (referenceEntry = referenceEntry2; referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                Object key = referenceEntry.getKey();
                if (referenceEntry.getHash() == i && key != null && this.a.e.a(k, key)) {
                    mhi valueReference = referenceEntry.getValueReference();
                    key = valueReference.get();
                    if (mgs_K__V == valueReference || (key == null && valueReference != LocalCache.r)) {
                        this.d++;
                        if (mgs_K__V.d()) {
                            a((Object) k, key, mgs_K__V.a(), key == null ? mht.COLLECTED : mht.REPLACED);
                            i2--;
                        }
                        a(referenceEntry, (Object) k, (Object) v, a);
                        this.b = i2;
                        a(referenceEntry);
                        return true;
                    }
                    a((Object) k, (Object) v, 0, mht.REPLACED);
                    unlock();
                    m();
                    return false;
                }
            }
            this.d++;
            referenceEntry = a((Object) k, i, referenceEntry2);
            a(referenceEntry, (Object) k, (Object) v, a);
            atomicReferenceArray.set(length, referenceEntry);
            this.b = i2;
            a(referenceEntry);
            unlock();
            m();
            return true;
        } finally {
            unlock();
            m();
        }
    }

    public boolean b(Object obj, int i, Object obj2) {
        lock();
        try {
            c(this.a.o.a());
            int i2 = this.b;
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntry2 = referenceEntry; referenceEntry2 != null; referenceEntry2 = referenceEntry2.getNext()) {
                Object key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() == i && key != null && this.a.e.a(obj, key)) {
                    mht mht;
                    mhi valueReference = referenceEntry2.getValueReference();
                    Object obj3 = valueReference.get();
                    if (this.a.f.a(obj2, obj3)) {
                        mht = mht.EXPLICIT;
                    } else {
                        if (obj3 == null) {
                            if (valueReference.d()) {
                                mht = mht.COLLECTED;
                            }
                        }
                        unlock();
                        m();
                        return false;
                    }
                    this.d++;
                    ReferenceEntry a = a(referenceEntry, referenceEntry2, key, i, obj3, valueReference, mht);
                    int i3 = this.b - 1;
                    atomicReferenceArray.set(length, a);
                    this.b = i3;
                    boolean z = mht == mht.EXPLICIT;
                    unlock();
                    m();
                    return z;
                }
            }
            unlock();
            m();
            return false;
        } catch (Throwable th) {
            unlock();
            m();
        }
    }

    public void a() {
        if (this.b != 0) {
            lock();
            try {
                c(this.a.o.a());
                AtomicReferenceArray atomicReferenceArray = this.f;
                for (int i = 0; i < atomicReferenceArray.length(); i++) {
                    for (ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                        if (referenceEntry.getValueReference().d()) {
                            Object key = referenceEntry.getKey();
                            Object obj = referenceEntry.getValueReference().get();
                            mht mht = (key == null || obj == null) ? mht.COLLECTED : mht.EXPLICIT;
                            referenceEntry.getHash();
                            a(key, obj, referenceEntry.getValueReference().a(), mht);
                        }
                    }
                }
                for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                    atomicReferenceArray.set(i2, null);
                }
                g();
                this.l.clear();
                this.m.clear();
                this.k.set(0);
                this.d++;
                this.b = 0;
            } finally {
                unlock();
                m();
            }
        }
    }

    private ReferenceEntry<K, V> a(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k, int i, V v, mhi<K, V> mhi_K__V, mht mht) {
        a((Object) k, (Object) v, mhi_K__V.a(), mht);
        this.l.remove(referenceEntry2);
        this.m.remove(referenceEntry2);
        if (!mhi_K__V.c()) {
            return b((ReferenceEntry) referenceEntry, (ReferenceEntry) referenceEntry2);
        }
        mhi_K__V.a(null);
        return referenceEntry;
    }

    private ReferenceEntry<K, V> b(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        int i = this.b;
        ReferenceEntry<K, V> next = referenceEntry2.getNext();
        ReferenceEntry next2;
        while (next2 != referenceEntry2) {
            int i2;
            ReferenceEntry<K, V> a = a(next2, (ReferenceEntry) next);
            if (a != null) {
                i2 = i;
            } else {
                b(next2);
                ReferenceEntry<K, V> referenceEntry3 = next;
                i2 = i - 1;
                a = referenceEntry3;
            }
            next2 = next2.getNext();
            i = i2;
            next = a;
        }
        this.b = i;
        return next;
    }

    private void b(ReferenceEntry<K, V> referenceEntry) {
        Object key = referenceEntry.getKey();
        referenceEntry.getHash();
        a(key, referenceEntry.getValueReference().get(), referenceEntry.getValueReference().a(), mht.COLLECTED);
        this.l.remove(referenceEntry);
        this.m.remove(referenceEntry);
    }

    public boolean a(ReferenceEntry<K, V> referenceEntry, int i) {
        lock();
        try {
            int i2 = this.b;
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry<K, V> referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.getNext()) {
                if (referenceEntry3 == referenceEntry) {
                    this.d++;
                    ReferenceEntry a = a(referenceEntry2, referenceEntry3, referenceEntry3.getKey(), i, referenceEntry3.getValueReference().get(), referenceEntry3.getValueReference(), mht.COLLECTED);
                    int i3 = this.b - 1;
                    atomicReferenceArray.set(length, a);
                    this.b = i3;
                    return true;
                }
            }
            unlock();
            m();
            return false;
        } finally {
            unlock();
            m();
        }
    }

    public boolean a(K k, int i, mhi<K, V> mhi_K__V) {
        lock();
        try {
            int i2 = this.b;
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            ReferenceEntry referenceEntry2 = referenceEntry;
            while (referenceEntry2 != null) {
                Object key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() != i || key == null || !this.a.e.a(k, key)) {
                    referenceEntry2 = referenceEntry2.getNext();
                } else if (referenceEntry2.getValueReference() == mhi_K__V) {
                    this.d++;
                    ReferenceEntry a = a(referenceEntry, referenceEntry2, key, i, mhi_K__V.get(), mhi_K__V, mht.COLLECTED);
                    i2 = this.b - 1;
                    atomicReferenceArray.set(length, a);
                    this.b = i2;
                    return true;
                } else {
                    unlock();
                    if (isHeldByCurrentThread()) {
                        return false;
                    }
                    m();
                    return false;
                }
            }
            unlock();
            if (isHeldByCurrentThread()) {
                return false;
            }
            m();
            return false;
        } finally {
            unlock();
            if (!isHeldByCurrentThread()) {
                m();
            }
        }
    }

    private boolean a(K k, int i, mgs<K, V> mgs_K__V) {
        lock();
        try {
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            ReferenceEntry referenceEntry2 = referenceEntry;
            while (referenceEntry2 != null) {
                Object key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() != i || key == null || !this.a.e.a(k, key)) {
                    referenceEntry2 = referenceEntry2.getNext();
                } else if (referenceEntry2.getValueReference() == mgs_K__V) {
                    if (mgs_K__V.d()) {
                        referenceEntry2.setValueReference(mgs_K__V.f());
                    } else {
                        atomicReferenceArray.set(length, b(referenceEntry, referenceEntry2));
                    }
                    unlock();
                    m();
                    return true;
                } else {
                    unlock();
                    m();
                    return false;
                }
            }
            unlock();
            m();
            return false;
        } catch (Throwable th) {
            unlock();
            m();
        }
    }

    private boolean a(ReferenceEntry<K, V> referenceEntry, int i, mht mht) {
        int i2 = this.b;
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = i & (atomicReferenceArray.length() - 1);
        ReferenceEntry<K, V> referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
        for (ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.getNext()) {
            if (referenceEntry3 == referenceEntry) {
                this.d++;
                ReferenceEntry a = a(referenceEntry2, referenceEntry3, referenceEntry3.getKey(), i, referenceEntry3.getValueReference().get(), referenceEntry3.getValueReference(), mht);
                int i3 = this.b - 1;
                atomicReferenceArray.set(length, a);
                this.b = i3;
                return true;
            }
        }
        return false;
    }

    void b() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            n();
        }
    }

    private void c(long j) {
        d(j);
    }

    private void m() {
        o();
    }

    private void n() {
        d(this.a.o.a());
        o();
    }

    private void d(long j) {
        if (tryLock()) {
            try {
                d();
                b(j);
                this.k.set(0);
            } finally {
                unlock();
            }
        }
    }

    private void o() {
        if (!isHeldByCurrentThread()) {
            this.a.j();
        }
    }
}
