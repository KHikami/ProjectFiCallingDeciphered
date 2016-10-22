package com.android.contacts.common.widget;

import abp;
import ajx;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

/* compiled from: PG */
public class ProportionalLayout extends ViewGroup {
    private ajx a;
    private float b;

    public ProportionalLayout(Context context) {
        super(context);
    }

    public ProportionalLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ProportionalLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        ajx ajx;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, abp.z);
        String string = obtainStyledAttributes.getString(abp.A);
        if (ajx.widthToHeight.c.equals(string)) {
            ajx = ajx.widthToHeight;
        } else if (ajx.heightToWidth.c.equals(string)) {
            ajx = ajx.heightToWidth;
        } else {
            String str = ajx.widthToHeight.c;
            String str2 = ajx.heightToWidth.c;
            throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(str2).length()).append("direction must be either ").append(str).append(" or ").append(str2).toString());
        }
        this.a = ajx;
        this.b = obtainStyledAttributes.getFloat(abp.B, 1.0f);
        obtainStyledAttributes.recycle();
    }

    protected void onMeasure(int i, int i2) {
        if (getChildCount() != 1) {
            throw new IllegalStateException("ProportionalLayout requires exactly one child");
        }
        View childAt = getChildAt(0);
        measureChild(childAt, i, i2);
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        if (this.a == ajx.heightToWidth) {
            measuredWidth = Math.round(((float) measuredHeight) * this.b);
        } else {
            measuredHeight = Math.round(((float) measuredWidth) * this.b);
        }
        measureChild(childAt, MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        setMeasuredDimension(resolveSize(measuredWidth, i), resolveSize(measuredHeight, i2));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() != 1) {
            throw new IllegalStateException("ProportionalLayout requires exactly one child");
        }
        getChildAt(0).layout(0, 0, i3 - i, i4 - i2);
    }
}
