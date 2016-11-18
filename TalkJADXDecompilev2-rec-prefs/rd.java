package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public final class rd extends AccessibilityNodeProvider {
    final /* synthetic */ re f28993a;

    public rd(re reVar) {
        this.f28993a = reVar;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        return (AccessibilityNodeInfo) this.f28993a.m33687a(i);
    }

    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        return this.f28993a.m33688a(str, i);
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.f28993a.m33689a(i, i2, bundle);
    }

    public AccessibilityNodeInfo findFocus(int i) {
        return (AccessibilityNodeInfo) this.f28993a.m33690b(i);
    }
}
