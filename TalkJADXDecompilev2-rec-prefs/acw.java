package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class acw extends MarginLayoutParams {
    public float f307g;
    public int f308h;

    public acw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f308h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wi.bq);
        this.f307g = obtainStyledAttributes.getFloat(wi.bs, 0.0f);
        this.f308h = obtainStyledAttributes.getInt(wi.br, -1);
        obtainStyledAttributes.recycle();
    }

    public acw(int i, int i2) {
        super(i, i2);
        this.f308h = -1;
        this.f307g = 0.0f;
    }

    public acw(LayoutParams layoutParams) {
        super(layoutParams);
        this.f308h = -1;
    }
}
