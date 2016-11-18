package p000;

import android.animation.Animator;

public final class iug extends iuf {
    public final Animator f19038a;
    final Runnable f19039b;
    private final iui f19040c;
    private iuk f19041d = new iuh(this);

    public static iug m23306a(Animator animator, Runnable runnable) {
        Object iug = new iug(animator, runnable);
        animator.addListener(iug);
        return iug;
    }

    private iug(Animator animator, Runnable runnable) {
        this.f19038a = animator;
        this.f19039b = runnable;
        this.f19040c = iui.m23311a();
    }

    public void onAnimationEnd(Animator animator) {
        if (!m23305a(animator)) {
            this.f19040c.mo3400a(this.f19041d);
        }
    }
}
