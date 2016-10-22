package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: mjx */
public abstract class mjx<K, V> implements Serializable, Map<K, V> {
    public static final Entry<?, ?>[] a;
    private transient mks<Entry<K, V>> b;
    private transient mks<K> c;
    private transient mjk<V> d;

    public abstract boolean d();

    abstract mks<Entry<K, V>> f();

    public abstract V get(Object obj);

    public /* synthetic */ Set entrySet() {
        return e();
    }

    public /* synthetic */ Set keySet() {
        return g();
    }

    public /* synthetic */ Collection values() {
        return c();
    }

    public static <K, V> mjx<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Entry[] entryArr = new Entry[]{mjx.b(k, v), mjx.b(k2, v2), mjx.b(k3, v3), mjx.b(k4, v4)};
        return mnb.a(entryArr.length, entryArr);
    }

    static <K, V> mkd<K, V> b(K k, V v) {
        return new mkd(k, v);
    }

    static void a(boolean z, String str, Entry<?, ?> entry, Entry<?, ?> entry2) {
        if (!z) {
            String valueOf = String.valueOf(entry);
            String valueOf2 = String.valueOf(entry2);
            throw new IllegalArgumentException(new StringBuilder(((String.valueOf(str).length() + 34) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("Multiple entries with same ").append(str).append(": ").append(valueOf).append(" and ").append(valueOf2).toString());
        }
    }

    public static <K extends Enum<K>, V> mjx<K, V> a(EnumMap<K, ? extends V> enumMap) {
        EnumMap enumMap2 = new EnumMap(enumMap);
        for (Entry entry : enumMap2.entrySet()) {
            Entry entry2;
            gwb.j(entry2.getKey(), entry2.getValue());
        }
        switch (enumMap2.size()) {
            case wi.w /*0*/:
                return mmv.b;
            case wi.j /*1*/:
                entry2 = (Entry) gwb.b(enumMap2.entrySet());
                return mjh.a((Enum) entry2.getKey(), entry2.getValue());
            default:
                return new mjo(enumMap2);
        }
    }

    static {
        a = new Entry[0];
    }

    mjx() {
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return c().contains(obj);
    }

    public mks<Entry<K, V>> e() {
        mks<Entry<K, V>> mks_java_util_Map_Entry_K__V = this.b;
        if (mks_java_util_Map_Entry_K__V != null) {
            return mks_java_util_Map_Entry_K__V;
        }
        mks_java_util_Map_Entry_K__V = f();
        this.b = mks_java_util_Map_Entry_K__V;
        return mks_java_util_Map_Entry_K__V;
    }

    public mks<K> g() {
        mks<K> mks_K = this.c;
        if (mks_K != null) {
            return mks_K;
        }
        mks_K = h();
        this.c = mks_K;
        return mks_K;
    }

    mks<K> h() {
        if (isEmpty()) {
            return mnc.a;
        }
        return new mkj(this);
    }

    mny<K> W_() {
        return new mjy(this, e().a());
    }

    public mjk<V> c() {
        mjk<V> mjk_V = this.d;
        if (mjk_V != null) {
            return mjk_V;
        }
        mjk_V = new mkl(this);
        this.d = mjk_V;
        return mjk_V;
    }

    public boolean equals(Object obj) {
        return mls.d(this, obj);
    }

    public int hashCode() {
        return ba.a(e());
    }

    boolean i() {
        return false;
    }

    public String toString() {
        return mls.a((Map) this);
    }

    Object writeReplace() {
        return new mkc(this);
    }
}
