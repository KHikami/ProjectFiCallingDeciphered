package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: beu */
final class beu {
    final Map<Integer, beq> a;

    beu() {
        this.a = new ky();
    }

    public boolean a(int i) {
        return this.a.containsKey(Integer.valueOf(i));
    }

    public beq b(int i) {
        return (beq) this.a.get(Integer.valueOf(i));
    }

    public void a(int i, beq beq) {
        if (bes.c.containsKey(Integer.valueOf(i))) {
            for (bet a : (Set) bes.c.get(Integer.valueOf(i))) {
                a.a(beq);
            }
        }
        if (beq == null) {
            this.a.remove(Integer.valueOf(i));
        } else {
            this.a.put(Integer.valueOf(i), beq);
        }
    }
}
