package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;

/* renamed from: gwk */
final class gwk extends gwj implements Callback {
    private final HashMap<gwl, gwm> a;
    private final Context b;
    private final Handler c;
    private final gxn d;
    private final long e;

    gwk(Context context) {
        this.a = new HashMap();
        this.b = context.getApplicationContext();
        this.c = new Handler(context.getMainLooper(), this);
        this.d = gxn.a();
        this.e = 5000;
    }

    private boolean a(gwl gwl, ServiceConnection serviceConnection, String str) {
        boolean b;
        gwb.f((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            gwm gwm = (gwm) this.a.get(gwl);
            if (gwm != null) {
                this.c.removeMessages(0, gwm);
                if (!gwm.b(serviceConnection)) {
                    gwm.a(serviceConnection, str);
                    switch (gwm.c()) {
                        case wi.j /*1*/:
                            serviceConnection.onServiceConnected(gwm.f(), gwm.e());
                            break;
                        case wi.l /*2*/:
                            gwm.a(str);
                            break;
                        default:
                            break;
                    }
                }
                String valueOf = String.valueOf(gwl);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(valueOf).toString());
            }
            gwm = new gwm(this, gwl);
            gwm.a(serviceConnection, str);
            gwm.a(str);
            this.a.put(gwl, gwm);
            b = gwm.b();
        }
        return b;
    }

    private void b(gwl gwl, ServiceConnection serviceConnection, String str) {
        gwb.f((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            gwm gwm = (gwm) this.a.get(gwl);
            String valueOf;
            if (gwm == null) {
                valueOf = String.valueOf(gwl);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Nonexistent connection status for service config: ").append(valueOf).toString());
            } else if (gwm.b(serviceConnection)) {
                gwm.a(serviceConnection);
                if (gwm.d()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, gwm), this.e);
                }
            } else {
                valueOf = String.valueOf(gwl);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(valueOf).toString());
            }
        }
    }

    public boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return a(new gwl(componentName), serviceConnection, str);
    }

    public boolean a(String str, String str2, ServiceConnection serviceConnection, String str3) {
        return a(new gwl(str, str2), serviceConnection, str3);
    }

    public void b(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        b(new gwl(componentName), serviceConnection, str);
    }

    public void b(String str, String str2, ServiceConnection serviceConnection, String str3) {
        b(new gwl(str, str2), serviceConnection, str3);
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case wi.w /*0*/:
                gwm gwm = (gwm) message.obj;
                synchronized (this.a) {
                    if (gwm.d()) {
                        if (gwm.b()) {
                            gwm.a();
                        }
                        this.a.remove(gwm.d);
                    }
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
