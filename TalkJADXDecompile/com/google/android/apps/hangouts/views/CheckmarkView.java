package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;

public class CheckmarkView extends CompoundButton {
    public CheckmarkView(Context context) {
        this(context, null);
    }

    public CheckmarkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckmarkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        sendAccessibilityEvent(1);
    }
}
