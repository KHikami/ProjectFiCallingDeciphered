package com.google.android.libraries.social.silentfeedback.impl;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.util.Log;
import idx;
import idy;
import ifi;
import ifj;
import jxu;
import jxw;
import jyn;

public final class SilentFeedbackService extends Service {
    private final Object a;
    private int b;
    private int c;

    public SilentFeedbackService() {
        this.a = new Object();
        this.b = 0;
        this.c = 0;
    }

    private boolean b() {
        int i;
        try {
            i = getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException e) {
            i = 0;
        }
        if (i < 6577000) {
            return false;
        }
        return true;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void a() {
        Integer num = null;
        synchronized (this.a) {
            int i = this.b - 1;
            this.b = i;
            if (i < 0) {
                Log.wtf("SilentFeedbackService", "Negative pending crash count: " + this.b);
                this.b = 0;
            }
            if (this.b == 0) {
                num = Integer.valueOf(this.c);
            }
        }
        if (num != null) {
            stopSelf(num.intValue());
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.a) {
            this.b++;
            this.c = i2;
        }
        if (b()) {
            idx a = ((idy) jyn.a(getApplication(), idy.class)).a(((ifj) jyn.a(getApplication(), ifj.class)).a()).a();
            a.a(new jxu(this, ((ifi) jyn.a(getApplication(), ifi.class)).a(a), intent, a));
            a.a(new jxw(this));
            a.a();
        } else {
            a();
        }
        return 2;
    }
}
