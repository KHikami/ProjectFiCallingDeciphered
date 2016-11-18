package p000;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

final class kfp implements Iterator<Entry<String, Object>> {
    final /* synthetic */ kfn f21588a;
    private int f21589b = -1;
    private kfu f21590c;
    private Object f21591d;
    private boolean f21592e;
    private boolean f21593f;
    private kfu f21594g;

    kfp(kfn kfn) {
        this.f21588a = kfn;
    }

    public /* synthetic */ Object next() {
        return m25732a();
    }

    public boolean hasNext() {
        if (!this.f21593f) {
            this.f21593f = true;
            this.f21591d = null;
            while (this.f21591d == null) {
                int i = this.f21589b + 1;
                this.f21589b = i;
                if (i >= this.f21588a.f21584b.f21565b.size()) {
                    break;
                }
                this.f21590c = this.f21588a.f21584b.m25712a((String) this.f21588a.f21584b.f21565b.get(this.f21589b));
                this.f21591d = this.f21590c.m25751a(this.f21588a.f21583a);
            }
        }
        return this.f21591d != null;
    }

    private Entry<String, Object> m25732a() {
        if (hasNext()) {
            this.f21594g = this.f21590c;
            Object obj = this.f21591d;
            this.f21593f = false;
            this.f21592e = false;
            this.f21590c = null;
            this.f21591d = null;
            return new kfo(this.f21588a, this.f21594g, obj);
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        boolean z = (this.f21594g == null || this.f21592e) ? false : true;
        bc.m4824b(z);
        this.f21592e = true;
        this.f21594g.m25753a(this.f21588a.f21583a, null);
    }
}
