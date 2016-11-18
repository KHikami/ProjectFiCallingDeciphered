package p000;

import java.util.Iterator;
import java.util.Map.Entry;

final class li implements Iterator<Entry<K, V>>, Entry<K, V> {
    int f25017a;
    int f25018b;
    boolean f25019c = false;
    final /* synthetic */ le f25020d;

    public /* synthetic */ Object next() {
        return m29080a();
    }

    li(le leVar) {
        this.f25020d = leVar;
        this.f25017a = leVar.mo3681a() - 1;
        this.f25018b = -1;
    }

    public boolean hasNext() {
        return this.f25018b < this.f25017a;
    }

    private Entry<K, V> m29080a() {
        this.f25018b++;
        this.f25019c = true;
        return this;
    }

    public void remove() {
        if (this.f25019c) {
            this.f25020d.mo3685a(this.f25018b);
            this.f25018b--;
            this.f25017a--;
            this.f25019c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public K getKey() {
        if (this.f25019c) {
            return this.f25020d.mo3683a(this.f25018b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public V getValue() {
        if (this.f25019c) {
            return this.f25020d.mo3683a(this.f25018b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public V setValue(V v) {
        if (this.f25019c) {
            return this.f25020d.mo3684a(this.f25018b, (Object) v);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean equals(Object obj) {
        if (!this.f25019c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Entry)) {
            return false;
        } else {
            Entry entry = (Entry) obj;
            if (la.m28316a(entry.getKey(), this.f25020d.mo3683a(this.f25018b, 0)) && la.m28316a(entry.getValue(), this.f25020d.mo3683a(this.f25018b, 1))) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int i = 0;
        if (this.f25019c) {
            Object a = this.f25020d.mo3683a(this.f25018b, 0);
            Object a2 = this.f25020d.mo3683a(this.f25018b, 1);
            int hashCode = a == null ? 0 : a.hashCode();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return i ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
