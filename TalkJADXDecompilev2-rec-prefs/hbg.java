package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

final class hbg implements ServiceConnection {
    final /* synthetic */ hbf f16515a;

    hbg(hbf hbf) {
        this.f16515a = hbf;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hbh hbh;
        hbf hbf = this.f16515a;
        if (iBinder == null) {
            hbh = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.http.IGoogleHttpService");
            hbh = (queryLocalInterface == null || !(queryLocalInterface instanceof hbh)) ? new hbj(iBinder) : (hbh) queryLocalInterface;
        }
        hbf.f16510d = hbh;
        this.f16515a.f16512f.countDown();
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
