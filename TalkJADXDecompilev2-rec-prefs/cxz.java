package p000;

import android.os.Build.VERSION;

final class cxz extends ph {
    final /* synthetic */ cxv f9320a;

    cxz(cxv cxv) {
        this.f9320a = cxv;
    }

    public void m11254a(int i, float f, int i2) {
        if (this.f9320a.f9296g != null) {
            int i3 = this.f9320a.f9299j;
            if (i2 == 0) {
                this.f9320a.mo1458a(i);
            }
            if (i == 0) {
                int i4 = (int) (((float) this.f9320a.f9299j) + (((float) (this.f9320a.f9300k - this.f9320a.f9299j)) * f));
                this.f9320a.f9296g.m8433a(cxv.f9274a, cxv.m11227b(cxv.f9274a), cxv.f9277d, cxv.m11227b(cxv.f9277d), f);
                i3 = i4;
            } else if (i == 1) {
                i3 = this.f9320a.f9300k;
            }
            if (VERSION.SDK_INT >= 17) {
                this.f9320a.m11240b((float) i3);
            } else {
                this.f9320a.m11230a((float) i3);
            }
        }
    }

    public void m11253a(int i) {
        if (this.f9320a.f9296g != null) {
            switch (i) {
                case 0:
                    this.f9320a.f9296g.m8432a(cxv.f9274a, cxv.m11227b(cxv.f9274a));
                    if (gld.m17937a(this.f9320a.f9295f)) {
                        this.f9320a.f9297h.setVisibility(4);
                        break;
                    }
                    break;
                case 1:
                    int i2 = this.f9320a.m11250i();
                    this.f9320a.f9296g.m8432a(i2, cxv.m11227b(i2));
                    this.f9320a.f9297h.setVisibility(0);
                    break;
                default:
                    iil.m21870a("Unknown page: " + i);
                    break;
            }
            super.a(i);
        }
    }
}
