import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

public class t extends bc {
    private Runnable a;
    ox b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private VelocityTracker g;

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.c) {
            return true;
        }
        int y;
        switch (jw.a(motionEvent)) {
            case rl.c /*0*/:
                this.c = false;
                int x = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (c(view) && coordinatorLayout.a(view, x, y)) {
                    this.e = y;
                    this.d = jw.b(motionEvent, 0);
                    M();
                    break;
                }
            case rq.b /*1*/:
            case rl.e /*3*/:
                this.c = false;
                this.d = -1;
                if (this.g != null) {
                    this.g.recycle();
                    this.g = null;
                    break;
                }
                break;
            case rq.c /*2*/:
                y = this.d;
                if (y != -1) {
                    y = jw.a(motionEvent, y);
                    if (y != -1) {
                        y = (int) jw.d(motionEvent, y);
                        if (Math.abs(y - this.e) > this.f) {
                            this.c = true;
                            this.e = y;
                            break;
                        }
                    }
                }
                break;
        }
        if (this.g != null) {
            this.g.addMovement(motionEvent);
        }
        return this.c;
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (jw.a(motionEvent)) {
            case rl.c /*0*/:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.a(view, (int) motionEvent.getX(), y) && c(view)) {
                    this.e = y;
                    this.d = jw.b(motionEvent, 0);
                    M();
                    break;
                }
                return false;
                break;
            case rq.b /*1*/:
                if (this.g != null) {
                    this.g.addMovement(motionEvent);
                    this.g.computeCurrentVelocity(1000);
                    a(coordinatorLayout, view, -a(view), 0, kj.b(this.g, this.d));
                    break;
                }
                break;
            case rq.c /*2*/:
                int a = jw.a(motionEvent, this.d);
                if (a != -1) {
                    a = (int) jw.d(motionEvent, a);
                    int i = this.e - a;
                    if (!this.c && Math.abs(i) > this.f) {
                        this.c = true;
                        i = i > 0 ? i - this.f : i + this.f;
                    }
                    if (this.c) {
                        this.e = a;
                        b(coordinatorLayout, view, i, b(view), 0);
                        break;
                    }
                }
                return false;
                break;
            case rl.e /*3*/:
                break;
        }
        this.c = false;
        this.d = -1;
        if (this.g != null) {
            this.g.recycle();
            this.g = null;
        }
        if (this.g != null) {
            this.g.addMovement(motionEvent);
        }
        return true;
    }

    public final int b(CoordinatorLayout coordinatorLayout, View view, int i) {
        return a(coordinatorLayout, view, i, (int) oe.INVALID_ID, Integer.MAX_VALUE);
    }

    int a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int b = b();
        if (i2 == 0 || b < i2 || b > i3) {
            return 0;
        }
        int a = buf.a(i, i2, i3);
        if (b == a) {
            return 0;
        }
        a(a);
        return b - a;
    }

    int a() {
        return b();
    }

    final int b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return a(coordinatorLayout, view, a() - i, i2, i3);
    }

    final boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, float f) {
        if (this.a != null) {
            view.removeCallbacks(this.a);
            this.a = null;
        }
        if (this.b == null) {
            this.b = ox.a(view.getContext(), null);
        }
        this.b.a(0, b(), 0, Math.round(f), 0, 0, i, 0);
        if (this.b.g()) {
            this.a = new u(this, coordinatorLayout, view);
            kn.a(view, this.a);
            return true;
        }
        a(coordinatorLayout, view);
        return false;
    }

    void a(CoordinatorLayout coordinatorLayout, View view) {
    }

    boolean c(View view) {
        return false;
    }

    int b(View view) {
        return -view.getHeight();
    }

    int a(View view) {
        return view.getHeight();
    }

    private final void M() {
        if (this.g == null) {
            this.g = VelocityTracker.obtain();
        }
    }
}
