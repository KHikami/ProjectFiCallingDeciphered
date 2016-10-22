package defpackage;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* compiled from: PG */
/* renamed from: oz */
final class oz implements oy {
    oz() {
    }

    public final Object a(Context context, Interpolator interpolator) {
        return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
    }

    public final boolean a(Object obj) {
        return ((Scroller) obj).isFinished();
    }

    public final int b(Object obj) {
        return ((Scroller) obj).getCurrX();
    }

    public final int c(Object obj) {
        return ((Scroller) obj).getCurrY();
    }

    public final float d(Object obj) {
        return 0.0f;
    }

    public final boolean e(Object obj) {
        return ((Scroller) obj).computeScrollOffset();
    }

    public final void a(Object obj, int i, int i2, int i3, int i4) {
        ((Scroller) obj).startScroll(i, i2, i3, i4);
    }

    public final void a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((Scroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    public final void a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((Scroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public final void a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        ((Scroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public final void f(Object obj) {
        ((Scroller) obj).abortAnimation();
    }

    public final int g(Object obj) {
        return ((Scroller) obj).getFinalX();
    }

    public final int h(Object obj) {
        return ((Scroller) obj).getFinalY();
    }

    public final boolean a(Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
        return false;
    }
}
