package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class sh extends MarginLayoutParams {
    public int f35098a = 0;
    public float f35099b;
    public boolean f35100c;
    public int f35101d;

    public sh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.a);
        this.f35098a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public sh(int i, int i2) {
        super(-1, -1);
    }

    public sh(sh shVar) {
        super(shVar);
        this.f35098a = shVar.f35098a;
    }

    public sh(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public sh(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
