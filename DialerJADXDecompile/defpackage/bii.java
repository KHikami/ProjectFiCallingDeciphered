package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* renamed from: bii */
final class bii implements ServiceConnection {
    private /* synthetic */ bih a;

    bii(bih bih) {
        this.a = bih;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        blq blq;
        bdf.a(this.a, "Connected");
        bih bih = this.a;
        if (iBinder == null) {
            blq = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.hangouts.telephony.ITeleHangoutsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof blq)) {
                blq = new bls(iBinder);
            } else {
                blq = (blq) queryLocalInterface;
            }
        }
        bih.b = blq;
        if (this.a.b == null) {
            bdf.b(this.a, "No binder given; disconnecting");
            this.a.a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        bdf.a(this.a, "Disconnected");
        this.a.b = null;
    }
}
