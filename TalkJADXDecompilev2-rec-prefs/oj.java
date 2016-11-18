package p000;

import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

public class oj {
    WeakHashMap<View, pn> f31886c = null;

    public boolean mo4106c(View view, int i) {
        return (view instanceof nu) && oj.m37497a((nu) view, i);
    }

    public boolean mo4107d(View view, int i) {
        return (view instanceof nu) && oj.m37498b((nu) view, i);
    }

    public void mo4104a(View view, lt ltVar) {
    }

    public boolean mo4108j(View view) {
        return false;
    }

    public boolean mo4114l(View view) {
        return false;
    }

    public void mo4115m(View view) {
        view.invalidate();
    }

    public void mo4111a(View view, Runnable runnable) {
        view.postDelayed(runnable, mo4086a());
    }

    public void mo4112a(View view, Runnable runnable, long j) {
        view.postDelayed(runnable, mo4086a() + j);
    }

    public int mo4116n(View view) {
        return 0;
    }

    public void mo4113e(View view, int i) {
    }

    public float mo4083a(View view) {
        return 1.0f;
    }

    public void mo4089a(View view, int i, Paint paint) {
    }

    public int mo4091b(View view) {
        return 0;
    }

    public int mo4124u(View view) {
        return 0;
    }

    public ViewParent mo4117o(View view) {
        return view.getParent();
    }

    public int mo4085a(int i, int i2, int i3) {
        return View.resolveSize(i, i2);
    }

    public int mo4095c(View view) {
        return view.getMeasuredWidth();
    }

    public int mo4097d(View view) {
        return 0;
    }

    public void mo4130f(View view, int i) {
    }

    public int mo4125v(View view) {
        return view.getPaddingLeft();
    }

    public int mo4126w(View view) {
        return view.getPaddingRight();
    }

    public void mo4123a(View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    public float mo4099e(View view) {
        return 0.0f;
    }

    public float mo4101f(View view) {
        return 0.0f;
    }

    public Matrix mo4102g(View view) {
        return null;
    }

    public int mo4118p(View view) {
        return gwb.k(view);
    }

    public int mo4119q(View view) {
        return gwb.l(view);
    }

    public pn mo4109k(View view) {
        return new pn(view);
    }

    public void mo4098d(View view, float f) {
    }

    public void mo4100e(View view, float f) {
    }

    public void mo4087a(View view, float f) {
    }

    public void mo4092b(View view, float f) {
    }

    public void mo4096c(View view, float f) {
    }

    public void mo4145f(View view, float f) {
    }

    public float mo4134B(View view) {
        return 0.0f;
    }

    public int mo4127x(View view) {
        return 0;
    }

    public void mo4120r(View view) {
    }

    public boolean mo4121s(View view) {
        return false;
    }

    public boolean mo4122t(View view) {
        return true;
    }

    public void mo4105c(View view, boolean z) {
    }

    public void mo4103h(View view) {
    }

    public void mo4143a(View view, no noVar) {
    }

    public qb mo4140a(View view, qb qbVar) {
        return qbVar;
    }

    public qb mo4144b(View view, qb qbVar) {
        return qbVar;
    }

    public void mo4090a(View view, boolean z) {
    }

    public void mo4094b(View view, boolean z) {
    }

    public boolean mo4128y(View view) {
        return false;
    }

    public ColorStateList mo4137E(View view) {
        return gwb.h(view);
    }

    public void mo4141a(View view, ColorStateList colorStateList) {
        gwb.a(view, colorStateList);
    }

    public Mode mo4138F(View view) {
        return gwb.i(view);
    }

    public void mo4142a(View view, Mode mode) {
        gwb.a(view, mode);
    }

    public void mo4136D(View view) {
        if (view instanceof nk) {
            ((nk) view).stopNestedScroll();
        }
    }

    public boolean mo4131z(View view) {
        return gwb.j(view);
    }

    public int mo4084a(int i, int i2) {
        return i | i2;
    }

    public float mo4139G(View view) {
        return mo4135C(view) + mo4134B(view);
    }

    public boolean mo4129A(View view) {
        return gwb.m(view);
    }

    public boolean mo4110i(View view) {
        return false;
    }

    public void mo4146a(View view, int i, int i2) {
    }

    public void mo4093b(View view, int i) {
        gwb.a(view, i);
    }

    public void mo4088a(View view, int i) {
        gwb.b(view, i);
    }

    oj() {
    }

    long mo4086a() {
        return 10;
    }

    public float mo4135C(View view) {
        return 0.0f;
    }

    static boolean m37497a(nu nuVar, int i) {
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

    static boolean m37498b(nu nuVar, int i) {
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
