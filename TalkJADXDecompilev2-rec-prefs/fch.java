package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.quickreply.impl.QuickReplyActivity;

public final class fch implements AnimatorListener {
    final /* synthetic */ boolean f12686a;
    final /* synthetic */ QuickReplyActivity f12687b;

    fch(QuickReplyActivity quickReplyActivity, boolean z) {
        this.f12687b = quickReplyActivity;
        this.f12686a = z;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.f12686a) {
            QuickReplyActivity quickReplyActivity = this.f12687b;
            quickReplyActivity.f6723q.setBackgroundDrawable(quickReplyActivity.getResources().getDrawable(gwb.ug));
            quickReplyActivity.f6723q.clearColorFilter();
            return;
        }
        this.f12687b.mo1085j();
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
