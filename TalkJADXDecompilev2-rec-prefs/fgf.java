package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fgf extends fgg<ete, eyj> {
    public fgf(Context context, int i, fgh fgh) {
        super(context, i, fgh, bc.ui);
    }

    protected int mo1990h() {
        return gwb.m1492a(gwb.m1400H(), "babel_get_voice_account_info_request_timeout_millis", 20000);
    }

    public void mo1480a(fme fme) {
        RealTimeChatService.m9078b(fme, this.d);
    }

    public Class<ete> mo1481d() {
        return ete.class;
    }

    public Class<eyj> mo1482e() {
        return eyj.class;
    }
}
