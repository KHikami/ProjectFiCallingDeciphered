package p000;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;

public final class oa {
    public static final oj f31462a;

    static {
        int i = VERSION.SDK_INT;
        if (gwb.c()) {
            f31462a = new oi((byte) 0);
        } else if (i >= 23) {
            f31462a = new oi();
        } else if (i >= 21) {
            f31462a = new oh();
        } else if (i >= 19) {
            f31462a = new og();
        } else if (i >= 18) {
            f31462a = new of((byte) 0);
        } else if (i >= 17) {
            f31462a = new of();
        } else if (i >= 16) {
            f31462a = new oe();
        } else if (i >= 15) {
            f31462a = new oc();
        } else if (i >= 14) {
            f31462a = new od();
        } else if (i >= 11) {
            f31462a = new ob();
        } else {
            f31462a = new oj();
        }
    }

    public static boolean m37342a(View view, int i) {
        return f31462a.mo4106c(view, i);
    }

    public static boolean m37346b(View view, int i) {
        return f31462a.mo4107d(view, i);
    }

    public static void m37338a(View view, lt ltVar) {
        f31462a.mo4104a(view, ltVar);
    }

    public static boolean m37341a(View view) {
        return f31462a.mo4114l(view);
    }

    public static void m37343b(View view) {
        f31462a.mo4115m(view);
    }

    public static void m37336a(View view, Runnable runnable) {
        f31462a.mo4111a(view, runnable);
    }

    public static void m37337a(View view, Runnable runnable, long j) {
        f31462a.mo4112a(view, runnable, j);
    }

    public static int m37347c(View view) {
        return f31462a.mo4116n(view);
    }

    public static void m37349c(View view, int i) {
        f31462a.mo4113e(view, i);
    }

    public static void m37335a(View view, int i, Paint paint) {
        f31462a.mo4089a(view, i, null);
    }

    public static int m37351d(View view) {
        return f31462a.mo4124u(view);
    }

    public static int m37332a(int i, int i2, int i3) {
        return f31462a.mo4085a(i, i2, i3);
    }

    public static int m37354e(View view) {
        return f31462a.mo4095c(view);
    }

    public static int m37357f(View view) {
        return f31462a.mo4097d(view);
    }

    public static void m37353d(View view, int i) {
        f31462a.mo4130f(view, i);
    }

    public static int m37360g(View view) {
        return f31462a.mo4125v(view);
    }

    public static int m37361h(View view) {
        return f31462a.mo4126w(view);
    }

    public static float m37362i(View view) {
        return f31462a.mo4099e(view);
    }

    public static float m37363j(View view) {
        return f31462a.mo4101f(view);
    }

    public static int m37364k(View view) {
        return f31462a.mo4118p(view);
    }

    public static int m37365l(View view) {
        return f31462a.mo4119q(view);
    }

    public static pn m37366m(View view) {
        return f31462a.mo4109k(view);
    }

    public static void m37334a(View view, float f) {
        f31462a.mo4087a(view, f);
    }

    public static void m37344b(View view, float f) {
        f31462a.mo4092b(view, f);
    }

    public static void m37348c(View view, float f) {
        f31462a.mo4096c(view, f);
    }

    public static void m37352d(View view, float f) {
        f31462a.mo4098d(view, f);
    }

    public static void m37355e(View view, float f) {
        f31462a.mo4100e(view, f);
    }

    public static void m37358f(View view, float f) {
        f31462a.mo4145f(view, f);
    }

    public static int m37367n(View view) {
        return f31462a.mo4127x(view);
    }

    public static void m37368o(View view) {
        f31462a.mo4120r(view);
    }

    public static boolean m37369p(View view) {
        return f31462a.mo4121s(view);
    }

    public static void m37340a(View view, boolean z) {
        f31462a.mo4105c(view, true);
    }

    public static void m37339a(View view, no noVar) {
        f31462a.mo4143a(view, noVar);
    }

    public static qb m37333a(View view, qb qbVar) {
        return f31462a.mo4140a(view, qbVar);
    }

    public static void m37345b(View view, boolean z) {
        f31462a.mo4090a(view, false);
    }

    public static void m37350c(View view, boolean z) {
        f31462a.mo4094b(view, z);
    }

    public static boolean m37370q(View view) {
        return f31462a.mo4131z(view);
    }

    public static float m37371r(View view) {
        return f31462a.mo4139G(view);
    }

    public static void m37356e(View view, int i) {
        f31462a.mo4093b(view, i);
    }

    public static void m37359f(View view, int i) {
        f31462a.mo4088a(view, i);
    }

    public static boolean m37372s(View view) {
        return f31462a.mo4129A(view);
    }
}
