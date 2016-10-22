package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PowerManager;

/* renamed from: dgd */
final class dgd extends BroadcastReceiver {
    final /* synthetic */ dgb a;

    dgd(dgb dgb) {
        this.a = dgb;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BATTERY_LOW".equals(intent.getAction())) {
            this.a.b.a(dgc.BATTERY_LOW);
        } else if ("android.intent.action.BATTERY_OKAY".equals(intent.getAction())) {
            this.a.b.a(dgc.BATTERY_OKAY_AFTER_LOW);
        } else if (VERSION.SDK_INT >= 21 && "android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            dgb dgb = this.a;
            glk.c("Babel_calls", "Battery saver is enabled: %b", Boolean.valueOf(powerManager.isPowerSaveMode()));
            if (powerManager.isPowerSaveMode()) {
                dgb.c = dgc.POWER_SAVE_MODE_ACTIVATED;
            } else {
                dgb.c = dgc.POWER_SAVE_MODE_DEACTIVATED;
            }
            if (dgb.b != null) {
                dgb.b.a(dgb.c);
            }
        }
    }
}
