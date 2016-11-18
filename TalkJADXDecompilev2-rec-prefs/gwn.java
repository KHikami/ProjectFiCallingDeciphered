package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class gwn implements ServiceConnection {
    final /* synthetic */ gwm f16311a;

    public gwn(gwm gwm) {
        this.f16311a = gwm;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f16311a.f16308f.f16295a) {
            this.f16311a.f16305c = iBinder;
            this.f16311a.f16307e = componentName;
            for (ServiceConnection onServiceConnected : this.f16311a.f16303a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f16311a.f16304b = 1;
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f16311a.f16308f.f16295a) {
            this.f16311a.f16305c = null;
            this.f16311a.f16307e = componentName;
            for (ServiceConnection onServiceDisconnected : this.f16311a.f16303a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f16311a.f16304b = 2;
        }
    }
}
