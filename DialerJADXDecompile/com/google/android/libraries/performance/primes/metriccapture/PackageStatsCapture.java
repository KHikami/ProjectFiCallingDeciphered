package com.google.android.libraries.performance.primes.metriccapture;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.IPackageStatsObserver.Stub;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Process;
import android.util.Log;
import buf;
import cww;
import cwx;
import cwy;
import java.lang.reflect.Modifier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class PackageStatsCapture {
    static final PackageStatsInvocation[] GETTER_INVOCATIONS;

    /* compiled from: PG */
    final class PackageStatsCallback extends Stub {
        final Semaphore a;
        volatile PackageStats b;

        PackageStatsCallback() {
            this.a = new Semaphore(1);
        }

        public final void onGetStatsCompleted(PackageStats packageStats, boolean z) {
            if (z) {
                if (Log.isLoggable("PackageStatsCapture", 3)) {
                    String valueOf = String.valueOf(packageStats);
                    new StringBuilder(String.valueOf(valueOf).length() + 30).append("Success getting PackageStats: ").append(valueOf);
                }
                this.b = packageStats;
            } else {
                Log.w("PackageStatsCapture", "Failure getting PackageStats");
            }
            this.a.release();
        }
    }

    /* compiled from: PG */
    public abstract class PackageStatsInvocation {
        private final String a;
        private final Class[] b;

        public abstract Object[] a(String str, int i, IPackageStatsObserver iPackageStatsObserver);

        public PackageStatsInvocation(String str, Class[] clsArr) {
            this.a = str;
            this.b = clsArr;
        }

        boolean invoke(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) {
            Throwable e;
            try {
                packageManager.getClass().getMethod(this.a, this.b).invoke(packageManager, a(str, i, iPackageStatsObserver));
                return true;
            } catch (NoSuchMethodException e2) {
                return false;
            } catch (Exception e3) {
                e = e3;
                Log.e("PackageStatsCapture", "PackageStats failure", e);
                return false;
            } catch (Error e4) {
                e = e4;
                Log.e("PackageStatsCapture", "PackageStats failure", e);
                return false;
            }
        }
    }

    private PackageStatsCapture() {
    }

    static {
        r0 = new PackageStatsInvocation[3];
        r0[0] = new cww("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class});
        r0[1] = new cwx("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class});
        r0[2] = new cwy("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class});
        GETTER_INVOCATIONS = r0;
    }

    private static boolean a() {
        try {
            return !Modifier.isAbstract(PackageStatsCallback.class.getMethod("onGetStatsCompleted", new Class[]{PackageStats.class, Boolean.TYPE}).getModifiers());
        } catch (Exception e) {
            return false;
        } catch (Error e2) {
            return false;
        }
    }

    static PackageStats getPackageStatsUsingInternalAPI(Context context, long j, PackageStatsInvocation... packageStatsInvocationArr) {
        if (a()) {
            PackageStatsCallback packageStatsCallback = new PackageStatsCallback();
            try {
                packageStatsCallback.a.acquire();
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                int myUid = Process.myUid();
                int length = packageStatsInvocationArr.length;
                int i = 0;
                while (i < length) {
                    if (!packageStatsInvocationArr[i].invoke(packageManager, packageName, myUid, packageStatsCallback)) {
                        i++;
                    } else if (packageStatsCallback.a.tryAcquire(j, TimeUnit.MILLISECONDS)) {
                        return packageStatsCallback.b;
                    } else {
                        Log.w("PackageStatsCapture", "Timeout while waiting for PackageStats callback");
                        return null;
                    }
                }
                Log.w("PackageStatsCapture", "Couldn't capture PackageStats.");
                return null;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        Log.w("PackageStatsCapture", "Callback implementation stripped by proguard.");
        return null;
    }

    public static PackageStats getPackageStats(Context context) {
        Object obj;
        buf.G();
        if (context.getPackageManager().checkPermission("android.permission.GET_PACKAGE_SIZE", context.getPackageName()) == 0 || context.checkCallingOrSelfPermission("android.permission.GET_PACKAGE_SIZE") == 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            return getPackageStatsUsingInternalAPI(context, 15000, GETTER_INVOCATIONS);
        }
        Log.w("PackageStatsCapture", "android.permission.GET_PACKAGE_SIZE required");
        return null;
    }
}
