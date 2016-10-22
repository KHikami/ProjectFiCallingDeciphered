import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: PG */
public class xq extends MarginLayoutParams {
    public float g;
    public int h;

    public xq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk.at);
        this.g = obtainStyledAttributes.getFloat(rk.av, 0.0f);
        this.h = obtainStyledAttributes.getInt(rk.au, -1);
        obtainStyledAttributes.recycle();
    }

    public xq(int i, int i2) {
        super(i, i2);
        this.h = -1;
        this.g = 0.0f;
    }

    public xq(LayoutParams layoutParams) {
        super(layoutParams);
        this.h = -1;
    }
}
