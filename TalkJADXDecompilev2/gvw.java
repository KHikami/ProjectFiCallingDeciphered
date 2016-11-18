package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public final class gvw implements ServiceConnection {
    final /* synthetic */ gvo a;
    private final int b;

    public gvw(gvo gvo, int i) {
        this.a = gvo;
        this.b = i;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gwb.f((Object) iBinder, (Object) "Expecting a valid IBinder");
        synchronized (this.a.n) {
            gxb gxb;
            gvo gvo = this.a;
            if (iBinder == null) {
                gxb = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                gxb = (queryLocalInterface == null || !(queryLocalInterface instanceof gxb)) ? new gxd(iBinder) : (gxb) queryLocalInterface;
            }
            gvo.o = gxb;
        }
        this.a.a(0, null, this.b);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.n) {
            this.a.o = null;
        }
        this.a.b.sendMessage(this.a.b.obtainMessage(4, this.b, 1));
    }
}
