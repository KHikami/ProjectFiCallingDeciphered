package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public final class rb extends AccessibilityNodeProvider {
    final /* synthetic */ rc a;

    public rb(rc rcVar) {
        this.a = rcVar;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        return (AccessibilityNodeInfo) this.a.a(i);
    }

    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        return this.a.a(str, i);
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.a(i, i2, bundle);
    }
}
