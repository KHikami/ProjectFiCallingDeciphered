package p000;

import android.os.Build.VERSION;
import android.view.MotionEvent;

public final class nh {
    static final nj f29815a;

    static {
        if (VERSION.SDK_INT >= 14) {
            f29815a = new ni();
        } else if (VERSION.SDK_INT >= 12) {
            f29815a = new ni();
        } else {
            f29815a = new nj();
        }
    }

    public static int m34904a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    public static int m34906b(MotionEvent motionEvent) {
        return (motionEvent.getAction() >> 8) & 255;
    }

    @Deprecated
    public static int m34905a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    public static int m34907b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    public static float m34908c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    public static float m34909d(MotionEvent motionEvent, int i) {
        return f29815a.mo3973a(motionEvent, i);
    }
}
