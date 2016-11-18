package p000;

import android.app.ActivityManager;
import android.content.Context;

public final class ash {
    private final Context f2273a;
    private ActivityManager f2274b;
    private asi f2275c;
    private float f2276d = 2.0f;
    private float f2277e = 4.0f;
    private float f2278f = 0.4f;
    private float f2279g = 0.33f;
    private int f2280h = 4194304;

    public ash(Context context) {
        this.f2273a = context;
        this.f2274b = (ActivityManager) context.getSystemService("activity");
        this.f2275c = new asi(context.getResources().getDisplayMetrics());
    }

    public asg m3933a() {
        return new asg(this.f2273a, this.f2274b, this.f2275c, this.f2276d, this.f2277e, this.f2280h, this.f2278f, this.f2279g);
    }
}
