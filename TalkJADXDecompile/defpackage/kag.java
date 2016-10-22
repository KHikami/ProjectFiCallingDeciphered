package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Process;
import android.util.Log;
import com.google.android.libraries.stitch.incompat.PlatformBugActivity;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: kag */
public final class kag implements UncaughtExceptionHandler {
    private final UncaughtExceptionHandler a;
    private final Context b;
    private final kah c;

    public kag(Context context, UncaughtExceptionHandler uncaughtExceptionHandler, kah kah) {
        this.a = uncaughtExceptionHandler;
        this.b = (Context) ba.a((Object) context, (Object) "context");
        this.c = kah;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            for (kaf kaf : jyn.c(this.b, kaf.class)) {
                if (kaf.a(th2)) {
                    try {
                        kaf.a(this.b).createNewFile();
                    } catch (Throwable e) {
                        Log.wtf("PlatformBugHandler", "Cannot create marker for platform bug file", e);
                    }
                    if (this.c != null) {
                        this.c.a(thread, th2, (String) kaf.a());
                    }
                    System.exit(0);
                }
            }
        }
        if (this.a != null) {
            this.a.uncaughtException(thread, th);
        } else {
            th.printStackTrace();
        }
    }

    public static boolean a(Context context) {
        for (kaf kaf : jyn.c(context, kaf.class)) {
            if (kaf.a(context).exists()) {
                try {
                    String str;
                    ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context, PlatformBugActivity.class), 0);
                    int myPid = Process.myPid();
                    for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                        if (runningAppProcessInfo.pid == myPid) {
                            str = runningAppProcessInfo.processName;
                            break;
                        }
                    }
                    str = null;
                    if (str == null || str.equals(activityInfo.processName)) {
                        return true;
                    }
                    Intent intent = new Intent(context, PlatformBugActivity.class);
                    intent.addFlags(884998144);
                    intent.putExtra("extra_error_type", (String) kaf.a());
                    context.startActivity(intent);
                    System.exit(0);
                    return true;
                } catch (Throwable e) {
                    Log.wtf("PlatformBugHandler", "Cannot find PlatformBugActivity", e);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Context context) {
        for (kaf a : jyn.c(context, kaf.class)) {
            if (a.a(context).exists()) {
                return true;
            }
        }
        return false;
    }
}
