package com.android.contacts.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
public class LayoutSuppressingImageView extends ImageView {
    public LayoutSuppressingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void requestLayout() {
        forceLayout();
    }
}
