package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: mkz */
public final class mkz<K, V> extends mle<K, V> implements NavigableMap<K, V> {
    private static final Comparator<Comparable> d;
    private static final mkz<Comparable, Object> e;
    private static final long serialVersionUID = 0;
    final transient mnd<K> b;
    final transient mjq<V> c;
    private transient mkz<K, V> f;

    public /* synthetic */ NavigableSet descendingKeySet() {
        return l();
    }

    public /* synthetic */ NavigableMap descendingMap() {
        return j();
    }

    public /* synthetic */ Set entrySet() {
        return e();
    }

    public /* synthetic */ mks g() {
        return b();
    }

    public /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        return a(obj, z);
    }

    public /* synthetic */ SortedMap headMap(Object obj) {
        return a(obj);
    }

    public /* synthetic */ Set keySet() {
        return b();
    }

    public /* synthetic */ NavigableSet navigableKeySet() {
        return k();
    }

    public /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return a(obj, z, obj2, z2);
    }

    public /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return a(obj, obj2);
    }

    public /* synthetic */ NavigableMap tailMap(Object obj, boolean z) {
        return b(obj, z);
    }

    public /* synthetic */ SortedMap tailMap(Object obj) {
        return b(obj);
    }

    public /* synthetic */ Collection values() {
        return c();
    }

    static <K, V> mkz<K, V> a(Comparator<? super K> comparator, K k, V v) {
        return new mkz(new mnd(mjq.a((Object) k), (Comparator) bm.a((Object) comparator)), mjq.a((Object) v));
    }

    static <K, V> mkz<K, V> a(Comparator<? super K> comparator, boolean z, Entry<K, V>[] entryArr, int i) {
        int i2 = 0;
        switch (i) {
            case wi.w /*0*/:
                return mkz.a((Comparator) comparator);
            case wi.j /*1*/:
                return mkz.a(comparator, entryArr[0].getKey(), entryArr[0].getValue());
            default:
                Object[] objArr = new Object[i];
                Object[] objArr2 = new Object[i];
                Object key;
                if (z) {
                    while (i2 < i) {
                        key = entryArr[i2].getKey();
                        Object value = entryArr[i2].getValue();
                        gwb.j(key, value);
                        objArr[i2] = key;
                        objArr2[i2] = value;
                        i2++;
                    }
                } else {
                    Arrays.sort(entryArr, 0, i, mms.a((Comparator) comparator).d());
                    key = entryArr[0].getKey();
                    objArr[0] = key;
                    objArr2[0] = entryArr[0].getValue();
                    int i3 = 1;
                    while (i3 < i) {
                        boolean z2;
                        Object key2 = entryArr[i3].getKey();
                        Object value2 = entryArr[i3].getValue();
                        gwb.j(key2, value2);
                        objArr[i3] = key2;
                        objArr2[i3] = value2;
                        if (comparator.compare(key, key2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mjx.a(z2, "key", entryArr[i3 - 1], entryArr[i3]);
                        i3++;
                        key = key2;
                    }
                }
                return new mkz(new mnd(new mna(objArr), comparator), new mna(objArr2));
        }
    }

    private mkz(mnd<K> mnd_K, mjq<V> mjq_V) {
        this(mnd_K, mjq_V, null);
    }

    private mkz(mnd<K> mnd_K, mjq<V> mjq_V, mkz<K, V> mkz_K__V) {
        this.b = mnd_K;
        this.c = mjq_V;
        this.f = mkz_K__V;
    }

    public int size() {
        return this.c.size();
    }

    public V get(Object obj) {
        int a = this.b.a(obj);
        return a == -1 ? null : this.c.get(a);
    }

    boolean d() {
        return this.b.e() || this.c.e();
    }

    public mks<Entry<K, V>> e() {
        return super.e();
    }

    mks<Entry<K, V>> f() {
        if (isEmpty()) {
            return mnc.a;
        }
        return new mla(this);
    }

    private mlf<K> b() {
        return this.b;
    }

    public mjk<V> c() {
        return this.c;
    }

    public Comparator<? super K> comparator() {
        return b().comparator();
    }

    public K firstKey() {
        return b().first();
    }

    public K lastKey() {
        return b().last();
    }

    private mkz<K, V> a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return mkz.a(comparator());
        }
        return new mkz(this.b.a(i, i2), this.c.a(i, i2));
    }

    private mkz<K, V> a(K k) {
        return a((Object) k, false);
    }

    private mkz<K, V> a(K k, boolean z) {
        return a(0, this.b.e(bm.a((Object) k), z));
    }

    private mkz<K, V> a(K k, K k2) {
        return a((Object) k, true, (Object) k2, false);
    }

    private mkz<K, V> a(K k, boolean z, K k2, boolean z2) {
        bm.a((Object) k);
        bm.a((Object) k2);
        bm.a(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", (Object) k, (Object) k2);
        return a((Object) k2, z2).b(k, z);
    }

    private mkz<K, V> b(K k) {
        return b(k, true);
    }

    private mkz<K, V> b(K k, boolean z) {
        return a(this.b.f(bm.a((Object) k), z), size());
    }

    public Entry<K, V> lowerEntry(K k) {
        return a((Object) k, false).lastEntry();
    }

    public K lowerKey(K k) {
        return mls.b(lowerEntry(k));
    }

    public Entry<K, V> floorEntry(K k) {
        return a((Object) k, true).lastEntry();
    }

    public K floorKey(K k) {
        return mls.b(floorEntry(k));
    }

    public Entry<K, V> ceilingEntry(K k) {
        return b(k, true).firstEntry();
    }

    public K ceilingKey(K k) {
        return mls.b(ceilingEntry(k));
    }

    public Entry<K, V> higherEntry(K k) {
        return b(k, false).firstEntry();
    }

    public K higherKey(K k) {
        return mls.b(higherEntry(k));
    }

    public Entry<K, V> firstEntry() {
        return isEmpty() ? null : (Entry) e().f().get(0);
    }

    public Entry<K, V> lastEntry() {
        return isEmpty() ? null : (Entry) e().f().get(size() - 1);
    }

    @Deprecated
    public final Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    private mkz<K, V> j() {
        mkz<K, V> mkz_K__V = this.f;
        if (mkz_K__V != null) {
            return mkz_K__V;
        }
        if (isEmpty()) {
            return mkz.a(mms.a(comparator()).c());
        }
        return new mkz((mnd) this.b.b(), this.c.d(), this);
    }

    private mlf<K> k() {
        return this.b;
    }

    private mlf<K> l() {
        return this.b.b();
    }

    Object writeReplace() {
        return new mld(this);
    }

    static <K, V> mkz<K, V> a(Comparator<? super K> comparator) {
        if (mmo.a.equals(comparator)) {
            return e;
        }
        return new mkz(mlf.a((Comparator) comparator), mna.a);
    }

    static {
        d = mmo.a;
        e = new mkz(mlf.a(mmo.a), mna.a);
    }
}
