package p000;

import android.view.View;

public final class bwa implements btn {
    public fwy[] mo758a() {
        return new fwy[]{fwy.OUTGOING_USER_MESSAGE, fwy.INCOMING_USER_MESSAGE};
    }

    public int mo756a(fwy fwy) {
        if (fwy == fwy.OUTGOING_USER_MESSAGE) {
            return ba.hz;
        }
        if (fwy == fwy.INCOMING_USER_MESSAGE) {
            return ba.hu;
        }
        String valueOf = String.valueOf(fwy);
        iil.m21870a(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Not supported MessageType: ").append(valueOf).toString());
        return -1;
    }

    public btm mo757a(dr drVar, View view) {
        return new bvu(drVar, view);
    }
}
