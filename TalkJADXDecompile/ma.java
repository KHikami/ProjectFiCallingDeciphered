import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ma {
    final /* synthetic */ lt a;
    final /* synthetic */ lw b;

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

    public Object a(View view) {
        qx a = this.a.a(view);
        return a != null ? a.a() : null;
    }

    public boolean a(View view, int i, Bundle bundle) {
        return this.a.a(view, i, bundle);
    }

    ma(lw lwVar, lt ltVar) {
        this.b = lwVar;
        this.a = ltVar;
    }
}
