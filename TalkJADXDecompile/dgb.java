import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import java.util.Map;

public final class dgb {
    public static final Map<dgc, Integer> a;
    dge b;
    dgc c;
    private final Context d;
    private final dgd e;

    static {
        a = mjx.a(dgc.BATTERY_LOW, Integer.valueOf(2805), dgc.BATTERY_OKAY_AFTER_LOW, Integer.valueOf(2806), dgc.POWER_SAVE_MODE_ACTIVATED, Integer.valueOf(2803), dgc.POWER_SAVE_MODE_DEACTIVATED, Integer.valueOf(2804));
    }

    public dgb(Context context) {
        this.c = dgc.POWER_SAVE_MODE_DEACTIVATED;
        this.d = context;
        this.e = new dgd(this);
    }

    public void a(dge dge) {
        this.b = dge;
    }

    public void a() {
        if (this.b != null) {
            Intent registerReceiver = this.d.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver.getIntExtra("plugged", -1) != 2) {
                if (((int) ((100.0d * ((double) registerReceiver.getIntExtra("level", -1))) / ((double) registerReceiver.getIntExtra("scale", -1)))) <= 15) {
                    this.b.a(dgc.BATTERY_LOW);
                }
            }
        }
        Context context = this.d;
        BroadcastReceiver broadcastReceiver = this.e;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        if (VERSION.SDK_INT >= 21) {
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        }
        context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public void b() {
        this.d.unregisterReceiver(this.e);
    }

    public dgc c() {
        return this.c;
    }
}
