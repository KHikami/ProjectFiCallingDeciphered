package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class fta extends BroadcastReceiver {
    private static final boolean f13953a = false;

    static {
        kae kae = glk.f15564k;
    }

    public void onReceive(Context context, Intent intent) {
        String valueOf;
        if (f13953a) {
            valueOf = String.valueOf(intent);
            new StringBuilder(String.valueOf(valueOf).length() + 26).append("CompanionReplacedReceiver ").append(valueOf);
        }
        valueOf = intent.getData().getSchemeSpecificPart();
        if ("com.google.android.wearable.app".equals(valueOf) || "com.google.android.projection.gearhead".equals(valueOf)) {
            eao.f11055a = false;
            eao.f11056b = false;
        }
    }
}
