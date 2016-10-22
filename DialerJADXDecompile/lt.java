import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
class lt {
    public boolean a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        if (view == null) {
            return false;
        }
        ((AccessibilityManager) view.getContext().getSystemService("accessibility")).sendAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public boolean a(ViewParent viewParent, View view, View view2, int i) {
        if (viewParent instanceof kd) {
            return ((kd) viewParent).onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public void b(ViewParent viewParent, View view, View view2, int i) {
        if (viewParent instanceof kd) {
            ((kd) viewParent).onNestedScrollAccepted(view, view2, i);
        }
    }

    public void a(ViewParent viewParent, View view) {
        if (viewParent instanceof kd) {
            ((kd) viewParent).onStopNestedScroll(view);
        }
    }

    public void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        if (viewParent instanceof kd) {
            ((kd) viewParent).onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        if (viewParent instanceof kd) {
            ((kd) viewParent).onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (viewParent instanceof kd) {
            return ((kd) viewParent).onNestedFling(view, f, f2, z);
        }
        return false;
    }

    public boolean a(ViewParent viewParent, View view, float f, float f2) {
        if (viewParent instanceof kd) {
            return ((kd) viewParent).onNestedPreFling(view, f, f2);
        }
        return false;
    }

    lt() {
    }
}
