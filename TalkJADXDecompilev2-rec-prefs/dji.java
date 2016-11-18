package p000;

import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

final class dji extends Animation {
    final /* synthetic */ LayoutParams f9944a;
    final /* synthetic */ int f9945b;
    final /* synthetic */ int f9946c;
    final /* synthetic */ LinearLayout f9947d;
    final /* synthetic */ boolean f9948e;
    final /* synthetic */ djd f9949f;

    dji(djd djd, LayoutParams layoutParams, int i, int i2, LinearLayout linearLayout, boolean z) {
        this.f9949f = djd;
        this.f9944a = layoutParams;
        this.f9945b = i;
        this.f9946c = i2;
        this.f9947d = linearLayout;
        this.f9948e = z;
    }

    protected void applyTransformation(float f, Transformation transformation) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9944a;
        layoutParams.bottomMargin = this.f9945b + ((int) (((float) this.f9946c) * f));
        this.f9947d.setLayoutParams(layoutParams);
        if (this.f9948e) {
            this.f9947d.setAlpha(f);
        } else {
            this.f9947d.setAlpha(1.0f - f);
        }
        if (f == 1.0f) {
            this.f9949f.m12044c();
        }
    }
}
