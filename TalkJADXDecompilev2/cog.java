package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cog extends euj<lte, ltf> {
    private final int a;
    private final int b;

    protected /* synthetic */ evz a(nzf nzf) {
        return coi.a((ltf) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((lte) nzf);
    }

    public cog(Context context, int i, int i2, coh coh) {
        super(jvc.newBuilder().a(context, i).a(), coh, "conversations/modifyotrstatus", fom.HANGOUTS_API, new lte(), new ltf());
        this.a = i;
        this.b = i2;
    }

    public void a(int i, String str, Exception exception) {
        evz d = d();
        if (d != null) {
            RealTimeChatService.a(this.a, d);
        }
    }

    private void a(lte lte) {
        coh coh = (coh) this.e;
        lqm lqm = new lqm();
        lqm.b = blo.c(coh.c());
        lqm.a = euk.a(coh.d());
        lqm.e = Integer.valueOf(9);
        lte.a = lqm;
        lte.requestHeader = a(new esq().a(this.a).b(this.b).a());
        lte.b = Integer.valueOf(coh.e());
    }
}
