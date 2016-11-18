package p000;

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

public final class kag implements UncaughtExceptionHandler {
    private final UncaughtExceptionHandler f21341a;
    private final Context f21342b;
    private final kah f21343c;

    public kag(Context context, UncaughtExceptionHandler uncaughtExceptionHandler, kah kah) {
        this.f21341a = uncaughtExceptionHandler;
        this.f21342b = (Context) ba.m4537a((Object) context, (Object) "context");
        this.f21343c = kah;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            for (kaf kaf : jyn.m25438c(this.f21342b, kaf.class)) {
                if (kaf.mo3635a(th2)) {
                    try {
                        kaf.mo3633a(this.f21342b).createNewFile();
                    } catch (Throwable e) {
                        Log.wtf("PlatformBugHandler", "Cannot create marker for platform bug file", e);
                    }
                    if (this.f21343c != null) {
                        this.f21343c.m25502a(thread, th2, (String) kaf.mo3634a());
                    }
                    System.exit(0);
                }
            }
        }
        if (this.f21341a != null) {
            this.f21341a.uncaughtException(thread, th);
        } else {
            th.printStackTrace();
        }
    }

    public static boolean m25500a(Context context) {
        for (kaf kaf : jyn.m25438c(context, kaf.class)) {
            if (kaf.mo3633a(context).exists()) {
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
                    intent.putExtra("extra_error_type", (String) kaf.mo3634a());
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

    public static boolean m25501b(Context context) {
        for (kaf a : jyn.m25438c(context, kaf.class)) {
            if (a.mo3633a(context).exists()) {
                return true;
            }
        }
        return false;
    }
}
