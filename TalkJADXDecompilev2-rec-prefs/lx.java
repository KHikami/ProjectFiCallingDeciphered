package p000;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public final class lx extends AccessibilityDelegate {
    final /* synthetic */ ly f26741a;

    public lx(ly lyVar) {
        this.f26741a = lyVar;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f26741a.m31090a(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f26741a.m31092b(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f26741a.m31089a(view, (Object) accessibilityNodeInfo);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f26741a.m31093c(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f26741a.m31091a(viewGroup, view, accessibilityEvent);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.f26741a.m31088a(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f26741a.m31094d(view, accessibilityEvent);
    }
}
