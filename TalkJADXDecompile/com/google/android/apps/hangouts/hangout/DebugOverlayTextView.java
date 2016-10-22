package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.TextView;
import dhb;
import ite;
import itg;
import itl;
import lkt;

public final class DebugOverlayTextView extends TextView {
    public final StringBuilder a;
    public itl b;
    public ite c;
    public lkt d;
    public lkt e;
    public final SparseArray<lkt> f;
    private boolean g;
    private final itg h;

    public DebugOverlayTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new StringBuilder();
        this.f = new SparseArray();
        this.h = new dhb(this);
        setMovementMethod(new ScrollingMovementMethod());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g = true;
        if (this.c != null) {
            this.c.a(this.h);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g = false;
        if (this.c != null) {
            this.c.b(this.h);
        }
    }

    public void a(ite ite) {
        if (this.g && this.c != null) {
            this.c.b(this.h);
        }
        this.c = ite;
        if (this.g && ite != null) {
            ite.a(this.h);
        }
    }
}
