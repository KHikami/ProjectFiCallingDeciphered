package defpackage;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;

public final class oa {
    public static final oj a;

    static {
        int i = VERSION.SDK_INT;
        if (gwb.c()) {
            a = new oi((byte) 0);
        } else if (i >= 23) {
            a = new oi();
        } else if (i >= 21) {
            a = new oh();
        } else if (i >= 19) {
            a = new og();
        } else if (i >= 18) {
            a = new of((byte) 0);
        } else if (i >= 17) {
            a = new of();
        } else if (i >= 16) {
            a = new oe();
        } else if (i >= 15) {
            a = new oc();
        } else if (i >= 14) {
            a = new od();
        } else if (i >= 11) {
            a = new ob();
        } else {
            a = new oj();
        }
    }

    public static boolean a(View view, int i) {
        return a.c(view, i);
    }

    public static boolean b(View view, int i) {
        return a.d(view, i);
    }

    public static void a(View view, lt ltVar) {
        a.a(view, ltVar);
    }

    public static boolean a(View view) {
        return a.l(view);
    }

    public static void b(View view) {
        a.m(view);
    }

    public static void a(View view, Runnable runnable) {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        a.a(view, runnable, j);
    }

    public static int c(View view) {
        return a.n(view);
    }

    public static void c(View view, int i) {
        a.e(view, i);
    }

    public static void a(View view, int i, Paint paint) {
        a.a(view, i, null);
    }

    public static int d(View view) {
        return a.u(view);
    }

    public static int a(int i, int i2, int i3) {
        return a.a(i, i2, i3);
    }

    public static int e(View view) {
        return a.c(view);
    }

    public static int f(View view) {
        return a.d(view);
    }

    public static void d(View view, int i) {
        a.f(view, i);
    }

    public static int g(View view) {
        return a.v(view);
    }

    public static int h(View view) {
        return a.w(view);
    }

    public static float i(View view) {
        return a.e(view);
    }

    public static float j(View view) {
        return a.f(view);
    }

    public static int k(View view) {
        return a.p(view);
    }

    public static int l(View view) {
        return a.q(view);
    }

    public static pn m(View view) {
        return a.k(view);
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

    public static void e(View view, float f) {
        a.e(view, f);
    }

    public static void f(View view, float f) {
        a.f(view, f);
    }

    public static int n(View view) {
        return a.x(view);
    }

    public static void o(View view) {
        a.r(view);
    }

    public static boolean p(View view) {
        return a.s(view);
    }

    public static void a(View view, boolean z) {
        a.c(view, true);
    }

    public static void a(View view, no noVar) {
        a.a(view, noVar);
    }

    public static qb a(View view, qb qbVar) {
        return a.a(view, qbVar);
    }

    public static void b(View view, boolean z) {
        a.a(view, false);
    }

    public static void c(View view, boolean z) {
        a.b(view, z);
    }

    public static boolean q(View view) {
        return a.z(view);
    }

    public static float r(View view) {
        return a.G(view);
    }

    public static void e(View view, int i) {
        a.b(view, i);
    }

    public static void f(View view, int i) {
        a.a(view, i);
    }

    public static boolean s(View view) {
        return a.A(view);
    }
}
