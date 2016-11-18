package p000;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class dot extends ijj {
    final /* synthetic */ dor f10261a;
    private boolean f10262b;

    dot(dor dor) {
        this.f10261a = dor;
    }

    private void m12387a(lym lym) {
        if (m12390c(lym)) {
            this.f10261a.f10256b.mo1630a(gwb.m1593a(this.f10261a.f10255a, lym));
        }
    }

    private void m12389b(lym lym) {
        if (m12390c(lym)) {
            this.f10261a.f10256b.mo1630a(gwb.m1984b(this.f10261a.f10255a, lym));
        }
    }

    private void m12388a(lym lym, lym lym2) {
        int i = 0;
        if (m12390c(lym2) && !gwb.m2061b(lym.f26922q)) {
            this.f10261a.f10256b.mo1630a(gwb.m1593a(this.f10261a.f10255a, lym2));
        }
        Set hashSet = new HashSet();
        for (lyn lyn : lym2.f26913h) {
            hashSet.add(lyn.f26931a);
        }
        lyn[] lynArr = lym.f26913h;
        int length = lynArr.length;
        while (i < length) {
            hashSet.remove(lynArr[i].f26931a);
            i++;
        }
        Map s = dgg.m11692a().m11715g().mo3228s();
        for (itl itl : s.values()) {
            if (hashSet.contains(itl.m23244g())) {
                this.f10261a.f10256b.mo1630a(gwb.m1592a(this.f10261a.f10255a, itl, (itl) s.get(lym2.f26907b)));
            }
        }
    }

    public void mo1425a() {
        this.f10262b = true;
    }

    private boolean m12390c(lym lym) {
        if (!this.f10262b) {
            return false;
        }
        ite g = dgg.m11692a().m11715g();
        if (g == null) {
            return false;
        }
        return !lym.f26907b.equals(((ijd) g.mo3229t().m21926a(ijd.class)).mo3376a().f26907b) && gwb.m2061b(lym.f26922q);
    }
}
