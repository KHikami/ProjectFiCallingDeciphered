package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public final class gvw implements ServiceConnection {
    final /* synthetic */ gvo f16253a;
    private final int f16254b;

    public gvw(gvo gvo, int i) {
        this.f16253a = gvo;
        this.f16254b = i;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gwb.m2195f((Object) iBinder, (Object) "Expecting a valid IBinder");
        synchronized (this.f16253a.f16227n) {
            gxb gxb;
            gvo gvo = this.f16253a;
            if (iBinder == null) {
                gxb = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                gxb = (queryLocalInterface == null || !(queryLocalInterface instanceof gxb)) ? new gxd(iBinder) : (gxb) queryLocalInterface;
            }
            gvo.f16228o = gxb;
        }
        this.f16253a.m18695a(0, null, this.f16254b);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f16253a.f16227n) {
            this.f16253a.f16228o = null;
        }
        this.f16253a.f16216b.sendMessage(this.f16253a.f16216b.obtainMessage(4, this.f16254b, 1));
    }
}
