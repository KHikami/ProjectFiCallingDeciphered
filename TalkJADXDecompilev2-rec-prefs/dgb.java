package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import java.util.Map;

public final class dgb {
    public static final Map<dgc, Integer> f9663a = mjx.m32327a(dgc.BATTERY_LOW, Integer.valueOf(2805), dgc.BATTERY_OKAY_AFTER_LOW, Integer.valueOf(2806), dgc.POWER_SAVE_MODE_ACTIVATED, Integer.valueOf(2803), dgc.POWER_SAVE_MODE_DEACTIVATED, Integer.valueOf(2804));
    dge f9664b;
    dgc f9665c = dgc.POWER_SAVE_MODE_DEACTIVATED;
    private final Context f9666d;
    private final dgd f9667e;

    public dgb(Context context) {
        this.f9666d = context;
        this.f9667e = new dgd(this);
    }

    public void m11686a(dge dge) {
        this.f9664b = dge;
    }

    public void m11685a() {
        if (this.f9664b != null) {
            Intent registerReceiver = this.f9666d.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver.getIntExtra("plugged", -1) != 2) {
                if (((int) ((100.0d * ((double) registerReceiver.getIntExtra("level", -1))) / ((double) registerReceiver.getIntExtra("scale", -1)))) <= 15) {
                    this.f9664b.m11689a(dgc.BATTERY_LOW);
                }
            }
        }
        Context context = this.f9666d;
        BroadcastReceiver broadcastReceiver = this.f9667e;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        if (VERSION.SDK_INT >= 21) {
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        }
        context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public void m11687b() {
        this.f9666d.unregisterReceiver(this.f9667e);
    }

    public dgc m11688c() {
        return this.f9665c;
    }
}
