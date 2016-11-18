package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public final class pa extends LayoutParams {
    public boolean f34754a;
    public int f34755b;
    public float f34756c = 0.0f;
    public boolean f34757d;
    public int f34758e;
    public int f34759f;

    public pa() {
        super(-1, -1);
    }

    public pa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
        this.f34755b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
