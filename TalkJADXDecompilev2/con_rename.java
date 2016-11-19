package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class con extends euj<lui, luj> {
    private final int a;
    private final int b;

    protected /* synthetic */ evz a(nzf nzf) {
        return cop.a((luj) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((lui) nzf);
    }

    public con(Context context, int i, int i2, coo coo) {
        super(jvc.newBuilder().a(context, i).a(), coo, "conversations/removeuser", fom.HANGOUTS_API, new lui(), new luj());
        this.a = i;
        this.b = i2;
    }

    public void a(int i, String str, Exception exception) {
        super.a(i, str, exception);
        evz d = d();
        if (d != null) {
            RealTimeChatService.a(this.a, d);
        }
    }

    private void a(lui lui) {
        coo coo = (coo) this.e;
        lqm lqm = new lqm();
        lqm.b = blo.c(coo.c());
        lqm.a = euk.a(coo.d());
        lqm.e = Integer.valueOf(5);
        lui.a = lqm;
        lui.requestHeader = a(new esq().a(this.a).b(this.b).a());
        if (coo.e() != null) {
            lui.b = gwb.c(coo.e());
        }
    }
}
