package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.apps.hangouts.elane.FilmstripParticipantView;

/* renamed from: ctc */
public final class ctc implements AnimationListener {
    final /* synthetic */ FilmstripParticipantView a;

    public ctc(FilmstripParticipantView filmstripParticipantView) {
        this.a = filmstripParticipantView;
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        this.a.f.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
