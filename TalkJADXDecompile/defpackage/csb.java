package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: csb */
final class csb {
    final View a;
    final csd b;
    private final int c;
    private ValueAnimator d;
    private int e;

    csb(View view, int i, csd csd) {
        this.e = 0;
        this.a = view;
        this.c = i;
        this.b = csd;
    }

    View a() {
        return this.a;
    }

    int b() {
        return this.e;
    }

    void a(int i) {
        if (this.d != null) {
            this.d.cancel();
        }
        if (i != this.e) {
            this.e = i;
            this.b.a(this.a, i);
            this.a.requestLayout();
        }
    }

    void a(int i, int i2, int i3) {
        if (i != this.e) {
            if (this.d != null) {
                this.d.cancel();
            }
            this.e = i;
            int a = this.b.a(this.a);
            this.d = ValueAnimator.ofInt(new int[]{a, this.e});
            this.d.addUpdateListener(new csc(this));
            this.d.setDuration((long) ((Math.abs(a - i) * this.c) / (i3 - i2)));
            if (i < a) {
                this.d.setInterpolator(gwb.ax());
            } else {
                this.d.setInterpolator(gwb.aw());
            }
            this.d.start();
        }
    }
}
