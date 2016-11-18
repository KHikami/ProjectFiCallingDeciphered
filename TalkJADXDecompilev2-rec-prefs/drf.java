package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class drf extends euj<lri, lrj> {
    private final int f10386a;
    private final int f10387b;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return drh.m12548a((lrj) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m12540a((lri) nzf);
    }

    public drf(Context context, int i, int i2, drg drg) {
        super(jvc.newBuilder().m25299a(context, i).m25298a(), drg, "conversations/getgroupconversationurl", fom.HANGOUTS_API, new lri(), new lrj());
        this.f10386a = i;
        this.f10387b = i2;
    }

    public void mo1046a(int i, String str, Exception exception) {
        super.mo1046a(i, str, exception);
        evz d = mo1043d();
        if (d != null) {
            RealTimeChatService.m8998a(this.f10386a, d);
        }
    }

    private void m12540a(lri lri) {
        drg drg = (drg) this.f5790e;
        lri.requestHeader = m8100a(new esq().m14381a(this.f10386a).m14384b(this.f10387b).m14380a());
        lri.f26215a = euk.m14555a(drg.m12547c());
    }
}
