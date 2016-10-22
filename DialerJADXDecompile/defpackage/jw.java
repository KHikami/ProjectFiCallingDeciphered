package defpackage;

import android.os.Build.VERSION;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: jw */
public final class jw {
    private static ka a;

    static {
        if (VERSION.SDK_INT >= 14) {
            a = new jz();
        } else if (VERSION.SDK_INT >= 12) {
            a = new jz();
        } else if (VERSION.SDK_INT >= 9) {
            a = new jy();
        } else if (VERSION.SDK_INT >= 5) {
            a = new jx();
        } else {
            a = new ka();
        }
    }

    public static int a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    public static int b(MotionEvent motionEvent) {
        return (motionEvent.getAction() >> 8) & 255;
    }

    public static int a(MotionEvent motionEvent, int i) {
        return a.a(motionEvent, i);
    }

    public static int b(MotionEvent motionEvent, int i) {
        return a.b(motionEvent, i);
    }

    public static float c(MotionEvent motionEvent, int i) {
        return a.c(motionEvent, i);
    }

    public static float d(MotionEvent motionEvent, int i) {
        return a.d(motionEvent, i);
    }

    public static int c(MotionEvent motionEvent) {
        return a.a(motionEvent);
    }

    public static int d(MotionEvent motionEvent) {
        return a.b(motionEvent);
    }

    public static float e(MotionEvent motionEvent, int i) {
        return a.e(motionEvent, i);
    }
}
