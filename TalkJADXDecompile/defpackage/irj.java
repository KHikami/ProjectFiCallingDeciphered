package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: irj */
final class irj implements ServiceConnection {
    final /* synthetic */ iri a;

    irj(iri iri) {
        this.a = iri;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        itx.a(4, "vclib", "onServiceConnected");
        if (iBinder == null) {
            itx.a(6, "vclib", "Failed to bind to CallService.");
        } else if (iBinder instanceof ikc) {
            this.a.d = (ikc) iBinder;
            if (this.a.c != null && this.a.c.l()) {
                this.a.d.a(this.a.c);
            }
        } else {
            itx.a(6, "vclib", "CallService does not appear to be running in the current process. This is most likely because the application crashed and restarted the service in another process. This instance will be unusable.");
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        itx.a(4, "vclib", "onServiceDisconnected");
        this.a.d = null;
    }
}
