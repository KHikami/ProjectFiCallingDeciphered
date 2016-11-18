package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public final class sp {
    private static final ss f35113b;
    private Object f35114a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f35113b = new st();
        } else if (VERSION.SDK_INT >= 14) {
            f35113b = new sr();
        } else {
            f35113b = new sq();
        }
    }

    public sp(Context context) {
        this.f35114a = f35113b.mo4368a(context);
    }

    public void m40643a(int i, int i2) {
        f35113b.mo4369a(this.f35114a, i, i2);
    }

    public boolean m40644a() {
        return f35113b.mo4370a(this.f35114a);
    }

    public void m40649b() {
        f35113b.mo4375b(this.f35114a);
    }

    @Deprecated
    public boolean m40645a(float f) {
        return f35113b.mo4371a(this.f35114a, f);
    }

    public boolean m40646a(float f, float f2) {
        return f35113b.mo4372a(this.f35114a, f, f2);
    }

    public boolean m40650c() {
        return f35113b.mo4376c(this.f35114a);
    }

    public boolean m40647a(int i) {
        return f35113b.mo4373a(this.f35114a, i);
    }

    public boolean m40648a(Canvas canvas) {
        return f35113b.mo4374a(this.f35114a, canvas);
    }
}
