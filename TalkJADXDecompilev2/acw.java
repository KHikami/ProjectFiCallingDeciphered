package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class acw extends MarginLayoutParams {
    public float g;
    public int h;

    public acw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wi.bq);
        this.g = obtainStyledAttributes.getFloat(wi.bs, 0.0f);
        this.h = obtainStyledAttributes.getInt(wi.br, -1);
        obtainStyledAttributes.recycle();
    }

    public acw(int i, int i2) {
        super(i, i2);
        this.h = -1;
        this.g = 0.0f;
    }

    public acw(LayoutParams layoutParams) {
        super(layoutParams);
        this.h = -1;
    }
}
