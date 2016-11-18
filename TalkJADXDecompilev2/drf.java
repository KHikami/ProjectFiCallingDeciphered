package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class drf extends euj<lri, lrj> {
    private final int a;
    private final int b;

    protected /* synthetic */ evz a(nzf nzf) {
        return drh.a((lrj) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((lri) nzf);
    }

    public drf(Context context, int i, int i2, drg drg) {
        super(jvc.newBuilder().a(context, i).a(), drg, "conversations/getgroupconversationurl", fom.HANGOUTS_API, new lri(), new lrj());
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

    private void a(lri lri) {
        drg drg = (drg) this.e;
        lri.requestHeader = a(new esq().a(this.a).b(this.b).a());
        lri.a = euk.a(drg.c());
    }
}
