package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cog extends euj<lte, ltf> {
    private final int f5816a;
    private final int f5817b;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return coi.m8160a((ltf) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m8150a((lte) nzf);
    }

    public cog(Context context, int i, int i2, coh coh) {
        super(jvc.newBuilder().m25299a(context, i).m25298a(), coh, "conversations/modifyotrstatus", fom.HANGOUTS_API, new lte(), new ltf());
        this.f5816a = i;
        this.f5817b = i2;
    }

    public void mo1046a(int i, String str, Exception exception) {
        evz d = mo1043d();
        if (d != null) {
            RealTimeChatService.m8998a(this.f5816a, d);
        }
    }

    private void m8150a(lte lte) {
        coh coh = (coh) this.f5790e;
        lqm lqm = new lqm();
        lqm.f26145b = blo.m5887c(coh.m8157c());
        lqm.f26144a = euk.m14555a(coh.m8158d());
        lqm.f26148e = Integer.valueOf(9);
        lte.f26368a = lqm;
        lte.requestHeader = m8100a(new esq().m14381a(this.f5816a).m14384b(this.f5817b).m14380a());
        lte.f26369b = Integer.valueOf(coh.m8159e());
    }
}
