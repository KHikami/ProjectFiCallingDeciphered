package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class mjx<K, V> implements Serializable, Map<K, V> {
    public static final Entry<?, ?>[] f27821a = new Entry[0];
    private transient mks<Entry<K, V>> f27822b;
    private transient mks<K> f27823c;
    private transient mjk<V> f27824d;

    public abstract boolean mo3850d();

    abstract mks<Entry<K, V>> mo3845f();

    public abstract V get(Object obj);

    public /* synthetic */ Set entrySet() {
        return mo3873e();
    }

    public /* synthetic */ Set keySet() {
        return mo3874g();
    }

    public /* synthetic */ Collection values() {
        return mo3833c();
    }

    public static <K, V> mjx<K, V> m32327a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Entry[] entryArr = new Entry[]{mjx.m32330b(k, v), mjx.m32330b(k2, v2), mjx.m32330b(k3, v3), mjx.m32330b(k4, v4)};
        return mnb.m32543a(entryArr.length, entryArr);
    }

    static <K, V> mkd<K, V> m32330b(K k, V v) {
        return new mkd(k, v);
    }

    static void m32329a(boolean z, String str, Entry<?, ?> entry, Entry<?, ?> entry2) {
        if (!z) {
            String valueOf = String.valueOf(entry);
            String valueOf2 = String.valueOf(entry2);
            throw new IllegalArgumentException(new StringBuilder(((String.valueOf(str).length() + 34) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("Multiple entries with same ").append(str).append(": ").append(valueOf).append(" and ").append(valueOf2).toString());
        }
    }

    public static <K extends Enum<K>, V> mjx<K, V> m32328a(EnumMap<K, ? extends V> enumMap) {
        Entry entry;
        EnumMap enumMap2 = new EnumMap(enumMap);
        for (Entry entry2 : enumMap2.entrySet()) {
            gwb.m2264j(entry2.getKey(), entry2.getValue());
        }
        switch (enumMap2.size()) {
            case 0:
                return mmv.f27916b;
            case 1:
                entry2 = (Entry) gwb.m1992b(enumMap2.entrySet());
                return mjh.m32338a((Enum) entry2.getKey(), entry2.getValue());
            default:
                return new mjo(enumMap2);
        }
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
        return mo3833c().contains(obj);
    }

    public mks<Entry<K, V>> mo3873e() {
        mks<Entry<K, V>> mks_java_util_Map_Entry_K__V = this.f27822b;
        if (mks_java_util_Map_Entry_K__V != null) {
            return mks_java_util_Map_Entry_K__V;
        }
        mks_java_util_Map_Entry_K__V = mo3845f();
        this.f27822b = mks_java_util_Map_Entry_K__V;
        return mks_java_util_Map_Entry_K__V;
    }

    public mks<K> mo3874g() {
        mks<K> mks_K = this.f27823c;
        if (mks_K != null) {
            return mks_K;
        }
        mks_K = mo3896h();
        this.f27823c = mks_K;
        return mks_K;
    }

    mks<K> mo3896h() {
        if (isEmpty()) {
            return mnc.f27935a;
        }
        return new mkj(this);
    }

    mny<K> W_() {
        return new mjy(this, mo3873e().mo3806a());
    }

    public mjk<V> mo3833c() {
        mjk<V> mjk_V = this.f27824d;
        if (mjk_V != null) {
            return mjk_V;
        }
        mjk_V = new mkl(this);
        this.f27824d = mjk_V;
        return mjk_V;
    }

    public boolean equals(Object obj) {
        return mls.m32492d(this, obj);
    }

    public int hashCode() {
        return ba.m4527a(mo3873e());
    }

    boolean mo3891i() {
        return false;
    }

    public String toString() {
        return mls.m32477a((Map) this);
    }

    Object writeReplace() {
        return new mkc(this);
    }
}
