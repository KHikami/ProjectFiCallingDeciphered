package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class chl extends AnimatorListenerAdapter {
    final /* synthetic */ Snackbar f5329a;

    public chl(Snackbar snackbar) {
        this.f5329a = snackbar;
    }

    public void onAnimationStart(Animator animator) {
        this.f5329a.setVisibility(0);
    }

    public void onAnimationEnd(Animator animator) {
        if (VERSION.SDK_INT < 21 && this.f5329a.m8339d() != 0) {
            Snackbar.m8331a(this.f5329a);
        }
    }
}
