package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.util.Log;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: cqn */
public final class cqn {
    private static volatile cqn e;
    public final Context a;
    final List b;
    public final cqp c;
    public UncaughtExceptionHandler d;
    private volatile cqu f;

    private cqn(Context context) {
        Object applicationContext = context.getApplicationContext();
        buf.A(applicationContext);
        this.a = applicationContext;
        this.c = new cqp(this);
        this.b = new CopyOnWriteArrayList();
        cqi cqi = new cqi();
    }

    public static cqn a(Context context) {
        buf.A((Object) context);
        if (e == null) {
            synchronized (cqn.class) {
                if (e == null) {
                    e = new cqn(context);
                }
            }
        }
        return e;
    }

    public static void b() {
        if (!(Thread.currentThread() instanceof cqs)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final cqu a() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    cqu cqu = new cqu();
                    PackageManager packageManager = this.a.getPackageManager();
                    String packageName = this.a.getPackageName();
                    cqu.c = packageName;
                    cqu.d = packageManager.getInstallerPackageName(packageName);
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.a.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (NameNotFoundException e) {
                        Log.e("GAv4", "Error retrieving package info: appName set to " + packageName);
                    }
                    cqu.a = packageName;
                    cqu.b = str;
                    this.f = cqu;
                }
            }
        }
        return this.f;
    }

    public final Future a(Callable callable) {
        buf.A((Object) callable);
        if (!(Thread.currentThread() instanceof cqs)) {
            return this.c.submit(callable);
        }
        Future futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    public final void a(Runnable runnable) {
        buf.A((Object) runnable);
        this.c.submit(runnable);
    }
}
