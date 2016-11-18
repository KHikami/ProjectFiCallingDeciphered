package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;

final class gwk extends gwj implements Callback {
    private final HashMap<gwl, gwm> f16295a = new HashMap();
    private final Context f16296b;
    private final Handler f16297c;
    private final gxn f16298d;
    private final long f16299e;

    gwk(Context context) {
        this.f16296b = context.getApplicationContext();
        this.f16297c = new Handler(context.getMainLooper(), this);
        this.f16298d = gxn.m18916a();
        this.f16299e = 5000;
    }

    private boolean m18783a(gwl gwl, ServiceConnection serviceConnection, String str) {
        boolean b;
        gwb.m2195f((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f16295a) {
            gwm gwm = (gwm) this.f16295a.get(gwl);
            if (gwm != null) {
                this.f16297c.removeMessages(0, gwm);
                if (!gwm.m18797b(serviceConnection)) {
                    gwm.m18794a(serviceConnection, str);
                    switch (gwm.m18798c()) {
                        case 1:
                            serviceConnection.onServiceConnected(gwm.m18801f(), gwm.m18800e());
                            break;
                        case 2:
                            gwm.m18795a(str);
                            break;
                        default:
                            break;
                    }
                }
                String valueOf = String.valueOf(gwl);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(valueOf).toString());
            }
            gwm = new gwm(this, gwl);
            gwm.m18794a(serviceConnection, str);
            gwm.m18795a(str);
            this.f16295a.put(gwl, gwm);
            b = gwm.m18796b();
        }
        return b;
    }

    private void m18785b(gwl gwl, ServiceConnection serviceConnection, String str) {
        gwb.m2195f((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f16295a) {
            gwm gwm = (gwm) this.f16295a.get(gwl);
            String valueOf;
            if (gwm == null) {
                valueOf = String.valueOf(gwl);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Nonexistent connection status for service config: ").append(valueOf).toString());
            } else if (gwm.m18797b(serviceConnection)) {
                gwm.m18793a(serviceConnection);
                if (gwm.m18799d()) {
                    this.f16297c.sendMessageDelayed(this.f16297c.obtainMessage(0, gwm), this.f16299e);
                }
            } else {
                valueOf = String.valueOf(gwl);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(valueOf).toString());
            }
        }
    }

    public boolean mo2356a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return m18783a(new gwl(componentName), serviceConnection, str);
    }

    public boolean mo2357a(String str, String str2, ServiceConnection serviceConnection, String str3) {
        return m18783a(new gwl(str, str2), serviceConnection, str3);
    }

    public void mo2358b(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        m18785b(new gwl(componentName), serviceConnection, str);
    }

    public void mo2359b(String str, String str2, ServiceConnection serviceConnection, String str3) {
        m18785b(new gwl(str, str2), serviceConnection, str3);
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                gwm gwm = (gwm) message.obj;
                synchronized (this.f16295a) {
                    if (gwm.m18799d()) {
                        if (gwm.m18796b()) {
                            gwm.m18792a();
                        }
                        this.f16295a.remove(gwm.f16306d);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
