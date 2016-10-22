import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class gpp implements AnimatorListener {
    final /* synthetic */ MessageListItemView a;

    public gpp(MessageListItemView messageListItemView) {
        this.a = messageListItemView;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
        a();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        a();
    }

    private void a() {
        this.a.a.f.setVisibility(8);
        this.a.a.d.a(0.0f);
    }
}
