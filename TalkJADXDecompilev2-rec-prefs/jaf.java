package p000;

import java.util.ArrayList;
import java.util.List;

public final class jaf {
    private final List<izy> f19526a = new ArrayList();
    private final List<izw> f19527b = new ArrayList();

    jaf() {
    }

    public jaf m23635a(Iterable<? extends izw> iterable) {
        for (Object obj : iterable) {
            ba.m4536a(obj);
            this.f19527b.add(obj);
        }
        return this;
    }

    public jaf m23636b(Iterable<? extends izy> iterable) {
        for (Object obj : iterable) {
            ba.m4536a(obj);
            this.f19526a.add(obj);
        }
        return this;
    }

    public jae m23634a() {
        boolean z = this.f19526a.size() > 0 || this.f19527b.size() > 0;
        ba.m4609b(z);
        return new jae(this.f19526a, this.f19527b);
    }
}
