package p000;

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public final class fqb implements fqd {
    private static final long serialVersionUID = 1;
    private final List<gkv<Integer, Boolean>> f13729a;

    public fqb(lut lut) {
        this.f13729a = new ArrayList(lut.f26531a.length);
        for (lus lus : lut.f26531a) {
            this.f13729a.add(new gkv(lus.f26529a, lus.f26530b));
        }
    }

    public void mo2060a(int i, mfa<Intent> mfa_android_content_Intent) {
        bko e = fde.m15018e(i);
        jck b = ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3464b(i);
        RealTimeChatService.m9061a(b, this.f13729a);
        b.m23891d();
        RealTimeChatService.m9069b(e);
    }
}
