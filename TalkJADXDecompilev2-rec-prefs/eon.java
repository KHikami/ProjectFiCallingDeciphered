package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class eon implements jcc, kco, kcp, kcq {
    static final boolean f11934a = false;
    boolean f11935b;
    eov[] f11936c;
    final Handler f11937d = new Handler();
    Context f11938e;
    int f11939f = -1;
    gai f11940g;
    iid f11941h;
    final Runnable f11942i = new eop(this);
    private final fip f11943j = new eoo(this);

    static {
        kae kae = glk.f15559f;
    }

    public eon(Context context, kbu kbu) {
        this.f11938e = context;
        this.f11940g = (gai) jyn.m25426a(context, gai.class);
        kbu.m25514a((kcq) this);
        ((jca) jyn.m25426a(context, jca.class)).mo2318a(this);
        this.f11936c = new eov[]{new eoq(this), new eou(this), new eot(this), new eor(this)};
    }

    public void z_() {
        RealTimeChatService.m9040a(this.f11943j);
        m14183d();
    }

    public void A_() {
        RealTimeChatService.m9077b(this.f11943j);
    }

    public void mo1133a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        this.f11939f = i2;
        this.f11941h = ((iih) jyn.m25426a(this.f11938e, iih.class)).mo1979a(i2);
        m14183d();
    }

    public void m14182b() {
        this.f11935b = true;
        m14183d();
    }

    public void m14183d() {
        this.f11942i.run();
    }
}
