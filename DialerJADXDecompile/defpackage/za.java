package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: PG */
/* renamed from: za */
public final class za extends MarginLayoutParams {
    public zk a;
    public final Rect b;
    public boolean c;
    boolean d;

    public za(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public za(int i, int i2) {
        super(-2, -2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public za(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public za(LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public za(za zaVar) {
        super(zaVar);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
