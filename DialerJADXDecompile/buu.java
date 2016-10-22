import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;

final class buu extends but implements Callback {
    private final HashMap a;
    private final Context b;
    private final Handler c;
    private final bvr d;
    private final long e;

    buu(Context context) {
        this.a = new HashMap();
        this.b = context.getApplicationContext();
        this.c = new Handler(context.getMainLooper(), this);
        this.d = bvr.a();
        this.e = 5000;
    }

    private final boolean a(buv buv, ServiceConnection serviceConnection, String str) {
        boolean z;
        buf.d((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            buw buw = (buw) this.a.get(buv);
            if (buw != null) {
                this.c.removeMessages(0, buw);
                if (!buw.a(serviceConnection)) {
                    buw.a(serviceConnection, str);
                    switch (buw.c) {
                        case rq.b /*1*/:
                            serviceConnection.onServiceConnected(buw.g, buw.e);
                            break;
                        case rq.c /*2*/:
                            buw.a(str);
                            break;
                        default:
                            break;
                    }
                }
                throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + buv);
            }
            buw = new buw(this, buv);
            buw.a(serviceConnection, str);
            buw.a(str);
            this.a.put(buv, buw);
            z = buw.d;
        }
        return z;
    }

    private final void b(buv buv, ServiceConnection serviceConnection, String str) {
        buf.d((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            buw buw = (buw) this.a.get(buv);
            if (buw == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + buv);
            } else if (buw.a(serviceConnection)) {
                buw.h.d.a(buw.h.b, bvr.a(serviceConnection), null, null, 4);
                buw.b.remove(serviceConnection);
                if (buw.a()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, buw), this.e);
                }
            } else {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + buv);
            }
        }
    }

    public final boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return a(new buv(componentName), serviceConnection, str);
    }

    public final boolean a(String str, ServiceConnection serviceConnection, String str2) {
        return a(new buv(str), serviceConnection, str2);
    }

    public final void b(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        b(new buv(componentName), serviceConnection, str);
    }

    public final void b(String str, ServiceConnection serviceConnection, String str2) {
        b(new buv(str), serviceConnection, str2);
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case rl.c /*0*/:
                buw buw = (buw) message.obj;
                synchronized (this.a) {
                    if (buw.a()) {
                        if (buw.d) {
                            buw.h.d.a(buw.h.b, buw.a);
                            buw.d = false;
                            buw.c = 2;
                        }
                        this.a.remove(buw.f);
                    }
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
