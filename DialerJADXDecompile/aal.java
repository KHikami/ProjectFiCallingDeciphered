import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: PG */
public final class aal extends pm {
    public int b;

    public aal(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public aal(int i, int i2) {
        super(-2, -2);
        this.b = 0;
        this.a = 8388627;
    }

    public aal(aal aal) {
        super((pm) aal);
        this.b = 0;
        this.b = aal.b;
    }

    public aal(pm pmVar) {
        super(pmVar);
        this.b = 0;
    }

    public aal(MarginLayoutParams marginLayoutParams) {
        super((LayoutParams) marginLayoutParams);
        this.b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public aal(LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }
}
