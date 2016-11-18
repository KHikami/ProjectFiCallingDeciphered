package p000;

import android.content.Context;

final class dtb extends erm implements glc {
    final /* synthetic */ dta f10492a;

    public dtb(dta dta, Context context, kbu kbu, int i) {
        this.f10492a = dta;
        super(context, kbu, i, etx.LAST_SEEN.f12271l);
    }

    protected void mo983c() {
        dta dta = this.f10492a;
        if (dta.f10487b != 0) {
            dta.f10487b = 0;
            dta.m12640a();
        }
    }

    protected void mo1664a(boolean z) {
        if (z) {
            dta.f10486a.m17917a(this);
        } else {
            dta.f10486a.m17918b(this);
        }
    }

    public void mo982a(etu etu) {
        dta dta = this.f10492a;
        long a = etu.m14511a(0);
        if (dta.f10487b != a) {
            dta.f10487b = a;
            dta.m12640a();
        }
    }

    public void mo1665d() {
        this.f10492a.m12640a();
    }
}
