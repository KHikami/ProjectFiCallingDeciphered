package p000;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

public abstract class iw extends BroadcastReceiver {
    private static final SparseArray<WakeLock> f6740a = new SparseArray();
    private static int f6741b = 1;

    public static ComponentName m8983a(Context context, Intent intent) {
        synchronized (f6740a) {
            int i = f6741b;
            int i2 = f6741b + 1;
            f6741b = i2;
            if (i2 <= 0) {
                f6741b = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f6740a.put(i, newWakeLock);
            return startService;
        }
    }

    public static boolean m8984a(Intent intent) {
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f6740a) {
            WakeLock wakeLock = (WakeLock) f6740a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f6740a.remove(intExtra);
                return true;
            }
            new StringBuilder("No active wake lock id #").append(intExtra);
            return true;
        }
    }
}
