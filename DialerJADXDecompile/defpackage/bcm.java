package defpackage;

import android.telephony.PhoneStateListener;

/* compiled from: PG */
/* renamed from: bcm */
final class bcm extends PhoneStateListener {
    private /* synthetic */ bcj a;

    bcm(bcj bcj) {
        this.a = bcj;
    }

    public final void onCallStateChanged(int i, String str) {
        if (i == 1 && !buf.C(this.a.i)) {
            this.a.t.a(this.a.j, str, buf.g(this.a.i));
        }
    }
}
