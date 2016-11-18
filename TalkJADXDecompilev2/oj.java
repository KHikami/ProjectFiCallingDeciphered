package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

public class oj {
    WeakHashMap<View, pn> c = null;

    public boolean c(View view, int i) {
        return (view instanceof nu) && oj.a((nu) view, i);
    }

    public boolean d(View view, int i) {
        return (view instanceof nu) && oj.b((nu) view, i);
    }

    public void a(View view, lt ltVar) {
    }

    public boolean j(View view) {
        return false;
    }

    public boolean l(View view) {
        return false;
    }

    public void m(View view) {
        view.invalidate();
    }

    public void a(View view, Runnable runnable) {
        view.postDelayed(runnable, a());
    }

    public void a(View view, Runnable runnable, long j) {
        view.postDelayed(runnable, a() + j);
    }

    public int n(View view) {
        return 0;
    }

    public void e(View view, int i) {
    }

    public float a(View view) {
        return 1.0f;
    }

    public void a(View view, int i, Paint paint) {
    }

    public int b(View view) {
        return 0;
    }

    public int u(View view) {
        return 0;
    }

    public ViewParent o(View view) {
        return view.getParent();
    }

    public int a(int i, int i2, int i3) {
        return View.resolveSize(i, i2);
    }

    public int c(View view) {
        return view.getMeasuredWidth();
    }

    public int d(View view) {
        return 0;
    }

    public void f(View view, int i) {
    }

    public int v(View view) {
        return view.getPaddingLeft();
    }

    public int w(View view) {
        return view.getPaddingRight();
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    public float e(View view) {
        return 0.0f;
    }

    public float f(View view) {
        return 0.0f;
    }

    public Matrix g(View view) {
        return null;
    }

    public int p(View view) {
        return gwb.k(view);
    }

    public int q(View view) {
        return gwb.l(view);
    }

    public pn k(View view) {
        return new pn(view);
    }

    public void d(View view, float f) {
    }

    public void e(View view, float f) {
    }

    public void a(View view, float f) {
    }

    public void b(View view, float f) {
    }

    public void c(View view, float f) {
    }

    public void f(View view, float f) {
    }

    public float B(View view) {
        return 0.0f;
    }

    public int x(View view) {
        return 0;
    }

    public void r(View view) {
    }

    public boolean s(View view) {
        return false;
    }

    public boolean t(View view) {
        return true;
    }

    public void c(View view, boolean z) {
    }

    public void h(View view) {
    }

    public void a(View view, no noVar) {
    }

    public qb a(View view, qb qbVar) {
        return qbVar;
    }

    public qb b(View view, qb qbVar) {
        return qbVar;
    }

    public void a(View view, boolean z) {
    }

    public void b(View view, boolean z) {
    }

    public boolean y(View view) {
        return false;
    }

    public ColorStateList E(View view) {
        return gwb.h(view);
    }

    public void a(View view, ColorStateList colorStateList) {
        gwb.a(view, colorStateList);
    }

    public Mode F(View view) {
        return gwb.i(view);
    }

    public void a(View view, Mode mode) {
        gwb.a(view, mode);
    }

    public void D(View view) {
        if (view instanceof nk) {
            ((nk) view).stopNestedScroll();
        }
    }

    public boolean z(View view) {
        return gwb.j(view);
    }

    public int a(int i, int i2) {
        return i | i2;
    }

    public float G(View view) {
        return C(view) + B(view);
    }

    public boolean A(View view) {
        return gwb.m(view);
    }

    public boolean i(View view) {
        return false;
    }

    public void a(View view, int i, int i2) {
    }

    public void b(View view, int i) {
        gwb.a(view, i);
    }

    public void a(View view, int i) {
        gwb.b(view, i);
    }

    oj() {
    }

    long a() {
        return 10;
    }

    public float C(View view) {
        return 0.0f;
    }

    static boolean a(nu nuVar, int i) {
        int computeHorizontalScrollOffset = nuVar.computeHorizontalScrollOffset();
        int computeHorizontalScrollRange = nuVar.computeHorizontalScrollRange() - nuVar.computeHorizontalScrollExtent();
        if (computeHorizontalScrollRange == 0) {
            return false;
        }
        if (i < 0) {
            if (computeHorizontalScrollOffset > 0) {
                return true;
            }
            return false;
        } else if (computeHorizontalScrollOffset < computeHorizontalScrollRange - 1) {
            return true;
        } else {
            return false;
        }
    }

    static boolean b(nu nuVar, int i) {
        int computeVerticalScrollOffset = nuVar.computeVerticalScrollOffset();
        int computeVerticalScrollRange = nuVar.computeVerticalScrollRange() - nuVar.computeVerticalScrollExtent();
        if (computeVerticalScrollRange == 0) {
            return false;
        }
        if (i < 0) {
            if (computeVerticalScrollOffset > 0) {
                return true;
            }
            return false;
        } else if (computeVerticalScrollOffset < computeVerticalScrollRange - 1) {
            return true;
        } else {
            return false;
        }
    }
}
