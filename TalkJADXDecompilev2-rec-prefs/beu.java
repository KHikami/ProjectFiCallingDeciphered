package p000;

import java.util.Map;
import java.util.Set;

final class beu {
    final Map<Integer, beq> f3162a = new ky();

    beu() {
    }

    public boolean m5033a(int i) {
        return this.f3162a.containsKey(Integer.valueOf(i));
    }

    public beq m5034b(int i) {
        return (beq) this.f3162a.get(Integer.valueOf(i));
    }

    public void m5032a(int i, beq beq) {
        if (bes.f3161c.containsKey(Integer.valueOf(i))) {
            for (bet a : (Set) bes.f3161c.get(Integer.valueOf(i))) {
                a.mo514a(beq);
            }
        }
        if (beq == null) {
            this.f3162a.remove(Integer.valueOf(i));
        } else {
            this.f3162a.put(Integer.valueOf(i), beq);
        }
    }
}
