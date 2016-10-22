package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;

/* renamed from: dkb */
public final class dkb implements OnGlobalLayoutListener {
    final /* synthetic */ ParticipantTrayView a;

    public dkb(ParticipantTrayView participantTrayView) {
        this.a = participantTrayView;
    }

    public void onGlobalLayout() {
        this.a.d();
    }
}
