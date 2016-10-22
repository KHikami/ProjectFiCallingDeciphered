import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: PG */
public final class nf extends AccessibilityNodeProvider {
    private /* synthetic */ ng a;

    public nf(ng ngVar) {
        this.a = ngVar;
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
}
