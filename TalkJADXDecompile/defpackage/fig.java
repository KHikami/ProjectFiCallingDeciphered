package defpackage;

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: fig */
public final class fig implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ fiu b;
    final /* synthetic */ Object c;

    public fig(Intent intent, fiu fiu, Object obj) {
        this.a = intent;
        this.b = fiu;
        this.c = obj;
    }

    public void run() {
        RealTimeChatService.a(this.a, this.b, this.c, true);
    }
}
