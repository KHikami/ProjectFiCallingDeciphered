import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: PG */
public class pm extends MarginLayoutParams {
    public int a;

    public pm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk.b);
        this.a = obtainStyledAttributes.getInt(rk.c, 0);
        obtainStyledAttributes.recycle();
    }

    public pm(int i, int i2) {
        super(i, i2);
        this.a = 0;
        this.a = 8388627;
    }

    public pm(pm pmVar) {
        super(pmVar);
        this.a = 0;
        this.a = pmVar.a;
    }

    public pm(LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
