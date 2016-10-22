import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class gke extends Animation {
    int a;
    int b;
    View c;

    public gke(View view, int i) {
        this.c = view;
        this.a = view.getLayoutParams().height;
        this.b = i - this.a;
        setDuration(new ValueAnimator().getDuration());
    }

    protected void applyTransformation(float f, Transformation transformation) {
        this.c.getLayoutParams().height = (int) (((float) this.a) + (((float) this.b) * f));
        this.c.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
