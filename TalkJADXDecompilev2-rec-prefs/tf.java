package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

public final class tf {
    OverScroller f35133a;
    private final boolean f35134b;

    public static tf m40727a(Context context, Interpolator interpolator) {
        return new tf(VERSION.SDK_INT >= 14, context, interpolator);
    }

    private tf(boolean z, Context context, Interpolator interpolator) {
        this.f35134b = z;
        this.f35133a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    public boolean m40732a() {
        return this.f35133a.isFinished();
    }

    public int m40734b() {
        return this.f35133a.getCurrX();
    }

    public int m40735c() {
        return this.f35133a.getCurrY();
    }

    public int m40736d() {
        return this.f35133a.getFinalX();
    }

    public int m40737e() {
        return this.f35133a.getFinalY();
    }

    public float m40738f() {
        return this.f35134b ? gwb.H(this.f35133a) : 0.0f;
    }

    public boolean m40739g() {
        return this.f35133a.computeScrollOffset();
    }

    public void m40728a(int i, int i2, int i3, int i4) {
        this.f35133a.startScroll(i, i2, 0, i4);
    }

    public void m40729a(int i, int i2, int i3, int i4, int i5) {
        this.f35133a.startScroll(i, i2, i3, i4, i5);
    }

    public void m40730a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f35133a.fling(0, i2, i3, i4, i5, i6, i7, i8);
    }

    public void m40731a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f35133a.fling(i, i2, 0, i4, 0, 0, 0, i8, 0, i10);
    }

    public boolean m40733a(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f35133a.springBack(i, i2, 0, 0, 0, i6);
    }

    public void m40740h() {
        this.f35133a.abortAnimation();
    }
}
