package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public final class rb extends AccessibilityNodeProvider {
    final /* synthetic */ rc f28990a;

    public rb(rc rcVar) {
        this.f28990a = rcVar;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        return (AccessibilityNodeInfo) this.f28990a.m33684a(i);
    }

    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        return this.f28990a.m33685a(str, i);
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.f28990a.m33686a(i, i2, bundle);
    }
}
