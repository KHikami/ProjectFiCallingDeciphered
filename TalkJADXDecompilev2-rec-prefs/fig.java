package p000;

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fig implements Runnable {
    final /* synthetic */ Intent f13112a;
    final /* synthetic */ fiu f13113b;
    final /* synthetic */ Object f13114c;

    public fig(Intent intent, fiu fiu, Object obj) {
        this.f13112a = intent;
        this.f13113b = fiu;
        this.f13114c = obj;
    }

    public void run() {
        RealTimeChatService.m9010a(this.f13112a, this.f13113b, this.f13114c, true);
    }
}
