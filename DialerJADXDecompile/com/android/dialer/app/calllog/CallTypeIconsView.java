package com.android.dialer.app.calllog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import anf;
import java.util.ArrayList;
import java.util.List;
import rl;
import rq;

/* compiled from: PG */
public class CallTypeIconsView extends View {
    private static anf b;
    public boolean a;
    private List c;
    private int d;
    private int e;

    public CallTypeIconsView(Context context) {
        this(context, null);
    }

    public CallTypeIconsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new ArrayList(3);
        this.a = false;
        if (b == null) {
            b = new anf(context);
        }
    }

    public final void a() {
        this.c.clear();
        this.d = 0;
        this.e = 0;
        invalidate();
    }

    public final void a(int i) {
        this.c.add(Integer.valueOf(i));
        Drawable b = b(i);
        this.d += b.getIntrinsicWidth() + b.g;
        this.e = Math.max(this.e, b.getIntrinsicHeight());
        invalidate();
    }

    public final void a(boolean z) {
        this.a = z;
        if (z) {
            this.d += b.f.getIntrinsicWidth();
            this.e = Math.max(this.e, b.f.getIntrinsicHeight());
            invalidate();
        }
    }

    private static Drawable b(int i) {
        switch (i) {
            case rq.b /*1*/:
                return b.a;
            case rq.c /*2*/:
                return b.b;
            case rl.e /*3*/:
                return b.c;
            case rl.f /*4*/:
                return b.d;
            case rl.i /*6*/:
                return b.e;
            default:
                return b.c;
        }
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(this.d, this.e);
    }

    protected void onDraw(Canvas canvas) {
        int i = 0;
        for (Integer intValue : this.c) {
            Drawable b = b(intValue.intValue());
            int intrinsicWidth = b.getIntrinsicWidth() + i;
            b.setBounds(i, 0, intrinsicWidth, b.getIntrinsicHeight());
            b.draw(canvas);
            i = b.g + intrinsicWidth;
        }
        if (this.a) {
            b = b.f;
            b.setBounds(i, 0, b.f.getIntrinsicWidth() + i, b.f.getIntrinsicHeight());
            b.draw(canvas);
        }
    }
}
