import java.util.Set;

public class ljm {
    static final ljm a;
    final ljm b;
    final lo<ljl<?>, Object> c;
    boolean d;

    static {
        a = new ljn(null, new lo(0)).a();
    }

    ljm(ljm ljm, lo<ljl<?>, Object> loVar) {
        this.d = false;
        if (ljm != null) {
            bm.a(ljm.d);
        }
        this.b = ljm;
        this.c = loVar;
    }

    static ljm a(Set<ljm> set) {
        if (set.isEmpty()) {
            return a;
        }
        if (set.size() == 1) {
            return (ljm) set.iterator().next();
        }
        ljm ljm;
        int i = 0;
        for (ljm ljm2 : set) {
            int i2 = i;
            do {
                i2 += ljm.c.size();
                ljm = ljm.b;
            } while (ljm != null);
            i = i2;
        }
        if (i == 0) {
            return a;
        }
        lo loVar = new lo(i);
        for (ljm ljm3 : set) {
            while (true) {
                for (int i3 = 0; i3 < ljm.c.size(); i3++) {
                    boolean z;
                    if (loVar.put((ljl) ljm.c.b(i3), ljm.c.c(i3)) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bm.a(z, "Duplicate bindings: %s", ljm.c.b(i3));
                }
                ljm ljm4 = ljm.b;
                if (ljm4 != null) {
                    ljm = ljm4;
                }
            }
        }
        return new ljn(null, loVar).a();
    }

    final ljm a() {
        if (this.d) {
            throw new IllegalStateException("Already frozen");
        }
        this.d = true;
        if (this.b == null || !this.c.isEmpty()) {
            return this;
        }
        return this.b;
    }
}
