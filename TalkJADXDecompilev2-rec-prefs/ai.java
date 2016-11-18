package p000;

import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

public class ai<V extends View> extends bp<V> {
    private Runnable f902a;
    tf f903b;
    private boolean f904c;
    private int f905d = -1;
    private int f906e;
    private int f907f = -1;
    private VelocityTracker f908g;

    public boolean mo221a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f907f < 0) {
            this.f907f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f904c) {
            return true;
        }
        int y;
        switch (nh.a(motionEvent)) {
            case 0:
                this.f904c = false;
                int x = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (m2435c(v) && coordinatorLayout.m3132a((View) v, x, y)) {
                    this.f906e = y;
                    this.f905d = motionEvent.getPointerId(0);
                    aX();
                    break;
                }
            case 1:
            case 3:
                this.f904c = false;
                this.f905d = -1;
                if (this.f908g != null) {
                    this.f908g.recycle();
                    this.f908g = null;
                    break;
                }
                break;
            case 2:
                y = this.f905d;
                if (y != -1) {
                    y = motionEvent.findPointerIndex(y);
                    if (y != -1) {
                        y = (int) motionEvent.getY(y);
                        if (Math.abs(y - this.f906e) > this.f907f) {
                            this.f904c = true;
                            this.f906e = y;
                            break;
                        }
                    }
                }
                break;
        }
        if (this.f908g != null) {
            this.f908g.addMovement(motionEvent);
        }
        return this.f904c;
    }

    public boolean mo222b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f907f < 0) {
            this.f907f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (nh.a(motionEvent)) {
            case 0:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.m3132a((View) v, (int) motionEvent.getX(), y) && m2435c(v)) {
                    this.f906e = y;
                    this.f905d = motionEvent.getPointerId(0);
                    aX();
                    break;
                }
                return false;
                break;
            case 1:
                if (this.f908g != null) {
                    this.f908g.addMovement(motionEvent);
                    this.f908g.computeCurrentVelocity(1000);
                    m2430a(coordinatorLayout, (View) v, -m2428a(v), 0, nw.b(this.f908g, this.f905d));
                    break;
                }
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f905d);
                if (findPointerIndex != -1) {
                    findPointerIndex = (int) motionEvent.getY(findPointerIndex);
                    int i = this.f906e - findPointerIndex;
                    if (!this.f904c && Math.abs(i) > this.f907f) {
                        this.f904c = true;
                        i = i > 0 ? i - this.f907f : i + this.f907f;
                    }
                    if (this.f904c) {
                        this.f906e = findPointerIndex;
                        m2432b(coordinatorLayout, v, i, m2433b(v), 0);
                        break;
                    }
                }
                return false;
                break;
            case 3:
                break;
        }
        this.f904c = false;
        this.f905d = -1;
        if (this.f908g != null) {
            this.f908g.recycle();
            this.f908g = null;
        }
        if (this.f908g != null) {
            this.f908g.addMovement(motionEvent);
        }
        return true;
    }

    public int a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return m2427a(coordinatorLayout, (View) v, i, (int) nzf.UNSET_ENUM_VALUE, Integer.MAX_VALUE);
    }

    int m2427a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b = m2424b();
        if (i2 == 0 || b < i2 || b > i3) {
            return 0;
        }
        int a = gwb.m1486a(i, i2, i3);
        if (b == a) {
            return 0;
        }
        m2422a(a);
        return b - a;
    }

    int m2426a() {
        return m2424b();
    }

    final int m2432b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return m2427a(coordinatorLayout, (View) v, m2426a() - i, i2, i3);
    }

    final boolean m2430a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        if (this.f902a != null) {
            v.removeCallbacks(this.f902a);
            this.f902a = null;
        }
        if (this.f903b == null) {
            this.f903b = tf.a(v.getContext(), null);
        }
        this.f903b.a(0, m2424b(), 0, Math.round(f), 0, 0, i, 0);
        if (this.f903b.g()) {
            this.f902a = new aj(this, coordinatorLayout, v);
            oa.a(v, this.f902a);
            return true;
        }
        m2429a(coordinatorLayout, v);
        return false;
    }

    void m2429a(CoordinatorLayout coordinatorLayout, V v) {
    }

    boolean m2435c(V v) {
        return false;
    }

    int m2433b(V v) {
        return -v.getHeight();
    }

    int m2428a(V v) {
        return v.getHeight();
    }

    private void aX() {
        if (this.f908g == null) {
            this.f908g = VelocityTracker.obtain();
        }
    }
}
