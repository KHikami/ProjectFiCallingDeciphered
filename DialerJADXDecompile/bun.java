import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public final class bun implements ServiceConnection {
    private final int a;
    private /* synthetic */ bui b;

    public bun(bui bui, int i) {
        this.b = bui;
        this.a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        buf.d((Object) iBinder, (Object) "Expecting a valid IBinder");
        synchronized (this.b.n) {
            bvg bvg;
            bui bui = this.b;
            if (iBinder == null) {
                bvg = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                bvg = (queryLocalInterface == null || !(queryLocalInterface instanceof bvg)) ? new bvi(iBinder) : (bvg) queryLocalInterface;
            }
            bui.o = bvg;
        }
        this.b.a(0, this.a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.b.n) {
            this.b.o = null;
        }
        this.b.b.sendMessage(this.b.b.obtainMessage(4, this.a, 1));
    }
}
