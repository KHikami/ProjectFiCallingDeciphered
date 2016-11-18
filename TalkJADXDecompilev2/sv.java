package defpackage;

import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

public final class sv extends lt {
    public boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int min;
        switch (i) {
            case 4096:
                min = Math.min(((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), nestedScrollView.b());
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

    public void a(View view, ql qlVar) {
        super.a(view, qlVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        qlVar.b(ScrollView.class.getName());
        if (nestedScrollView.isEnabled()) {
            int b = nestedScrollView.b();
            if (b > 0) {
                qlVar.k(true);
                if (nestedScrollView.getScrollY() > 0) {
                    qlVar.a(8192);
                }
                if (nestedScrollView.getScrollY() < b) {
                    qlVar.a(4096);
                }
            }
        }
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        rf a = qf.a(accessibilityEvent);
        a.a(nestedScrollView.b() > 0);
        a.d(nestedScrollView.getScrollX());
        a.e(nestedScrollView.getScrollY());
        a.f(nestedScrollView.getScrollX());
        a.g(nestedScrollView.b());
    }
}
