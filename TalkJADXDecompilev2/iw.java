package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

public abstract class iw extends BroadcastReceiver {
    private static final SparseArray<WakeLock> a = new SparseArray();
    private static int b = 1;

    public static ComponentName a(Context context, Intent intent) {
        synchronized (a) {
            int i = b;
            int i2 = b + 1;
            b = i2;
            if (i2 <= 0) {
                b = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            a.put(i, newWakeLock);
            return startService;
        }
    }

    public static boolean a(Intent intent) {
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (a) {
            WakeLock wakeLock = (WakeLock) a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                a.remove(intExtra);
                return true;
            }
            new StringBuilder("No active wake lock id #").append(intExtra);
            return true;
        }
    }
}
