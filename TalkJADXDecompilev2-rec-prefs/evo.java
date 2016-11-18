package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public class evo extends esw {
    private static final long serialVersionUID = 1;
    public final int f12375c;
    public final boolean f12376d;

    public nzf mo1944a(String str, int i, int i2) {
        if (a) {
            int i3 = this.f12375c;
            String str2 = this.f12376d ? " in a call." : " NOT in a call.";
            new StringBuilder(String.valueOf(str2).length() + 51).append("SetInCallPresenceRequest build protobuf ").append(i3).append(str2);
        }
        nzf lvr = new lvr();
        lrz lrz = new lrz();
        if (this.f12376d) {
            boolean z;
            if (this.f12375c > 0) {
                z = true;
            } else {
                z = false;
            }
            iil.m21874a("Expected condition to be true", z);
            lrz.f26292a = Integer.valueOf(100);
            lrz.f26293b = Long.valueOf((long) this.f12375c);
        } else {
            lrz.f26292a = Integer.valueOf(0);
        }
        lvr.f26616e = lrz;
        lvr.requestHeader = euk.m14556a(str, i, i2, this.i);
        return lvr;
    }

    public String mo1947g() {
        return "presence/setpresence";
    }

    public String K_() {
        return "ui_queue";
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public long mo1017b() {
        return TimeUnit.SECONDS.toMillis((long) this.f12375c);
    }

    public boolean mo1015a(ead ead) {
        iil.m21869a(getClass(), ead.getClass());
        return true;
    }
}
