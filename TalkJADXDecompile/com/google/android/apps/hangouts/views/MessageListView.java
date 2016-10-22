package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListView;
import gpz;

public class MessageListView extends ListView {
    gpz a;

    public MessageListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new gpz(this);
    }

    public void a(int i, int i2) {
        if (i >= this.a.a) {
            this.a.a = i;
            this.a.b = i2;
            this.a.c = true;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a.c) {
            if (getLastVisiblePosition() > getCount() - 3) {
                setSelectionFromTop(this.a.a, this.a.b);
            }
            this.a.c = false;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, int i, AccessibilityNodeInfo accessibilityNodeInfo) {
        if (i != -1 && i < getCount()) {
            super.onInitializeAccessibilityNodeInfoForItem(view, i, accessibilityNodeInfo);
        }
    }
}
