package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: PG */
/* renamed from: nh */
public final class nh extends AccessibilityNodeProvider {
    private /* synthetic */ ni a;

    public nh(ni niVar) {
        this.a = niVar;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        return (AccessibilityNodeInfo) this.a.a(i);
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return this.a.a(str, i);
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.a(i, i2, bundle);
    }

    public final AccessibilityNodeInfo findFocus(int i) {
        return (AccessibilityNodeInfo) this.a.b(i);
    }
}
