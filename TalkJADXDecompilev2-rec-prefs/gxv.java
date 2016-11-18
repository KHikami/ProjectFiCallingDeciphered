package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class gxv implements ServiceConnection {
    boolean f16361a = false;
    private final BlockingQueue<IBinder> f16362b = new LinkedBlockingQueue();

    public IBinder m18929a() {
        gwb.m1434O("BlockingServiceConnection.getService() called on main thread");
        if (this.f16361a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f16361a = true;
        return (IBinder) this.f16362b.take();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f16362b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
