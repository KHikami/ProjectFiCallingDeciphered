package p000;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import com.google.android.apps.hangouts.R$drawable;

public final class gnz {
    private static final int[] f15759a = new int[]{R$drawable.f5937k, R$drawable.f5938l, R$drawable.f5939m, R$drawable.f5938l, R$drawable.f5937k, R$drawable.f5940n, R$drawable.f5941o, R$drawable.f5940n, R$drawable.f5937k, R$drawable.f5942p, R$drawable.f5943q, R$drawable.f5942p, R$drawable.f5937k};
    private static final int[] f15760b = new int[]{R$drawable.f5944r, R$drawable.f5945s, R$drawable.f5946t, R$drawable.f5947u, R$drawable.f5948v, R$drawable.f5949w, R$drawable.f5950x, R$drawable.f5951y, R$drawable.f5952z, R$drawable.f5901A, R$drawable.f5902B, R$drawable.f5903C, R$drawable.f5904D, R$drawable.f5905E, R$drawable.f5906F, R$drawable.f5907G, R$drawable.f5908H, R$drawable.f5909I, R$drawable.f5910J, R$drawable.f5911K};
    private static final int[] f15761c = new int[]{R$drawable.f5912L, R$drawable.f5913M, R$drawable.f5914N, R$drawable.f5915O, R$drawable.f5916P, R$drawable.f5917Q, R$drawable.f5918R, R$drawable.f5919S, R$drawable.f5920T};
    private static final int[] f15762d = new int[]{R$drawable.f5921U, R$drawable.f5922V, R$drawable.f5923W, R$drawable.f5924X, R$drawable.f5925Y, R$drawable.f5926Z, R$drawable.aa, R$drawable.ab, R$drawable.ac, R$drawable.ad, R$drawable.ae, R$drawable.af, R$drawable.ag, R$drawable.ah, R$drawable.ai, R$drawable.aj, R$drawable.ak, R$drawable.al, R$drawable.am, R$drawable.an};
    private static final int[] f15763e = new int[]{R$drawable.ao, R$drawable.ap, R$drawable.aq, R$drawable.ar, R$drawable.as, R$drawable.at, R$drawable.au, R$drawable.av, R$drawable.aw};

    public static AnimationDrawable m18195a(Context context, kbu kbu, boolean z) {
        iil.m21867a();
        AnimationDrawable animationDrawable = new AnimationDrawable();
        try {
            int length = f15760b.length;
            int i = 0;
            while (i < length) {
                animationDrawable.addFrame(context.getResources().getDrawable(f15760b[i]), i == length + -1 ? 500 : 33);
                i++;
            }
            animationDrawable.setOneShot(false);
        } catch (Throwable e) {
            glk.m17980d("Babel", "OutOfMemory trying to create animation ellipsis", e);
        }
        kbu.m25514a(new goa(animationDrawable));
        return animationDrawable;
    }

    public static AnimationDrawable m18194a(Context context, kbu kbu) {
        iil.m21867a();
        AnimationDrawable animationDrawable = new AnimationDrawable();
        try {
            int length = f15759a.length;
            int i = 0;
            while (i < length) {
                animationDrawable.addFrame(context.getResources().getDrawable(f15759a[i]), i == length + -1 ? 500 : 44);
                i++;
            }
            animationDrawable.setOneShot(false);
        } catch (Throwable e) {
            glk.m17980d("Babel", "OutOfMemory trying to create animation ellipsis", e);
        }
        kbu.m25514a(new goa(animationDrawable));
        return animationDrawable;
    }
}
