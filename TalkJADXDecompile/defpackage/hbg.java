package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: hbg */
final class hbg implements ServiceConnection {
    final /* synthetic */ hbf a;

    hbg(hbf hbf) {
        this.a = hbf;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hbh hbh;
        hbf hbf = this.a;
        if (iBinder == null) {
            hbh = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.http.IGoogleHttpService");
            hbh = (queryLocalInterface == null || !(queryLocalInterface instanceof hbh)) ? new hbj(iBinder) : (hbh) queryLocalInterface;
        }
        hbf.d = hbh;
        this.a.f.countDown();
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
