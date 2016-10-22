import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class gwn implements ServiceConnection {
    final /* synthetic */ gwm a;

    public gwn(gwm gwm) {
        this.a = gwm;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a.f.a) {
            this.a.c = iBinder;
            this.a.e = componentName;
            for (ServiceConnection onServiceConnected : this.a.a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.a.b = 1;
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.f.a) {
            this.a.c = null;
            this.a.e = componentName;
            for (ServiceConnection onServiceDisconnected : this.a.a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.a.b = 2;
        }
    }
}
