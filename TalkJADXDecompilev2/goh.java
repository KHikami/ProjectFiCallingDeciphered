package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.apps.hangouts.views.FadeImageView;

public final class goh implements AnimationListener {
    final /* synthetic */ FadeImageView a;

    public goh(FadeImageView fadeImageView) {
        this.a = fadeImageView;
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        this.a.b.setAnimationListener(null);
        this.a.setBackgroundDrawable(this.a.c);
        this.a.startAnimation(this.a.a);
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
