package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class gxv implements ServiceConnection {
    boolean a = false;
    private final BlockingQueue<IBinder> b = new LinkedBlockingQueue();

    public IBinder a() {
        gwb.O("BlockingServiceConnection.getService() called on main thread");
        if (this.a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.a = true;
        return (IBinder) this.b.take();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
