package defpackage;

import android.telecom.Call;
import android.telecom.Call.Callback;
import android.telecom.Call.Details;

/* compiled from: PG */
/* renamed from: bbr */
final class bbr extends Callback {
    private /* synthetic */ bbq a;

    bbr(bbq bbq) {
        this.a = bbq;
    }

    public final void onDetailsChanged(Call call, Details details) {
        bbq bbq = this.a;
        if (call.getDetails().hasProperty(64)) {
            for (bbs c : bbq.b) {
                c.c(call);
            }
            return;
        }
        bbq.a(call);
        for (bbs c2 : bbq.b) {
            c2.d(call);
        }
    }
}
