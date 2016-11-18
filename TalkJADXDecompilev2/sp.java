package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public final class sp {
    private static final ss b;
    private Object a;

    static {
        if (VERSION.SDK_INT >= 21) {
            b = new st();
        } else if (VERSION.SDK_INT >= 14) {
            b = new sr();
        } else {
            b = new sq();
        }
    }

    public sp(Context context) {
        this.a = b.a(context);
    }

    public void a(int i, int i2) {
        b.a(this.a, i, i2);
    }

    public boolean a() {
        return b.a(this.a);
    }

    public void b() {
        b.b(this.a);
    }

    @Deprecated
    public boolean a(float f) {
        return b.a(this.a, f);
    }

    public boolean a(float f, float f2) {
        return b.a(this.a, f, f2);
    }

    public boolean c() {
        return b.c(this.a);
    }

    public boolean a(int i) {
        return b.a(this.a, i);
    }

    public boolean a(Canvas canvas) {
        return b.a(this.a, canvas);
    }
}
