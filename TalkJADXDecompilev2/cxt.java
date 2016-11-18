package defpackage;

import android.content.Context;
import android.view.View.OnClickListener;

public class cxt {
    final /* synthetic */ cxv a;

    public void a(int i) {
        cxv cxv;
        if (i == cxv.a) {
            int i2;
            gwb.a(this.a.l(), 2497);
            this.a.i.setBackgroundResource(ba.kB);
            this.a.m.setVisibility(4);
            if (this.a.o instanceof eet) {
                i2 = cxv.b;
            } else if (this.a.o instanceof eev) {
                i2 = cxv.c;
            } else {
                String valueOf = String.valueOf(this.a.o);
                throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 32).append("Unexpected primary action type: ").append(valueOf).toString());
            }
            this.a.m.setVisibility(0);
            this.a.g.a(i2, cxv.b(i2), cxu.a);
            this.a.l.show();
            cxv = this.a;
            if (cxv.j()) {
                cxv.a(0, 255);
                cxv.a(new cyi());
            }
        } else if (i == cxv.b || i == cxv.c) {
            cxv = this.a;
            Context context = this.a.m.getContext();
            cxl cxl = this.a.o;
            if (cxv.n == null) {
                cxv.n = cxl;
                cxl.a(context);
            }
        } else if (i == cxv.d) {
            gwb.a(this.a.l(), 2498);
            for (OnClickListener onClick : this.a.z) {
                onClick.onClick(this.a.g);
            }
        } else if (i == cxv.e && this.a.A != null) {
            gwb.a(this.a.l(), 2499);
            this.a.A.onClick(this.a.g);
        }
    }

    cxt(cxv cxv) {
        this.a = cxv;
    }
}
