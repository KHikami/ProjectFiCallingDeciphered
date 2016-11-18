package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class iuf extends AnimatorListenerAdapter {
    private lo<Animator, Boolean> f19037a = new lo();

    public void onAnimationStart(Animator animator) {
        this.f19037a.put(animator, Boolean.valueOf(false));
    }

    public void onAnimationCancel(Animator animator) {
        this.f19037a.put(animator, Boolean.valueOf(true));
    }

    public final boolean m23305a(Animator animator) {
        return this.f19037a.containsKey(animator) && ((Boolean) this.f19037a.get(animator)).booleanValue();
    }
}
