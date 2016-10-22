package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: ash */
public final class ash {
    private final Context a;
    private ActivityManager b;
    private asi c;
    private float d;
    private float e;
    private float f;
    private float g;
    private int h;

    public ash(Context context) {
        this.d = 2.0f;
        this.e = 4.0f;
        this.f = 0.4f;
        this.g = 0.33f;
        this.h = 4194304;
        this.a = context;
        this.b = (ActivityManager) context.getSystemService("activity");
        this.c = new asi(context.getResources().getDisplayMetrics());
    }

    public asg a() {
        return new asg(this.a, this.b, this.c, this.d, this.e, this.h, this.f, this.g);
    }
}
