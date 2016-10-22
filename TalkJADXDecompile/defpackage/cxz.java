package defpackage;

import android.os.Build.VERSION;
import ph;

/* renamed from: cxz */
final class cxz extends ph {
    final /* synthetic */ cxv a;

    cxz(cxv cxv) {
        this.a = cxv;
    }

    public void a(int i, float f, int i2) {
        if (this.a.g != null) {
            int i3 = this.a.j;
            if (i2 == 0) {
                this.a.a(i);
            }
            if (i == 0) {
                int i4 = (int) (((float) this.a.j) + (((float) (this.a.k - this.a.j)) * f));
                this.a.g.a(cxv.a, cxv.b(cxv.a), cxv.d, cxv.b(cxv.d), f);
                i3 = i4;
            } else if (i == 1) {
                i3 = this.a.k;
            }
            if (VERSION.SDK_INT >= 17) {
                this.a.b((float) i3);
            } else {
                this.a.a((float) i3);
            }
        }
    }

    public void a(int i) {
        if (this.a.g != null) {
            switch (i) {
                case wi.w /*0*/:
                    this.a.g.a(cxv.a, cxv.b(cxv.a));
                    if (gld.a(this.a.f)) {
                        this.a.h.setVisibility(4);
                        break;
                    }
                    break;
                case wi.j /*1*/:
                    int i2 = this.a.i();
                    this.a.g.a(i2, cxv.b(i2));
                    this.a.h.setVisibility(0);
                    break;
                default:
                    iil.a("Unknown page: " + i);
                    break;
            }
            super.a(i);
        }
    }
}
