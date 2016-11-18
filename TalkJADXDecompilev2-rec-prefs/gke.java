package p000;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class gke extends Animation {
    int f15483a;
    int f15484b;
    View f15485c;

    public gke(View view, int i) {
        this.f15485c = view;
        this.f15483a = view.getLayoutParams().height;
        this.f15484b = i - this.f15483a;
        setDuration(new ValueAnimator().getDuration());
    }

    protected void applyTransformation(float f, Transformation transformation) {
        this.f15485c.getLayoutParams().height = (int) (((float) this.f15483a) + (((float) this.f15484b) * f));
        this.f15485c.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
