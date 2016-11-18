package p000;

import java.util.Map.Entry;

final class nxt implements Comparable<nxt>, Entry<K, V> {
    final /* synthetic */ nxo f31223a;
    private final K f31224b;
    private V f31225c;

    public /* synthetic */ int compareTo(Object obj) {
        return m37045a((nxt) obj);
    }

    public /* synthetic */ Object getKey() {
        return m37047a();
    }

    nxt(nxo nxo, Entry<K, V> entry) {
        this(nxo, (Comparable) entry.getKey(), entry.getValue());
    }

    nxt(nxo nxo, K k, V v) {
        this.f31223a = nxo;
        this.f31224b = k;
        this.f31225c = v;
    }

    public K m37047a() {
        return this.f31224b;
    }

    public V getValue() {
        return this.f31225c;
    }

    private int m37045a(nxt nxt) {
        return m37047a().compareTo(nxt.m37047a());
    }

    public V setValue(V v) {
        this.f31223a.m37043f();
        V v2 = this.f31225c;
        this.f31225c = v;
        return v2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (nxt.m37046a(this.f31224b, entry.getKey()) && nxt.m37046a(this.f31225c, entry.getValue())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f31224b == null ? 0 : this.f31224b.hashCode();
        if (this.f31225c != null) {
            i = this.f31225c.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f31224b);
        String valueOf2 = String.valueOf(this.f31225c);
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }

    private static boolean m37046a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            return obj.equals(obj2);
        }
    }
}
