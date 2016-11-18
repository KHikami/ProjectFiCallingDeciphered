package p000;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class lt {
    private static final lv f97a;
    private static final Object f98c = f97a.mo3721a();
    final Object f99b = f97a.mo3722a(this);

    static {
        if (VERSION.SDK_INT >= 16) {
            f97a = new lw();
        } else if (VERSION.SDK_INT >= 14) {
            f97a = new lu();
        } else {
            f97a = new lv();
        }
    }

    Object m130a() {
        return this.f99b;
    }

    public void m132a(View view, int i) {
        f97a.mo3723a(f98c, view, i);
    }

    public void m137b(View view, AccessibilityEvent accessibilityEvent) {
        f97a.mo3729d(f98c, view, accessibilityEvent);
    }

    public boolean m138c(View view, AccessibilityEvent accessibilityEvent) {
        return f97a.mo3725a(f98c, view, accessibilityEvent);
    }

    public void m139d(View view, AccessibilityEvent accessibilityEvent) {
        f97a.mo3728c(f98c, view, accessibilityEvent);
    }

    public void mo12a(View view, AccessibilityEvent accessibilityEvent) {
        f97a.mo3727b(f98c, view, accessibilityEvent);
    }

    public void mo13a(View view, ql qlVar) {
        f97a.mo3724a(f98c, view, qlVar);
    }

    public boolean m136a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f97a.mo3726a(f98c, viewGroup, view, accessibilityEvent);
    }

    public qx m131a(View view) {
        return f97a.mo3730a(f98c, view);
    }

    public boolean mo109a(View view, int i, Bundle bundle) {
        return f97a.mo3731a(f98c, view, i, bundle);
    }
}
