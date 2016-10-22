package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import gqe;
import gqf;

public class MultiLineLayout extends ViewGroup {
    private final gqe a;
    private final gqf b;

    public MultiLineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new gqe(this);
        this.b = new gqf(this);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.a(i3 - i);
    }

    protected void onMeasure(int i, int i2) {
        this.b.a(i, i2);
        this.b.a(resolveSize(Integer.MAX_VALUE, i));
    }
}
