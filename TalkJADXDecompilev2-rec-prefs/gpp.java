package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class gpp implements AnimatorListener {
    final /* synthetic */ MessageListItemView f15877a;

    public gpp(MessageListItemView messageListItemView) {
        this.f15877a = messageListItemView;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
        m18280a();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        m18280a();
    }

    private void m18280a() {
        this.f15877a.f7070a.f7134f.setVisibility(8);
        this.f15877a.f7070a.f7132d.m9608a(0.0f);
    }
}
