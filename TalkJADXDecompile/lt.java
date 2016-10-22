import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class lt {
    private static final lv a;
    private static final Object c;
    final Object b;

    static {
        if (VERSION.SDK_INT >= 16) {
            a = new lw();
        } else if (VERSION.SDK_INT >= 14) {
            a = new lu();
        } else {
            a = new lv();
        }
        c = a.a();
    }

    public lt() {
        this.b = a.a(this);
    }

    Object a() {
        return this.b;
    }

    public void a(View view, int i) {
        a.a(c, view, i);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        a.d(c, view, accessibilityEvent);
    }

    public boolean c(View view, AccessibilityEvent accessibilityEvent) {
        return a.a(c, view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        a.c(c, view, accessibilityEvent);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        a.b(c, view, accessibilityEvent);
    }

    public void a(View view, ql qlVar) {
        a.a(c, view, qlVar);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return a.a(c, viewGroup, view, accessibilityEvent);
    }

    public qx a(View view) {
        return a.a(c, view);
    }

    public boolean a(View view, int i, Bundle bundle) {
        return a.a(c, view, i, bundle);
    }
}
