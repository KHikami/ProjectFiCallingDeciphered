import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

final class jgy {
    private static jgy a;
    private final Context b;
    private final SparseArray<WakeLock> c;
    private int d;

    static synchronized jgy a(Context context) {
        jgy jgy;
        synchronized (jgy.class) {
            if (a == null) {
                a = new jgy(context);
            }
            jgy = a;
        }
        return jgy;
    }

    private jgy(Context context) {
        this.c = new SparseArray();
        this.b = context;
    }

    int a(String str, long j) {
        synchronized (this.c) {
            int i = this.d + 1;
            this.d = i;
            if (i <= 0) {
                this.d = 1;
            }
            PowerManager powerManager = (PowerManager) this.b.getSystemService("power");
            String str2 = "BackgroundTaskService-";
            String valueOf = String.valueOf(str);
            WakeLock newWakeLock = powerManager.newWakeLock(1, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            newWakeLock.setReferenceCounted(false);
            if (j > 0) {
                newWakeLock.acquire(j);
            } else {
                newWakeLock.acquire();
            }
            this.c.put(this.d, newWakeLock);
        }
        return this.d;
    }

    void a(int i) {
        synchronized (this.c) {
            WakeLock wakeLock = (WakeLock) this.c.get(i);
            if (wakeLock != null) {
                wakeLock.release();
                this.c.remove(i);
            }
        }
    }
}
