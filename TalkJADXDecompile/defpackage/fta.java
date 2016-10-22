package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: fta */
public final class fta extends BroadcastReceiver {
    private static final boolean a;

    static {
        kae kae = glk.k;
        a = false;
    }

    public void onReceive(Context context, Intent intent) {
        String valueOf;
        if (a) {
            valueOf = String.valueOf(intent);
            new StringBuilder(String.valueOf(valueOf).length() + 26).append("CompanionReplacedReceiver ").append(valueOf);
        }
        valueOf = intent.getData().getSchemeSpecificPart();
        if ("com.google.android.wearable.app".equals(valueOf) || "com.google.android.projection.gearhead".equals(valueOf)) {
            eao.a = false;
            eao.b = false;
        }
    }
}
