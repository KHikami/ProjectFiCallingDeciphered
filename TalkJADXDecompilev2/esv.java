package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class esv extends euj<lrm, lrn> {
    static final int[] a = new int[]{7};
    static final int[] b = new int[]{1, 2, 3, 4, 6, 8, 11, 12, 13, 15, 18, 20};
    private final int u;
    private final bko v;

    protected /* synthetic */ evz a(nzf nzf) {
        return eyc.a((lrn) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((lrm) nzf);
    }

    public esv(jvc jvc, int i, int i2, ffv ffv) {
        super(jvc, ffv, "contacts/getselfinfo", fom.HANGOUTS_API, new lrm(), new lrn());
        this.u = i;
        this.v = fde.e(i2);
        ba.a(!"SMS".equals(jvc.b()));
    }

    private void a(lrm lrm) {
        super.b(lrm);
        esq a = new esq().b(this.u).a(true);
        if (this.v != null) {
            a.a(this.v.g());
        }
        lrm.requestHeader = a(a.a());
        lrm.a = a;
        lrm.b = b;
    }

    public void a(int i, String str, Exception exception) {
        if (n() || exception != null) {
            glk.c("Babel_GetSelfInfo", "Failed to get self info. ErrorCode: " + i, (Throwable) exception);
        } else if (d() != null && this.v != null) {
            int g = this.v.g();
            jcf jcf = (jcf) jyn.a(this.g, jcf.class);
            jck b = jcf.b(g);
            a(b);
            b.d();
            RealTimeChatService.a(this.v, ((fuz) jyn.a(this.g, fuz.class)).d(g));
            RealTimeChatService.b(this.v);
            fde.a(jcf, g);
        }
    }

    public void a(jck jck) {
        eyc eyc = (eyc) d();
        edk k = eyc.k();
        if (glk.a("Babel_GetSelfInfo", 3)) {
            String valueOf = String.valueOf(k.b);
            glk.a("Babel_GetSelfInfo", new StringBuilder(String.valueOf(valueOf).length() + 47).append("processResponse for GetSelfInfo, participantId=").append(valueOf).toString(), new Object[0]);
        }
        if (k.b == null) {
            glk.e("Babel_GetSelfInfo", "processResponse for GetSelfInfo, participantId is null.", new Object[0]);
        } else if (k.b.b == null) {
            glk.e("Babel_GetSelfInfo", "processResponse for GetSelfInfo, participantId.chatId is null.", new Object[0]);
        }
        for (eso eso : eyc.r()) {
            eso a = fdq.a(eso.b());
            if (a != null) {
                a.a(jck, eso);
                a.a(eso.c());
            } else {
                String str = "Babel_GetSelfInfo";
                String str2 = "Unknown experiment ";
                String valueOf2 = String.valueOf(eso.b());
                glk.a(str, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), new Object[0]);
            }
        }
        int s = eyc.s();
        if (!(this.v == null || s == 0)) {
            if (fdq.O.b(this.v.g())) {
                ((fuz) jyn.a(this.g, fuz.class)).b(this.v.g(), s);
            }
        }
        bkq.a(jck, k.b, k.e, k.m, k.x, k.h, eyc.l(), eyc.n(), k.p);
        for (ffw a2 : jyn.c(this.g, ffw.class)) {
            a2.a(jck, eyc);
        }
        if (eyc.o()) {
            jck.c("dnd_expiration", eyc.p());
        } else {
            jck.c("dnd_expiration", 0);
        }
        if (eyc.q() != null) {
            RealTimeChatService.a(jck, eyc.q());
        }
        jck.c("setting_time", glj.a());
    }

    public esv(Context context, int i, int i2, ffv ffv) {
        this(jvc.newBuilder().a(context, i).a(new juv()).a(), i2, i, ffv);
    }
}
