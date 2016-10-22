package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: bux */
public final class bux implements ServiceConnection {
    private /* synthetic */ buw a;

    public bux(buw buw) {
        this.a = buw;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (buu.a(this.a.h)) {
            this.a.e = iBinder;
            this.a.g = componentName;
            for (ServiceConnection onServiceConnected : this.a.b) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.a.c = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (buu.a(this.a.h)) {
            this.a.e = null;
            this.a.g = componentName;
            for (ServiceConnection onServiceDisconnected : this.a.b) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.a.c = 2;
        }
    }
}
