package defpackage;

import android.view.View;

/* renamed from: bwa */
public final class bwa implements btn {
    public fwy[] a() {
        return new fwy[]{fwy.OUTGOING_USER_MESSAGE, fwy.INCOMING_USER_MESSAGE};
    }

    public int a(fwy fwy) {
        if (fwy == fwy.OUTGOING_USER_MESSAGE) {
            return ba.hz;
        }
        if (fwy == fwy.INCOMING_USER_MESSAGE) {
            return ba.hu;
        }
        String valueOf = String.valueOf(fwy);
        iil.a(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Not supported MessageType: ").append(valueOf).toString());
        return -1;
    }

    public btm a(dr drVar, View view) {
        return new bvu(drVar, view);
    }
}
