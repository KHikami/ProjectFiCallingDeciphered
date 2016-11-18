package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class ggf extends gsg implements ServiceConnection {
    private final Context f15224a;
    private final String f15225b;
    private ggo f15226c;
    private boolean f15227d;

    public ggf(Context context, String str, ggo ggo) {
        this.f15224a = context;
        this.f15225b = str;
        this.f15226c = ggo;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        glk.m17979c("Babel_telephony", "TeleGetProxyNumberConnection.onServiceConnected", new Object[0]);
        this.f15227d = true;
        gsi a = gsj.m18467a(iBinder);
        try {
            if (a.mo2326a() >= gwb.m1492a(this.f15224a, "babel_telephony_min_voice_service_api_version_to_enable_proxy_number", 3)) {
                a.mo2327a(this.f15225b, this);
            } else {
                m17641b(1);
            }
        } catch (Throwable e) {
            glk.m17980d("Babel_telephony", "TeleGetProxyNumberConnection.onServiceConnected, calling VoiceService failed", e);
            m17641b(2);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        glk.m17979c("Babel_telephony", "TeleGetProxyNumberConnection.onServiceDisconnected", new Object[0]);
        m17641b(2);
    }

    private void m17641b(int i) {
        gwb.aL().post(new ggg(this, this.f15226c, i));
        m17640a();
    }

    private void m17640a() {
        this.f15226c = null;
        if (this.f15227d) {
            this.f15224a.unbindService(this);
            this.f15227d = false;
        }
    }

    public void mo2262a(String str, String str2) {
        gwb.m1453T(this.f15224a);
        glk.m17979c("Babel_telephony", "TeleGetProxyNumberConnection.onReceiveProxyNumber, received proxy number", new Object[0]);
        String valueOf = String.valueOf(this.f15226c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 54).append("TeleGetProxyNumberConnection.handleSuccess, callback: ").append(valueOf).toString(), new Object[0]);
        gwb.aL().post(new ggh(this, this.f15226c, str2));
        m17640a();
    }

    public void mo2261a(int i) {
        gwb.m1453T(this.f15224a);
        glk.m17982e("Babel_telephony", "TeleGetProxyNumberConnection.onError, failed with errorCode: %d", Integer.valueOf(i));
        m17641b(2);
    }
}
