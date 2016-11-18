package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ewi extends evz {
    private static final long serialVersionUID = 1;
    private final String g;

    ewi(lyj lyj) {
        if (lyj.a != null) {
            this.g = lyj.a.a;
        } else {
            this.g = null;
        }
        if (evz.a) {
            String valueOf = String.valueOf(lyj);
            new StringBuilder(String.valueOf(valueOf).length() + 29).append("CreateHangoutIdResponse from:").append(valueOf);
        }
    }

    public String k() {
        return this.g;
    }

    public void a(Context context, bko bko) {
        RealTimeChatService.i.post(new fhz(this));
    }
}
