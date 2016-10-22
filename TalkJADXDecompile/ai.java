import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

public class ai<V extends View> extends bp<V> {
    private Runnable a;
    tf b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private VelocityTracker g;

    public ai() {
        this.d = -1;
        this.f = -1;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.c) {
            return true;
        }
        int y;
        switch (nh.a(motionEvent)) {
            case wi.w /*0*/:
                this.c = false;
                int x = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (c(v) && coordinatorLayout.a((View) v, x, y)) {
                    this.e = y;
                    this.d = motionEvent.getPointerId(0);
                    aX();
                    break;
                }
            case wi.j /*1*/:
            case wi.z /*3*/:
                this.c = false;
                this.d = -1;
                if (this.g != null) {
                    this.g.recycle();
                    this.g = null;
                    break;
                }
                break;
            case wi.l /*2*/:
                y = this.d;
                if (y != -1) {
                    y = motionEvent.findPointerIndex(y);
                    if (y != -1) {
                        y = (int) motionEvent.getY(y);
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

    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (nh.a(motionEvent)) {
            case wi.w /*0*/:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.a((View) v, (int) motionEvent.getX(), y) && c(v)) {
                    this.e = y;
                    this.d = motionEvent.getPointerId(0);
                    aX();
                    break;
                }
                return false;
                break;
            case wi.j /*1*/:
                if (this.g != null) {
                    this.g.addMovement(motionEvent);
                    this.g.computeCurrentVelocity(1000);
                    a(coordinatorLayout, (View) v, -a(v), 0, nw.b(this.g, this.d));
                    break;
                }
                break;
            case wi.l /*2*/:
                int findPointerIndex = motionEvent.findPointerIndex(this.d);
                if (findPointerIndex != -1) {
                    findPointerIndex = (int) motionEvent.getY(findPointerIndex);
                    int i = this.e - findPointerIndex;
                    if (!this.c && Math.abs(i) > this.f) {
                        this.c = true;
                        i = i > 0 ? i - this.f : i + this.f;
                    }
                    if (this.c) {
                        this.e = findPointerIndex;
                        b(coordinatorLayout, v, i, b(v), 0);
                        break;
                    }
                }
                return false;
                break;
            case wi.z /*3*/:
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

    public int a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return a(coordinatorLayout, (View) v, i, (int) nzf.UNSET_ENUM_VALUE, Integer.MAX_VALUE);
    }

    int a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b = b();
        if (i2 == 0 || b < i2 || b > i3) {
            return 0;
        }
        int a = gwb.a(i, i2, i3);
        if (b == a) {
            return 0;
        }
        a(a);
        return b - a;
    }

    int a() {
        return b();
    }

    final int b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return a(coordinatorLayout, (View) v, a() - i, i2, i3);
    }

    final boolean a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        if (this.a != null) {
            v.removeCallbacks(this.a);
            this.a = null;
        }
        if (this.b == null) {
            this.b = tf.a(v.getContext(), null);
        }
        this.b.a(0, b(), 0, Math.round(f), 0, 0, i, 0);
        if (this.b.g()) {
            this.a = new aj(this, coordinatorLayout, v);
            oa.a(v, this.a);
            return true;
        }
        a(coordinatorLayout, v);
        return false;
    }

    void a(CoordinatorLayout coordinatorLayout, V v) {
    }

    boolean c(V v) {
        return false;
    }

    int b(V v) {
        return -v.getHeight();
    }

    int a(V v) {
        return v.getHeight();
    }

    private void aX() {
        if (this.g == null) {
            this.g = VelocityTracker.obtain();
        }
    }
}
