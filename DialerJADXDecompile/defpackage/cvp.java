package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: cvp */
final class cvp implements Runnable {
    private /* synthetic */ cvo a;

    cvp(cvo cvo) {
        this.a = cvo;
    }

    public final void run() {
        cwj cwj = this.a.c;
        Context context = this.a.b;
        if (!cwj.c && cwj.b) {
            cwj.a(context);
            context.registerReceiver(new cwk(), new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
        }
        cvo cvo = this.a;
        if (cvo.c()) {
            List arrayList = new ArrayList();
            if (cvo.d.a()) {
                arrayList.add(cuj.a(cvo.a, cvo.d, cvo.b));
            }
            if (cvo.e.b) {
                arrayList.add(new cvk(cvo.b, cvo.a, cvo.e));
            }
            if (!arrayList.isEmpty()) {
                cwh cwh = new cwh(arrayList);
                Application application = cvo.b;
                cug.a(application).a(new ctx(cwh, application));
                cwh.a();
            }
        }
        cum.a(this.a.a, this.a.b).a();
    }
}
