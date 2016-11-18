package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class iwr extends BroadcastReceiver {
    final /* synthetic */ iwp a;

    public iwr(iwp iwp) {
        this.a = iwp;
    }

    public void onReceive(Context context, Intent intent) {
        if (!"android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.a.b();
            this.a.h = ((ScheduledExecutorService) this.a.b.a()).schedule(new iws(this, context), 5, TimeUnit.SECONDS);
        } else if (this.a.g.get()) {
            this.a.b();
        }
    }
}
