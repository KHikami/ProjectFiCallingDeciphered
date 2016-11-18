package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class gff extends BroadcastReceiver {
    final /* synthetic */ gfe f15136a;

    gff(gfe gfe) {
        this.f15136a = gfe;
    }

    public void onReceive(Context context, Intent intent) {
        iil.m21867a();
        if (this.f15136a.f15131a != null) {
            glk.m17979c("Babel_telephony", "TeleUserActivityMonitor.onReceive, activityType: %s confidenceLevel: %s", gfe.m17496b(intent.getExtras().getInt("com.google.android.apps.hangouts.user_activity_type")), Integer.valueOf(intent.getExtras().getInt("com.google.android.apps.hangouts.user_activity_confidence")));
            this.f15136a.f15131a.mo2255b(r0, r1);
        }
    }
}
