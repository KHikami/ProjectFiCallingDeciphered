package defpackage;

import android.telephony.PhoneStateListener;
import com.google.android.apps.hangouts.hangout.IncomingRing;

/* renamed from: dgi */
final class dgi extends PhoneStateListener {
    final /* synthetic */ dgg a;

    dgi(dgg dgg) {
        this.a = dgg;
    }

    public void onCallStateChanged(int i, String str) {
        if (i == 2) {
            if (this.a.q != null) {
                this.a.q.b(11006);
            }
            IncomingRing incomingRing = IncomingRing.b;
            if (incomingRing != null) {
                incomingRing.n();
            }
        }
    }
}
