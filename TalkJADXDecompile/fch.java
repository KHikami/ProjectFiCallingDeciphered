import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.quickreply.impl.QuickReplyActivity;

public final class fch implements AnimatorListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ QuickReplyActivity b;

    fch(QuickReplyActivity quickReplyActivity, boolean z) {
        this.b = quickReplyActivity;
        this.a = z;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.a) {
            QuickReplyActivity quickReplyActivity = this.b;
            quickReplyActivity.q.setBackgroundDrawable(quickReplyActivity.getResources().getDrawable(gwb.ug));
            quickReplyActivity.q.clearColorFilter();
            return;
        }
        this.b.j();
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
