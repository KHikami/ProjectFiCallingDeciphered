package defpackage;

import android.content.Context;

public class euq extends esw {
    private static final long serialVersionUID = 1;
    public final int c;

    public euq(int i) {
        this.c = i;
        if (glk.a("BabelClient", 3)) {
            glk.b("BabelClient", "declineAllInvitesRequest constructor", new Object[0]);
        }
    }

    public nzf a(String str, int i, int i2) {
        if (glk.a("BabelClient", 3)) {
            glk.b("BabelClient", "declineAllInvitesRequest build protobuf", new Object[0]);
        }
        nzf lpc = new lpc();
        lpc.requestHeader = euk.a(null, true, str, i, i2, this.i);
        lpd lpd = new lpd();
        lpd.b = Integer.valueOf(this.c);
        lpc.a = new lpd[1];
        lpc.a[0] = lpd;
        return lpc;
    }

    public String g() {
        return "conversations/declineallinvites";
    }

    public String K_() {
        return "event_queue";
    }

    public void a(Context context, bko bko, fdo fdo) {
        super.a(context, bko, fdo);
    }

    public int i() {
        return 4;
    }
}
