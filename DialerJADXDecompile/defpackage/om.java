package defpackage;

import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* compiled from: PG */
/* renamed from: om */
public final class om extends in {
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int min;
        switch (i) {
            case 4096:
                min = Math.min(((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), nestedScrollView.a());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.a(0, min);
                return true;
            case 8192:
                min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.a(0, min);
                return true;
            default:
                return false;
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View view, mr mrVar) {
        super.onInitializeAccessibilityNodeInfo(view, mrVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        mrVar.a(ScrollView.class.getName());
        if (nestedScrollView.isEnabled()) {
            int a = nestedScrollView.a();
            if (a > 0) {
                mrVar.c(true);
                if (nestedScrollView.getScrollY() > 0) {
                    mrVar.a(8192);
                }
                if (nestedScrollView.getScrollY() < a) {
                    mrVar.a(4096);
                }
            }
        }
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        nj a = ml.a(accessibilityEvent);
        a.a(nestedScrollView.a() > 0);
        nj.a.c(a.b, nestedScrollView.getScrollX());
        nj.a.d(a.b, nestedScrollView.getScrollY());
        nj.a.f(a.b, nestedScrollView.getScrollX());
        nj.a.g(a.b, nestedScrollView.a());
    }
}
