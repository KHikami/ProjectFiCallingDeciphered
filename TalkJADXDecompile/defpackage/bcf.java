package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bcf */
public final class bcf {
    public List<bcn> a;
    public List<bcg> b;

    public bcf() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public juh a() {
        return new juh();
    }

    public bcf a(bcn bcn) {
        this.a.add(bcn);
        return this;
    }

    public bcf a(Iterable<? extends bcn> iterable) {
        for (bcn add : iterable) {
            this.a.add(add);
        }
        return this;
    }

    public bcf a(bcg bcg) {
        this.b.add(bcg);
        return this;
    }
}
