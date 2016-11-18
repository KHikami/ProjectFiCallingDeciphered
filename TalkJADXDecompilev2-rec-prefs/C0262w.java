package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout.LayoutParams;

public final class C0262w extends LayoutParams {
    int f35420a = 1;
    Interpolator f35421b;

    public C0262w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0223o.f31445j);
        this.f35420a = obtainStyledAttributes.getInt(C0223o.f31446k, 0);
        if (obtainStyledAttributes.hasValue(C0223o.f31447l)) {
            this.f35421b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C0223o.f31447l, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public C0262w(int i, int i2) {
        super(-1, -2);
    }

    public C0262w(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C0262w(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public C0262w(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public int m41102a() {
        return this.f35420a;
    }

    public Interpolator m41103b() {
        return this.f35421b;
    }
}
