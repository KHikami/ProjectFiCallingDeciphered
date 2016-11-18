package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

final class kfp implements Iterator<Entry<String, Object>> {
    final /* synthetic */ kfn a;
    private int b = -1;
    private kfu c;
    private Object d;
    private boolean e;
    private boolean f;
    private kfu g;

    kfp(kfn kfn) {
        this.a = kfn;
    }

    public /* synthetic */ Object next() {
        return a();
    }

    public boolean hasNext() {
        if (!this.f) {
            this.f = true;
            this.d = null;
            while (this.d == null) {
                int i = this.b + 1;
                this.b = i;
                if (i >= this.a.b.b.size()) {
                    break;
                }
                this.c = this.a.b.a((String) this.a.b.b.get(this.b));
                this.d = this.c.a(this.a.a);
            }
        }
        return this.d != null;
    }

    private Entry<String, Object> a() {
        if (hasNext()) {
            this.g = this.c;
            Object obj = this.d;
            this.f = false;
            this.e = false;
            this.c = null;
            this.d = null;
            return new kfo(this.a, this.g, obj);
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        boolean z = (this.g == null || this.e) ? false : true;
        bc.b(z);
        this.e = true;
        this.g.a(this.a.a, null);
    }
}
