package p000;

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
    final LocalCache<K, V> f27690a;
    public volatile int f27691b;
    long f27692c;
    public int f27693d;
    int f27694e;
    public volatile AtomicReferenceArray<ReferenceEntry<K, V>> f27695f;
    final long f27696g;
    final ReferenceQueue<K> f27697h;
    final ReferenceQueue<V> f27698i;
    final Queue<ReferenceEntry<K, V>> f27699j;
    final AtomicInteger f27700k;
    final Queue<ReferenceEntry<K, V>> f27701l;
    final Queue<ReferenceEntry<K, V>> f27702m;

    private ReferenceEntry<K, V> m32071a(K k, int i, ReferenceEntry<K, V> referenceEntry) {
        return this.f27690a.f8711p.mo3770a(this, bm.m6122a((Object) k), i, referenceEntry);
    }

    private ReferenceEntry<K, V> m32068a(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        if (referenceEntry.getKey() == null) {
            return null;
        }
        mhi valueReference = referenceEntry.getValueReference();
        Object obj = valueReference.get();
        if (obj == null && valueReference.mo3751d()) {
            return null;
        }
        ReferenceEntry<K, V> a = this.f27690a.f8711p.mo3771a(this, referenceEntry, referenceEntry2);
        a.setValueReference(valueReference.mo3747a(this.f27698i, obj, a));
        return a;
    }

    private void m32079a(ReferenceEntry<K, V> referenceEntry, K k, V v, long j) {
        mhi valueReference = referenceEntry.getValueReference();
        int v2 = this.f27690a.f8705j.m25v();
        bm.m6151b(v2 >= 0, (Object) "Weights must be non-negative");
        referenceEntry.setValueReference(this.f27690a.f8703h.mo3773a(this, referenceEntry, v, v2));
        m32078a((ReferenceEntry) referenceEntry, v2, j);
        valueReference.mo3748a(v);
    }

    private mti<V> m32075a(K k, int i, mgs<K, V> mgs_K__V, u uVar) {
        mti<V> a = mgs_K__V.m32057a(k, uVar);
        a.mo3706a(new mgw(this, k, i, mgs_K__V, a), gwb.aT());
        return a;
    }

    V m32109a(K k, int i, mgs<K, V> mgs_K__V, mti<V> mti_V) {
        V v = null;
        try {
            v = gwb.m1639a((Future) mti_V);
            if (v == null) {
                String valueOf = String.valueOf(k);
                throw new mfz(new StringBuilder(String.valueOf(valueOf).length() + 35).append("CacheLoader returned null for key ").append(valueOf).append(".").toString());
            }
            mgs_K__V.m32064e();
            m32083a((Object) k, i, (mgs) mgs_K__V, (Object) v);
            return v;
        } finally {
            if (v == null) {
                mgs_K__V.m32064e();
                m32082a((Object) k, i, (mgs) mgs_K__V);
            }
        }
    }

    private V m32072a(ReferenceEntry<K, V> referenceEntry, K k, int i, V v, long j, u uVar) {
        if (!this.f27690a.m10520d() || j - referenceEntry.getWriteTime() <= this.f27690a.f8708m || referenceEntry.getValueReference().mo3750c()) {
            return v;
        }
        V a = m32073a((Object) k, i, uVar, true);
        if (a != null) {
            return a;
        }
        return v;
    }

    private V m32073a(K k, int i, u uVar, boolean z) {
        V v = null;
        mgs a = m32074a((Object) k, i, true);
        if (a != null) {
            Future a2 = m32075a((Object) k, i, a, uVar);
            if (a2.isDone()) {
                try {
                    v = gwb.m1639a(a2);
                } catch (Throwable th) {
                }
            }
        }
        return v;
    }

    private mgs<K, V> m32074a(K k, int i, boolean z) {
        lock();
        long a = this.f27690a.f8710o.mo3744a();
        m32089c(a);
        AtomicReferenceArray atomicReferenceArray = this.f27695f;
        int length = i & (atomicReferenceArray.length() - 1);
        ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
        ReferenceEntry referenceEntry2 = referenceEntry;
        while (referenceEntry2 != null) {
            Object key = referenceEntry2.getKey();
            if (referenceEntry2.getHash() == i && key != null && this.f27690a.f8700e.a(k, key)) {
                mhi valueReference = referenceEntry2.getValueReference();
                if (valueReference.mo3750c() || (z && a - referenceEntry2.getWriteTime() < this.f27690a.f8708m)) {
                    unlock();
                    m32102m();
                    return null;
                }
                this.f27693d++;
                mgs<K, V> mgs = new mgs(valueReference);
                referenceEntry2.setValueReference(mgs);
                unlock();
                m32102m();
                return mgs;
            }
            try {
                referenceEntry2 = referenceEntry2.getNext();
            } catch (Throwable th) {
                unlock();
                m32102m();
            }
        }
        this.f27693d++;
        mhi mgs2 = new mgs();
        referenceEntry = m32071a((Object) k, i, referenceEntry);
        referenceEntry.setValueReference(mgs2);
        atomicReferenceArray.set(length, referenceEntry);
        unlock();
        m32102m();
        return mgs2;
    }

    private void m32088c() {
        if (tryLock()) {
            try {
                m32092d();
            } finally {
                unlock();
            }
        }
    }

    private void m32092d() {
        if (this.f27690a.m10523g()) {
            m32094e();
        }
        if (this.f27690a.m10524h()) {
            m32095f();
        }
    }

    private void m32094e() {
        int i = 0;
        while (true) {
            Reference poll = this.f27697h.poll();
            if (poll != null) {
                this.f27690a.m10514a((ReferenceEntry) poll);
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

    private void m32095f() {
        int i = 0;
        while (true) {
            Reference poll = this.f27698i.poll();
            if (poll != null) {
                this.f27690a.m10515a((mhi) poll);
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

    private void m32096g() {
        if (this.f27690a.m10523g()) {
            m32097h();
        }
        if (this.f27690a.m10524h()) {
            m32098i();
        }
    }

    private void m32097h() {
        do {
        } while (this.f27697h.poll() != null);
    }

    private void m32098i() {
        do {
        } while (this.f27698i.poll() != null);
    }

    private void m32087b(ReferenceEntry<K, V> referenceEntry, long j) {
        if (this.f27690a.m10522f()) {
            referenceEntry.setAccessTime(j);
        }
        this.f27699j.add(referenceEntry);
    }

    private void m32090c(ReferenceEntry<K, V> referenceEntry, long j) {
        if (this.f27690a.m10522f()) {
            referenceEntry.setAccessTime(j);
        }
        this.f27702m.add(referenceEntry);
    }

    private void m32078a(ReferenceEntry<K, V> referenceEntry, int i, long j) {
        m32099j();
        this.f27692c += (long) i;
        if (this.f27690a.m10522f()) {
            referenceEntry.setAccessTime(j);
        }
        if (this.f27690a.m10521e()) {
            referenceEntry.setWriteTime(j);
        }
        this.f27702m.add(referenceEntry);
        this.f27701l.add(referenceEntry);
    }

    private void m32099j() {
        while (true) {
            ReferenceEntry referenceEntry = (ReferenceEntry) this.f27699j.poll();
            if (referenceEntry == null) {
                return;
            }
            if (this.f27702m.contains(referenceEntry)) {
                this.f27702m.add(referenceEntry);
            }
        }
    }

    private void m32076a(long j) {
        if (tryLock()) {
            try {
                m32085b(j);
            } finally {
                unlock();
            }
        }
    }

    private void m32085b(long j) {
        m32099j();
        ReferenceEntry referenceEntry;
        do {
            referenceEntry = (ReferenceEntry) this.f27701l.peek();
            if (referenceEntry == null || !this.f27690a.m10518b(referenceEntry, j)) {
                do {
                    referenceEntry = (ReferenceEntry) this.f27702m.peek();
                    if (referenceEntry == null || !this.f27690a.m10518b(referenceEntry, j)) {
                        return;
                    }
                } while (m32081a(referenceEntry, referenceEntry.getHash(), mht.EXPIRED));
                throw new AssertionError();
            }
        } while (m32081a(referenceEntry, referenceEntry.getHash(), mht.EXPIRED));
        throw new AssertionError();
    }

    private void m32080a(Object obj, Object obj2, int i, mht mht) {
        this.f27692c -= (long) i;
        mht.mo3774a();
        if (this.f27690a.f8709n != LocalCache.f8696s) {
            this.f27690a.f8709n.offer(new mhz(obj, obj2, mht));
        }
    }

    private void m32077a(ReferenceEntry<K, V> referenceEntry) {
        if (this.f27690a.m10516a()) {
            m32099j();
            if (((long) referenceEntry.getValueReference().mo3746a()) <= this.f27696g || m32081a((ReferenceEntry) referenceEntry, referenceEntry.getHash(), mht.SIZE)) {
                while (this.f27692c > this.f27696g) {
                    ReferenceEntry k = m32100k();
                    if (!m32081a(k, k.getHash(), mht.SIZE)) {
                        throw new AssertionError();
                    }
                }
                return;
            }
            throw new AssertionError();
        }
    }

    private ReferenceEntry<K, V> m32100k() {
        for (ReferenceEntry<K, V> referenceEntry : this.f27702m) {
            if (referenceEntry.getValueReference().mo3746a() > 0) {
                return referenceEntry;
            }
        }
        throw new AssertionError();
    }

    private ReferenceEntry<K, V> m32067a(int i) {
        AtomicReferenceArray atomicReferenceArray = this.f27695f;
        return (ReferenceEntry) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i);
    }

    private ReferenceEntry<K, V> m32091d(Object obj, int i) {
        for (ReferenceEntry<K, V> a = m32067a(i); a != null; a = a.getNext()) {
            if (a.getHash() == i) {
                Object key = a.getKey();
                if (key == null) {
                    m32088c();
                } else if (this.f27690a.f8700e.a(obj, key)) {
                    return a;
                }
            }
        }
        return null;
    }

    private ReferenceEntry<K, V> m32070a(Object obj, int i, long j) {
        ReferenceEntry<K, V> d = m32091d(obj, i);
        if (d == null) {
            return null;
        }
        if (!this.f27690a.m10518b((ReferenceEntry) d, j)) {
            return d;
        }
        m32076a(j);
        return null;
    }

    public V m32105a(ReferenceEntry<K, V> referenceEntry, long j) {
        if (referenceEntry.getKey() == null) {
            m32088c();
            return null;
        }
        V v = referenceEntry.getValueReference().get();
        if (v == null) {
            m32088c();
            return null;
        } else if (!this.f27690a.m10518b((ReferenceEntry) referenceEntry, j)) {
            return v;
        } else {
            m32076a(j);
            return null;
        }
    }

    public V m32106a(Object obj, int i) {
        V v = null;
        try {
            if (this.f27691b != 0) {
                long a = this.f27690a.f8710o.mo3744a();
                ReferenceEntry a2 = m32070a(obj, i, a);
                if (a2 != null) {
                    Object obj2 = a2.getValueReference().get();
                    if (obj2 != null) {
                        m32087b(a2, a);
                        v = m32072a(a2, a2.getKey(), i, obj2, a, this.f27690a.f8712q);
                        m32114b();
                    } else {
                        m32088c();
                    }
                }
                return v;
            }
            m32114b();
            return v;
        } finally {
            m32114b();
        }
    }

    public boolean m32115b(Object obj, int i) {
        boolean z = false;
        try {
            if (this.f27691b != 0) {
                ReferenceEntry a = m32070a(obj, i, this.f27690a.f8710o.mo3744a());
                if (a != null) {
                    if (a.getValueReference().get() != null) {
                        z = true;
                    }
                    m32114b();
                }
            } else {
                m32114b();
            }
            return z;
        } finally {
            m32114b();
        }
    }

    public V m32108a(K k, int i, V v, boolean z) {
        lock();
        try {
            int i2;
            ReferenceEntry referenceEntry;
            long a = this.f27690a.f8710o.mo3744a();
            m32089c(a);
            if (this.f27691b + 1 > this.f27694e) {
                m32101l();
                i2 = this.f27691b;
            }
            AtomicReferenceArray atomicReferenceArray = this.f27695f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
            for (referenceEntry = referenceEntry2; referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                Object key = referenceEntry.getKey();
                if (referenceEntry.getHash() == i && key != null && this.f27690a.f8700e.a(k, key)) {
                    mhi valueReference = referenceEntry.getValueReference();
                    V v2 = valueReference.get();
                    if (v2 == null) {
                        this.f27693d++;
                        if (valueReference.mo3751d()) {
                            m32080a((Object) k, (Object) v2, valueReference.mo3746a(), mht.COLLECTED);
                            m32079a(referenceEntry, (Object) k, (Object) v, a);
                            i2 = this.f27691b;
                        } else {
                            m32079a(referenceEntry, (Object) k, (Object) v, a);
                            i2 = this.f27691b + 1;
                        }
                        this.f27691b = i2;
                        m32077a(referenceEntry);
                        return null;
                    } else if (z) {
                        m32090c(referenceEntry, a);
                        unlock();
                        m32102m();
                        return v2;
                    } else {
                        this.f27693d++;
                        m32080a((Object) k, (Object) v2, valueReference.mo3746a(), mht.REPLACED);
                        m32079a(referenceEntry, (Object) k, (Object) v, a);
                        m32077a(referenceEntry);
                        unlock();
                        m32102m();
                        return v2;
                    }
                }
            }
            this.f27693d++;
            referenceEntry = m32071a((Object) k, i, referenceEntry2);
            m32079a(referenceEntry, (Object) k, (Object) v, a);
            atomicReferenceArray.set(length, referenceEntry);
            this.f27691b++;
            m32077a(referenceEntry);
            unlock();
            m32102m();
            return null;
        } finally {
            unlock();
            m32102m();
        }
    }

    private void m32101l() {
        AtomicReferenceArray atomicReferenceArray = this.f27695f;
        int length = atomicReferenceArray.length();
        if (length < 1073741824) {
            int i = this.f27691b;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
            this.f27694e = (atomicReferenceArray2.length() * 3) / 4;
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
                            referenceEntry = m32068a(referenceEntry2, (ReferenceEntry) atomicReferenceArray2.get(hash2));
                            if (referenceEntry != null) {
                                atomicReferenceArray2.set(hash2, referenceEntry);
                                i4 = i3;
                            } else {
                                m32086b(referenceEntry2);
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
            this.f27695f = atomicReferenceArray2;
            this.f27691b = i;
        }
    }

    public boolean m32112a(K k, int i, V v, V v2) {
        lock();
        try {
            long a = this.f27690a.f8710o.mo3744a();
            m32089c(a);
            AtomicReferenceArray atomicReferenceArray = this.f27695f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntry2 = referenceEntry; referenceEntry2 != null; referenceEntry2 = referenceEntry2.getNext()) {
                Object key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() == i && key != null && this.f27690a.f8700e.a(k, key)) {
                    mhi valueReference = referenceEntry2.getValueReference();
                    Object obj = valueReference.get();
                    if (obj == null) {
                        if (valueReference.mo3751d()) {
                            int i2 = this.f27691b;
                            this.f27693d++;
                            ReferenceEntry a2 = m32069a(referenceEntry, referenceEntry2, key, i, obj, valueReference, mht.COLLECTED);
                            int i3 = this.f27691b - 1;
                            atomicReferenceArray.set(length, a2);
                            this.f27691b = i3;
                        }
                        unlock();
                        m32102m();
                        return false;
                    } else if (this.f27690a.f8701f.a(v, obj)) {
                        this.f27693d++;
                        m32080a((Object) k, obj, valueReference.mo3746a(), mht.REPLACED);
                        m32079a(referenceEntry2, (Object) k, (Object) v2, a);
                        m32077a(referenceEntry2);
                        unlock();
                        m32102m();
                        return true;
                    } else {
                        m32090c(referenceEntry2, a);
                        unlock();
                        m32102m();
                        return false;
                    }
                }
            }
            unlock();
            m32102m();
            return false;
        } catch (Throwable th) {
            unlock();
            m32102m();
        }
    }

    public V m32107a(K k, int i, V v) {
        lock();
        try {
            long a = this.f27690a.f8710o.mo3744a();
            m32089c(a);
            AtomicReferenceArray atomicReferenceArray = this.f27695f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntry2 = referenceEntry; referenceEntry2 != null; referenceEntry2 = referenceEntry2.getNext()) {
                Object key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() == i && key != null && this.f27690a.f8700e.a(k, key)) {
                    mhi valueReference = referenceEntry2.getValueReference();
                    Object obj = valueReference.get();
                    if (obj == null) {
                        if (valueReference.mo3751d()) {
                            int i2 = this.f27691b;
                            this.f27693d++;
                            ReferenceEntry a2 = m32069a(referenceEntry, referenceEntry2, key, i, obj, valueReference, mht.COLLECTED);
                            int i3 = this.f27691b - 1;
                            atomicReferenceArray.set(length, a2);
                            this.f27691b = i3;
                        }
                        unlock();
                        m32102m();
                        return null;
                    }
                    this.f27693d++;
                    m32080a((Object) k, obj, valueReference.mo3746a(), mht.REPLACED);
                    m32079a(referenceEntry2, (Object) k, (Object) v, a);
                    m32077a(referenceEntry2);
                    unlock();
                    m32102m();
                    return obj;
                }
            }
            unlock();
            m32102m();
            return null;
        } catch (Throwable th) {
            unlock();
            m32102m();
        }
    }

    public V m32117c(Object obj, int i) {
        lock();
        try {
            m32089c(this.f27690a.f8710o.mo3744a());
            int i2 = this.f27691b;
            AtomicReferenceArray atomicReferenceArray = this.f27695f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntry2 = referenceEntry; referenceEntry2 != null; referenceEntry2 = referenceEntry2.getNext()) {
                Object key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() == i && key != null && this.f27690a.f8700e.a(obj, key)) {
                    mht mht;
                    mhi valueReference = referenceEntry2.getValueReference();
                    V v = valueReference.get();
                    if (v != null) {
                        mht = mht.EXPLICIT;
                    } else if (valueReference.mo3751d()) {
                        mht = mht.COLLECTED;
                    } else {
                        unlock();
                        m32102m();
                        return null;
                    }
                    this.f27693d++;
                    ReferenceEntry a = m32069a(referenceEntry, referenceEntry2, key, i, v, valueReference, mht);
                    i2 = this.f27691b - 1;
                    atomicReferenceArray.set(length, a);
                    this.f27691b = i2;
                    return v;
                }
            }
            unlock();
            m32102m();
            return null;
        } finally {
            unlock();
            m32102m();
        }
    }

    private boolean m32083a(K k, int i, mgs<K, V> mgs_K__V, V v) {
        lock();
        try {
            ReferenceEntry referenceEntry;
            long a = this.f27690a.f8710o.mo3744a();
            m32089c(a);
            int i2 = this.f27691b + 1;
            if (i2 > this.f27694e) {
                m32101l();
                i2 = this.f27691b + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f27695f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
            for (referenceEntry = referenceEntry2; referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                Object key = referenceEntry.getKey();
                if (referenceEntry.getHash() == i && key != null && this.f27690a.f8700e.a(k, key)) {
                    mhi valueReference = referenceEntry.getValueReference();
                    key = valueReference.get();
                    if (mgs_K__V == valueReference || (key == null && valueReference != LocalCache.f8695r)) {
                        this.f27693d++;
                        if (mgs_K__V.mo3751d()) {
                            m32080a((Object) k, key, mgs_K__V.mo3746a(), key == null ? mht.COLLECTED : mht.REPLACED);
                            i2--;
                        }
                        m32079a(referenceEntry, (Object) k, (Object) v, a);
                        this.f27691b = i2;
                        m32077a(referenceEntry);
                        return true;
                    }
                    m32080a((Object) k, (Object) v, 0, mht.REPLACED);
                    unlock();
                    m32102m();
                    return false;
                }
            }
            this.f27693d++;
            referenceEntry = m32071a((Object) k, i, referenceEntry2);
            m32079a(referenceEntry, (Object) k, (Object) v, a);
            atomicReferenceArray.set(length, referenceEntry);
            this.f27691b = i2;
            m32077a(referenceEntry);
            unlock();
            m32102m();
            return true;
        } finally {
            unlock();
            m32102m();
        }
    }

    public boolean m32116b(Object obj, int i, Object obj2) {
        lock();
        try {
            m32089c(this.f27690a.f8710o.mo3744a());
            int i2 = this.f27691b;
            AtomicReferenceArray atomicReferenceArray = this.f27695f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntry2 = referenceEntry; referenceEntry2 != null; referenceEntry2 = referenceEntry2.getNext()) {
                Object key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() == i && key != null && this.f27690a.f8700e.a(obj, key)) {
                    mht mht;
                    mhi valueReference = referenceEntry2.getValueReference();
                    Object obj3 = valueReference.get();
                    if (this.f27690a.f8701f.a(obj2, obj3)) {
                        mht = mht.EXPLICIT;
                    } else {
                        if (obj3 == null) {
                            if (valueReference.mo3751d()) {
                                mht = mht.COLLECTED;
                            }
                        }
                        unlock();
                        m32102m();
                        return false;
                    }
                    this.f27693d++;
                    ReferenceEntry a = m32069a(referenceEntry, referenceEntry2, key, i, obj3, valueReference, mht);
                    int i3 = this.f27691b - 1;
                    atomicReferenceArray.set(length, a);
                    this.f27691b = i3;
                    boolean z = mht == mht.EXPLICIT;
                    unlock();
                    m32102m();
                    return z;
                }
            }
            unlock();
            m32102m();
            return false;
        } catch (Throwable th) {
            unlock();
            m32102m();
        }
    }

    public void m32110a() {
        if (this.f27691b != 0) {
            lock();
            try {
                m32089c(this.f27690a.f8710o.mo3744a());
                AtomicReferenceArray atomicReferenceArray = this.f27695f;
                for (int i = 0; i < atomicReferenceArray.length(); i++) {
                    for (ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                        if (referenceEntry.getValueReference().mo3751d()) {
                            Object key = referenceEntry.getKey();
                            Object obj = referenceEntry.getValueReference().get();
                            mht mht = (key == null || obj == null) ? mht.COLLECTED : mht.EXPLICIT;
                            referenceEntry.getHash();
                            m32080a(key, obj, referenceEntry.getValueReference().mo3746a(), mht);
                        }
                    }
                }
                for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                    atomicReferenceArray.set(i2, null);
                }
                m32096g();
                this.f27701l.clear();
                this.f27702m.clear();
                this.f27700k.set(0);
                this.f27693d++;
                this.f27691b = 0;
            } finally {
                unlock();
                m32102m();
            }
        }
    }

    private ReferenceEntry<K, V> m32069a(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k, int i, V v, mhi<K, V> mhi_K__V, mht mht) {
        m32080a((Object) k, (Object) v, mhi_K__V.mo3746a(), mht);
        this.f27701l.remove(referenceEntry2);
        this.f27702m.remove(referenceEntry2);
        if (!mhi_K__V.mo3750c()) {
            return m32084b((ReferenceEntry) referenceEntry, (ReferenceEntry) referenceEntry2);
        }
        mhi_K__V.mo3748a(null);
        return referenceEntry;
    }

    private ReferenceEntry<K, V> m32084b(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        int i = this.f27691b;
        ReferenceEntry<K, V> next = referenceEntry2.getNext();
        ReferenceEntry next2;
        while (next2 != referenceEntry2) {
            int i2;
            ReferenceEntry<K, V> a = m32068a(next2, (ReferenceEntry) next);
            if (a != null) {
                i2 = i;
            } else {
                m32086b(next2);
                ReferenceEntry<K, V> referenceEntry3 = next;
                i2 = i - 1;
                a = referenceEntry3;
            }
            next2 = next2.getNext();
            i = i2;
            next = a;
        }
        this.f27691b = i;
        return next;
    }

    private void m32086b(ReferenceEntry<K, V> referenceEntry) {
        Object key = referenceEntry.getKey();
        referenceEntry.getHash();
        m32080a(key, referenceEntry.getValueReference().get(), referenceEntry.getValueReference().mo3746a(), mht.COLLECTED);
        this.f27701l.remove(referenceEntry);
        this.f27702m.remove(referenceEntry);
    }

    public boolean m32111a(ReferenceEntry<K, V> referenceEntry, int i) {
        lock();
        try {
            int i2 = this.f27691b;
            AtomicReferenceArray atomicReferenceArray = this.f27695f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry<K, V> referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.getNext()) {
                if (referenceEntry3 == referenceEntry) {
                    this.f27693d++;
                    ReferenceEntry a = m32069a(referenceEntry2, referenceEntry3, referenceEntry3.getKey(), i, referenceEntry3.getValueReference().get(), referenceEntry3.getValueReference(), mht.COLLECTED);
                    int i3 = this.f27691b - 1;
                    atomicReferenceArray.set(length, a);
                    this.f27691b = i3;
                    return true;
                }
            }
            unlock();
            m32102m();
            return false;
        } finally {
            unlock();
            m32102m();
        }
    }

    public boolean m32113a(K k, int i, mhi<K, V> mhi_K__V) {
        lock();
        try {
            int i2 = this.f27691b;
            AtomicReferenceArray atomicReferenceArray = this.f27695f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            ReferenceEntry referenceEntry2 = referenceEntry;
            while (referenceEntry2 != null) {
                Object key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() != i || key == null || !this.f27690a.f8700e.a(k, key)) {
                    referenceEntry2 = referenceEntry2.getNext();
                } else if (referenceEntry2.getValueReference() == mhi_K__V) {
                    this.f27693d++;
                    ReferenceEntry a = m32069a(referenceEntry, referenceEntry2, key, i, mhi_K__V.get(), mhi_K__V, mht.COLLECTED);
                    i2 = this.f27691b - 1;
                    atomicReferenceArray.set(length, a);
                    this.f27691b = i2;
                    return true;
                } else {
                    unlock();
                    if (isHeldByCurrentThread()) {
                        return false;
                    }
                    m32102m();
                    return false;
                }
            }
            unlock();
            if (isHeldByCurrentThread()) {
                return false;
            }
            m32102m();
            return false;
        } finally {
            unlock();
            if (!isHeldByCurrentThread()) {
                m32102m();
            }
        }
    }

    private boolean m32082a(K k, int i, mgs<K, V> mgs_K__V) {
        lock();
        try {
            AtomicReferenceArray atomicReferenceArray = this.f27695f;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            ReferenceEntry referenceEntry2 = referenceEntry;
            while (referenceEntry2 != null) {
                Object key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() != i || key == null || !this.f27690a.f8700e.a(k, key)) {
                    referenceEntry2 = referenceEntry2.getNext();
                } else if (referenceEntry2.getValueReference() == mgs_K__V) {
                    if (mgs_K__V.mo3751d()) {
                        referenceEntry2.setValueReference(mgs_K__V.m32065f());
                    } else {
                        atomicReferenceArray.set(length, m32084b(referenceEntry, referenceEntry2));
                    }
                    unlock();
                    m32102m();
                    return true;
                } else {
                    unlock();
                    m32102m();
                    return false;
                }
            }
            unlock();
            m32102m();
            return false;
        } catch (Throwable th) {
            unlock();
            m32102m();
        }
    }

    private boolean m32081a(ReferenceEntry<K, V> referenceEntry, int i, mht mht) {
        int i2 = this.f27691b;
        AtomicReferenceArray atomicReferenceArray = this.f27695f;
        int length = i & (atomicReferenceArray.length() - 1);
        ReferenceEntry<K, V> referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
        for (ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.getNext()) {
            if (referenceEntry3 == referenceEntry) {
                this.f27693d++;
                ReferenceEntry a = m32069a(referenceEntry2, referenceEntry3, referenceEntry3.getKey(), i, referenceEntry3.getValueReference().get(), referenceEntry3.getValueReference(), mht);
                int i3 = this.f27691b - 1;
                atomicReferenceArray.set(length, a);
                this.f27691b = i3;
                return true;
            }
        }
        return false;
    }

    void m32114b() {
        if ((this.f27700k.incrementAndGet() & 63) == 0) {
            m32103n();
        }
    }

    private void m32089c(long j) {
        m32093d(j);
    }

    private void m32102m() {
        m32104o();
    }

    private void m32103n() {
        m32093d(this.f27690a.f8710o.mo3744a());
        m32104o();
    }

    private void m32093d(long j) {
        if (tryLock()) {
            try {
                m32092d();
                m32085b(j);
                this.f27700k.set(0);
            } finally {
                unlock();
            }
        }
    }

    private void m32104o() {
        if (!isHeldByCurrentThread()) {
            this.f27690a.m10525j();
        }
    }
}
