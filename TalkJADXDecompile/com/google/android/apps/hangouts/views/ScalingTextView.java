package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class ScalingTextView extends TextView {
    private float a;

    public ScalingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScalingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 1.0f;
    }

    public void a(float f) {
        this.a = f;
        requestLayout();
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension((int) (((float) getMeasuredWidth()) * this.a), (int) (((float) getMeasuredHeight()) * this.a));
    }
}
