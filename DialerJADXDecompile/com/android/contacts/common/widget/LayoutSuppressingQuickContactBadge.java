package com.android.contacts.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.QuickContactBadge;

/* compiled from: PG */
public class LayoutSuppressingQuickContactBadge extends QuickContactBadge {
    public LayoutSuppressingQuickContactBadge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void requestLayout() {
        forceLayout();
    }
}
