package defpackage;

import com.google.common.cache.LocalCache;
import java.util.Map.Entry;

/* renamed from: mhs */
public final class mhs implements Entry<K, V> {
    final K a;
    V b;
    final /* synthetic */ LocalCache c;

    mhs(LocalCache localCache, K k, V v) {
        this.c = localCache;
        this.a = k;
        this.b = v;
    }

    public K getKey() {
        return this.a;
    }

    public V getValue() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (this.a.equals(entry.getKey()) && this.b.equals(entry.getValue())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public V setValue(V v) {
        V put = this.c.put(this.a, v);
        this.b = v;
        return put;
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }
}
