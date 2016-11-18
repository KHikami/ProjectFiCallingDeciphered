package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class irj implements ServiceConnection {
    final /* synthetic */ iri f18778a;

    irj(iri iri) {
        this.f18778a = iri;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        itx.m23277a(4, "vclib", "onServiceConnected");
        if (iBinder == null) {
            itx.m23277a(6, "vclib", "Failed to bind to CallService.");
        } else if (iBinder instanceof ikc) {
            this.f18778a.f18774d = (ikc) iBinder;
            if (this.f18778a.f18773c != null && this.f18778a.f18773c.mo3221l()) {
                this.f18778a.f18774d.m22104a(this.f18778a.f18773c);
            }
        } else {
            itx.m23277a(6, "vclib", "CallService does not appear to be running in the current process. This is most likely because the application crashed and restarted the service in another process. This instance will be unusable.");
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        itx.m23277a(4, "vclib", "onServiceDisconnected");
        this.f18778a.f18774d = null;
    }
}
