package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhm implements Runnable {
    final /* synthetic */ fok f13064a;
    final /* synthetic */ bko f13065b;
    final /* synthetic */ fdo f13066c;

    public fhm(fok fok, bko bko, fdo fdo) {
        this.f13064a = fok;
        this.f13065b = bko;
        this.f13066c = fdo;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6750g.iterator();
        while (it.hasNext()) {
            it.next();
            iil.m21876b();
        }
    }
}
