import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

/* compiled from: PG */
public class kx {
    WeakHashMap a;

    public boolean c(View view, int i) {
        return (view instanceof kh) && a((kh) view, i);
    }

    public boolean d(View view, int i) {
        return (view instanceof kh) && b((kh) view, i);
    }

    public int a(View view) {
        return 2;
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
    }

    public void a(View view, mr mrVar) {
    }

    public void a(View view, in inVar) {
    }

    public boolean k(View view) {
        return false;
    }

    public boolean m(View view) {
        return false;
    }

    public void n(View view) {
        view.invalidate();
    }

    public void a(View view, Runnable runnable) {
        view.postDelayed(runnable, a());
    }

    public void a(View view, Runnable runnable, long j) {
        view.postDelayed(runnable, a() + j);
    }

    public int o(View view) {
        return 0;
    }

    public void e(View view, int i) {
    }

    public boolean a(View view, int i, Bundle bundle) {
        return false;
    }

    public float b(View view) {
        return 1.0f;
    }

    public void a(View view, int i, Paint paint) {
    }

    public int c(View view) {
        return 0;
    }

    public int u(View view) {
        return 0;
    }

    public int a(int i, int i2, int i3) {
        return View.resolveSize(i, i2);
    }

    public int d(View view) {
        return view.getMeasuredWidth();
    }

    public int e(View view) {
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

    public float f(View view) {
        return 0.0f;
    }

    public float g(View view) {
        return 0.0f;
    }

    public Matrix h(View view) {
        return null;
    }

    public int p(View view) {
        return buf.j(view);
    }

    public int q(View view) {
        return buf.k(view);
    }

    public lv l(View view) {
        return new lv(view);
    }

    public void a(View view, float f) {
    }

    public void b(View view, float f) {
    }

    public void c(View view, float f) {
    }

    public void d(View view, float f) {
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

    public void i(View view) {
    }

    public void a(View view, kf kfVar) {
    }

    public mj a(View view, mj mjVar) {
        return mjVar;
    }

    public mj b(View view, mj mjVar) {
        return mjVar;
    }

    public void a(View view, boolean z) {
    }

    public void b(View view, boolean z) {
    }

    public boolean y(View view) {
        return false;
    }

    public ColorStateList E(View view) {
        return buf.g(view);
    }

    public void a(View view, ColorStateList colorStateList) {
        buf.a(view, colorStateList);
    }

    public Mode F(View view) {
        return buf.h(view);
    }

    public void a(View view, Mode mode) {
        buf.a(view, mode);
    }

    public void D(View view) {
        if (view instanceof kb) {
            ((kb) view).stopNestedScroll();
        }
    }

    public boolean z(View view) {
        return buf.i(view);
    }

    public int a(int i, int i2) {
        return i | i2;
    }

    public float G(View view) {
        return C(view) + B(view);
    }

    public boolean A(View view) {
        return buf.l(view);
    }

    public boolean j(View view) {
        return false;
    }

    public void a(View view, int i, int i2) {
    }

    public void b(View view, int i) {
        buf.a(view, i);
    }

    public void a(View view, int i) {
        buf.b(view, i);
    }

    kx() {
        this.a = null;
    }

    long a() {
        return 10;
    }

    public float B(View view) {
        return 0.0f;
    }

    public float C(View view) {
        return 0.0f;
    }

    static boolean a(kh khVar, int i) {
        int computeHorizontalScrollOffset = khVar.computeHorizontalScrollOffset();
        int computeHorizontalScrollRange = khVar.computeHorizontalScrollRange() - khVar.computeHorizontalScrollExtent();
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

    static boolean b(kh khVar, int i) {
        int computeVerticalScrollOffset = khVar.computeVerticalScrollOffset();
        int computeVerticalScrollRange = khVar.computeVerticalScrollRange() - khVar.computeVerticalScrollExtent();
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

    kx(byte b) {
        this();
    }
}
