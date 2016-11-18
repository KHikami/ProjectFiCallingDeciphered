package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout.LayoutParams;

public final class w extends LayoutParams {
    int a = 1;
    Interpolator b;

    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.j);
        this.a = obtainStyledAttributes.getInt(o.k, 0);
        if (obtainStyledAttributes.hasValue(o.l)) {
            this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(o.l, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public w(int i, int i2) {
        super(-1, -2);
    }

    public w(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public w(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public w(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public int a() {
        return this.a;
    }

    public Interpolator b() {
        return this.b;
    }
}
