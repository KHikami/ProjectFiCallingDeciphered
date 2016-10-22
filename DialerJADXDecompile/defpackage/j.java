package defpackage;

import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: j */
public class j extends buf {
    int a;
    int b;
    boolean c;
    int d;
    ph e;
    int f;
    WeakReference g;
    WeakReference h;
    int i;
    boolean j;
    private float mh;
    private int mi;
    private boolean mj;
    private boolean mk;
    private int ml;
    private boolean mm;
    private VelocityTracker mn;
    private int mo;
    private final pk mp;

    public final Parcelable b(CoordinatorLayout coordinatorLayout, View view) {
        return new k(super.b(coordinatorLayout, view), this.d);
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.a(coordinatorLayout, view, kVar.e);
        if (kVar.a == 1 || kVar.a == 2) {
            this.d = 4;
        } else {
            this.d = kVar.a;
        }
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (kn.o(coordinatorLayout) && !kn.o(view)) {
            kn.a(view, true);
        }
        int top = view.getTop();
        coordinatorLayout.a(view, i);
        this.f = coordinatorLayout.getHeight();
        this.a = Math.max(0, this.f - view.getHeight());
        this.b = Math.max(this.f - this.mi, this.a);
        if (this.d == 3) {
            kn.d(view, this.a);
        } else if (this.c && this.d == 5) {
            kn.d(view, this.f);
        } else if (this.d == 4) {
            kn.d(view, this.b);
        } else if (this.d == 1 || this.d == 2) {
            kn.d(view, top - view.getTop());
        }
        if (this.e == null) {
            this.e = ph.a((ViewGroup) coordinatorLayout, this.mp);
        }
        this.g = new WeakReference(view);
        this.h = new WeakReference(a(view));
        return true;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int a = jw.a(motionEvent);
        if (a == 0) {
            a();
        }
        if (this.mn == null) {
            this.mn = VelocityTracker.obtain();
        }
        this.mn.addMovement(motionEvent);
        switch (a) {
            case rl.c /*0*/:
                int x = (int) motionEvent.getX();
                this.mo = (int) motionEvent.getY();
                View view2 = (View) this.h.get();
                if (view2 != null && coordinatorLayout.a(view2, x, this.mo)) {
                    this.i = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.j = true;
                }
                boolean z = this.i == -1 && !coordinatorLayout.a(view, x, this.mo);
                this.mk = z;
                break;
            case rq.b /*1*/:
            case rl.e /*3*/:
                this.j = false;
                this.i = -1;
                if (this.mk) {
                    this.mk = false;
                    return false;
                }
                break;
        }
        if (!this.mk && this.e.a(motionEvent)) {
            return true;
        }
        view2 = (View) this.h.get();
        if (a != 2 || view2 == null || this.mk || this.d == 1 || coordinatorLayout.a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.mo) - motionEvent.getY()) <= ((float) this.e.b)) {
            return false;
        }
        return true;
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int a = jw.a(motionEvent);
        if (this.d == 1 && a == 0) {
            return true;
        }
        this.e.b(motionEvent);
        if (a == 0) {
            a();
        }
        if (this.mn == null) {
            this.mn = VelocityTracker.obtain();
        }
        this.mn.addMovement(motionEvent);
        if (a == 2 && !this.mk && Math.abs(((float) this.mo) - motionEvent.getY()) > ((float) this.e.b)) {
            this.e.a(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (this.mk) {
            return false;
        }
        return true;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        this.ml = 0;
        this.mm = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        if (view2 == ((View) this.h.get())) {
            int top = view.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.a) {
                    iArr[1] = top - this.a;
                    kn.d(view, -iArr[1]);
                    a(3);
                } else {
                    iArr[1] = i2;
                    kn.d(view, -i2);
                    a(1);
                }
            } else if (i2 < 0 && !kn.b(view2, -1)) {
                if (i3 <= this.b || this.c) {
                    iArr[1] = i2;
                    kn.d(view, -i2);
                    a(1);
                } else {
                    iArr[1] = top - this.b;
                    kn.d(view, -iArr[1]);
                    a(4);
                }
            }
            b(view.getTop());
            this.ml = i2;
            this.mm = true;
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i = 3;
        if (view.getTop() == this.a) {
            a(3);
        } else if (view2 == this.h.get() && this.mm) {
            int i2;
            if (this.ml > 0) {
                i2 = this.a;
            } else {
                if (this.c) {
                    this.mn.computeCurrentVelocity(1000, this.mh);
                    if (a(view, kj.b(this.mn, this.i))) {
                        i2 = this.f;
                        i = 5;
                    }
                }
                if (this.ml == 0) {
                    int top = view.getTop();
                    if (Math.abs(top - this.a) < Math.abs(top - this.b)) {
                        i2 = this.a;
                    } else {
                        i2 = this.b;
                        i = 4;
                    }
                } else {
                    i2 = this.b;
                    i = 4;
                }
            }
            ph phVar = this.e;
            int left = view.getLeft();
            phVar.d = view;
            phVar.c = -1;
            boolean a = phVar.a(left, i2, 0, 0);
            if (!(a || phVar.a != 0 || phVar.d == null)) {
                phVar.d = null;
            }
            if (a) {
                a(2);
                kn.a(view, new l(this, view, i));
            } else {
                a(i);
            }
            this.mm = false;
        }
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return view2 == this.h.get() && (this.d != 3 || super.a(coordinatorLayout, view, view2, f, f2));
    }

    final void a(int i) {
        if (this.d != i) {
            this.d = i;
            this.g.get();
        }
    }

    private final void a() {
        this.i = -1;
        if (this.mn != null) {
            this.mn.recycle();
            this.mn = null;
        }
    }

    final boolean a(View view, float f) {
        if (this.mj) {
            return true;
        }
        if (view.getTop() < this.b) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (0.1f * f)) - ((float) this.b)) / ((float) this.mi) <= 0.5f) {
            return false;
        }
        return true;
    }

    private final View a(View view) {
        if (view instanceof kb) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    final void b(int i) {
        this.g.get();
    }
}
