package defpackage;

import com.google.android.apps.hangouts.hangout.ParticipantOverlays;

public final class djz extends itg {
    final /* synthetic */ ParticipantOverlays a;

    public djz(ParticipantOverlays participantOverlays) {
        this.a = participantOverlays;
        super('\u0000');
    }

    public void d(itl itl) {
        if (this.a.a != null && this.a.a.equals(itl)) {
            for (djy a : this.a.b) {
                a.a(itl);
            }
        }
    }
}
