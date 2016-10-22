import android.content.Context;

final class eaq extends ebz {
    eaq(Context context, int i, eap eap) {
        int i2 = 1;
        super(context, i, eap);
        ear ear = (ear) eap.b.get(0);
        ebq ebq = (ebq) ear.h.get(0);
        this.i = gwb.m(context, i);
        this.i.putExtra("is_chat_notification", true);
        if (ear.i == 1) {
            b(ear.a);
            c(ear.a);
            this.g = ebq.s;
            if (ear.c) {
                this.h = context.getResources().getQuantityString(gwb.ie, ear.d, new Object[]{Integer.valueOf(ear.d)});
                return;
            }
            this.h = context.getString(bc.je);
            return;
        }
        this.g = context.getString(bc.jd, new Object[]{Integer.valueOf(ear.i)});
        if (ear.h.size() == 2) {
            ebq ebq2 = (ebq) ear.h.get(1);
            this.h = context.getString(bc.jf, new Object[]{ebq.s, ebq2.s});
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(ebq.r);
        while (i2 < ear.h.size()) {
            stringBuilder.append(", ");
            stringBuilder.append(((ecj) ear.h.get(i2)).r);
            i2++;
        }
        this.h = stringBuilder.toString();
    }

    protected void a(boolean z) {
        this.w.a(this.g).b(this.h);
        ear ear = (ear) this.n.b.get(0);
        if (ear.i == 1) {
            this.v = new fw(this.w).b(this.h);
            this.w.c(this.g);
        } else {
            this.w.c(m());
            gl gaVar = new ga(this.w);
            for (int i = 0; i < ear.h.size(); i++) {
                CharSequence quantityString;
                ebq ebq = (ebq) ear.h.get(i);
                if (ebq.c) {
                    int a = ebq.a(this.s);
                    quantityString = this.r.getResources().getQuantityString(gwb.ie, a, new Object[]{Integer.valueOf(a)});
                } else {
                    quantityString = this.r.getString(bc.hq);
                }
                gaVar.b(a(ebq.s, quantityString, null, 0));
            }
            this.v = gaVar;
        }
        this.w.a(ear.g / 1000);
        super.a(z);
    }

    protected String d() {
        return ecm.a(this.r, this.s, this.t.a());
    }

    protected void c() {
        int i;
        super.c();
        ear ear = (ear) this.n.b.get(0);
        bko e = fde.e(this.s);
        if (ear.h.size() == 1) {
            i = 2234;
        } else {
            i = 2235;
        }
        gwb.a(e, i);
    }

    protected void e() {
        int i;
        super.e();
        ear ear = (ear) this.n.b.get(0);
        bko e = fde.e(this.s);
        if (ear.h.size() == 1) {
            i = 2236;
        } else {
            i = 2237;
        }
        gwb.a(e, i);
    }
}
