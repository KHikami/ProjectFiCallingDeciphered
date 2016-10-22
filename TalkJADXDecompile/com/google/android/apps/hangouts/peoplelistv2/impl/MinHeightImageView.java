package com.google.android.apps.hangouts.peoplelistv2.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class MinHeightImageView extends ImageView {
    public MinHeightImageView(Context context) {
        super(context);
    }

    public MinHeightImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MinHeightImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MinHeightImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = (int) (((float) i2) / getResources().getDisplayMetrics().density);
        if (getVisibility() == 8 || i5 >= 100) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }
}
