package defpackage;

import android.graphics.Rect;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public final class sb extends lt {
    final /* synthetic */ DrawerLayout a;
    private final Rect c = new Rect();

    public sb(DrawerLayout drawerLayout) {
        this.a = drawerLayout;
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(DrawerLayout.class.getName());
    }

    public boolean c(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.c(view, accessibilityEvent);
        }
        List text = accessibilityEvent.getText();
        View c = this.a.c();
        if (c != null) {
            CharSequence c2 = this.a.c(this.a.e(c));
            if (c2 != null) {
                text.add(c2);
            }
        }
        return true;
    }

    public void a(View view, ql qlVar) {
        if (DrawerLayout.b) {
            super.a(view, qlVar);
        } else {
            ql qlVar2;
            Object b = ql.a.b(qlVar.b);
            if (b != null) {
                qlVar2 = new ql(b);
            } else {
                qlVar2 = null;
            }
            super.a(view, qlVar2);
            qlVar.a(view);
            ViewParent o = oa.a.o(view);
            if (o instanceof View) {
                qlVar.c((View) o);
            }
            Rect rect = this.c;
            qlVar2.a(rect);
            qlVar.b(rect);
            qlVar2.c(rect);
            qlVar.d(rect);
            qlVar.e(qlVar2.e());
            qlVar.a(qlVar2.k());
            qlVar.b(qlVar2.l());
            qlVar.c(qlVar2.m());
            qlVar.j(qlVar2.j());
            qlVar.h(qlVar2.h());
            qlVar.c(qlVar2.c());
            qlVar.d(qlVar2.d());
            qlVar.f(qlVar2.f());
            qlVar.g(qlVar2.g());
            qlVar.i(qlVar2.i());
            qlVar.a(qlVar2.b());
            qlVar2.n();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.l(childAt)) {
                    qlVar.b(childAt);
                }
            }
        }
        qlVar.b(DrawerLayout.class.getName());
        qlVar.c(false);
        qlVar.d(false);
        qlVar.b(qm.a);
        qlVar.b(qm.b);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (DrawerLayout.b || DrawerLayout.l(view)) {
            return super.a(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
