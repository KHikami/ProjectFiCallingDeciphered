package p000;

import android.graphics.Rect;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public final class sb extends lt {
    final /* synthetic */ DrawerLayout f35095a;
    private final Rect f35096c = new Rect();

    public sb(DrawerLayout drawerLayout) {
        this.f35095a = drawerLayout;
    }

    public void m40586a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(DrawerLayout.class.getName());
    }

    public boolean m40589c(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.c(view, accessibilityEvent);
        }
        List text = accessibilityEvent.getText();
        View c = this.f35095a.c();
        if (c != null) {
            CharSequence c2 = this.f35095a.c(this.f35095a.e(c));
            if (c2 != null) {
                text.add(c2);
            }
        }
        return true;
    }

    public void m40587a(View view, ql qlVar) {
        if (DrawerLayout.b) {
            super.a(view, qlVar);
        } else {
            ql qlVar2;
            Object b = ql.f35003a.mo4282b(qlVar.f35004b);
            if (b != null) {
                qlVar2 = new ql(b);
            } else {
                qlVar2 = null;
            }
            super.a(view, qlVar2);
            qlVar.m40352a(view);
            ViewParent o = oa.f31462a.mo4117o(view);
            if (o instanceof View) {
                qlVar.m40365c((View) o);
            }
            Rect rect = this.f35096c;
            qlVar2.m40351a(rect);
            qlVar.m40358b(rect);
            qlVar2.m40364c(rect);
            qlVar.m40369d(rect);
            qlVar.m40372e(qlVar2.m40373e());
            qlVar.m40353a(qlVar2.m40384k());
            qlVar.m40360b(qlVar2.m40386l());
            qlVar.m40366c(qlVar2.m40387m());
            qlVar.m40382j(qlVar2.m40383j());
            qlVar.m40378h(qlVar2.m40379h());
            qlVar.m40367c(qlVar2.m40368c());
            qlVar.m40370d(qlVar2.m40371d());
            qlVar.m40374f(qlVar2.m40375f());
            qlVar.m40376g(qlVar2.m40377g());
            qlVar.m40380i(qlVar2.m40381i());
            qlVar.m40350a(qlVar2.m40357b());
            qlVar2.m40388n();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.l(childAt)) {
                    qlVar.m40359b(childAt);
                }
            }
        }
        qlVar.m40360b(DrawerLayout.class.getName());
        qlVar.m40367c(false);
        qlVar.m40370d(false);
        qlVar.m40363b(qm.f35009a);
        qlVar.m40363b(qm.f35010b);
    }

    public boolean m40588a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (DrawerLayout.b || DrawerLayout.l(view)) {
            return super.a(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
