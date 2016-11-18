package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.views.ConversationListItemWrapper;

public final class gnt implements AnimatorListener {
    final /* synthetic */ Runnable f15743a;
    final /* synthetic */ ConversationListItemWrapper f15744b;

    public gnt(ConversationListItemWrapper conversationListItemWrapper, Runnable runnable) {
        this.f15744b = conversationListItemWrapper;
        this.f15743a = runnable;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f15743a.run();
    }
}
