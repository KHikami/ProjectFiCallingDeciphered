package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class aft extends tq {
    public int f555b;

    public aft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f555b = 0;
    }

    public aft(int i, int i2) {
        super(-2, -2);
        this.f555b = 0;
        this.a = 8388627;
    }

    public aft(aft aft) {
        super(aft);
        this.f555b = 0;
        this.f555b = aft.f555b;
    }

    public aft(tq tqVar) {
        super(tqVar);
        this.f555b = 0;
    }

    public aft(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f555b = 0;
        m953a(marginLayoutParams);
    }

    public aft(LayoutParams layoutParams) {
        super(layoutParams);
        this.f555b = 0;
    }

    private void m953a(MarginLayoutParams marginLayoutParams) {
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }
}
