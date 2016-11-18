package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class iwr extends BroadcastReceiver {
    final /* synthetic */ iwp f19289a;

    public iwr(iwp iwp) {
        this.f19289a = iwp;
    }

    public void onReceive(Context context, Intent intent) {
        if (!"android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.f19289a.m23411b();
            this.f19289a.f19285h = ((ScheduledExecutorService) this.f19289a.f19279b.mo3325a()).schedule(new iws(this, context), 5, TimeUnit.SECONDS);
        } else if (this.f19289a.f19284g.get()) {
            this.f19289a.m23411b();
        }
    }
}
