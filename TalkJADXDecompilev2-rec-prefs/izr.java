package p000;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import java.util.List;

public final class izr {
    private static ActivityManager f19494a = null;

    public static ActivityManager m23604a(Context context) {
        if (f19494a == null) {
            f19494a = (ActivityManager) context.getSystemService("activity");
        }
        return f19494a;
    }

    public static boolean m23605b(Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.contains(context.getPackageName())) {
                    int i = runningAppProcessInfo.importance == 100 ? 1 : 0;
                    if (VERSION.SDK_INT < 23) {
                        i &= izr.m23606c(context);
                    }
                    if (i != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean m23606c(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return VERSION.SDK_INT >= 20 ? powerManager.isInteractive() : powerManager.isScreenOn();
    }
}
