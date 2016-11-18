package p000;

import android.os.Build.VERSION;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

public abstract class acm implements OnTouchListener {
    private final float f86a;
    private final int f87b;
    final View f88c;
    Runnable f89d;
    boolean f90e;
    int f91f;
    private final int f92g;
    private Runnable f93h;
    private final int[] f94i = new int[2];

    public abstract ys mo10a();

    public acm(View view) {
        this.f88c = view;
        view.setLongClickable(true);
        if (VERSION.SDK_INT >= 12) {
            view.addOnAttachStateChangeListener(new acn(this));
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new aco(this));
        }
        this.f86a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f87b = ViewConfiguration.getTapTimeout();
        this.f92g = (this.f87b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f90e;
        View view2;
        int a;
        if (z2) {
            view2 = this.f88c;
            ys a2 = mo10a();
            if (a2 == null || !a2.d()) {
                z = false;
            } else {
                acj acj = (acj) a2.e();
                if (acj == null || !acj.isShown()) {
                    z = false;
                } else {
                    MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                    int[] iArr = this.f94i;
                    view2.getLocationOnScreen(iArr);
                    obtainNoHistory.offsetLocation((float) iArr[0], (float) iArr[1]);
                    int[] iArr2 = this.f94i;
                    acj.getLocationOnScreen(iArr2);
                    obtainNoHistory.offsetLocation((float) (-iArr2[0]), (float) (-iArr2[1]));
                    boolean a3 = acj.mo83a(obtainNoHistory, this.f91f);
                    obtainNoHistory.recycle();
                    a = nh.a(motionEvent);
                    if (a == 1 || a == 3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (a3 && r0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (z || !m126c()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            view2 = this.f88c;
            if (view2.isEnabled()) {
                switch (nh.a(motionEvent)) {
                    case 0:
                        this.f91f = motionEvent.getPointerId(0);
                        if (this.f89d == null) {
                            this.f89d = new acp(this);
                        }
                        view2.postDelayed(this.f89d, (long) this.f87b);
                        if (this.f93h == null) {
                            this.f93h = new acq(this);
                        }
                        view2.postDelayed(this.f93h, (long) this.f92g);
                    case 1:
                    case 3:
                        m127d();
                    case 2:
                        a = motionEvent.findPointerIndex(this.f91f);
                        if (a >= 0) {
                            float x = motionEvent.getX(a);
                            float y = motionEvent.getY(a);
                            float f = this.f86a;
                            if (x < (-f) || y < (-f) || x >= ((float) (view2.getRight() - view2.getLeft())) + f || y >= ((float) (view2.getBottom() - view2.getTop())) + f) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                m127d();
                                view2.getParent().requestDisallowInterceptTouchEvent(true);
                                z = true;
                                break;
                            }
                        }
                        break;
                }
            }
            z = false;
            boolean z3 = z && mo11b();
            if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f88c.onTouchEvent(obtain);
                obtain.recycle();
            }
            z = z3;
        }
        this.f90e = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public boolean mo11b() {
        ys a = mo10a();
        if (!(a == null || a.d())) {
            a.a();
        }
        return true;
    }

    protected boolean m126c() {
        ys a = mo10a();
        if (a != null && a.d()) {
            a.c();
        }
        return true;
    }

    void m127d() {
        if (this.f93h != null) {
            this.f88c.removeCallbacks(this.f93h);
        }
        if (this.f89d != null) {
            this.f88c.removeCallbacks(this.f89d);
        }
    }
}
