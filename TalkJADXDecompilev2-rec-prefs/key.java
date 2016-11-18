package p000;

import java.util.Map.Entry;

final class key implements Entry<K, V> {
    final /* synthetic */ kex f21543a;
    private int f21544b;

    key(kex kex, int i) {
        this.f21543a = kex;
        this.f21544b = i;
    }

    public K getKey() {
        kex kex = this.f21543a;
        int i = this.f21544b;
        if (i < 0 || i >= kex.f21541a) {
            return null;
        }
        return kex.f21542b[i << 1];
    }

    public V getValue() {
        return this.f21543a.m25697a(this.f21544b);
    }

    public V setValue(V v) {
        return this.f21543a.m25698a(this.f21544b, v);
    }

    public int hashCode() {
        return getKey().hashCode() ^ getValue().hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (ba.m4612b(getKey(), entry.getKey()) && ba.m4612b(getValue(), entry.getValue())) {
            return true;
        }
        return false;
    }
}
