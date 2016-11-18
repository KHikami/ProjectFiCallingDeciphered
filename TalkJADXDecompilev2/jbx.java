package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class jbx extends AnimatorListenerAdapter {
    final /* synthetic */ Snackbar a;

    public jbx(Snackbar snackbar) {
        this.a = snackbar;
    }

    public void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }

    public void onAnimationEnd(Animator animator) {
        if (VERSION.SDK_INT < 21 && this.a.d() != 0) {
            Snackbar.a(this.a);
        }
    }
}
