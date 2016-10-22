package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: PG */
/* renamed from: p */
public final class p extends MarginLayoutParams {
    public buf a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public View g;
    public View h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final Rect l;

    public p(int i, int i2) {
        super(-2, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
    }

    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f);
        this.c = obtainStyledAttributes.getInteger(a.g, 0);
        this.f = obtainStyledAttributes.getResourceId(a.h, -1);
        this.d = obtainStyledAttributes.getInteger(a.i, 0);
        this.e = obtainStyledAttributes.getInteger(a.k, -1);
        this.b = obtainStyledAttributes.hasValue(a.j);
        if (this.b) {
            this.a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(a.j));
        }
        obtainStyledAttributes.recycle();
    }

    public p(p pVar) {
        super(pVar);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
    }

    public p(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
    }

    public p(LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
    }

    public final void a(buf buf) {
        if (this.a != buf) {
            this.a = buf;
            this.b = true;
        }
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 == this.h || (this.a != null && this.a.c(coordinatorLayout, view, view2));
    }
}
