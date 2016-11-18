package p000;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

final class cfd implements OnLayoutChangeListener {
    final /* synthetic */ cdr f5163a;

    cfd(cdr cdr) {
        this.f5163a = cdr;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        if (i2 <= 0) {
            glk.m17979c("Babel_Conv", "Unexpected compose area view layout. onLayoutChange(v, " + i + ", " + i2 + ", " + i3 + ", " + i4 + ", " + i5 + ", " + i6 + ", " + i7 + ", " + i8 + ")", new Object[0]);
        }
        if (this.f5163a.aU == -1 && i2 > 0) {
            this.f5163a.aU = i2;
        }
        if (this.f5163a.aU > 0) {
            if (this.f5163a.getResources().getDimensionPixelSize(gwb.lg) == 0) {
                i9 = 1;
            }
            if (i9 != 0) {
                this.f5163a.aW.mo812a(this.f5163a.aU);
            }
        }
    }
}
