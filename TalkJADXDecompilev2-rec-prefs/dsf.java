package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dsf {
    private final int f10434a;

    public dsf(int i) {
        this.f10434a = i;
    }

    public boolean m12608a() {
        return bnz.m6279e(this.f10434a).equals("RING") && bnz.m6280f(this.f10434a).equals("RING");
    }

    public void m12609b() {
        RealTimeChatService.m9042a(((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2035a(), this.f10434a);
    }
}
