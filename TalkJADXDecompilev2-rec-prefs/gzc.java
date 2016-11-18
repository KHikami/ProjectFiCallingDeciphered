package p000;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Iterator;

public class gzc extends Service {
    private final Object f6736a = new Object();
    private int f6737b;
    private int f6738c = 0;

    private void m8976b() {
        synchronized (this.f6736a) {
            this.f6738c--;
            if (this.f6738c == 0) {
                m8980a(this.f6737b);
            }
        }
    }

    static void m8977b(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    public void mo1184a() {
    }

    public void mo1185a(Bundle bundle) {
    }

    boolean m8980a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f6736a) {
            this.f6737b = i2;
            this.f6738c++;
        }
        if (intent == null) {
            m8976b();
            return 2;
        }
        if (VERSION.SDK_INT >= 11) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new gzd(this, intent));
        } else {
            new gze(this, intent).execute(new Void[0]);
        }
        return 3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m8975a(gzc gzc, Intent intent) {
        Object obj = -1;
        try {
            String action = intent.getAction();
            switch (action.hashCode()) {
                case 366519424:
                    if (action.equals("com.google.android.c2dm.intent.RECEIVE")) {
                        Object obj2 = null;
                        break;
                    }
                    break;
            }
        } finally {
            iw.m8984a(intent);
        }
    }
}
