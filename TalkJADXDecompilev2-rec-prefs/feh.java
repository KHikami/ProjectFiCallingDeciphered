package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class feh implements bhg, bhm {
    private static final gma f12890a = gma.m18073a("Babel_ConcNetwork");
    private final evz f12891b;
    private final int f12892c;

    public int mo539a(Context context, bhb bhb) {
        bko e = fde.m15018e(this.f12892c);
        RealTimeChatService.m9029a(e, RealTimeChatService.m8988a(context, e, fde.m15019e(e), this.f12891b, null));
        gma gma = f12890a;
        String valueOf = String.valueOf("RES_");
        String valueOf2 = String.valueOf(this.f12891b.m8129c());
        gma.m18079c(new StringBuilder((String.valueOf(valueOf).length() + 12) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).append("_").append(this.f12891b.m8127b()).toString());
        faz.f12604a.m18079c(faz.m14869a(this.f12891b.m8129c()));
        return bhn.f3348a;
    }

    public feh(evz evz, int i) {
        this.f12891b = evz;
        this.f12892c = i;
        gma gma = f12890a;
        String valueOf = String.valueOf("RES_");
        String valueOf2 = String.valueOf(evz.m8129c());
        gma.m18078b(new StringBuilder((String.valueOf(valueOf).length() + 12) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).append("_").append(evz.m8127b()).toString());
    }
}
