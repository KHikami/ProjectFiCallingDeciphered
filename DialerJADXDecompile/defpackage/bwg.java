package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: bwg */
public final class bwg implements ServiceConnection {
    private boolean a;
    private final BlockingQueue b;

    public bwg() {
        this.a = false;
        this.b = new LinkedBlockingQueue();
    }

    public final IBinder a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
        } else if (this.a) {
            throw new IllegalStateException();
        } else {
            this.a = true;
            return (IBinder) this.b.take();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
