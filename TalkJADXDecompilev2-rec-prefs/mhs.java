package p000;

import com.google.common.cache.LocalCache;
import java.util.Map.Entry;

public final class mhs implements Entry<K, V> {
    final K f27753a;
    V f27754b;
    final /* synthetic */ LocalCache f27755c;

    mhs(LocalCache localCache, K k, V v) {
        this.f27755c = localCache;
        this.f27753a = k;
        this.f27754b = v;
    }

    public K getKey() {
        return this.f27753a;
    }

    public V getValue() {
        return this.f27754b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (this.f27753a.equals(entry.getKey()) && this.f27754b.equals(entry.getValue())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f27753a.hashCode() ^ this.f27754b.hashCode();
    }

    public V setValue(V v) {
        V put = this.f27755c.put(this.f27753a, v);
        this.f27754b = v;
        return put;
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }
}
