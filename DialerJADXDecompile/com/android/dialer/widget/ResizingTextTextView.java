package com.android.dialer.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import axl;
import axq;

/* compiled from: PG */
public class ResizingTextTextView extends TextView {
    private final int a;
    private final int b;

    public ResizingTextTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = (int) getTextSize();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, axq.a);
        this.b = (int) obtainStyledAttributes.getDimension(axq.b, (float) this.a);
        obtainStyledAttributes.recycle();
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        axl.a(this, this.a, this.b);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        axl.a(this, this.a, this.b);
    }
}
