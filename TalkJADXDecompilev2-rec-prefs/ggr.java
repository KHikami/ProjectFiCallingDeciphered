package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class ggr implements ServiceConnection {
    private final Context f15253a;

    public ggr(Context context) {
        this.f15253a = context;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        glk.m17979c("Babel_telephony", "TeleTychoController.SimCallManagerChangedConnection.onServiceConnected", new Object[0]);
        try {
            gsj.m18467a(iBinder).mo2329c();
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            glk.m17982e("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 112).append("TeleTychoController.SimCallManagerChangedConnection.onServiceConnected, calling onSimCallManagerChanged failed: ").append(valueOf).toString(), new Object[0]);
        } finally {
            this.f15253a.unbindService(this);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        glk.m17979c("Babel_telephony", "TeleTychoController.SimCallManagerChangedConnection.onServiceDisconnected", new Object[0]);
    }
}
