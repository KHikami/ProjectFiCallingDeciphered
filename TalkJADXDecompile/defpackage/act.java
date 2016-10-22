package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: act */
public final class act extends aeg {
    int a;
    int b;

    public act(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = 0;
    }

    public act(int i, int i2) {
        super(i, i2);
        this.a = -1;
        this.b = 0;
    }

    public act(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = -1;
        this.b = 0;
    }

    public act(LayoutParams layoutParams) {
        super(layoutParams);
        this.a = -1;
        this.b = 0;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }
}
