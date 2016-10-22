package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: ake */
public final class ake {
    public static final Interpolator a;
    public static final Interpolator b;
    public static final Interpolator c;

    static {
        a = buf.a(0.0f, 0.0f, 0.2f, 1.0f);
        b = buf.a(0.4f, 0.0f, 1.0f, 1.0f);
        c = buf.a(0.4f, 0.0f, 0.2f, 1.0f);
    }

    public static void a(View view, View view2, int i) {
        ake.a(view, 200, 0, null);
        ake.a(view2, 200, null);
    }

    public static void a(View view, int i) {
        ake.a(view, i, null);
    }

    public static void a(View view, int i, akk akk) {
        view.setAlpha(1.0f);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.alpha(0.0f).withLayer().setListener(new akf(view, akk));
        if (i != -1) {
            animate.setDuration((long) i);
        }
        animate.start();
    }

    public static void b(View view, int i) {
        ake.a(view, i, 0, null);
    }

    public static void a(View view, int i, int i2, akk akk) {
        view.setAlpha(0.0f);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.setStartDelay((long) i2);
        animate.alpha(1.0f).withLayer().setListener(new akg(view, null));
        if (i != -1) {
            animate.setDuration((long) i);
        }
        animate.start();
    }

    public static void a(View view, int i, int i2) {
        ake.a(view, 0, 1, 266, i2, new akh(view), a);
    }

    public static void c(View view, int i) {
        ake.a(view, 1, 0, i, 0, new aki(view), b);
    }

    private static void a(View view, int i, int i2, int i3, int i4, AnimatorListenerAdapter animatorListenerAdapter, Interpolator interpolator) {
        view.setScaleX((float) i);
        view.setScaleY((float) i);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.setInterpolator(interpolator).scaleX((float) i2).scaleY((float) i2).setListener(animatorListenerAdapter).withLayer();
        if (i3 != -1) {
            animate.setDuration((long) i3);
        }
        animate.setStartDelay((long) i4);
        animate.start();
    }

    public static void b(View view, int i, int i2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        int width = view.getWidth();
        int height = view.getHeight();
        ofFloat.addUpdateListener(new akj(view, i - width, width, i2 - height, height));
        ofFloat.start();
    }
}
