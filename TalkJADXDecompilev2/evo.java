package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public class evo extends esw {
    private static final long serialVersionUID = 1;
    public final int c;
    public final boolean d;

    public nzf a(String str, int i, int i2) {
        if (a) {
            int i3 = this.c;
            String str2 = this.d ? " in a call." : " NOT in a call.";
            new StringBuilder(String.valueOf(str2).length() + 51).append("SetInCallPresenceRequest build protobuf ").append(i3).append(str2);
        }
        nzf lvr = new lvr();
        lrz lrz = new lrz();
        if (this.d) {
            boolean z;
            if (this.c > 0) {
                z = true;
            } else {
                z = false;
            }
            iil.a("Expected condition to be true", z);
            lrz.a = Integer.valueOf(100);
            lrz.b = Long.valueOf((long) this.c);
        } else {
            lrz.a = Integer.valueOf(0);
        }
        lvr.e = lrz;
        lvr.requestHeader = euk.a(str, i, i2, this.i);
        return lvr;
    }

    public String g() {
        return "presence/setpresence";
    }

    public String K_() {
        return "ui_queue";
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public long b() {
        return TimeUnit.SECONDS.toMillis((long) this.c);
    }

    public boolean a(ead ead) {
        iil.a(getClass(), ead.getClass());
        return true;
    }
}
