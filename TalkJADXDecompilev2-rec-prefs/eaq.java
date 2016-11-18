package p000;

import android.content.Context;

final class eaq extends ebz {
    eaq(Context context, int i, eap eap) {
        int i2 = 1;
        super(context, i, eap);
        ear ear = (ear) eap.f11060b.get(0);
        ebq ebq = (ebq) ear.f11068h.get(0);
        this.i = gwb.m2294m(context, i);
        this.i.putExtra("is_chat_notification", true);
        if (ear.f11069i == 1) {
            m13308b(ear.f11061a);
            m13312c(ear.f11061a);
            this.g = ebq.s;
            if (ear.f11063c) {
                this.h = context.getResources().getQuantityString(gwb.ie, ear.f11064d, new Object[]{Integer.valueOf(ear.f11064d)});
                return;
            }
            this.h = context.getString(bc.je);
            return;
        }
        this.g = context.getString(bc.jd, new Object[]{Integer.valueOf(ear.f11069i)});
        if (ear.f11068h.size() == 2) {
            ebq ebq2 = (ebq) ear.f11068h.get(1);
            this.h = context.getString(bc.jf, new Object[]{ebq.s, ebq2.s});
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(ebq.r);
        while (i2 < ear.f11068h.size()) {
            stringBuilder.append(", ");
            stringBuilder.append(((ecj) ear.f11068h.get(i2)).f11114r);
            i2++;
        }
        this.h = stringBuilder.toString();
    }

    protected void mo1807a(boolean z) {
        this.w.m16429a(this.g).m16436b(this.h);
        ear ear = (ear) this.n.f11060b.get(0);
        if (ear.f11069i == 1) {
            this.v = new fw(this.w).m16352b(this.h);
            this.w.m16440c(this.g);
        } else {
            this.w.m16440c(m13348m());
            gl gaVar = new ga(this.w);
            for (int i = 0; i < ear.f11068h.size(); i++) {
                CharSequence quantityString;
                ebq ebq = (ebq) ear.f11068h.get(i);
                if (ebq.f11119c) {
                    int a = ebq.m13475a(this.s);
                    quantityString = this.r.getResources().getQuantityString(gwb.ie, a, new Object[]{Integer.valueOf(a)});
                } else {
                    quantityString = this.r.getString(bc.hq);
                }
                gaVar.m16798b(m13335a(ebq.s, quantityString, null, 0));
            }
            this.v = gaVar;
        }
        this.w.m16419a(ear.f11067g / 1000);
        super.mo1807a(z);
    }

    protected String mo1819d() {
        return ecm.m13298a(this.r, this.s, this.t.m17807a());
    }

    protected void mo1809c() {
        int i;
        super.mo1809c();
        ear ear = (ear) this.n.f11060b.get(0);
        bko e = fde.m15018e(this.s);
        if (ear.f11068h.size() == 1) {
            i = 2234;
        } else {
            i = 2235;
        }
        gwb.m1823a(e, i);
    }

    protected void mo1820e() {
        int i;
        super.mo1820e();
        ear ear = (ear) this.n.f11060b.get(0);
        bko e = fde.m15018e(this.s);
        if (ear.f11068h.size() == 1) {
            i = 2236;
        } else {
            i = 2237;
        }
        gwb.m1823a(e, i);
    }
}
