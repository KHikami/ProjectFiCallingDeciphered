package p000;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

final class jgy {
    private static jgy f20043a;
    private final Context f20044b;
    private final SparseArray<WakeLock> f20045c = new SparseArray();
    private int f20046d;

    static synchronized jgy m24183a(Context context) {
        jgy jgy;
        synchronized (jgy.class) {
            if (f20043a == null) {
                f20043a = new jgy(context);
            }
            jgy = f20043a;
        }
        return jgy;
    }

    private jgy(Context context) {
        this.f20044b = context;
    }

    int m24184a(String str, long j) {
        synchronized (this.f20045c) {
            int i = this.f20046d + 1;
            this.f20046d = i;
            if (i <= 0) {
                this.f20046d = 1;
            }
            PowerManager powerManager = (PowerManager) this.f20044b.getSystemService("power");
            String str2 = "BackgroundTaskService-";
            String valueOf = String.valueOf(str);
            WakeLock newWakeLock = powerManager.newWakeLock(1, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            newWakeLock.setReferenceCounted(false);
            if (j > 0) {
                newWakeLock.acquire(j);
            } else {
                newWakeLock.acquire();
            }
            this.f20045c.put(this.f20046d, newWakeLock);
        }
        return this.f20046d;
    }

    void m24185a(int i) {
        synchronized (this.f20045c) {
            WakeLock wakeLock = (WakeLock) this.f20045c.get(i);
            if (wakeLock != null) {
                wakeLock.release();
                this.f20045c.remove(i);
            }
        }
    }
}
