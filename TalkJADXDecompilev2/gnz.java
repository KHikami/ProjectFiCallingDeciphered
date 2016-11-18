package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import com.google.android.apps.hangouts.R$drawable;

public final class gnz {
    private static final int[] a = new int[]{R$drawable.k, R$drawable.l, R$drawable.m, R$drawable.l, R$drawable.k, R$drawable.n, R$drawable.o, R$drawable.n, R$drawable.k, R$drawable.p, R$drawable.q, R$drawable.p, R$drawable.k};
    private static final int[] b = new int[]{R$drawable.r, R$drawable.s, R$drawable.t, R$drawable.u, R$drawable.v, R$drawable.w, R$drawable.x, R$drawable.y, R$drawable.z, R$drawable.A, R$drawable.B, R$drawable.C, R$drawable.D, R$drawable.E, R$drawable.F, R$drawable.G, R$drawable.H, R$drawable.I, R$drawable.J, R$drawable.K};
    private static final int[] c = new int[]{R$drawable.L, R$drawable.M, R$drawable.N, R$drawable.O, R$drawable.P, R$drawable.Q, R$drawable.R, R$drawable.S, R$drawable.T};
    private static final int[] d = new int[]{R$drawable.U, R$drawable.V, R$drawable.W, R$drawable.X, R$drawable.Y, R$drawable.Z, R$drawable.aa, R$drawable.ab, R$drawable.ac, R$drawable.ad, R$drawable.ae, R$drawable.af, R$drawable.ag, R$drawable.ah, R$drawable.ai, R$drawable.aj, R$drawable.ak, R$drawable.al, R$drawable.am, R$drawable.an};
    private static final int[] e = new int[]{R$drawable.ao, R$drawable.ap, R$drawable.aq, R$drawable.ar, R$drawable.as, R$drawable.at, R$drawable.au, R$drawable.av, R$drawable.aw};

    public static AnimationDrawable a(Context context, kbu kbu, boolean z) {
        iil.a();
        AnimationDrawable animationDrawable = new AnimationDrawable();
        try {
            int length = b.length;
            int i = 0;
            while (i < length) {
                animationDrawable.addFrame(context.getResources().getDrawable(b[i]), i == length + -1 ? 500 : 33);
                i++;
            }
            animationDrawable.setOneShot(false);
        } catch (Throwable e) {
            glk.d("Babel", "OutOfMemory trying to create animation ellipsis", e);
        }
        kbu.a(new goa(animationDrawable));
        return animationDrawable;
    }

    public static AnimationDrawable a(Context context, kbu kbu) {
        iil.a();
        AnimationDrawable animationDrawable = new AnimationDrawable();
        try {
            int length = a.length;
            int i = 0;
            while (i < length) {
                animationDrawable.addFrame(context.getResources().getDrawable(a[i]), i == length + -1 ? 500 : 44);
                i++;
            }
            animationDrawable.setOneShot(false);
        } catch (Throwable e) {
            glk.d("Babel", "OutOfMemory trying to create animation ellipsis", e);
        }
        kbu.a(new goa(animationDrawable));
        return animationDrawable;
    }
}
