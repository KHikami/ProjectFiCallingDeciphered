package defpackage;

import android.content.Context;
import android.widget.ListView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;

public final class fml implements Runnable {
    final /* synthetic */ DebugWakelocksActivity a;

    public fml(DebugWakelocksActivity debugWakelocksActivity) {
        this.a = debugWakelocksActivity;
    }

    public void run() {
        gwb.b(this.a.c);
        ListView listView = this.a.b;
        Context context = this.a;
        listView.setAdapter(new fmp(context, context, ba.mu, gwb.uH, ba.b(context.a.b.values())));
        gwb.a((Runnable) this, 100);
    }
}
