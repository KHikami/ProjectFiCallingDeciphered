package com.google.common.cache;

import a;
import bm;
import gwb;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;
import mfx;
import mga;
import mgb;
import mge;
import mgo;
import mgr;
import mgu;
import mgv;
import mgy;
import mhi;
import mhj;
import mhz;
import mlj;
import u;

public class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public static final Logger a;
    public static final mhi<Object, Object> r;
    public static final Queue<? extends Object> s;
    final int b;
    final int c;
    public final mgv<K, V>[] d;
    public final u e;
    public final u f;
    final mgy g;
    public final mgy h;
    final long i;
    public final a j;
    final long k;
    final long l;
    public final long m;
    public final Queue<mhz<K, V>> n;
    public final mfx o;
    public final mge p;
    public final u q;
    Set<K> t;
    Collection<V> u;
    Set<Entry<K, V>> v;

    public interface ReferenceEntry<K, V> {
        long getAccessTime();

        int getHash();

        K getKey();

        ReferenceEntry<K, V> getNext();

        ReferenceEntry<K, V> getNextInAccessQueue();

        ReferenceEntry<K, V> getNextInWriteQueue();

        ReferenceEntry<K, V> getPreviousInAccessQueue();

        ReferenceEntry<K, V> getPreviousInWriteQueue();

        mhi<K, V> getValueReference();

        long getWriteTime();

        void setAccessTime(long j);

        void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry);

        void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry);

        void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry);

        void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry);

        void setValueReference(mhi<K, V> mhi_K__V);

        void setWriteTime(long j);
    }

    static {
        a = Logger.getLogger(LocalCache.class.getName());
        r = new mga();
        s = new mgb();
    }

    public boolean a() {
        return this.i >= 0;
    }

    boolean b() {
        return this.l > 0;
    }

    boolean c() {
        return this.k > 0;
    }

    public boolean d() {
        return this.m > 0;
    }

    public boolean e() {
        return b() || d();
    }

    public boolean f() {
        return c();
    }

    public boolean g() {
        return this.g != mgy.STRONG;
    }

    public boolean h() {
        return this.h != mgy.STRONG;
    }

    public static <K, V> ReferenceEntry<K, V> i() {
        return mgu.INSTANCE;
    }

    int a(Object obj) {
        int a = this.e.a(obj);
        a += (a << 15) ^ -12931;
        a ^= a >>> 10;
        a += a << 3;
        a ^= a >>> 6;
        a += (a << 2) + (a << 14);
        return a ^ (a >>> 16);
    }

    public void a(mhi<K, V> mhi_K__V) {
        ReferenceEntry b = mhi_K__V.b();
        int hash = b.getHash();
        a(hash).a(b.getKey(), hash, (mhi) mhi_K__V);
    }

    public void a(ReferenceEntry<K, V> referenceEntry) {
        int hash = referenceEntry.getHash();
        a(hash).a((ReferenceEntry) referenceEntry, hash);
    }

    mgv<K, V> a(int i) {
        return this.d[(i >>> this.c) & this.b];
    }

    public V a(ReferenceEntry<K, V> referenceEntry, long j) {
        if (referenceEntry.getKey() == null) {
            return null;
        }
        V v = referenceEntry.getValueReference().get();
        if (v == null || b((ReferenceEntry) referenceEntry, j)) {
            return null;
        }
        return v;
    }

    public boolean b(ReferenceEntry<K, V> referenceEntry, long j) {
        bm.a((Object) referenceEntry);
        if (c() && j - referenceEntry.getAccessTime() >= this.k) {
            return true;
        }
        if (!b() || j - referenceEntry.getWriteTime() < this.l) {
            return false;
        }
        return true;
    }

    public static <K, V> void a(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInAccessQueue(referenceEntry2);
        referenceEntry2.setPreviousInAccessQueue(referenceEntry);
    }

    public static <K, V> void b(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInWriteQueue(referenceEntry2);
        referenceEntry2.setPreviousInWriteQueue(referenceEntry);
    }

    public void j() {
        do {
        } while (((mhz) this.n.poll()) != null);
    }

    public boolean isEmpty() {
        int i;
        mgv[] mgvArr = this.d;
        long j = 0;
        for (i = 0; i < mgvArr.length; i++) {
            if (mgvArr[i].b != 0) {
                return false;
            }
            j += (long) mgvArr[i].d;
        }
        if (j != 0) {
            for (i = 0; i < mgvArr.length; i++) {
                if (mgvArr[i].b != 0) {
                    return false;
                }
                j -= (long) mgvArr[i].d;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    long k() {
        long j = 0;
        for (mgv mgv : this.d) {
            j += (long) Math.max(0, mgv.b);
        }
        return j;
    }

    public int size() {
        return gwb.e(k());
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = a(obj);
        return a(a).a(obj, a);
    }

    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int a = a(obj);
        return a(a).b(obj, a);
    }

    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long a = this.o.a();
        mgv[] mgvArr = this.d;
        int i = 0;
        long j = -1;
        while (i < 3) {
            long j2 = 0;
            for (mgv mgv : mgvArr) {
                int i2 = mgv.b;
                AtomicReferenceArray atomicReferenceArray = mgv.f;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i3); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                        Object a2 = mgv.a(referenceEntry, a);
                        if (a2 != null) {
                            if (this.f.a(obj, a2)) {
                                return true;
                            }
                        }
                    }
                }
                j2 += (long) mgv.d;
            }
            if (j2 == j) {
                break;
            }
            i++;
            j = j2;
        }
        return false;
    }

    public V put(K k, V v) {
        bm.a((Object) k);
        bm.a((Object) v);
        int a = a((Object) k);
        return a(a).a((Object) k, a, (Object) v, false);
    }

    public V putIfAbsent(K k, V v) {
        bm.a((Object) k);
        bm.a((Object) v);
        int a = a((Object) k);
        return a(a).a((Object) k, a, (Object) v, true);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = a(obj);
        return a(a).c(obj, a);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int a = a(obj);
        return a(a).b(obj, a, obj2);
    }

    public boolean replace(K k, V v, V v2) {
        bm.a((Object) k);
        bm.a((Object) v2);
        if (v == null) {
            return false;
        }
        int a = a((Object) k);
        return a(a).a((Object) k, a, (Object) v, (Object) v2);
    }

    public V replace(K k, V v) {
        bm.a((Object) k);
        bm.a((Object) v);
        int a = a((Object) k);
        return a(a).a((Object) k, a, (Object) v);
    }

    public void clear() {
        for (mgv a : this.d) {
            a.a();
        }
    }

    public Set<K> keySet() {
        Set<K> set = this.t;
        if (set != null) {
            return set;
        }
        set = new mgr(this, this);
        this.t = set;
        return set;
    }

    public Collection<V> values() {
        Collection<V> collection = this.u;
        if (collection != null) {
            return collection;
        }
        collection = new mhj(this, this);
        this.u = collection;
        return collection;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.v;
        if (set != null) {
            return set;
        }
        set = new mgo(this, this);
        this.v = set;
        return set;
    }

    public static <E> ArrayList<E> a(Collection<E> collection) {
        Collection arrayList = new ArrayList(collection.size());
        mlj.a(arrayList, collection.iterator());
        return arrayList;
    }
}
