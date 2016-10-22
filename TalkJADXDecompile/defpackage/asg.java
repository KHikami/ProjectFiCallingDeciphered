package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.Log;

/* renamed from: asg */
public final class asg {
    private final int a;
    private final int b;
    private final Context c;
    private final int d;

    asg(Context context, ActivityManager activityManager, asi asi, float f, float f2, int i, float f3, float f4) {
        this.c = context;
        if (asg.a(activityManager)) {
            i /= 2;
        }
        this.d = i;
        float memoryClass = (float) ((activityManager.getMemoryClass() << 10) << 10);
        if (!asg.a(activityManager)) {
            f4 = f3;
        }
        int round = Math.round(memoryClass * f4);
        int a = (asi.a() * asi.b()) << 2;
        int round2 = Math.round(((float) a) * f2);
        a = Math.round(((float) a) * f);
        int i2 = round - this.d;
        if (a + round2 <= i2) {
            this.b = a;
            this.a = round2;
        } else {
            float f5 = ((float) i2) / (f2 + f);
            this.b = Math.round(f5 * f);
            this.a = Math.round(f5 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            String valueOf = String.valueOf(a(this.b));
            String valueOf2 = String.valueOf(a(this.a));
            String valueOf3 = String.valueOf(a(this.d));
            boolean z = a + round2 > round;
            String valueOf4 = String.valueOf(a(round));
            new StringBuilder((((String.valueOf(valueOf).length() + 177) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("Calculation complete, Calculated memory cache size: ").append(valueOf).append(", pool size: ").append(valueOf2).append(", byte array size: ").append(valueOf3).append(", memory class limited? ").append(z).append(", max size: ").append(valueOf4).append(", memoryClass: ").append(activityManager.getMemoryClass()).append(", isLowMemoryDevice: ").append(asg.a(activityManager));
        }
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.d;
    }

    private String a(int i) {
        return Formatter.formatFileSize(this.c, (long) i);
    }

    private static boolean a(ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return VERSION.SDK_INT < 11;
    }
}
