package p000;

import android.telephony.PhoneStateListener;
import com.google.android.apps.hangouts.hangout.IncomingRing;

final class dgi extends PhoneStateListener {
    final /* synthetic */ dgg f9700a;

    dgi(dgg dgg) {
        this.f9700a = dgg;
    }

    public void onCallStateChanged(int i, String str) {
        if (i == 2) {
            if (this.f9700a.f9694q != null) {
                this.f9700a.f9694q.m11973b(11006);
            }
            IncomingRing incomingRing = IncomingRing.f6355b;
            if (incomingRing != null) {
                incomingRing.m8645n();
            }
        }
    }
}
