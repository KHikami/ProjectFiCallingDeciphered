import java.util.Map.Entry;

final class key implements Entry<K, V> {
    final /* synthetic */ kex a;
    private int b;

    key(kex kex, int i) {
        this.a = kex;
        this.b = i;
    }

    public K getKey() {
        kex kex = this.a;
        int i = this.b;
        if (i < 0 || i >= kex.a) {
            return null;
        }
        return kex.b[i << 1];
    }

    public V getValue() {
        return this.a.a(this.b);
    }

    public V setValue(V v) {
        return this.a.a(this.b, v);
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
        if (ba.b(getKey(), entry.getKey()) && ba.b(getValue(), entry.getValue())) {
            return true;
        }
        return false;
    }
}
