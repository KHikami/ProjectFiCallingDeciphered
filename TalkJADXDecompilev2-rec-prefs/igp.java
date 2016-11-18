package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;

final class igp extends Thread {
    final /* synthetic */ igo f17660a;
    private final String f17661b;
    private final gzj f17662c;
    private final Bundle f17663d;

    igp(igo igo, String str, IBinder iBinder, Bundle bundle) {
        gzj gzj;
        this.f17660a = igo;
        super("GCMService");
        this.f17661b = str;
        if (iBinder == null) {
            gzj = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
            gzj = (queryLocalInterface == null || !(queryLocalInterface instanceof gzj)) ? new gzl(iBinder) : (gzj) queryLocalInterface;
        }
        this.f17662c = gzj;
        this.f17663d = bundle;
    }

    public void run() {
        Process.setThreadPriority(10);
        try {
            this.f17662c.mo2428a(this.f17660a.f17657a.mo1057a(new igi(this.f17661b, this.f17663d)));
        } catch (RemoteException e) {
            String str = "GcoreGcmTaskServiceHlpr";
            String str2 = "Error reporting result of operation to scheduler for ";
            String valueOf = String.valueOf(this.f17661b);
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } finally {
            this.f17660a.m21756a(this.f17661b);
        }
    }
}
