package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;

public final class cxr extends AnimatorListenerAdapter {
    final /* synthetic */ FloatingActionButton f9268a;

    public cxr(FloatingActionButton floatingActionButton) {
        this.f9268a = floatingActionButton;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.f9268a.f6218g == cxu.f9271a) {
            this.f9268a.f6213b = this.f9268a.f6215d;
            this.f9268a.f6214c = this.f9268a.f6216e;
        }
        this.f9268a.f6215d = -1;
        this.f9268a.f6216e = null;
        this.f9268a.f6217f = 0.0f;
        this.f9268a.invalidate();
    }
}
