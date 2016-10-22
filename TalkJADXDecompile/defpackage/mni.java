package defpackage;

import java.util.Map.Entry;

/* renamed from: mni */
final class mni<K, V> extends mjh<K, V> {
    final transient K b;
    final transient V c;
    transient mjh<V, K> d;

    mni(K k, V v) {
        gwb.j((Object) k, (Object) v);
        this.b = k;
        this.c = v;
    }

    private mni(K k, V v, mjh<V, K> mjh_V__K) {
        this.b = k;
        this.c = v;
        this.d = mjh_V__K;
    }

    public V get(Object obj) {
        return this.b.equals(obj) ? this.c : null;
    }

    public int size() {
        return 1;
    }

    public boolean containsKey(Object obj) {
        return this.b.equals(obj);
    }

    public boolean containsValue(Object obj) {
        return this.c.equals(obj);
    }

    boolean d() {
        return false;
    }

    mks<Entry<K, V>> f() {
        return mks.b(mls.a(this.b, this.c));
    }

    mks<K> h() {
        return mks.b(this.b);
    }

    public mjh<V, K> a() {
        mjh<V, K> mjh_V__K = this.d;
        if (mjh_V__K != null) {
            return mjh_V__K;
        }
        mjh_V__K = new mni(this.c, this.b, this);
        this.d = mjh_V__K;
        return mjh_V__K;
    }
}
