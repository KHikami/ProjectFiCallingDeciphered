package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ewi extends evz {
    private static final long serialVersionUID = 1;
    private final String f12413g;

    ewi(lyj lyj) {
        if (lyj.f26895a != null) {
            this.f12413g = lyj.f26895a.f26866a;
        } else {
            this.f12413g = null;
        }
        if (evz.f5798a) {
            String valueOf = String.valueOf(lyj);
            new StringBuilder(String.valueOf(valueOf).length() + 29).append("CreateHangoutIdResponse from:").append(valueOf);
        }
    }

    public String m14714k() {
        return this.f12413g;
    }

    public void mo1958a(Context context, bko bko) {
        RealTimeChatService.f6752i.post(new fhz(this));
    }
}
