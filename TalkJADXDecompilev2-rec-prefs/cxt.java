package p000;

import android.content.Context;
import android.view.View.OnClickListener;

public class cxt {
    final /* synthetic */ cxv f9270a;

    public void m11225a(int i) {
        cxv cxv;
        if (i == cxv.f9274a) {
            int i2;
            gwb.m1823a(this.f9270a.m11252l(), 2497);
            this.f9270a.f9298i.setBackgroundResource(ba.kB);
            this.f9270a.f9302m.setVisibility(4);
            if (this.f9270a.f9304o instanceof eet) {
                i2 = cxv.f9275b;
            } else if (this.f9270a.f9304o instanceof eev) {
                i2 = cxv.f9276c;
            } else {
                String valueOf = String.valueOf(this.f9270a.f9304o);
                throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 32).append("Unexpected primary action type: ").append(valueOf).toString());
            }
            this.f9270a.f9302m.setVisibility(0);
            this.f9270a.f9296g.m8431a(i2, cxv.m11227b(i2), cxu.f9271a);
            this.f9270a.f9301l.show();
            cxv = this.f9270a;
            if (cxv.m11228j()) {
                cxv.m11233a(0, 255);
                cxv.m11236a(new cyi());
            }
        } else if (i == cxv.f9275b || i == cxv.f9276c) {
            cxv = this.f9270a;
            Context context = this.f9270a.f9302m.getContext();
            cxl cxl = this.f9270a.f9304o;
            if (cxv.f9303n == null) {
                cxv.f9303n = cxl;
                cxl.mo1880a(context);
            }
        } else if (i == cxv.f9277d) {
            gwb.m1823a(this.f9270a.m11252l(), 2498);
            for (OnClickListener onClick : this.f9270a.f9315z) {
                onClick.onClick(this.f9270a.f9296g);
            }
        } else if (i == cxv.f9278e && this.f9270a.f9279A != null) {
            gwb.m1823a(this.f9270a.m11252l(), 2499);
            this.f9270a.f9279A.onClick(this.f9270a.f9296g);
        }
    }

    cxt(cxv cxv) {
        this.f9270a = cxv;
    }
}
