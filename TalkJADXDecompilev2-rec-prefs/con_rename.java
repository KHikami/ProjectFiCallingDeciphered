package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class con extends euj<lui, luj> {
    private final int f8717a;
    private final int f8718b;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return cop.m10544a((luj) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m10534a((lui) nzf);
    }

    public con(Context context, int i, int i2, coo coo) {
        super(jvc.newBuilder().m25299a(context, i).m25298a(), coo, "conversations/removeuser", fom.HANGOUTS_API, new lui(), new luj());
        this.f8717a = i;
        this.f8718b = i2;
    }

    public void mo1046a(int i, String str, Exception exception) {
        super.mo1046a(i, str, exception);
        evz d = mo1043d();
        if (d != null) {
            RealTimeChatService.m8998a(this.f8717a, d);
        }
    }

    private void m10534a(lui lui) {
        coo coo = (coo) this.f5790e;
        lqm lqm = new lqm();
        lqm.f26145b = blo.m5887c(coo.m10541c());
        lqm.f26144a = euk.m14555a(coo.m10542d());
        lqm.f26148e = Integer.valueOf(5);
        lui.f26483a = lqm;
        lui.requestHeader = m8100a(new esq().m14381a(this.f8717a).m14384b(this.f8718b).m14380a());
        if (coo.m10543e() != null) {
            lui.f26484b = gwb.m2092c(coo.m10543e());
        }
    }
}
