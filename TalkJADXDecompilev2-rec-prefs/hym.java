package p000;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Log;

public class hym extends Service implements hxo, hxs, hyc {
    String f7207a;
    Handler f7208b;
    final Object f7209c = new Object();
    boolean f7210d;
    private IBinder f7211e;

    public void mo1275a(hxv hxv) {
    }

    public void mo1276a(hye hye) {
    }

    public final IBinder onBind(Intent intent) {
        return "com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()) ? this.f7211e : null;
    }

    public void onCreate() {
        super.onCreate();
        if (Log.isLoggable("WearableLS", 3)) {
            String str = "onCreate: ";
            String valueOf = String.valueOf(new ComponentName(getPackageName(), getClass().getName()).flattenToShortString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        this.f7207a = getPackageName();
        HandlerThread handlerThread = new HandlerThread("WearableListenerService");
        handlerThread.start();
        this.f7208b = new Handler(handlerThread.getLooper());
        this.f7211e = new hyn(this);
    }

    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            String str = "onDestroy: ";
            String valueOf = String.valueOf(new ComponentName(getPackageName(), getClass().getName()).flattenToShortString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        synchronized (this.f7209c) {
            this.f7210d = true;
            if (this.f7208b == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
            }
            this.f7208b.getLooper().quit();
        }
        super.onDestroy();
    }
}
