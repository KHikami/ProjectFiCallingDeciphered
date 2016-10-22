import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class ggf extends gsg implements ServiceConnection {
    private final Context a;
    private final String b;
    private ggo c;
    private boolean d;

    public ggf(Context context, String str, ggo ggo) {
        this.a = context;
        this.b = str;
        this.c = ggo;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        glk.c("Babel_telephony", "TeleGetProxyNumberConnection.onServiceConnected", new Object[0]);
        this.d = true;
        gsi a = gsj.a(iBinder);
        try {
            if (a.a() >= gwb.a(this.a, "babel_telephony_min_voice_service_api_version_to_enable_proxy_number", 3)) {
                a.a(this.b, this);
            } else {
                b(1);
            }
        } catch (Throwable e) {
            glk.d("Babel_telephony", "TeleGetProxyNumberConnection.onServiceConnected, calling VoiceService failed", e);
            b(2);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        glk.c("Babel_telephony", "TeleGetProxyNumberConnection.onServiceDisconnected", new Object[0]);
        b(2);
    }

    private void b(int i) {
        gwb.aL().post(new ggg(this, this.c, i));
        a();
    }

    private void a() {
        this.c = null;
        if (this.d) {
            this.a.unbindService(this);
            this.d = false;
        }
    }

    public void a(String str, String str2) {
        gwb.T(this.a);
        glk.c("Babel_telephony", "TeleGetProxyNumberConnection.onReceiveProxyNumber, received proxy number", new Object[0]);
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 54).append("TeleGetProxyNumberConnection.handleSuccess, callback: ").append(valueOf).toString(), new Object[0]);
        gwb.aL().post(new ggh(this, this.c, str2));
        a();
    }

    public void a(int i) {
        gwb.T(this.a);
        glk.e("Babel_telephony", "TeleGetProxyNumberConnection.onError, failed with errorCode: %d", Integer.valueOf(i));
        b(2);
    }
}
