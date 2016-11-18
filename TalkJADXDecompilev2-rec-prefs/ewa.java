package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ewa extends evz {
    private static final long serialVersionUID = 1;
    private final String f12404g;

    ewa(ohz ohz) {
        String str = (ohz == null || ohz.b == null) ? null : ohz.b.a;
        this.f12404g = str;
    }

    public String m14700k() {
        return this.f12404g;
    }

    public void mo1958a(Context context, bko bko) {
        RealTimeChatService.f6752i.post(new fhy(this));
    }
}
