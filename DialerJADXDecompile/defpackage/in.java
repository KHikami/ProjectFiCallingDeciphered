package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: in */
public class in {
    private static final Object DEFAULT_DELEGATE;
    private static final ip IMPL;
    final Object mBridge;

    static {
        if (VERSION.SDK_INT >= 16) {
            IMPL = new iq();
        } else if (VERSION.SDK_INT >= 14) {
            IMPL = new io();
        } else {
            IMPL = new ip();
        }
        DEFAULT_DELEGATE = IMPL.a();
    }

    public in() {
        this.mBridge = IMPL.a(this);
    }

    Object getBridge() {
        return this.mBridge;
    }

    public void sendAccessibilityEvent(View view, int i) {
        IMPL.a(DEFAULT_DELEGATE, view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        IMPL.d(DEFAULT_DELEGATE, view, accessibilityEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return IMPL.a(DEFAULT_DELEGATE, view, accessibilityEvent);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        IMPL.c(DEFAULT_DELEGATE, view, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        IMPL.b(DEFAULT_DELEGATE, view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, mr mrVar) {
        IMPL.a(DEFAULT_DELEGATE, view, mrVar);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return IMPL.a(DEFAULT_DELEGATE, viewGroup, view, accessibilityEvent);
    }

    public nb getAccessibilityNodeProvider(View view) {
        return IMPL.a(DEFAULT_DELEGATE, view);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return IMPL.a(DEFAULT_DELEGATE, view, i, bundle);
    }
}
