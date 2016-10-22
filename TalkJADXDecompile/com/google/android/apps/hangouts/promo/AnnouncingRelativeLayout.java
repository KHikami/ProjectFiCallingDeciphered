package com.google.android.apps.hangouts.promo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.RelativeLayout;

public class AnnouncingRelativeLayout extends RelativeLayout {
    private String a;

    public AnnouncingRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32 && this.a != null) {
            accessibilityEvent.getText().add(this.a);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void a(String str) {
        this.a = str;
    }
}
