import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
public final class ll extends in {
    private /* synthetic */ ViewPager a;

    public ll(ViewPager viewPager) {
        this.a = viewPager;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        nj a = ml.a(accessibilityEvent);
        a.a(a());
        if (accessibilityEvent.getEventType() == 4096 && this.a.b != null) {
            a.a(this.a.b.a());
            a.b(this.a.c);
            a.c(this.a.c);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View view, mr mrVar) {
        super.onInitializeAccessibilityNodeInfo(view, mrVar);
        mrVar.a(ViewPager.class.getName());
        mrVar.c(a());
        if (this.a.canScrollHorizontally(1)) {
            mrVar.a(4096);
        }
        if (this.a.canScrollHorizontally(-1)) {
            mrVar.a(8192);
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.a.canScrollHorizontally(1)) {
                    return false;
                }
                this.a.b(this.a.c + 1);
                return true;
            case 8192:
                if (!this.a.canScrollHorizontally(-1)) {
                    return false;
                }
                this.a.b(this.a.c - 1);
                return true;
            default:
                return false;
        }
    }

    private final boolean a() {
        return this.a.b != null && this.a.b.a() > 1;
    }
}
