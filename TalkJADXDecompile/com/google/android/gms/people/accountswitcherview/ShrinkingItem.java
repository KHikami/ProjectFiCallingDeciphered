package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ShrinkingItem extends FrameLayout {
    private float a;

    public ShrinkingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1.0f;
    }

    public ShrinkingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 1.0f;
    }

    public void a(float f) {
        this.a = f;
        requestLayout();
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        if (this.a != 1.0f) {
            measuredHeight = Math.round(((float) measuredHeight) * this.a);
        }
        setMeasuredDimension(MeasureSpec.getSize(i), measuredHeight);
    }
}
