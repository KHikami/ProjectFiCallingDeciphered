package p000;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public abstract class ify extends Service {
    private iga f5981a;

    public abstract int mo1057a(igi igi);

    public abstract ifz mo1058a();

    public void onCreate() {
        super.onCreate();
        this.f5981a = mo1058a().mo3195a(this);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return this.f5981a.mo3196a(intent, i2);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }
}
