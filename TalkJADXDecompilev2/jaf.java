package defpackage;

import java.util.ArrayList;
import java.util.List;

public final class jaf {
    private final List<izy> a = new ArrayList();
    private final List<izw> b = new ArrayList();

    jaf() {
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
