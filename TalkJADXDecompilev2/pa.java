package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public final class pa extends LayoutParams {
    public boolean a;
    public int b;
    public float c = 0.0f;
    public boolean d;
    public int e;
    public int f;

    public pa() {
        super(-1, -1);
    }

    public pa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
        this.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
