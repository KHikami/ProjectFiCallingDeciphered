package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: evn */
public class evn extends esw {
    private static final long serialVersionUID = 1;
    public final long c;

    public evn(long j) {
        this.c = j;
    }

    public nzf a(String str, int i, int i2) {
        long j;
        if (a) {
            new StringBuilder(57).append("SetDndPresenceRequest build protobuf ").append(this.c);
        }
        nzf lvr = new lvr();
        lpt lpt = new lpt();
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(TimeUnit.MICROSECONDS.toMillis(this.c) - glj.a());
        lpt.a = Boolean.valueOf(toSeconds > 0);
        if (toSeconds > 0) {
            j = toSeconds;
        } else {
            j = 0;
        }
        lpt.b = Long.valueOf(j);
        lvr.b = lpt;
        lvr.requestHeader = euk.a(str, i, i2, this.i);
        return lvr;
    }

    public String g() {
        return "presence/setpresence";
    }

    public String K_() {
        return "ui_queue";
    }

    public boolean a(ead ead) {
        iil.a(getClass(), ead.getClass());
        return true;
    }
}
