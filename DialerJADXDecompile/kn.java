import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;

/* compiled from: PG */
public final class kn {
    public static final kx a;

    static {
        int i = VERSION.SDK_INT;
        if (buf.c()) {
            a = new kw((byte) 0);
        } else if (i >= 23) {
            a = new kw();
        } else if (i >= 21) {
            a = new kv();
        } else if (i >= 19) {
            a = new ku();
        } else if (i >= 18) {
            a = new kt((byte) 0);
        } else if (i >= 17) {
            a = new kt();
        } else if (i >= 16) {
            a = new ks();
        } else if (i >= 15) {
            a = new kq();
        } else if (i >= 14) {
            a = new kr();
        } else if (i >= 11) {
            a = new kp();
        } else if (i >= 9) {
            a = new ko();
        } else if (i >= 7) {
            a = new kx((byte) 0);
        } else {
            a = new kx();
        }
    }

    public static boolean a(View view, int i) {
        return a.c(view, i);
    }

    public static boolean b(View view, int i) {
        return a.d(view, i);
    }

    public static int a(View view) {
        return a.a(view);
    }

    public static void a(View view, in inVar) {
        a.a(view, inVar);
    }

    public static boolean b(View view) {
        return a.m(view);
    }

    public static void c(View view) {
        a.n(view);
    }

    public static void a(View view, Runnable runnable) {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        a.a(view, runnable, j);
    }

    public static int d(View view) {
        return a.o(view);
    }

    public static void c(View view, int i) {
        a.e(view, i);
    }

    public static float e(View view) {
        return a.b(view);
    }

    public static void a(View view, int i, Paint paint) {
        a.a(view, i, null);
    }

    public static int f(View view) {
        return a.u(view);
    }

    public static int a(int i, int i2, int i3) {
        return a.a(i, i2, i3);
    }

    public static int g(View view) {
        return a.e(view);
    }

    public static float h(View view) {
        return a.f(view);
    }

    public static float i(View view) {
        return a.g(view);
    }

    public static int j(View view) {
        return a.p(view);
    }

    public static int k(View view) {
        return a.q(view);
    }

    public static lv l(View view) {
        return a.l(view);
    }

    public static void a(View view, float f) {
        a.a(view, f);
    }

    public static void b(View view, float f) {
        a.b(view, f);
    }

    public static void c(View view, float f) {
        a.c(view, f);
    }

    public static void d(View view, float f) {
        a.d(view, f);
    }

    public static int m(View view) {
        return a.x(view);
    }

    public static void n(View view) {
        a.r(view);
    }

    public static boolean o(View view) {
        return a.s(view);
    }

    public static void a(View view, boolean z) {
        a.c(view, true);
    }

    public static void a(View view, kf kfVar) {
        a.a(view, kfVar);
    }

    public static mj a(View view, mj mjVar) {
        return a.a(view, mjVar);
    }

    public static void b(View view, boolean z) {
        a.a(view, false);
    }

    public static void c(View view, boolean z) {
        a.b(view, z);
    }

    public static boolean p(View view) {
        return a.z(view);
    }

    public static float q(View view) {
        return a.G(view);
    }

    public static void d(View view, int i) {
        a.b(view, i);
    }

    public static void e(View view, int i) {
        a.a(view, i);
    }

    public static boolean r(View view) {
        return a.A(view);
    }
}
