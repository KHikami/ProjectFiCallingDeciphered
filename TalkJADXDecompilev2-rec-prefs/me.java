package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

public final class me {
    private final mf f27565a;

    public me(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public me(Context context, OnGestureListener onGestureListener, Handler handler) {
        if (VERSION.SDK_INT > 17) {
            this.f27565a = new mi(context, onGestureListener, null);
        } else {
            this.f27565a = new mg(context, onGestureListener, null);
        }
    }

    public boolean m31932a(MotionEvent motionEvent) {
        return this.f27565a.mo3745a(motionEvent);
    }
}
