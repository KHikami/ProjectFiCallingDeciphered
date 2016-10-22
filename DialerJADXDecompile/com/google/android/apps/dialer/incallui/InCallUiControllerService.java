package com.google.android.apps.dialer.incallui;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import bdf;
import bio;
import bip;
import blx;
import bqs;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
public class InCallUiControllerService extends Service {
    public static final HashSet a;
    public final Handler b;
    private final blx c;

    public InCallUiControllerService() {
        this.b = new bio(this, Looper.getMainLooper());
        this.c = new blx(this);
    }

    static {
        a = new HashSet();
    }

    public static void a(Context context) {
        int callingUid = Binder.getCallingUid();
        if (callingUid == Process.myUid()) {
            bdf.f("InCallUiControllerService", "Expected to be called from another app.");
        }
        PackageManager packageManager = context.getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(callingUid);
        int length = packagesForUid.length;
        callingUid = 0;
        while (callingUid < length) {
            if (!bqs.a(packageManager, packagesForUid[callingUid])) {
                callingUid++;
            } else {
                return;
            }
        }
        throw new SecurityException("Calling package must be Google signed");
    }

    public IBinder onBind(Intent intent) {
        bdf.d(this, "onBind");
        return this.c;
    }

    public boolean onUnbind(Intent intent) {
        bdf.d(this, "Unregistering UI listeners");
        Iterator it = ((HashSet) a.clone()).iterator();
        while (it.hasNext()) {
            ((bip) it.next()).b();
        }
        return super.onUnbind(intent);
    }
}
