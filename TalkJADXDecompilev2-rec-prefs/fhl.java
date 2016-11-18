package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhl implements Runnable {
    final /* synthetic */ fok f13061a;
    final /* synthetic */ bko f13062b;
    final /* synthetic */ fdo f13063c;

    public fhl(fok fok, bko bko, fdo fdo) {
        this.f13061a = fok;
        this.f13062b = bko;
        this.f13063c = fdo;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).mo640a(this.f13061a.L_(), this.f13062b, this.f13061a, this.f13063c);
        }
        RealTimeChatService.m9015a(this.f13062b, this.f13063c);
    }
}
