package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PowerManager;

final class dgd extends BroadcastReceiver {
    final /* synthetic */ dgb f9673a;

    dgd(dgb dgb) {
        this.f9673a = dgb;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BATTERY_LOW".equals(intent.getAction())) {
            this.f9673a.f9664b.m11689a(dgc.BATTERY_LOW);
        } else if ("android.intent.action.BATTERY_OKAY".equals(intent.getAction())) {
            this.f9673a.f9664b.m11689a(dgc.BATTERY_OKAY_AFTER_LOW);
        } else if (VERSION.SDK_INT >= 21 && "android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            dgb dgb = this.f9673a;
            glk.m17979c("Babel_calls", "Battery saver is enabled: %b", Boolean.valueOf(powerManager.isPowerSaveMode()));
            if (powerManager.isPowerSaveMode()) {
                dgb.f9665c = dgc.POWER_SAVE_MODE_ACTIVATED;
            } else {
                dgb.f9665c = dgc.POWER_SAVE_MODE_DEACTIVATED;
            }
            if (dgb.f9664b != null) {
                dgb.f9664b.m11689a(dgb.f9665c);
            }
        }
    }
}
