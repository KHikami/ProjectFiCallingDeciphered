package defpackage;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: aqc */
public final class aqc extends AccessibilityDelegate {
    private View a;

    private aqc(View view) {
        this.a = view;
    }

    public static void a(View view) {
        ((View) view.getParent()).setAccessibilityDelegate(new aqc(view));
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (view == this.a && accessibilityEvent.getEventType() == 2048) {
            return false;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
