package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.Log;

public final class asg {
    private final int f2269a;
    private final int f2270b;
    private final Context f2271c;
    private final int f2272d;

    asg(Context context, ActivityManager activityManager, asi asi, float f, float f2, int i, float f3, float f4) {
        this.f2271c = context;
        if (asg.m3929a(activityManager)) {
            i /= 2;
        }
        this.f2272d = i;
        float memoryClass = (float) ((activityManager.getMemoryClass() << 10) << 10);
        if (!asg.m3929a(activityManager)) {
            f4 = f3;
        }
        int round = Math.round(memoryClass * f4);
        int a = (asi.m3934a() * asi.m3935b()) << 2;
        int round2 = Math.round(((float) a) * f2);
        a = Math.round(((float) a) * f);
        int i2 = round - this.f2272d;
        if (a + round2 <= i2) {
            this.f2270b = a;
            this.f2269a = round2;
        } else {
            float f5 = ((float) i2) / (f2 + f);
            this.f2270b = Math.round(f5 * f);
            this.f2269a = Math.round(f5 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            String valueOf = String.valueOf(m3928a(this.f2270b));
            String valueOf2 = String.valueOf(m3928a(this.f2269a));
            String valueOf3 = String.valueOf(m3928a(this.f2272d));
            boolean z = a + round2 > round;
            String valueOf4 = String.valueOf(m3928a(round));
            new StringBuilder((((String.valueOf(valueOf).length() + 177) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("Calculation complete, Calculated memory cache size: ").append(valueOf).append(", pool size: ").append(valueOf2).append(", byte array size: ").append(valueOf3).append(", memory class limited? ").append(z).append(", max size: ").append(valueOf4).append(", memoryClass: ").append(activityManager.getMemoryClass()).append(", isLowMemoryDevice: ").append(asg.m3929a(activityManager));
        }
    }

    public int m3930a() {
        return this.f2270b;
    }

    public int m3931b() {
        return this.f2269a;
    }

    public int m3932c() {
        return this.f2272d;
    }

    private String m3928a(int i) {
        return Formatter.formatFileSize(this.f2271c, (long) i);
    }

    private static boolean m3929a(ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return VERSION.SDK_INT < 11;
    }
}
