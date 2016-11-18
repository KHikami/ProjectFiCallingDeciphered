package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class sh extends MarginLayoutParams {
    public int a = 0;
    public float b;
    public boolean c;
    public int d;

    public sh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.a);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public sh(int i, int i2) {
        super(-1, -1);
    }

    public sh(sh shVar) {
        super(shVar);
        this.a = shVar.a;
    }

    public sh(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public sh(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
