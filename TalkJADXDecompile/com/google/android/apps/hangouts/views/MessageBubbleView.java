package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class MessageBubbleView extends LinearLayout {
    private int a;
    private int b;

    public MessageBubbleView(Context context) {
        this(context, null);
    }

    public MessageBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = getMeasuredWidth();
        if (this.a > 0) {
            setMeasuredDimension(this.a, getMeasuredHeight());
        } else {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
