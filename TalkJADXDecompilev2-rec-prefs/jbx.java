package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class jbx extends AnimatorListenerAdapter {
    final /* synthetic */ Snackbar f19840a;

    public jbx(Snackbar snackbar) {
        this.f19840a = snackbar;
    }

    public void onAnimationStart(Animator animator) {
        this.f19840a.setVisibility(0);
    }

    public void onAnimationEnd(Animator animator) {
        if (VERSION.SDK_INT < 21 && this.f19840a.m8339d() != 0) {
            Snackbar.m8331a(this.f19840a);
        }
    }
}
