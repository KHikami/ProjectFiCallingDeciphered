package defpackage;

import android.content.Context;

/* renamed from: dtb */
final class dtb extends erm implements glc {
    final /* synthetic */ dta a;

    public dtb(dta dta, Context context, kbu kbu, int i) {
        this.a = dta;
        super(context, kbu, i, etx.LAST_SEEN.l);
    }

    protected void c() {
        dta dta = this.a;
        if (dta.b != 0) {
            dta.b = 0;
            dta.a();
        }
    }

    protected void a(boolean z) {
        if (z) {
            dta.a.a(this);
        } else {
            dta.a.b(this);
        }
    }

    public void a(etu etu) {
        dta dta = this.a;
        long a = etu.a(0);
        if (dta.b != a) {
            dta.b = a;
            dta.a();
        }
    }

    public void d() {
        this.a.a();
    }
}
