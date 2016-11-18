package defpackage;

import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class y<V extends View> extends gwb {
    private float Ag;
    private int Ah;
    private boolean Ai;
    private int Aj;
    private boolean Ak;
    private boolean Al;
    private int Am;
    private boolean An;
    private VelocityTracker Ao;
    private int Ap;
    private final to Aq;
    int a;
    int b;
    boolean c;
    int d;
    tl e;
    int f;
    WeakReference<V> g;
    WeakReference<View> h;
    int i;
    boolean j;

    public Parcelable b(CoordinatorLayout coordinatorLayout, V v) {
        return new z(super.b(coordinatorLayout, v), this.d);
    }

    public void a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        z zVar = (z) parcelable;
        super.a(coordinatorLayout, v, zVar.e);
        if (zVar.a == 1 || zVar.a == 2) {
            this.d = 4;
        } else {
            this.d = zVar.a;
        }
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        int max;
        if (oa.p(coordinatorLayout) && !oa.p(v)) {
            oa.a((View) v, true);
        }
        int top = v.getTop();
        coordinatorLayout.a(v, i);
        this.f = coordinatorLayout.getHeight();
        if (this.Ai) {
            if (this.Aj == 0) {
                this.Aj = coordinatorLayout.getResources().getDimensionPixelSize(tz.e);
            }
            max = Math.max(this.Aj, this.f - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            max = this.Ah;
        }
        this.a = Math.max(0, this.f - v.getHeight());
        this.b = Math.max(this.f - max, this.a);
        if (this.d == 3) {
            oa.e((View) v, this.a);
        } else if (this.c && this.d == 5) {
            oa.e((View) v, this.f);
        } else if (this.d == 4) {
            oa.e((View) v, this.b);
        } else if (this.d == 1 || this.d == 2) {
            oa.e((View) v, top - v.getTop());
        }
        if (this.e == null) {
            this.e = tl.a((ViewGroup) coordinatorLayout, this.Aq);
        }
        this.g = new WeakReference(v);
        this.h = new WeakReference(b((View) v));
        return true;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int a = nh.a(motionEvent);
        if (a == 0) {
            a();
        }
        if (this.Ao == null) {
            this.Ao = VelocityTracker.obtain();
        }
        this.Ao.addMovement(motionEvent);
        switch (a) {
            case 0:
                int x = (int) motionEvent.getX();
                this.Ap = (int) motionEvent.getY();
                View view = (View) this.h.get();
                if (view != null && coordinatorLayout.a(view, x, this.Ap)) {
                    this.i = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.j = true;
                }
                boolean z = this.i == -1 && !coordinatorLayout.a(v, x, this.Ap);
                this.Al = z;
                break;
            case 1:
            case 3:
                this.j = false;
                this.i = -1;
                if (this.Al) {
                    this.Al = false;
                    return false;
                }
                break;
        }
        if (!this.Al && this.e.a(motionEvent)) {
            return true;
        }
        view = (View) this.h.get();
        if (a != 2 || view == null || this.Al || this.d == 1 || coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.Ap) - motionEvent.getY()) <= ((float) this.e.d())) {
            return false;
        }
        return true;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int a = nh.a(motionEvent);
        if (this.d == 1 && a == 0) {
            return true;
        }
        this.e.b(motionEvent);
        if (a == 0) {
            a();
        }
        if (this.Ao == null) {
            this.Ao = VelocityTracker.obtain();
        }
        this.Ao.addMovement(motionEvent);
        if (a == 2 && !this.Al && Math.abs(((float) this.Ap) - motionEvent.getY()) > ((float) this.e.d())) {
            this.e.a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (this.Al) {
            return false;
        }
        return true;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.Am = 0;
        this.An = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.h.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.a) {
                    iArr[1] = top - this.a;
                    oa.e((View) v, -iArr[1]);
                    a(3);
                } else {
                    iArr[1] = i2;
                    oa.e((View) v, -i2);
                    a(1);
                }
            } else if (i2 < 0 && !oa.b(view, -1)) {
                if (i3 <= this.b || this.c) {
                    iArr[1] = i2;
                    oa.e((View) v, -i2);
                    a(1);
                } else {
                    iArr[1] = top - this.b;
                    oa.e((View) v, -iArr[1]);
                    a(4);
                }
            }
            b(v.getTop());
            this.Am = i2;
            this.An = true;
        }
    }

    public void a(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i = 3;
        if (v.getTop() == this.a) {
            a(3);
        } else if (view == this.h.get() && this.An) {
            int i2;
            if (this.Am > 0) {
                i2 = this.a;
            } else {
                if (this.c) {
                    this.Ao.computeCurrentVelocity(1000, this.Ag);
                    if (a(v, nw.b(this.Ao, this.i))) {
                        i2 = this.f;
                        i = 5;
                    }
                }
                if (this.Am == 0) {
                    int top = v.getTop();
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
            if (this.e.a((View) v, v.getLeft(), i2)) {
                a(2);
                oa.a((View) v, new aa(this, v, i));
            } else {
                a(i);
            }
            this.An = false;
        }
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.h.get() && (this.d != 3 || super.a(coordinatorLayout, v, view, f, f2));
    }

    void a(int i) {
        if (this.d != i) {
            this.d = i;
            this.g.get();
        }
    }

    private void a() {
        this.i = -1;
        if (this.Ao != null) {
            this.Ao.recycle();
            this.Ao = null;
        }
    }

    boolean a(View view, float f) {
        if (this.Ak) {
            return true;
        }
        if (view.getTop() < this.b) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (0.1f * f)) - ((float) this.b)) / ((float) this.Ah) <= 0.5f) {
            return false;
        }
        return true;
    }

    private View b(View view) {
        if (view instanceof nk) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View b = b(viewGroup.getChildAt(i));
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    void b(int i) {
        this.g.get();
    }
}
