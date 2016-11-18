package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class drs extends euj<lto, ltp> {
    private final int f10408a;
    private final int f10409b;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return dru.m12575a((ltp) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m12569a((lto) nzf);
    }

    public drs(Context context, int i, int i2, drt drt) {
        super(jvc.newBuilder().m25299a(context, i).m25298a(), drt, "conversations/opengroupconversationfromurl", fom.HANGOUTS_API, new lto(), new ltp());
        this.f10408a = i;
        this.f10409b = i2;
    }

    public void mo1046a(int i, String str, Exception exception) {
        super.mo1046a(i, str, exception);
        evz d = mo1043d();
        if (d != null) {
            RealTimeChatService.m8998a(this.f10408a, d);
        }
    }

    private void m12569a(lto lto) {
        drt drt = (drt) this.f5790e;
        lto.f26393a = null;
        lto.requestHeader = m8100a(new esq().m14381a(this.f10408a).m14384b(this.f10409b).m14380a());
        lto.f26394b = drt.m12574c();
    }
}
