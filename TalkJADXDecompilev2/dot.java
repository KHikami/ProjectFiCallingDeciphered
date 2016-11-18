package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class dot extends ijj {
    final /* synthetic */ dor a;
    private boolean b;

    dot(dor dor) {
        this.a = dor;
    }

    private void a(lym lym) {
        if (c(lym)) {
            this.a.b.a(gwb.a(this.a.a, lym));
        }
    }

    private void b(lym lym) {
        if (c(lym)) {
            this.a.b.a(gwb.b(this.a.a, lym));
        }
    }

    private void a(lym lym, lym lym2) {
        int i = 0;
        if (c(lym2) && !gwb.b(lym.q)) {
            this.a.b.a(gwb.a(this.a.a, lym2));
        }
        Set hashSet = new HashSet();
        for (lyn lyn : lym2.h) {
            hashSet.add(lyn.a);
        }
        lyn[] lynArr = lym.h;
        int length = lynArr.length;
        while (i < length) {
            hashSet.remove(lynArr[i].a);
            i++;
        }
        Map s = dgg.a().g().s();
        for (itl itl : s.values()) {
            if (hashSet.contains(itl.g())) {
                this.a.b.a(gwb.a(this.a.a, itl, (itl) s.get(lym2.b)));
            }
        }
    }

    public void a() {
        this.b = true;
    }

    private boolean c(lym lym) {
        if (!this.b) {
            return false;
        }
        ite g = dgg.a().g();
        if (g == null) {
            return false;
        }
        return !lym.b.equals(((ijd) g.t().a(ijd.class)).a().b) && gwb.b(lym.q);
    }
}
