package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class gff extends BroadcastReceiver {
    final /* synthetic */ gfe a;

    gff(gfe gfe) {
        this.a = gfe;
    }

    public void onReceive(Context context, Intent intent) {
        iil.a();
        if (this.a.a != null) {
            glk.c("Babel_telephony", "TeleUserActivityMonitor.onReceive, activityType: %s confidenceLevel: %s", gfe.b(intent.getExtras().getInt("com.google.android.apps.hangouts.user_activity_type")), Integer.valueOf(intent.getExtras().getInt("com.google.android.apps.hangouts.user_activity_confidence")));
            this.a.a.b(r0, r1);
        }
    }
}
