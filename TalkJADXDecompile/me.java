import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

public final class me {
    private final mf a;

    public me(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public me(Context context, OnGestureListener onGestureListener, Handler handler) {
        if (VERSION.SDK_INT > 17) {
            this.a = new mi(context, onGestureListener, null);
        } else {
            this.a = new mg(context, onGestureListener, null);
        }
    }

    public boolean a(MotionEvent motionEvent) {
        return this.a.a(motionEvent);
    }
}
