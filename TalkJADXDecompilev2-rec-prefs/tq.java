package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class tq extends MarginLayoutParams {
    public int f35160a;

    public tq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35160a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wi.t);
        this.f35160a = obtainStyledAttributes.getInt(wi.u, 0);
        obtainStyledAttributes.recycle();
    }

    public tq(int i, int i2) {
        super(i, i2);
        this.f35160a = 0;
        this.f35160a = 8388627;
    }

    public tq(tq tqVar) {
        super(tqVar);
        this.f35160a = 0;
        this.f35160a = tqVar.f35160a;
    }

    public tq(LayoutParams layoutParams) {
        super(layoutParams);
        this.f35160a = 0;
    }
}
