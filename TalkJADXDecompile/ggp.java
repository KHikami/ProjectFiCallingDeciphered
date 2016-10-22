import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class ggp implements ServiceConnection {
    private final Context a;
    private ggq b;

    public ggp(Context context, ggq ggq) {
        this.a = context;
        this.b = ggq;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        glk.c("Babel_telephony", "TeleTychoController.HomeVocieNetworkConnection.onServiceConnected", new Object[0]);
        try {
            this.b.a(true, gsj.a(iBinder).b());
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            glk.e("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 104).append("TeleTychoController.HomeVocieNetworkConnection.onServiceConnected, calling isOnHomeVoiceNetwork failed: ").append(valueOf).toString(), new Object[0]);
            this.b.a(false, false);
        } finally {
            this.b = null;
            this.a.unbindService(this);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        glk.c("Babel_telephony", "TeleTychoController.HomeVocieNetworkConnection.onServiceDisconnected", new Object[0]);
        if (this.b != null) {
            this.b.a(false, false);
            this.b = null;
        }
    }
}
