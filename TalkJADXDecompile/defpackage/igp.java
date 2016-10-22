package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: igp */
final class igp extends Thread {
    final /* synthetic */ igo a;
    private final String b;
    private final gzj c;
    private final Bundle d;

    igp(igo igo, String str, IBinder iBinder, Bundle bundle) {
        gzj gzj;
        this.a = igo;
        super("GCMService");
        this.b = str;
        if (iBinder == null) {
            gzj = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
            gzj = (queryLocalInterface == null || !(queryLocalInterface instanceof gzj)) ? new gzl(iBinder) : (gzj) queryLocalInterface;
        }
        this.c = gzj;
        this.d = bundle;
    }

    public void run() {
        Process.setThreadPriority(10);
        try {
            this.c.a(this.a.a.a(new igi(this.b, this.d)));
        } catch (RemoteException e) {
            String str = "GcoreGcmTaskServiceHlpr";
            String str2 = "Error reporting result of operation to scheduler for ";
            String valueOf = String.valueOf(this.b);
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } finally {
            this.a.a(this.b);
        }
    }
}
