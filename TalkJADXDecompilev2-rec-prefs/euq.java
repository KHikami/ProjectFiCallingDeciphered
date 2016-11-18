package p000;

import android.content.Context;

public class euq extends esw {
    private static final long serialVersionUID = 1;
    public final int f12311c;

    public euq(int i) {
        this.f12311c = i;
        if (glk.m17973a("BabelClient", 3)) {
            glk.m17976b("BabelClient", "declineAllInvitesRequest constructor", new Object[0]);
        }
    }

    public nzf mo1944a(String str, int i, int i2) {
        if (glk.m17973a("BabelClient", 3)) {
            glk.m17976b("BabelClient", "declineAllInvitesRequest build protobuf", new Object[0]);
        }
        nzf lpc = new lpc();
        lpc.requestHeader = euk.m14557a(null, true, str, i, i2, this.i);
        lpd lpd = new lpd();
        lpd.f25988b = Integer.valueOf(this.f12311c);
        lpc.f25985a = new lpd[1];
        lpc.f25985a[0] = lpd;
        return lpc;
    }

    public String mo1947g() {
        return "conversations/declineallinvites";
    }

    public String K_() {
        return "event_queue";
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        super.mo1945a(context, bko, fdo);
    }

    public int mo1957i() {
        return 4;
    }
}
