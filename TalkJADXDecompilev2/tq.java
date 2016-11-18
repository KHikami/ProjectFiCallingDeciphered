package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class tq extends MarginLayoutParams {
    public int a;

    public tq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wi.t);
        this.a = obtainStyledAttributes.getInt(wi.u, 0);
        obtainStyledAttributes.recycle();
    }

    public tq(int i, int i2) {
        super(i, i2);
        this.a = 0;
        this.a = 8388627;
    }

    public tq(tq tqVar) {
        super(tqVar);
        this.a = 0;
        this.a = tqVar.a;
    }

    public tq(LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
