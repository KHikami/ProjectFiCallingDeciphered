package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jaf */
public final class jaf {
    private final List<izy> a;
    private final List<izw> b;

    jaf() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public jaf a(Iterable<? extends izw> iterable) {
        for (Object obj : iterable) {
            ba.a(obj);
            this.b.add(obj);
        }
        return this;
    }

    public jaf b(Iterable<? extends izy> iterable) {
        for (Object obj : iterable) {
            ba.a(obj);
            this.a.add(obj);
        }
        return this;
    }

    public jae a() {
        boolean z = this.a.size() > 0 || this.b.size() > 0;
        ba.b(z);
        return new jae(this.a, this.b);
    }
}
