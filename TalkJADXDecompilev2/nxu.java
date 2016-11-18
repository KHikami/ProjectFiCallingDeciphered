package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

final class nxu implements Iterator<Entry<K, V>> {
    final /* synthetic */ nxo a;
    private int b = -1;
    private boolean c;
    private Iterator<Entry<K, V>> d;

    nxu(nxo nxo) {
        this.a = nxo;
    }

    public /* synthetic */ Object next() {
        return a();
    }

    public boolean hasNext() {
        return this.b + 1 < this.a.a.size() || b().hasNext();
    }

    private Entry<K, V> a() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        if (i < this.a.a.size()) {
            return (Entry) this.a.a.get(this.b);
        }
        return (Entry) b().next();
    }

    public void remove() {
        if (this.c) {
            this.c = false;
            this.a.f();
            if (this.b < this.a.a.size()) {
                nxo nxo = this.a;
                int i = this.b;
                this.b = i - 1;
                nxo.c(i);
                return;
            }
            b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private Iterator<Entry<K, V>> b() {
        if (this.d == null) {
            this.d = this.a.b.entrySet().iterator();
        }
        return this.d;
    }
}
