package com.google.android.apps.hangouts.phone;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.Log;
import ci;
import cj;
import ekg;
import epf;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jjw;
import lhi;
import lhj;
import lhu;
import mpi;
import mpj;

public final class Hangouts_Application extends Application implements lhj<epf> {
    public static final long a;
    private static final AtomicBoolean b;
    private final Object c;
    private volatile epf d;

    public /* synthetic */ Object a() {
        return b();
    }

    public Hangouts_Application() {
        this.c = new Object();
    }

    static {
        a = SystemClock.elapsedRealtime();
        b = new AtomicBoolean(false);
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (!ci.b) {
            if (VERSION.SDK_INT < 4) {
                throw new RuntimeException("Multi dex installation failed. SDK " + VERSION.SDK_INT + " is unsupported. Min SDK version is 4" + ".");
            }
            try {
                PackageManager packageManager = getPackageManager();
                String packageName = getPackageName();
                if (packageManager != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                        if (applicationInfo != null) {
                            synchronized (ci.a) {
                                String str = applicationInfo.sourceDir;
                                if (ci.a.contains(str)) {
                                    return;
                                }
                                ci.a.add(str);
                                if (VERSION.SDK_INT > 20) {
                                    new StringBuilder("MultiDex is not guaranteed to work in SDK version ").append(VERSION.SDK_INT).append(": SDK version higher than 20").append(" should be backed by ").append("runtime with built-in multidex capabilty but it's not the ").append("case here: java.vm.version=\"").append(System.getProperty("java.vm.version")).append("\"");
                                }
                                try {
                                    ClassLoader classLoader = getClassLoader();
                                    if (classLoader == null) {
                                        Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                                        return;
                                    }
                                    File file = new File(getFilesDir(), "secondary-dexes");
                                    List a = cj.a((Context) this, applicationInfo, file, false);
                                    if (ci.a(a)) {
                                        ci.a(classLoader, file, a);
                                    } else {
                                        List a2 = cj.a((Context) this, applicationInfo, file, true);
                                        if (ci.a(a2)) {
                                            ci.a(classLoader, file, a2);
                                        } else {
                                            throw new RuntimeException("Zip files were not valid.");
                                        }
                                    }
                                } catch (RuntimeException e) {
                                }
                            }
                        }
                    } catch (Throwable e2) {
                        Log.e("MultiDex", "Multidex installation failure", e2);
                        throw new RuntimeException("Multi dex installation failed (" + e2.getMessage() + ").");
                    }
                }
            } catch (RuntimeException e3) {
            }
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        jjw.a();
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        jjw.a(i);
    }

    private epf b() {
        c();
        return this.d;
    }

    private void c() {
        if (this.d == null) {
            synchronized (this.c) {
                if (this.d == null) {
                    this.d = new ekg().a(new lhu(this)).a();
                }
            }
        }
    }

    public void onCreate() {
        c();
        this.d.o().a();
        if (!b.getAndSet(true)) {
            mpj a = new mpj().a(this.d.m());
            if (mpi.a.compareAndSet(false, true)) {
                mpi.a(a.b);
                mpi.a(a.a);
            } else {
                throw new IllegalStateException("Logger backend configuration may only occur once.");
            }
        }
        for (lhi a2 : this.d.n()) {
            a2.a();
        }
        super.onCreate();
    }
}
