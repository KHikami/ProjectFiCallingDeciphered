package defpackage;

import java.util.Map.Entry;

final class nxt implements Comparable<nxt>, Entry<K, V> {
    final /* synthetic */ nxo a;
    private final K b;
    private V c;

    public /* synthetic */ int compareTo(Object obj) {
        return a((nxt) obj);
    }

    public /* synthetic */ Object getKey() {
        return a();
    }

    nxt(nxo nxo, Entry<K, V> entry) {
        this(nxo, (Comparable) entry.getKey(), entry.getValue());
    }

    nxt(nxo nxo, K k, V v) {
        this.a = nxo;
        this.b = k;
        this.c = v;
    }

    public K a() {
        return this.b;
    }

    public V getValue() {
        return this.c;
    }

    private int a(nxt nxt) {
        return a().compareTo(nxt.a());
    }

    public V setValue(V v) {
        this.a.f();
        V v2 = this.c;
        this.c = v;
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
        if (nxt.a(this.b, entry.getKey()) && nxt.a(this.c, entry.getValue())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.b == null ? 0 : this.b.hashCode();
        if (this.c != null) {
            i = this.c.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            return obj.equals(obj2);
        }
    }
}
