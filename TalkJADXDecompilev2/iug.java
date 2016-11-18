package defpackage;

import android.animation.Animator;

public final class iug extends iuf {
    public final Animator a;
    final Runnable b;
    private final iui c;
    private iuk d = new iuh(this);

    public static iug a(Animator animator, Runnable runnable) {
        Object iug = new iug(animator, runnable);
        animator.addListener(iug);
        return iug;
    }

    private iug(Animator animator, Runnable runnable) {
        this.a = animator;
        this.b = runnable;
        this.c = iui.a();
    }

    public void onAnimationEnd(Animator animator) {
        if (!a(animator)) {
            this.c.a(this.d);
        }
    }
}
