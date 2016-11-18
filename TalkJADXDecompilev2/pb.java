package defpackage;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class pb extends lt {
    final /* synthetic */ ViewPager a;

    public pb(ViewPager viewPager) {
        this.a = viewPager;
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        rf a = qf.a(accessibilityEvent);
        a.a(b());
        if (accessibilityEvent.getEventType() == 4096 && this.a.b != null) {
            a.a(this.a.b.a());
            a.b(this.a.c);
            a.c(this.a.c);
        }
    }

    public void a(View view, ql qlVar) {
        super.a(view, qlVar);
        qlVar.b(ViewPager.class.getName());
        qlVar.k(b());
        if (this.a.canScrollHorizontally(1)) {
            qlVar.a(4096);
        }
        if (this.a.canScrollHorizontally(-1)) {
            qlVar.a(8192);
        }
    }

    public boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
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

    private boolean b() {
        return this.a.b != null && this.a.b.a() > 1;
    }
}
