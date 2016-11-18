package p000;

import java.util.concurrent.TimeUnit;

public class evn extends esw {
    private static final long serialVersionUID = 1;
    public final long f12374c;

    public evn(long j) {
        this.f12374c = j;
    }

    public nzf mo1944a(String str, int i, int i2) {
        long j;
        if (a) {
            new StringBuilder(57).append("SetDndPresenceRequest build protobuf ").append(this.f12374c);
        }
        nzf lvr = new lvr();
        lpt lpt = new lpt();
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(TimeUnit.MICROSECONDS.toMillis(this.f12374c) - glj.m17956a());
        lpt.f26025a = Boolean.valueOf(toSeconds > 0);
        if (toSeconds > 0) {
            j = toSeconds;
        } else {
            j = 0;
        }
        lpt.f26026b = Long.valueOf(j);
        lvr.f26613b = lpt;
        lvr.requestHeader = euk.m14556a(str, i, i2, this.i);
        return lvr;
    }

    public String mo1947g() {
        return "presence/setpresence";
    }

    public String K_() {
        return "ui_queue";
    }

    public boolean mo1015a(ead ead) {
        iil.m21869a(getClass(), ead.getClass());
        return true;
    }
}
