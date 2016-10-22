import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout.LayoutParams;

public final class h extends LayoutParams {
    int a;
    Interpolator b;

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a);
        this.a = obtainStyledAttributes.getInt(a.b, 0);
        if (obtainStyledAttributes.hasValue(a.c)) {
            this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(a.c, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public h(int i, int i2) {
        super(-1, -2);
        this.a = 1;
    }

    public h(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public h(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public h(LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}
