package p000;

import android.content.Context;

public class evj extends esw {
    private static final long serialVersionUID = 1;
    public final String f12365c;

    public evj(String str) {
        this.f12365c = str;
    }

    public nzf mo1944a(String str, int i, int i2) {
        ltn ltn = new ltn();
        if (this.f12365c != null) {
            ltn.f26390a = Integer.valueOf(1);
            ltn.f26392c = this.f12365c;
        }
        nzf lva = new lva();
        lva.requestHeader = euk.m14556a(str, i, i2, this.i);
        lva.f26572a = ltn;
        return lva;
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public String mo1947g() {
        return "devices/sendoffnetworkinvitation";
    }
}
