import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import java.util.List;

/* compiled from: PG */
public final class cwz {
    private static ActivityManager a;

    static {
        a = null;
    }

    public static ActivityManager a(Context context) {
        if (a == null) {
            a = (ActivityManager) context.getSystemService("activity");
        }
        return a;
    }

    public static boolean b(Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.contains(context.getPackageName())) {
                    int i = runningAppProcessInfo.importance == 100 ? 1 : 0;
                    if (VERSION.SDK_INT < 23) {
                        i &= c(context);
                    }
                    if (i != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @TargetApi(20)
    public static boolean c(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return VERSION.SDK_INT >= 20 ? powerManager.isInteractive() : powerManager.isScreenOn();
    }
}
