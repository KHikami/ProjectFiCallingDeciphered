package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

final class dby extends AccessibilityDelegate {
    dby() {
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096 || accessibilityEvent.getEventType() == 2048) {
            Rect rect = new Rect();
            viewGroup.getHitRect(rect);
            if (!view.getLocalVisibleRect(rect)) {
                return false;
            }
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
