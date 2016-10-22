package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Log;

/* renamed from: hym */
public class hym extends Service implements hxo, hxs, hyc {
    String a;
    Handler b;
    final Object c;
    boolean d;
    private IBinder e;

    public hym() {
        this.c = new Object();
    }

    public void a(hxv hxv) {
    }

    public void a(hye hye) {
    }

    public final IBinder onBind(Intent intent) {
        return "com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()) ? this.e : null;
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
        this.a = getPackageName();
        HandlerThread handlerThread = new HandlerThread("WearableListenerService");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
        this.e = new hyn(this);
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
        synchronized (this.c) {
            this.d = true;
            if (this.b == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
            }
            this.b.getLooper().quit();
        }
        super.onDestroy();
    }
}
