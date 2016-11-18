package p000;

import android.content.Context;
import android.widget.ListView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;

public final class fml implements Runnable {
    final /* synthetic */ DebugWakelocksActivity f13465a;

    public fml(DebugWakelocksActivity debugWakelocksActivity) {
        this.f13465a = debugWakelocksActivity;
    }

    public void run() {
        gwb.m2042b(this.f13465a.f6772c);
        ListView listView = this.f13465a.f6771b;
        Context context = this.f13465a;
        listView.setAdapter(new fmp(context, context, ba.mu, gwb.uH, ba.m4601b(context.f6770a.f13477b.values())));
        gwb.m1864a((Runnable) this, 100);
    }
}
