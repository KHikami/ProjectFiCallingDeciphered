package defpackage;

import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* renamed from: dji */
final class dji extends Animation {
    final /* synthetic */ LayoutParams a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ LinearLayout d;
    final /* synthetic */ boolean e;
    final /* synthetic */ djd f;

    dji(djd djd, LayoutParams layoutParams, int i, int i2, LinearLayout linearLayout, boolean z) {
        this.f = djd;
        this.a = layoutParams;
        this.b = i;
        this.c = i2;
        this.d = linearLayout;
        this.e = z;
    }

    protected void applyTransformation(float f, Transformation transformation) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a;
        layoutParams.bottomMargin = this.b + ((int) (((float) this.c) * f));
        this.d.setLayoutParams(layoutParams);
        if (this.e) {
            this.d.setAlpha(f);
        } else {
            this.d.setAlpha(1.0f - f);
        }
        if (f == 1.0f) {
            this.f.c();
        }
    }
}
