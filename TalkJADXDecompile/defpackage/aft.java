package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import tq;

/* renamed from: aft */
public final class aft extends tq {
    public int b;

    public aft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public aft(int i, int i2) {
        super(-2, -2);
        this.b = 0;
        this.a = 8388627;
    }

    public aft(aft aft) {
        super(aft);
        this.b = 0;
        this.b = aft.b;
    }

    public aft(tq tqVar) {
        super(tqVar);
        this.b = 0;
    }

    public aft(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = 0;
        a(marginLayoutParams);
    }

    public aft(LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }

    private void a(MarginLayoutParams marginLayoutParams) {
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }
}
