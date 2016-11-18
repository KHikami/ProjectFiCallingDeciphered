package p000;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.apps.hangouts.elane.FilmstripParticipantView;

public final class ctc implements AnimationListener {
    final /* synthetic */ FilmstripParticipantView f9022a;

    public ctc(FilmstripParticipantView filmstripParticipantView) {
        this.f9022a = filmstripParticipantView;
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        this.f9022a.f6143f.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
