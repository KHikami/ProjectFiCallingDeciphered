package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dro extends euj<lvp, lvq> {
    private final int f10399a;
    private final int f10400b;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return drq.m12565a((lvq) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m12557a((lvp) nzf);
    }

    public dro(Context context, int i, int i2, drp drp) {
        super(jvc.newBuilder().m25299a(context, i).m25298a(), drp, "conversations/setgrouplinksharingenabled", fom.HANGOUTS_API, new lvp(), new lvq());
        this.f10399a = i;
        this.f10400b = i2;
    }

    public void mo1046a(int i, String str, Exception exception) {
        super.mo1046a(i, str, exception);
        evz d = mo1043d();
        if (d != null) {
            RealTimeChatService.m8998a(this.f10399a, d);
        }
    }

    private void m12557a(lvp lvp) {
        drp drp = (drp) this.f5790e;
        lqm lqm = new lqm();
        lqm.f26145b = blo.m5887c(drp.m12563d());
        lqm.f26144a = euk.m14555a(drp.m12564e());
        lqm.f26148e = Integer.valueOf(14);
        lvp.f26608a = lqm;
        lvp.requestHeader = m8100a(new esq().m14381a(this.f10399a).m14384b(this.f10400b).m14380a());
        lvp.f26609b = Integer.valueOf(drp.m12562c());
    }
}
