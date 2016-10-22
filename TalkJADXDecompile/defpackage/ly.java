package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import ql;

/* renamed from: ly */
public class ly {
    final /* synthetic */ lt a;
    final /* synthetic */ lu b;

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.c(view, accessibilityEvent);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.a.a(view, accessibilityEvent);
    }

    public void a(View view, Object obj) {
        this.a.a(view, new ql(obj));
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.a(viewGroup, view, accessibilityEvent);
    }

    public void a(View view, int i) {
        this.a.a(view, i);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.a.b(view, accessibilityEvent);
    }

    ly(lu luVar, lt ltVar) {
        this.b = luVar;
        this.a = ltVar;
    }
}
