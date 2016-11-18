package p000;

import android.animation.ValueAnimator;
import android.view.View;

final class csb {
    final View f8973a;
    final csd f8974b;
    private final int f8975c;
    private ValueAnimator f8976d;
    private int f8977e = 0;

    csb(View view, int i, csd csd) {
        this.f8973a = view;
        this.f8975c = i;
        this.f8974b = csd;
    }

    View m10851a() {
        return this.f8973a;
    }

    int m10854b() {
        return this.f8977e;
    }

    void m10852a(int i) {
        if (this.f8976d != null) {
            this.f8976d.cancel();
        }
        if (i != this.f8977e) {
            this.f8977e = i;
            this.f8974b.mo1397a(this.f8973a, i);
            this.f8973a.requestLayout();
        }
    }

    void m10853a(int i, int i2, int i3) {
        if (i != this.f8977e) {
            if (this.f8976d != null) {
                this.f8976d.cancel();
            }
            this.f8977e = i;
            int a = this.f8974b.mo1396a(this.f8973a);
            this.f8976d = ValueAnimator.ofInt(new int[]{a, this.f8977e});
            this.f8976d.addUpdateListener(new csc(this));
            this.f8976d.setDuration((long) ((Math.abs(a - i) * this.f8975c) / (i3 - i2)));
            if (i < a) {
                this.f8976d.setInterpolator(gwb.ax());
            } else {
                this.f8976d.setInterpolator(gwb.aw());
            }
            this.f8976d.start();
        }
    }
}
