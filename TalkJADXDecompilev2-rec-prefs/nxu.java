package p000;

import java.util.Iterator;
import java.util.Map.Entry;

final class nxu implements Iterator<Entry<K, V>> {
    final /* synthetic */ nxo f31226a;
    private int f31227b = -1;
    private boolean f31228c;
    private Iterator<Entry<K, V>> f31229d;

    nxu(nxo nxo) {
        this.f31226a = nxo;
    }

    public /* synthetic */ Object next() {
        return m37048a();
    }

    public boolean hasNext() {
        return this.f31227b + 1 < this.f31226a.f31216a.size() || m37049b().hasNext();
    }

    private Entry<K, V> m37048a() {
        this.f31228c = true;
        int i = this.f31227b + 1;
        this.f31227b = i;
        if (i < this.f31226a.f31216a.size()) {
            return (Entry) this.f31226a.f31216a.get(this.f31227b);
        }
        return (Entry) m37049b().next();
    }

    public void remove() {
        if (this.f31228c) {
            this.f31228c = false;
            this.f31226a.m37043f();
            if (this.f31227b < this.f31226a.f31216a.size()) {
                nxo nxo = this.f31226a;
                int i = this.f31227b;
                this.f31227b = i - 1;
                nxo.m37040c(i);
                return;
            }
            m37049b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private Iterator<Entry<K, V>> m37049b() {
        if (this.f31229d == null) {
            this.f31229d = this.f31226a.f31217b.entrySet().iterator();
        }
        return this.f31229d;
    }
}
