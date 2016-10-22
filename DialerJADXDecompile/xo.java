import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
final class xo implements Runnable {
    private /* synthetic */ xm a;

    xo(xm xmVar) {
        this.a = xmVar;
    }

    public final void run() {
        xm xmVar = this.a;
        xmVar.d();
        View view = xmVar.a;
        if (view.isEnabled() && !view.isLongClickable() && xmVar.b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            xmVar.b = true;
        }
    }
}
