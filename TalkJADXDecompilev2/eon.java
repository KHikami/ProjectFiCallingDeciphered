package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class eon implements jcc, kco, kcp, kcq {
    static final boolean a = false;
    boolean b;
    eov[] c;
    final Handler d = new Handler();
    Context e;
    int f = -1;
    gai g;
    iid h;
    final Runnable i = new eop(this);
    private final fip j = new eoo(this);

    static {
        kae kae = glk.f;
    }

    public eon(Context context, kbu kbu) {
        this.e = context;
        this.g = (gai) jyn.a(context, gai.class);
        kbu.a((kcq) this);
        ((jca) jyn.a(context, jca.class)).a(this);
        this.c = new eov[]{new eoq(this), new eou(this), new eot(this), new eor(this)};
    }

    public void z_() {
        RealTimeChatService.a(this.j);
        d();
    }

    public void A_() {
        RealTimeChatService.b(this.j);
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        this.f = i2;
        this.h = ((iih) jyn.a(this.e, iih.class)).a(i2);
        d();
    }

    public void b() {
        this.b = true;
        d();
    }

    public void d() {
        this.i.run();
    }
}
