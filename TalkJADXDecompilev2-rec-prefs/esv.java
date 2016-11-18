package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class esv extends euj<lrm, lrn> {
    static final int[] f12211a = new int[]{7};
    static final int[] f12212b = new int[]{1, 2, 3, 4, 6, 8, 11, 12, 13, 15, 18, 20};
    private final int f12213u;
    private final bko f12214v;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return eyc.m14769a((lrn) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m14422a((lrm) nzf);
    }

    public esv(jvc jvc, int i, int i2, ffv ffv) {
        super(jvc, ffv, "contacts/getselfinfo", fom.HANGOUTS_API, new lrm(), new lrn());
        this.f12213u = i;
        this.f12214v = fde.m15018e(i2);
        ba.m4577a(!"SMS".equals(jvc.m25293b()));
    }

    private void m14422a(lrm lrm) {
        super.mo1041b(lrm);
        esq a = new esq().m14384b(this.f12213u).m14383a(true);
        if (this.f12214v != null) {
            a.m14381a(this.f12214v.m5638g());
        }
        lrm.requestHeader = m8100a(a.m14380a());
        lrm.f26220a = f12211a;
        lrm.f26221b = f12212b;
    }

    public void mo1046a(int i, String str, Exception exception) {
        if (m8076n() || exception != null) {
            glk.m17978c("Babel_GetSelfInfo", "Failed to get self info. ErrorCode: " + i, (Throwable) exception);
        } else if (mo1043d() != null && this.f12214v != null) {
            int g = this.f12214v.m5638g();
            jcf jcf = (jcf) jyn.m25426a(this.g, jcf.class);
            jck b = jcf.mo3464b(g);
            m14425a(b);
            b.m23891d();
            RealTimeChatService.m9014a(this.f12214v, ((fuz) jyn.m25426a(this.g, fuz.class)).m16296d(g));
            RealTimeChatService.m9069b(this.f12214v);
            fde.m15002a(jcf, g);
        }
    }

    public void m14425a(jck jck) {
        eyc eyc = (eyc) mo1043d();
        edk k = eyc.m14770k();
        if (glk.m17973a("Babel_GetSelfInfo", 3)) {
            String valueOf = String.valueOf(k.f11213b);
            glk.m17970a("Babel_GetSelfInfo", new StringBuilder(String.valueOf(valueOf).length() + 47).append("processResponse for GetSelfInfo, participantId=").append(valueOf).toString(), new Object[0]);
        }
        if (k.f11213b == null) {
            glk.m17982e("Babel_GetSelfInfo", "processResponse for GetSelfInfo, participantId is null.", new Object[0]);
        } else if (k.f11213b.f11245b == null) {
            glk.m17982e("Babel_GetSelfInfo", "processResponse for GetSelfInfo, participantId.chatId is null.", new Object[0]);
        }
        for (eso eso : eyc.m14777r()) {
            eso a = fdq.m15088a(eso.m14369b());
            if (a != null) {
                a.m14367a(jck, eso);
                a.m14368a(eso.m14372c());
            } else {
                String str = "Babel_GetSelfInfo";
                String str2 = "Unknown experiment ";
                String valueOf2 = String.valueOf(eso.m14369b());
                glk.m17970a(str, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), new Object[0]);
            }
        }
        int s = eyc.m14778s();
        if (!(this.f12214v == null || s == 0)) {
            if (fdq.f12773O.m14370b(this.f12214v.m5638g())) {
                ((fuz) jyn.m25426a(this.g, fuz.class)).m16293b(this.f12214v.m5638g(), s);
            }
        }
        bkq.m5672a(jck, k.f11213b, k.f11216e, k.f11224m, k.f11235x, k.f11219h, eyc.m14771l(), eyc.m14773n(), k.f11227p);
        for (ffw a2 : jyn.m25438c(this.g, ffw.class)) {
            a2.mo536a(jck, eyc);
        }
        if (eyc.m14774o()) {
            jck.mo3444c("dnd_expiration", eyc.m14775p());
        } else {
            jck.mo3444c("dnd_expiration", 0);
        }
        if (eyc.m14776q() != null) {
            RealTimeChatService.m9061a(jck, eyc.m14776q());
        }
        jck.mo3444c("setting_time", glj.m17956a());
    }

    public esv(Context context, int i, int i2, ffv ffv) {
        this(jvc.newBuilder().m25299a(context, i).m25302a(new juv()).m25298a(), i2, i, ffv);
    }
}
