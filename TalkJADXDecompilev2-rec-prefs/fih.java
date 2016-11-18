package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class fih implements Runnable {
    final /* synthetic */ List f13115a;
    final /* synthetic */ bko f13116b;

    public fih(List list, bko bko) {
        this.f13115a = list;
        this.f13116b = bko;
    }

    public void run() {
        RealTimeChatService.m9062a(false, this.f13115a, this.f13116b);
    }
}
