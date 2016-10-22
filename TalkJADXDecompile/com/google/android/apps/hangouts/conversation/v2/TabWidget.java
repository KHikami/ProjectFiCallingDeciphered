package com.google.android.apps.hangouts.conversation.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class TabWidget extends android.widget.TabWidget {
    public TabWidget(Context context) {
        super(context);
    }

    public TabWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TabWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), 0), i2);
    }

    public void onFocusChange(View view, boolean z) {
    }
}
