package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class hfs extends BroadcastReceiver {
    public Context f16878a;
    private final hft f16879b;

    public hfs(hft hft) {
        this.f16879b = hft;
    }

    public synchronized void m19689a() {
        if (this.f16878a != null) {
            this.f16878a.unregisterReceiver(this);
        }
        this.f16878a = null;
    }

    public void m19690a(Context context) {
        this.f16878a = context;
    }

    public void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        Object obj = null;
        if (data != null) {
            obj = data.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(obj)) {
            this.f16879b.mo2478a();
            m19689a();
        }
    }
}
