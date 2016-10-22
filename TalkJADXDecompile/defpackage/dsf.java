package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: dsf */
public final class dsf {
    private final int a;

    public dsf(int i) {
        this.a = i;
    }

    public boolean a() {
        return bnz.e(this.a).equals("RING") && bnz.f(this.a).equals("RING");
    }

    public void b() {
        RealTimeChatService.a(((fmf) jyn.a(gwb.H(), fmf.class)).a(), this.a);
    }
}
