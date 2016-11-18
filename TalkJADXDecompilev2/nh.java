package defpackage;

import android.os.Build.VERSION;
import android.view.MotionEvent;

public final class nh {
    static final nj a;

    static {
        if (VERSION.SDK_INT >= 14) {
            a = new ni();
        } else if (VERSION.SDK_INT >= 12) {
            a = new ni();
        } else {
            a = new nj();
        }
    }

    public static int a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    public static int b(MotionEvent motionEvent) {
        return (motionEvent.getAction() >> 8) & 255;
    }

    @Deprecated
    public static int a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    public static int b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    public static float c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    public static float d(MotionEvent motionEvent, int i) {
        return a.a(motionEvent, i);
    }
}
