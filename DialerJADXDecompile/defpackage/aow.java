package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;

/* compiled from: PG */
/* renamed from: aow */
public final class aow implements AnimatorListener {
    final /* synthetic */ aou a;

    public aow(aou aou) {
        this.a = aou;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
        try {
            Context context;
            View b = this.a.b();
            if (b != null) {
                context = b.getContext();
            } else {
                context = null;
            }
            if (context != null) {
                Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200);
                }
            }
        } catch (Exception e) {
            animator.cancel();
        }
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        try {
            View findViewById = this.a.b().findViewById(aq.ad);
            if (findViewById != null) {
                findViewById.getBackground().clearColorFilter();
            }
            new Handler().postDelayed(new aox(this), 1000);
        } catch (Exception e) {
            animator.cancel();
        }
    }
}
