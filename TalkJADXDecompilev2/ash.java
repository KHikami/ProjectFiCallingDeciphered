package defpackage;

import android.app.ActivityManager;
import android.content.Context;

public final class ash {
    private final Context a;
    private ActivityManager b;
    private asi c;
    private float d = 2.0f;
    private float e = 4.0f;
    private float f = 0.4f;
    private float g = 0.33f;
    private int h = 4194304;

    public ash(Context context) {
        this.a = context;
        this.b = (ActivityManager) context.getSystemService("activity");
        this.c = new asi(context.getResources().getDisplayMetrics());
    }

    public asg a() {
        return new asg(this.a, this.b, this.c, this.d, this.e, this.h, this.f, this.g);
    }
}
