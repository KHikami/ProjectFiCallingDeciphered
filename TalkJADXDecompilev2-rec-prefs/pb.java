package p000;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class pb extends lt {
    final /* synthetic */ ViewPager f34880a;

    public pb(ViewPager viewPager) {
        this.f34880a = viewPager;
    }

    public void m40151a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        rf a = qf.a(accessibilityEvent);
        a.a(m40150b());
        if (accessibilityEvent.getEventType() == 4096 && this.f34880a.b != null) {
            a.a(this.f34880a.b.m35979a());
            a.b(this.f34880a.c);
            a.c(this.f34880a.c);
        }
    }

    public void m40152a(View view, ql qlVar) {
        super.a(view, qlVar);
        qlVar.m40360b(ViewPager.class.getName());
        qlVar.m40385k(m40150b());
        if (this.f34880a.canScrollHorizontally(1)) {
            qlVar.m40350a(4096);
        }
        if (this.f34880a.canScrollHorizontally(-1)) {
            qlVar.m40350a(8192);
        }
    }

    public boolean m40153a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.f34880a.canScrollHorizontally(1)) {
                    return false;
                }
                this.f34880a.b(this.f34880a.c + 1);
                return true;
            case 8192:
                if (!this.f34880a.canScrollHorizontally(-1)) {
                    return false;
                }
                this.f34880a.b(this.f34880a.c - 1);
                return true;
            default:
                return false;
        }
    }

    private boolean m40150b() {
        return this.f34880a.b != null && this.f34880a.b.m35979a() > 1;
    }
}
