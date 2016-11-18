package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

public final class mkz<K, V> extends mle<K, V> implements NavigableMap<K, V> {
    private static final Comparator<Comparable> f27870d = mmo.f27910a;
    private static final mkz<Comparable, Object> f27871e = new mkz(mlf.m32263a(mmo.f27910a), mna.f27928a);
    private static final long serialVersionUID = 0;
    final transient mnd<K> f27872b;
    final transient mjq<V> f27873c;
    private transient mkz<K, V> f27874f;

    public /* synthetic */ NavigableSet descendingKeySet() {
        return m32431l();
    }

    public /* synthetic */ NavigableMap descendingMap() {
        return m32429j();
    }

    public /* synthetic */ Set entrySet() {
        return mo3873e();
    }

    public /* synthetic */ mks mo3874g() {
        return m32428b();
    }

    public /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        return m32421a(obj, z);
    }

    public /* synthetic */ SortedMap headMap(Object obj) {
        return m32419a(obj);
    }

    public /* synthetic */ Set keySet() {
        return m32428b();
    }

    public /* synthetic */ NavigableSet navigableKeySet() {
        return m32430k();
    }

    public /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return m32422a(obj, z, obj2, z2);
    }

    public /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return m32420a(obj, obj2);
    }

    public /* synthetic */ NavigableMap tailMap(Object obj, boolean z) {
        return m32427b(obj, z);
    }

    public /* synthetic */ SortedMap tailMap(Object obj) {
        return m32426b(obj);
    }

    public /* synthetic */ Collection values() {
        return mo3833c();
    }

    static <K, V> mkz<K, V> m32424a(Comparator<? super K> comparator, K k, V v) {
        return new mkz(new mnd(mjq.m32313a((Object) k), (Comparator) bm.m6122a((Object) comparator)), mjq.m32313a((Object) v));
    }

    static <K, V> mkz<K, V> m32425a(Comparator<? super K> comparator, boolean z, Entry<K, V>[] entryArr, int i) {
        int i2 = 0;
        switch (i) {
            case 0:
                return mkz.m32423a((Comparator) comparator);
            case 1:
                return mkz.m32424a(comparator, entryArr[0].getKey(), entryArr[0].getValue());
            default:
                Object[] objArr = new Object[i];
                Object[] objArr2 = new Object[i];
                Object key;
                if (z) {
                    while (i2 < i) {
                        key = entryArr[i2].getKey();
                        Object value = entryArr[i2].getValue();
                        gwb.m2264j(key, value);
                        objArr[i2] = key;
                        objArr2[i2] = value;
                        i2++;
                    }
                } else {
                    Arrays.sort(entryArr, 0, i, mms.m32221a((Comparator) comparator).m32227d());
                    key = entryArr[0].getKey();
                    objArr[0] = key;
                    objArr2[0] = entryArr[0].getValue();
                    int i3 = 1;
                    while (i3 < i) {
                        boolean z2;
                        Object key2 = entryArr[i3].getKey();
                        Object value2 = entryArr[i3].getValue();
                        gwb.m2264j(key2, value2);
                        objArr[i3] = key2;
                        objArr2[i3] = value2;
                        if (comparator.compare(key, key2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mjx.m32329a(z2, "key", entryArr[i3 - 1], entryArr[i3]);
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
        this.f27872b = mnd_K;
        this.f27873c = mjq_V;
        this.f27874f = mkz_K__V;
    }

    public int size() {
        return this.f27873c.size();
    }

    public V get(Object obj) {
        int a = this.f27872b.mo3812a(obj);
        return a == -1 ? null : this.f27873c.get(a);
    }

    boolean mo3850d() {
        return this.f27872b.mo3822e() || this.f27873c.mo3822e();
    }

    public mks<Entry<K, V>> mo3873e() {
        return super.mo3873e();
    }

    mks<Entry<K, V>> mo3845f() {
        if (isEmpty()) {
            return mnc.f27935a;
        }
        return new mla(this);
    }

    private mlf<K> m32428b() {
        return this.f27872b;
    }

    public mjk<V> mo3833c() {
        return this.f27873c;
    }

    public Comparator<? super K> comparator() {
        return m32428b().comparator();
    }

    public K firstKey() {
        return m32428b().first();
    }

    public K lastKey() {
        return m32428b().last();
    }

    private mkz<K, V> m32418a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return mkz.m32423a(comparator());
        }
        return new mkz(this.f27872b.m32556a(i, i2), this.f27873c.mo3855a(i, i2));
    }

    private mkz<K, V> m32419a(K k) {
        return m32421a((Object) k, false);
    }

    private mkz<K, V> m32421a(K k, boolean z) {
        return m32418a(0, this.f27872b.m32561e(bm.m6122a((Object) k), z));
    }

    private mkz<K, V> m32420a(K k, K k2) {
        return m32422a((Object) k, true, (Object) k2, false);
    }

    private mkz<K, V> m32422a(K k, boolean z, K k2, boolean z2) {
        bm.m6122a((Object) k);
        bm.m6122a((Object) k2);
        bm.m6144a(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", (Object) k, (Object) k2);
        return m32421a((Object) k2, z2).m32427b(k, z);
    }

    private mkz<K, V> m32426b(K k) {
        return m32427b(k, true);
    }

    private mkz<K, V> m32427b(K k, boolean z) {
        return m32418a(this.f27872b.m32563f(bm.m6122a((Object) k), z), size());
    }

    public Entry<K, V> lowerEntry(K k) {
        return m32421a((Object) k, false).lastEntry();
    }

    public K lowerKey(K k) {
        return mls.m32484b(lowerEntry(k));
    }

    public Entry<K, V> floorEntry(K k) {
        return m32421a((Object) k, true).lastEntry();
    }

    public K floorKey(K k) {
        return mls.m32484b(floorEntry(k));
    }

    public Entry<K, V> ceilingEntry(K k) {
        return m32427b(k, true).firstEntry();
    }

    public K ceilingKey(K k) {
        return mls.m32484b(ceilingEntry(k));
    }

    public Entry<K, V> higherEntry(K k) {
        return m32427b(k, false).firstEntry();
    }

    public K higherKey(K k) {
        return mls.m32484b(higherEntry(k));
    }

    public Entry<K, V> firstEntry() {
        return isEmpty() ? null : (Entry) mo3873e().mo3807f().get(0);
    }

    public Entry<K, V> lastEntry() {
        return isEmpty() ? null : (Entry) mo3873e().mo3807f().get(size() - 1);
    }

    @Deprecated
    public final Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    private mkz<K, V> m32429j() {
        mkz<K, V> mkz_K__V = this.f27874f;
        if (mkz_K__V != null) {
            return mkz_K__V;
        }
        if (isEmpty()) {
            return mkz.m32423a(mms.m32221a(comparator()).mo3888c());
        }
        return new mkz((mnd) this.f27872b.mo3815b(), this.f27873c.mo3856d(), this);
    }

    private mlf<K> m32430k() {
        return this.f27872b;
    }

    private mlf<K> m32431l() {
        return this.f27872b.mo3815b();
    }

    Object writeReplace() {
        return new mld(this);
    }

    static <K, V> mkz<K, V> m32423a(Comparator<? super K> comparator) {
        if (mmo.f27910a.equals(comparator)) {
            return f27871e;
        }
        return new mkz(mlf.m32263a((Comparator) comparator), mna.f27928a);
    }
}
