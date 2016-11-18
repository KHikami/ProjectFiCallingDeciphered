package p000;

import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class C0264y<V extends View> extends gwb {
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
    int f35784a;
    int f35785b;
    boolean f35786c;
    int f35787d;
    tl f35788e;
    int f35789f;
    WeakReference<V> f35790g;
    WeakReference<View> f35791h;
    int f35792i;
    boolean f35793j;

    public Parcelable m41461b(CoordinatorLayout coordinatorLayout, V v) {
        return new C0265z(super.b(coordinatorLayout, v), this.f35787d);
    }

    public void m41453a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C0265z c0265z = (C0265z) parcelable;
        super.a(coordinatorLayout, v, c0265z.e);
        if (c0265z.f35878a == 1 || c0265z.f35878a == 2) {
            this.f35787d = 4;
        } else {
            this.f35787d = c0265z.f35878a;
        }
    }

    public boolean m41456a(CoordinatorLayout coordinatorLayout, V v, int i) {
        int max;
        if (oa.m37369p(coordinatorLayout) && !oa.m37369p(v)) {
            oa.m37340a((View) v, true);
        }
        int top = v.getTop();
        coordinatorLayout.a(v, i);
        this.f35789f = coordinatorLayout.getHeight();
        if (this.Ai) {
            if (this.Aj == 0) {
                this.Aj = coordinatorLayout.getResources().getDimensionPixelSize(tz.f35174e);
            }
            max = Math.max(this.Aj, this.f35789f - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            max = this.Ah;
        }
        this.f35784a = Math.max(0, this.f35789f - v.getHeight());
        this.f35785b = Math.max(this.f35789f - max, this.f35784a);
        if (this.f35787d == 3) {
            oa.m37356e((View) v, this.f35784a);
        } else if (this.f35786c && this.f35787d == 5) {
            oa.m37356e((View) v, this.f35789f);
        } else if (this.f35787d == 4) {
            oa.m37356e((View) v, this.f35785b);
        } else if (this.f35787d == 1 || this.f35787d == 2) {
            oa.m37356e((View) v, top - v.getTop());
        }
        if (this.f35788e == null) {
            this.f35788e = tl.m40747a((ViewGroup) coordinatorLayout, this.Aq);
        }
        this.f35790g = new WeakReference(v);
        this.f35791h = new WeakReference(m41451b((View) v));
        return true;
    }

    public boolean m41457a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int a = nh.m34904a(motionEvent);
        if (a == 0) {
            m41450a();
        }
        if (this.Ao == null) {
            this.Ao = VelocityTracker.obtain();
        }
        this.Ao.addMovement(motionEvent);
        switch (a) {
            case 0:
                int x = (int) motionEvent.getX();
                this.Ap = (int) motionEvent.getY();
                View view = (View) this.f35791h.get();
                if (view != null && coordinatorLayout.a(view, x, this.Ap)) {
                    this.f35792i = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f35793j = true;
                }
                boolean z = this.f35792i == -1 && !coordinatorLayout.a(v, x, this.Ap);
                this.Al = z;
                break;
            case 1:
            case 3:
                this.f35793j = false;
                this.f35792i = -1;
                if (this.Al) {
                    this.Al = false;
                    return false;
                }
                break;
        }
        if (!this.Al && this.f35788e.m40768a(motionEvent)) {
            return true;
        }
        view = (View) this.f35791h.get();
        if (a != 2 || view == null || this.Al || this.f35787d == 1 || coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.Ap) - motionEvent.getY()) <= ((float) this.f35788e.m40777d())) {
            return false;
        }
        return true;
    }

    public boolean m41463b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int a = nh.m34904a(motionEvent);
        if (this.f35787d == 1 && a == 0) {
            return true;
        }
        this.f35788e.m40774b(motionEvent);
        if (a == 0) {
            m41450a();
        }
        if (this.Ao == null) {
            this.Ao = VelocityTracker.obtain();
        }
        this.Ao.addMovement(motionEvent);
        if (a == 2 && !this.Al && Math.abs(((float) this.Ap) - motionEvent.getY()) > ((float) this.f35788e.m40777d())) {
            this.f35788e.m40766a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (this.Al) {
            return false;
        }
        return true;
    }

    public boolean m41459a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.Am = 0;
        this.An = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public void m41455a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f35791h.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.f35784a) {
                    iArr[1] = top - this.f35784a;
                    oa.m37356e((View) v, -iArr[1]);
                    m41452a(3);
                } else {
                    iArr[1] = i2;
                    oa.m37356e((View) v, -i2);
                    m41452a(1);
                }
            } else if (i2 < 0 && !oa.m37346b(view, -1)) {
                if (i3 <= this.f35785b || this.f35786c) {
                    iArr[1] = i2;
                    oa.m37356e((View) v, -i2);
                    m41452a(1);
                } else {
                    iArr[1] = top - this.f35785b;
                    oa.m37356e((View) v, -iArr[1]);
                    m41452a(4);
                }
            }
            m41462b(v.getTop());
            this.Am = i2;
            this.An = true;
        }
    }

    public void m41454a(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i = 3;
        if (v.getTop() == this.f35784a) {
            m41452a(3);
        } else if (view == this.f35791h.get() && this.An) {
            int i2;
            if (this.Am > 0) {
                i2 = this.f35784a;
            } else {
                if (this.f35786c) {
                    this.Ao.computeCurrentVelocity(1000, this.Ag);
                    if (m41460a(v, nw.m36913b(this.Ao, this.f35792i))) {
                        i2 = this.f35789f;
                        i = 5;
                    }
                }
                if (this.Am == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f35784a) < Math.abs(top - this.f35785b)) {
                        i2 = this.f35784a;
                    } else {
                        i2 = this.f35785b;
                        i = 4;
                    }
                } else {
                    i2 = this.f35785b;
                    i = 4;
                }
            }
            if (this.f35788e.m40769a((View) v, v.getLeft(), i2)) {
                m41452a(2);
                oa.m37336a((View) v, new aa(this, v, i));
            } else {
                m41452a(i);
            }
            this.An = false;
        }
    }

    public boolean m41458a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f35791h.get() && (this.f35787d != 3 || super.a(coordinatorLayout, v, view, f, f2));
    }

    void m41452a(int i) {
        if (this.f35787d != i) {
            this.f35787d = i;
            this.f35790g.get();
        }
    }

    private void m41450a() {
        this.f35792i = -1;
        if (this.Ao != null) {
            this.Ao.recycle();
            this.Ao = null;
        }
    }

    boolean m41460a(View view, float f) {
        if (this.Ak) {
            return true;
        }
        if (view.getTop() < this.f35785b) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (0.1f * f)) - ((float) this.f35785b)) / ((float) this.Ah) <= 0.5f) {
            return false;
        }
        return true;
    }

    private View m41451b(View view) {
        if (view instanceof nk) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View b = m41451b(viewGroup.getChildAt(i));
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    void m41462b(int i) {
        this.f35790g.get();
    }
}
