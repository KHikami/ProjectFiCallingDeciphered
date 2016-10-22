package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.views.ConversationListItemWrapper;

/* renamed from: gnt */
public final class gnt implements AnimatorListener {
    final /* synthetic */ Runnable a;
    final /* synthetic */ ConversationListItemWrapper b;

    public gnt(ConversationListItemWrapper conversationListItemWrapper, Runnable runnable) {
        this.b = conversationListItemWrapper;
        this.a = runnable;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.a.run();
    }
}
