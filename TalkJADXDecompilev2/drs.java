package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class drs extends euj<lto, ltp> {
    private final int a;
    private final int b;

    protected /* synthetic */ evz a(nzf nzf) {
        return dru.a((ltp) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((lto) nzf);
    }

    public drs(Context context, int i, int i2, drt drt) {
        super(jvc.newBuilder().a(context, i).a(), drt, "conversations/opengroupconversationfromurl", fom.HANGOUTS_API, new lto(), new ltp());
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

    private void a(lto lto) {
        drt drt = (drt) this.e;
        lto.a = null;
        lto.requestHeader = a(new esq().a(this.a).b(this.b).a());
        lto.b = drt.c();
    }
}
