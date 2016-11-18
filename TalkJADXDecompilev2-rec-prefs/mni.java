package p000;

import java.util.Map.Entry;

final class mni<K, V> extends mjh<K, V> {
    final transient K f27945b;
    final transient V f27946c;
    transient mjh<V, K> f27947d;

    mni(K k, V v) {
        gwb.m2264j((Object) k, (Object) v);
        this.f27945b = k;
        this.f27946c = v;
    }

    private mni(K k, V v, mjh<V, K> mjh_V__K) {
        this.f27945b = k;
        this.f27946c = v;
        this.f27947d = mjh_V__K;
    }

    public V get(Object obj) {
        return this.f27945b.equals(obj) ? this.f27946c : null;
    }

    public int size() {
        return 1;
    }

    public boolean containsKey(Object obj) {
        return this.f27945b.equals(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f27946c.equals(obj);
    }

    boolean mo3850d() {
        return false;
    }

    mks<Entry<K, V>> mo3845f() {
        return mks.m32259b(mls.m32480a(this.f27945b, this.f27946c));
    }

    mks<K> mo3896h() {
        return mks.m32259b(this.f27945b);
    }

    public mjh<V, K> mo3889a() {
        mjh<V, K> mjh_V__K = this.f27947d;
        if (mjh_V__K != null) {
            return mjh_V__K;
        }
        mjh_V__K = new mni(this.f27946c, this.f27945b, this);
        this.f27947d = mjh_V__K;
        return mjh_V__K;
    }
}
