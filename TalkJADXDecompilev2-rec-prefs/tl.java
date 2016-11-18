package p000;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

public final class tl {
    private static final Interpolator f35136v = new tm();
    private int f35137a;
    private int f35138b;
    private int f35139c = -1;
    private float[] f35140d;
    private float[] f35141e;
    private float[] f35142f;
    private float[] f35143g;
    private int[] f35144h;
    private int[] f35145i;
    private int[] f35146j;
    private int f35147k;
    private VelocityTracker f35148l;
    private float f35149m;
    private float f35150n;
    private int f35151o;
    private int f35152p;
    private tf f35153q;
    private final to f35154r;
    private View f35155s;
    private boolean f35156t;
    private final ViewGroup f35157u;
    private final Runnable f35158w = new tn(this);

    public static tl m40747a(ViewGroup viewGroup, to toVar) {
        return new tl(viewGroup.getContext(), viewGroup, toVar);
    }

    public static tl m40746a(ViewGroup viewGroup, float f, to toVar) {
        tl a = tl.m40747a(viewGroup, toVar);
        a.f35138b = (int) (((float) a.f35138b) * (1.0f / f));
        return a;
    }

    private tl(Context context, ViewGroup viewGroup, to toVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (toVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f35157u = viewGroup;
            this.f35154r = toVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f35151o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f35138b = viewConfiguration.getScaledTouchSlop();
            this.f35149m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f35150n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f35153q = tf.m40727a(context, f35136v);
        }
    }

    public void m40764a(float f) {
        this.f35150n = f;
    }

    public int m40763a() {
        return this.f35137a;
    }

    public void m40765a(int i) {
        this.f35152p = i;
    }

    public int m40771b() {
        return this.f35151o;
    }

    public void m40766a(View view, int i) {
        if (view.getParent() != this.f35157u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f35157u + ")");
        }
        this.f35155s = view;
        this.f35139c = i;
        this.f35154r.mo4364b(view, i);
        m40773b(1);
    }

    public View m40775c() {
        return this.f35155s;
    }

    public int m40777d() {
        return this.f35138b;
    }

    public void m40778e() {
        this.f35139c = -1;
        if (this.f35140d != null) {
            Arrays.fill(this.f35140d, 0.0f);
            Arrays.fill(this.f35141e, 0.0f);
            Arrays.fill(this.f35142f, 0.0f);
            Arrays.fill(this.f35143g, 0.0f);
            Arrays.fill(this.f35144h, 0);
            Arrays.fill(this.f35145i, 0);
            Arrays.fill(this.f35146j, 0);
            this.f35147k = 0;
        }
        if (this.f35148l != null) {
            this.f35148l.recycle();
            this.f35148l = null;
        }
    }

    public boolean m40769a(View view, int i, int i2) {
        this.f35155s = view;
        this.f35139c = -1;
        boolean a = m40751a(i, i2, 0, 0);
        if (!(a || this.f35137a != 0 || this.f35155s == null)) {
            this.f35155s = null;
        }
        return a;
    }

    public boolean m40767a(int i, int i2) {
        if (this.f35156t) {
            return m40751a(i, i2, (int) nw.m36912a(this.f35148l, this.f35139c), (int) nw.m36913b(this.f35148l, this.f35139c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    private boolean m40751a(int i, int i2, int i3, int i4) {
        int left = this.f35155s.getLeft();
        int top = this.f35155s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f35153q.m40740h();
            m40773b(0);
            return false;
        }
        View view = this.f35155s;
        int b = tl.m40753b(i3, (int) this.f35150n, (int) this.f35149m);
        int b2 = tl.m40753b(i4, (int) this.f35150n, (int) this.f35149m);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        this.f35153q.m40729a(left, top, i5, i6, (int) (((b2 != 0 ? ((float) abs4) / ((float) i7) : ((float) abs2) / ((float) i8)) * ((float) m40745a(i6, b2, this.f35154r.m40622d()))) + ((b != 0 ? ((float) abs3) / ((float) i7) : ((float) abs) / ((float) i8)) * ((float) m40745a(i5, b, this.f35154r.mo4358a(view))))));
        m40773b(2);
        return true;
    }

    private int m40745a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f35157u.getWidth();
        int i4 = width / 2;
        float sin = (((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f)) * 0.4712389167638204d)))) * ((float) i4)) + ((float) i4);
        i4 = Math.abs(i2);
        if (i4 > 0) {
            width = Math.round(Math.abs(sin / ((float) i4)) * 1000.0f) * 4;
        } else {
            width = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(width, 600);
    }

    private static int m40753b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            return -i3;
        }
        return i3;
    }

    private static float m40744a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            return -f3;
        }
        return f3;
    }

    public boolean m40770a(boolean z) {
        if (this.f35137a == 2) {
            boolean g = this.f35153q.m40739g();
            int b = this.f35153q.m40734b();
            int c = this.f35153q.m40735c();
            int left = b - this.f35155s.getLeft();
            int top = c - this.f35155s.getTop();
            if (left != 0) {
                oa.m37359f(this.f35155s, left);
            }
            if (top != 0) {
                oa.m37356e(this.f35155s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f35154r.mo4362a(this.f35155s, b, c);
            }
            if (g && b == this.f35153q.m40736d() && c == this.f35153q.m40737e()) {
                this.f35153q.m40740h();
                g = false;
            }
            if (!g) {
                this.f35157u.post(this.f35158w);
            }
        }
        if (this.f35137a == 2) {
            return true;
        }
        return false;
    }

    private void m40748a(float f, float f2) {
        this.f35156t = true;
        this.f35154r.mo4361a(this.f35155s, f, f2);
        this.f35156t = false;
        if (this.f35137a == 1) {
            m40773b(0);
        }
    }

    private void m40758d(int i) {
        if (this.f35140d != null && m40760e(i)) {
            this.f35140d[i] = 0.0f;
            this.f35141e[i] = 0.0f;
            this.f35142f[i] = 0.0f;
            this.f35143g[i] = 0.0f;
            this.f35144h[i] = 0;
            this.f35145i[i] = 0;
            this.f35146j[i] = 0;
            this.f35147k &= (1 << i) ^ -1;
        }
    }

    private void m40756c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m40762f(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f35142f[pointerId] = x;
                this.f35143g[pointerId] = y;
            }
        }
    }

    private boolean m40760e(int i) {
        return (this.f35147k & (1 << i)) != 0;
    }

    void m40773b(int i) {
        this.f35157u.removeCallbacks(this.f35158w);
        if (this.f35137a != i) {
            this.f35137a = i;
            this.f35154r.mo4359a(i);
            if (this.f35137a == 0) {
                this.f35155s = null;
            }
        }
    }

    private boolean m40755b(View view, int i) {
        if (view == this.f35155s && this.f35139c == i) {
            return true;
        }
        if (view == null || !this.f35154r.mo4363a(view, i)) {
            return false;
        }
        this.f35139c = i;
        m40766a(view, i);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m40768a(MotionEvent motionEvent) {
        int a = nh.m34904a(motionEvent);
        int b = nh.m34906b(motionEvent);
        if (a == 0) {
            m40778e();
        }
        if (this.f35148l == null) {
            this.f35148l = VelocityTracker.obtain();
        }
        this.f35148l.addMovement(motionEvent);
        float x;
        float y;
        int pointerId;
        switch (a) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                pointerId = motionEvent.getPointerId(0);
                m40749a(x, y, pointerId);
                View b2 = m40772b((int) x, (int) y);
                if (b2 == this.f35155s && this.f35137a == 2) {
                    m40755b(b2, pointerId);
                }
                if ((this.f35144h[pointerId] & this.f35152p) != 0) {
                    this.f35154r.mo4366c();
                    break;
                }
                break;
            case 1:
            case 3:
                m40778e();
                break;
            case 2:
                if (!(this.f35140d == null || this.f35141e == null)) {
                    pointerId = motionEvent.getPointerCount();
                    for (b = 0; b < pointerId; b++) {
                        int pointerId2 = motionEvent.getPointerId(b);
                        if (m40762f(pointerId2)) {
                            x = motionEvent.getX(b);
                            float y2 = motionEvent.getY(b);
                            float f = x - this.f35140d[pointerId2];
                            float f2 = y2 - this.f35141e[pointerId2];
                            View b3 = m40772b((int) x, (int) y2);
                            Object obj = (b3 == null || !m40752a(b3, f, f2)) ? null : 1;
                            if (obj != null) {
                                int left = b3.getLeft();
                                int c = this.f35154r.mo4365c(b3, ((int) f) + left);
                                int top = b3.getTop();
                                int d = this.f35154r.mo4367d(b3, ((int) f2) + top);
                                int a2 = this.f35154r.mo4358a(b3);
                                int d2 = this.f35154r.m40622d();
                                if (a2 != 0) {
                                    if (a2 > 0) {
                                    }
                                }
                                if (d2 != 0) {
                                    if (d2 > 0 && d == top) {
                                    }
                                }
                                m40756c(motionEvent);
                                break;
                            }
                            m40754b(f, f2, pointerId2);
                            if (this.f35137a != 1) {
                                if (obj != null && m40755b(b3, pointerId2)) {
                                }
                            }
                            m40756c(motionEvent);
                        }
                    }
                    m40756c(motionEvent);
                }
                break;
            case 5:
                a = motionEvent.getPointerId(b);
                float x2 = motionEvent.getX(b);
                y = motionEvent.getY(b);
                m40749a(x2, y, a);
                if (this.f35137a != 0) {
                    if (this.f35137a == 2) {
                        View b4 = m40772b((int) x2, (int) y);
                        if (b4 == this.f35155s) {
                            m40755b(b4, a);
                            break;
                        }
                    }
                } else if ((this.f35144h[a] & this.f35152p) != 0) {
                    this.f35154r.mo4366c();
                    break;
                }
                break;
            case 6:
                m40758d(motionEvent.getPointerId(b));
                break;
        }
        if (this.f35137a == 1) {
            return true;
        }
        return false;
    }

    public void m40774b(MotionEvent motionEvent) {
        int i = 0;
        int a = nh.m34904a(motionEvent);
        int b = nh.m34906b(motionEvent);
        if (a == 0) {
            m40778e();
        }
        if (this.f35148l == null) {
            this.f35148l = VelocityTracker.obtain();
        }
        this.f35148l.addMovement(motionEvent);
        float x;
        float y;
        View b2;
        int left;
        switch (a) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                i = motionEvent.getPointerId(0);
                b2 = m40772b((int) x, (int) y);
                m40749a(x, y, i);
                m40755b(b2, i);
                if ((this.f35144h[i] & this.f35152p) != 0) {
                    this.f35154r.mo4366c();
                    return;
                }
                return;
            case 1:
                if (this.f35137a == 1) {
                    m40761f();
                }
                m40778e();
                return;
            case 2:
                int pointerCount;
                if (this.f35137a != 1) {
                    pointerCount = motionEvent.getPointerCount();
                    while (i < pointerCount) {
                        a = motionEvent.getPointerId(i);
                        if (m40762f(a)) {
                            float x2 = motionEvent.getX(i);
                            float y2 = motionEvent.getY(i);
                            float f = x2 - this.f35140d[a];
                            float f2 = y2 - this.f35141e[a];
                            m40754b(f, f2, a);
                            if (this.f35137a != 1) {
                                b2 = m40772b((int) x2, (int) y2);
                                if (m40752a(b2, f, f2) && m40755b(b2, a)) {
                                }
                            }
                            m40756c(motionEvent);
                            return;
                        }
                        i++;
                    }
                    m40756c(motionEvent);
                    return;
                } else if (m40762f(this.f35139c)) {
                    i = motionEvent.findPointerIndex(this.f35139c);
                    x = motionEvent.getX(i);
                    a = (int) (x - this.f35142f[this.f35139c]);
                    b = (int) (motionEvent.getY(i) - this.f35143g[this.f35139c]);
                    pointerCount = this.f35155s.getLeft() + a;
                    i = this.f35155s.getTop() + b;
                    left = this.f35155s.getLeft();
                    int top = this.f35155s.getTop();
                    if (a != 0) {
                        pointerCount = this.f35154r.mo4365c(this.f35155s, pointerCount);
                        oa.m37359f(this.f35155s, pointerCount - left);
                    }
                    if (b != 0) {
                        i = this.f35154r.mo4367d(this.f35155s, i);
                        oa.m37356e(this.f35155s, i - top);
                    }
                    if (!(a == 0 && b == 0)) {
                        this.f35154r.mo4362a(this.f35155s, pointerCount, i);
                    }
                    m40756c(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.f35137a == 1) {
                    m40748a(0.0f, 0.0f);
                }
                m40778e();
                return;
            case 5:
                i = motionEvent.getPointerId(b);
                x = motionEvent.getX(b);
                y = motionEvent.getY(b);
                m40749a(x, y, i);
                if (this.f35137a == 0) {
                    m40755b(m40772b((int) x, (int) y), i);
                    if ((this.f35144h[i] & this.f35152p) != 0) {
                        this.f35154r.mo4366c();
                        return;
                    }
                    return;
                } else if (m40759d((int) x, (int) y)) {
                    m40755b(this.f35155s, i);
                    return;
                } else {
                    return;
                }
            case 6:
                a = motionEvent.getPointerId(b);
                if (this.f35137a == 1 && a == this.f35139c) {
                    b = motionEvent.getPointerCount();
                    while (i < b) {
                        left = motionEvent.getPointerId(i);
                        if (left != this.f35139c) {
                            if (m40772b((int) motionEvent.getX(i), (int) motionEvent.getY(i)) == this.f35155s && m40755b(this.f35155s, left)) {
                                i = this.f35139c;
                                if (i == -1) {
                                    m40761f();
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        m40761f();
                    }
                }
                m40758d(a);
                return;
            default:
                return;
        }
    }

    private void m40754b(float f, float f2, int i) {
        int i2 = 1;
        if (!m40750a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m40750a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m40750a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m40750a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f35145i;
            iArr[i] = iArr[i] | i2;
            this.f35154r.mo4360a(i2, i);
        }
    }

    private boolean m40750a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f35144h[i] & i2) != i2 || (this.f35152p & i2) == 0 || (this.f35146j[i] & i2) == i2 || (this.f35145i[i] & i2) == i2) {
            return false;
        }
        if ((abs > ((float) this.f35138b) || abs2 > ((float) this.f35138b)) && (this.f35145i[i] & i2) == 0 && abs > ((float) this.f35138b)) {
            return true;
        }
        return false;
    }

    private boolean m40752a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z;
        boolean z2;
        if (this.f35154r.mo4358a(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f35154r.m40622d() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            if ((f * f) + (f2 * f2) > ((float) (this.f35138b * this.f35138b))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f35138b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f35138b)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean m40776c(int i) {
        int length = this.f35140d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m40757c(3, i2)) {
                return true;
            }
        }
        return false;
    }

    private boolean m40757c(int i, int i2) {
        if (!m40760e(i2)) {
            return false;
        }
        boolean z;
        boolean z2 = (i & 1) == 1;
        if ((i & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        float f = this.f35142f[i2] - this.f35140d[i2];
        float f2 = this.f35143g[i2] - this.f35141e[i2];
        if (z2 && z) {
            if ((f * f) + (f2 * f2) > ((float) (this.f35138b * this.f35138b))) {
                return true;
            }
            return false;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f35138b)) {
                return true;
            }
            return false;
        } else if (!z || Math.abs(f2) <= ((float) this.f35138b)) {
            return false;
        } else {
            return true;
        }
    }

    private void m40761f() {
        this.f35148l.computeCurrentVelocity(1000, this.f35149m);
        m40748a(tl.m40744a(nw.m36912a(this.f35148l, this.f35139c), this.f35150n, this.f35149m), tl.m40744a(nw.m36913b(this.f35148l, this.f35139c), this.f35150n, this.f35149m));
    }

    private boolean m40759d(int i, int i2) {
        View view = this.f35155s;
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public View m40772b(int i, int i2) {
        for (int childCount = this.f35157u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f35157u.getChildAt(this.f35154r.m40618b(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private boolean m40762f(int i) {
        if (m40760e(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void m40749a(float f, float f2, int i) {
        int i2 = 0;
        if (this.f35140d == null || this.f35140d.length <= i) {
            Object obj = new float[(i + 1)];
            Object obj2 = new float[(i + 1)];
            Object obj3 = new float[(i + 1)];
            Object obj4 = new float[(i + 1)];
            Object obj5 = new int[(i + 1)];
            Object obj6 = new int[(i + 1)];
            Object obj7 = new int[(i + 1)];
            if (this.f35140d != null) {
                System.arraycopy(this.f35140d, 0, obj, 0, this.f35140d.length);
                System.arraycopy(this.f35141e, 0, obj2, 0, this.f35141e.length);
                System.arraycopy(this.f35142f, 0, obj3, 0, this.f35142f.length);
                System.arraycopy(this.f35143g, 0, obj4, 0, this.f35143g.length);
                System.arraycopy(this.f35144h, 0, obj5, 0, this.f35144h.length);
                System.arraycopy(this.f35145i, 0, obj6, 0, this.f35145i.length);
                System.arraycopy(this.f35146j, 0, obj7, 0, this.f35146j.length);
            }
            this.f35140d = obj;
            this.f35141e = obj2;
            this.f35142f = obj3;
            this.f35143g = obj4;
            this.f35144h = obj5;
            this.f35145i = obj6;
            this.f35146j = obj7;
        }
        float[] fArr = this.f35140d;
        this.f35142f[i] = f;
        fArr[i] = f;
        fArr = this.f35141e;
        this.f35143g[i] = f2;
        fArr[i] = f2;
        int[] iArr = this.f35144h;
        int i3 = (int) f;
        int i4 = (int) f2;
        if (i3 < this.f35157u.getLeft() + this.f35151o) {
            i2 = 1;
        }
        if (i4 < this.f35157u.getTop() + this.f35151o) {
            i2 |= 4;
        }
        if (i3 > this.f35157u.getRight() - this.f35151o) {
            i2 |= 2;
        }
        if (i4 > this.f35157u.getBottom() - this.f35151o) {
            i2 |= 8;
        }
        iArr[i] = i2;
        this.f35147k |= 1 << i;
    }
}
