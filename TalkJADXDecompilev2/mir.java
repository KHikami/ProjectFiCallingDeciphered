package defpackage;

import java.util.Map.Entry;

abstract class mir<K, V> implements Entry<K, V> {
    public abstract K getKey();

    public abstract V getValue();

    mir() {
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (mez.b(getKey(), entry.getKey()) && mez.b(getValue(), entry.getValue())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        Object key = getKey();
        Object value = getValue();
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i = value.hashCode();
        }
        return i ^ hashCode;
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }
}
