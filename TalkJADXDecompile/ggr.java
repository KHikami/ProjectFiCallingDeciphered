import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class ggr implements ServiceConnection {
    private final Context a;

    public ggr(Context context) {
        this.a = context;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        glk.c("Babel_telephony", "TeleTychoController.SimCallManagerChangedConnection.onServiceConnected", new Object[0]);
        try {
            gsj.a(iBinder).c();
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            glk.e("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 112).append("TeleTychoController.SimCallManagerChangedConnection.onServiceConnected, calling onSimCallManagerChanged failed: ").append(valueOf).toString(), new Object[0]);
        } finally {
            this.a.unbindService(this);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        glk.c("Babel_telephony", "TeleTychoController.SimCallManagerChangedConnection.onServiceDisconnected", new Object[0]);
    }
}
