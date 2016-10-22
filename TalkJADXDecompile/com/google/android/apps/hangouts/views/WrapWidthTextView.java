package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import gld;

public class WrapWidthTextView extends TextView {
    public WrapWidthTextView(Context context) {
        super(context);
    }

    public WrapWidthTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WrapWidthTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!gld.a(getText().toString().toCharArray())) {
            Layout layout = getLayout();
            if (layout != null) {
                float f = 0.0f;
                int lineCount = layout.getLineCount();
                for (int i3 = 0; i3 < lineCount; i3++) {
                    f = Math.max(f, layout.getLineWidth(i3));
                }
                setMeasuredDimension(Math.min((((int) Math.ceil((double) f)) + getCompoundPaddingLeft()) + getCompoundPaddingRight(), getMeasuredWidth()), getMeasuredHeight());
            }
        }
    }
}
