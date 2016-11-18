package p000;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;

public final class dkb implements OnGlobalLayoutListener {
    final /* synthetic */ ParticipantTrayView f9985a;

    public dkb(ParticipantTrayView participantTrayView) {
        this.f9985a = participantTrayView;
    }

    public void onGlobalLayout() {
        this.f9985a.m8666d();
    }
}
