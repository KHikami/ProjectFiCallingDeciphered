package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class fhg implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ bko b;

    public fhg(List list, bko bko) {
        this.a = list;
        this.b = bko;
    }

    public void run() {
        RealTimeChatService.a(true, this.a, this.b);
    }
}
