package p000;

import java.util.Set;

public class ljm {
    static final ljm f25099a = new ljn(null, new lo(0)).m29179a();
    final ljm f25100b;
    final lo<ljl<?>, Object> f25101c;
    boolean f25102d = false;

    ljm(ljm ljm, lo<ljl<?>, Object> loVar) {
        if (ljm != null) {
            bm.m6137a(ljm.f25102d);
        }
        this.f25100b = ljm;
        this.f25101c = loVar;
    }

    static ljm m29178a(Set<ljm> set) {
        if (set.isEmpty()) {
            return f25099a;
        }
        if (set.size() == 1) {
            return (ljm) set.iterator().next();
        }
        ljm ljm;
        int i = 0;
        for (ljm ljm2 : set) {
            int i2 = i;
            do {
                i2 += ljm.f25101c.size();
                ljm = ljm.f25100b;
            } while (ljm != null);
            i = i2;
        }
        if (i == 0) {
            return f25099a;
        }
        lo loVar = new lo(i);
        for (ljm ljm3 : set) {
            while (true) {
                for (int i3 = 0; i3 < ljm.f25101c.size(); i3++) {
                    boolean z;
                    if (loVar.put((ljl) ljm.f25101c.m28017b(i3), ljm.f25101c.m28018c(i3)) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bm.m6143a(z, "Duplicate bindings: %s", ljm.f25101c.m28017b(i3));
                }
                ljm ljm4 = ljm.f25100b;
                if (ljm4 != null) {
                    ljm = ljm4;
                }
            }
        }
        return new ljn(null, loVar).m29179a();
    }

    final ljm m29179a() {
        if (this.f25102d) {
            throw new IllegalStateException("Already frozen");
        }
        this.f25102d = true;
        if (this.f25100b == null || !this.f25101c.isEmpty()) {
            return this;
        }
        return this.f25100b;
    }
}
