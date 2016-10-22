package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

/* renamed from: fhm */
public final class fhm implements Runnable {
    final /* synthetic */ fok a;
    final /* synthetic */ bko b;
    final /* synthetic */ fdo c;

    public fhm(fok fok, bko bko, fdo fdo) {
        this.a = fok;
        this.b = bko;
        this.c = fdo;
    }

    public void run() {
        Iterator it = RealTimeChatService.g.iterator();
        while (it.hasNext()) {
            it.next();
            iil.b();
        }
    }
}
