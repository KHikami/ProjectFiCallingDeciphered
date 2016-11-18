package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class ggp implements ServiceConnection {
    private final Context f15251a;
    private ggq f15252b;

    public ggp(Context context, ggq ggq) {
        this.f15251a = context;
        this.f15252b = ggq;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        glk.m17979c("Babel_telephony", "TeleTychoController.HomeVocieNetworkConnection.onServiceConnected", new Object[0]);
        try {
            this.f15252b.mo2202a(true, gsj.m18467a(iBinder).mo2328b());
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            glk.m17982e("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 104).append("TeleTychoController.HomeVocieNetworkConnection.onServiceConnected, calling isOnHomeVoiceNetwork failed: ").append(valueOf).toString(), new Object[0]);
            this.f15252b.mo2202a(false, false);
        } finally {
            this.f15252b = null;
            this.f15251a.unbindService(this);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        glk.m17979c("Babel_telephony", "TeleTychoController.HomeVocieNetworkConnection.onServiceDisconnected", new Object[0]);
        if (this.f15252b != null) {
            this.f15252b.mo2202a(false, false);
            this.f15252b = null;
        }
    }
}
