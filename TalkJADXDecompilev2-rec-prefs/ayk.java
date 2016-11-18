package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class ayk implements ayo {
    final ayi f2542a;
    boolean f2543b;
    private final Context f2544c;
    private boolean f2545d;
    private final BroadcastReceiver f2546e = new ayl(this);

    public ayk(Context context, ayi ayi) {
        this.f2544c = context.getApplicationContext();
        this.f2542a = ayi;
    }

    static boolean m4346a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void mo261f() {
    }

    public void mo260d() {
        if (!this.f2545d) {
            this.f2543b = ayk.m4346a(this.f2544c);
            this.f2544c.registerReceiver(this.f2546e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f2545d = true;
        }
    }

    public void h_() {
        if (this.f2545d) {
            this.f2544c.unregisterReceiver(this.f2546e);
            this.f2545d = false;
        }
    }
}
