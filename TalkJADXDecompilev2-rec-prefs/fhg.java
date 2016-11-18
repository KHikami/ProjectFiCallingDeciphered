package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class fhg implements Runnable {
    final /* synthetic */ List f13055a;
    final /* synthetic */ bko f13056b;

    public fhg(List list, bko bko) {
        this.f13055a = list;
        this.f13056b = bko;
    }

    public void run() {
        RealTimeChatService.m9062a(true, this.f13055a, this.f13056b);
    }
}
