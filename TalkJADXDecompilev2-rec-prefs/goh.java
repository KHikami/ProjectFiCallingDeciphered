package p000;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.apps.hangouts.views.FadeImageView;

public final class goh implements AnimationListener {
    final /* synthetic */ FadeImageView f15789a;

    public goh(FadeImageView fadeImageView) {
        this.f15789a = fadeImageView;
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        this.f15789a.f6975b.setAnimationListener(null);
        this.f15789a.setBackgroundDrawable(this.f15789a.f6976c);
        this.f15789a.startAnimation(this.f15789a.f6974a);
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
