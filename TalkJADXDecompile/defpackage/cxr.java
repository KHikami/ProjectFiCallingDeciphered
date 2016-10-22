package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;

/* renamed from: cxr */
public final class cxr extends AnimatorListenerAdapter {
    final /* synthetic */ FloatingActionButton a;

    public cxr(FloatingActionButton floatingActionButton) {
        this.a = floatingActionButton;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.a.g == cxu.a) {
            this.a.b = this.a.d;
            this.a.c = this.a.e;
        }
        this.a.d = -1;
        this.a.e = null;
        this.a.f = 0.0f;
        this.a.invalidate();
    }
}
