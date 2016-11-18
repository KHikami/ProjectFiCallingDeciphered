package defpackage;

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
    private static final Interpolator v = new tm();
    private int a;
    private int b;
    private int c = -1;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private int p;
    private tf q;
    private final to r;
    private View s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable w = new tn(this);

    public static tl a(ViewGroup viewGroup, to toVar) {
        return new tl(viewGroup.getContext(), viewGroup, toVar);
    }

    public static tl a(ViewGroup viewGroup, float f, to toVar) {
        tl a = tl.a(viewGroup, toVar);
        a.b = (int) (((float) a.b) * (1.0f / f));
        return a;
    }

    private tl(Context context, ViewGroup viewGroup, to toVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (toVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.u = viewGroup;
            this.r = toVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.q = tf.a(context, v);
        }
    }

    public void a(float f) {
        this.n = f;
    }

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.p = i;
    }

    public int b() {
        return this.o;
    }

    public void a(View view, int i) {
        if (view.getParent() != this.u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
        }
        this.s = view;
        this.c = i;
        this.r.b(view, i);
        b(1);
    }

    public View c() {
        return this.s;
    }

    public int d() {
        return this.b;
    }

    public void e() {
        this.c = -1;
        if (this.d != null) {
            Arrays.fill(this.d, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        if (this.l != null) {
            this.l.recycle();
            this.l = null;
        }
    }

    public boolean a(View view, int i, int i2) {
        this.s = view;
        this.c = -1;
        boolean a = a(i, i2, 0, 0);
        if (!(a || this.a != 0 || this.s == null)) {
            this.s = null;
        }
        return a;
    }

    public boolean a(int i, int i2) {
        if (this.t) {
            return a(i, i2, (int) nw.a(this.l, this.c), (int) nw.b(this.l, this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    private boolean a(int i, int i2, int i3, int i4) {
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.q.h();
            b(0);
            return false;
        }
        View view = this.s;
        int b = tl.b(i3, (int) this.n, (int) this.m);
        int b2 = tl.b(i4, (int) this.n, (int) this.m);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        this.q.a(left, top, i5, i6, (int) (((b2 != 0 ? ((float) abs4) / ((float) i7) : ((float) abs2) / ((float) i8)) * ((float) a(i6, b2, this.r.d()))) + ((b != 0 ? ((float) abs3) / ((float) i7) : ((float) abs) / ((float) i8)) * ((float) a(i5, b, this.r.a(view))))));
        b(2);
        return true;
    }

    private int a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.u.getWidth();
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

    private static int b(int i, int i2, int i3) {
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

    private static float a(float f, float f2, float f3) {
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

    public boolean a(boolean z) {
        if (this.a == 2) {
            boolean g = this.q.g();
            int b = this.q.b();
            int c = this.q.c();
            int left = b - this.s.getLeft();
            int top = c - this.s.getTop();
            if (left != 0) {
                oa.f(this.s, left);
            }
            if (top != 0) {
                oa.e(this.s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.r.a(this.s, b, c);
            }
            if (g && b == this.q.d() && c == this.q.e()) {
                this.q.h();
                g = false;
            }
            if (!g) {
                this.u.post(this.w);
            }
        }
        if (this.a == 2) {
            return true;
        }
        return false;
    }

    private void a(float f, float f2) {
        this.t = true;
        this.r.a(this.s, f, f2);
        this.t = false;
        if (this.a == 1) {
            b(0);
        }
    }

    private void d(int i) {
        if (this.d != null && e(i)) {
            this.d[i] = 0.0f;
            this.e[i] = 0.0f;
            this.f[i] = 0.0f;
            this.g[i] = 0.0f;
            this.h[i] = 0;
            this.i[i] = 0;
            this.j[i] = 0;
            this.k &= (1 << i) ^ -1;
        }
    }

    private void c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (f(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    private boolean e(int i) {
        return (this.k & (1 << i)) != 0;
    }

    void b(int i) {
        this.u.removeCallbacks(this.w);
        if (this.a != i) {
            this.a = i;
            this.r.a(i);
            if (this.a == 0) {
                this.s = null;
            }
        }
    }

    private boolean b(View view, int i) {
        if (view == this.s && this.c == i) {
            return true;
        }
        if (view == null || !this.r.a(view, i)) {
            return false;
        }
        this.c = i;
        a(view, i);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r0 = defpackage.nh.a(r14);
        r1 = defpackage.nh.b(r14);
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        r13.e();
    L_0x000d:
        r2 = r13.l;
        if (r2 != 0) goto L_0x0017;
    L_0x0011:
        r2 = android.view.VelocityTracker.obtain();
        r13.l = r2;
    L_0x0017:
        r2 = r13.l;
        r2.addMovement(r14);
        switch(r0) {
            case 0: goto L_0x0026;
            case 1: goto L_0x011f;
            case 2: goto L_0x008c;
            case 3: goto L_0x011f;
            case 4: goto L_0x001f;
            case 5: goto L_0x0057;
            case 6: goto L_0x0116;
            default: goto L_0x001f;
        };
    L_0x001f:
        r0 = r13.a;
        r1 = 1;
        if (r0 != r1) goto L_0x0124;
    L_0x0024:
        r0 = 1;
    L_0x0025:
        return r0;
    L_0x0026:
        r0 = r14.getX();
        r1 = r14.getY();
        r2 = 0;
        r2 = r14.getPointerId(r2);
        r13.a(r0, r1, r2);
        r0 = (int) r0;
        r1 = (int) r1;
        r0 = r13.b(r0, r1);
        r1 = r13.s;
        if (r0 != r1) goto L_0x0048;
    L_0x0040:
        r1 = r13.a;
        r3 = 2;
        if (r1 != r3) goto L_0x0048;
    L_0x0045:
        r13.b(r0, r2);
    L_0x0048:
        r0 = r13.h;
        r0 = r0[r2];
        r1 = r13.p;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x001f;
    L_0x0051:
        r0 = r13.r;
        r0.c();
        goto L_0x001f;
    L_0x0057:
        r0 = r14.getPointerId(r1);
        r2 = r14.getX(r1);
        r1 = r14.getY(r1);
        r13.a(r2, r1, r0);
        r3 = r13.a;
        if (r3 != 0) goto L_0x0079;
    L_0x006a:
        r1 = r13.h;
        r0 = r1[r0];
        r1 = r13.p;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x001f;
    L_0x0073:
        r0 = r13.r;
        r0.c();
        goto L_0x001f;
    L_0x0079:
        r3 = r13.a;
        r4 = 2;
        if (r3 != r4) goto L_0x001f;
    L_0x007e:
        r2 = (int) r2;
        r1 = (int) r1;
        r1 = r13.b(r2, r1);
        r2 = r13.s;
        if (r1 != r2) goto L_0x001f;
    L_0x0088:
        r13.b(r1, r0);
        goto L_0x001f;
    L_0x008c:
        r0 = r13.d;
        if (r0 == 0) goto L_0x001f;
    L_0x0090:
        r0 = r13.e;
        if (r0 == 0) goto L_0x001f;
    L_0x0094:
        r2 = r14.getPointerCount();
        r0 = 0;
        r1 = r0;
    L_0x009a:
        if (r1 >= r2) goto L_0x0111;
    L_0x009c:
        r3 = r14.getPointerId(r1);
        r0 = r13.f(r3);
        if (r0 == 0) goto L_0x010b;
    L_0x00a6:
        r0 = r14.getX(r1);
        r4 = r14.getY(r1);
        r5 = r13.d;
        r5 = r5[r3];
        r5 = r0 - r5;
        r6 = r13.e;
        r6 = r6[r3];
        r6 = r4 - r6;
        r0 = (int) r0;
        r4 = (int) r4;
        r4 = r13.b(r0, r4);
        if (r4 == 0) goto L_0x010f;
    L_0x00c2:
        r0 = r13.a(r4, r5, r6);
        if (r0 == 0) goto L_0x010f;
    L_0x00c8:
        r0 = 1;
    L_0x00c9:
        if (r0 == 0) goto L_0x00fb;
    L_0x00cb:
        r7 = r4.getLeft();
        r8 = (int) r5;
        r8 = r8 + r7;
        r9 = r13.r;
        r8 = r9.c(r4, r8);
        r9 = r4.getTop();
        r10 = (int) r6;
        r10 = r10 + r9;
        r11 = r13.r;
        r10 = r11.d(r4, r10);
        r11 = r13.r;
        r11 = r11.a(r4);
        r12 = r13.r;
        r12 = r12.d();
        if (r11 == 0) goto L_0x00f5;
    L_0x00f1:
        if (r11 <= 0) goto L_0x00fb;
    L_0x00f3:
        if (r8 != r7) goto L_0x00fb;
    L_0x00f5:
        if (r12 == 0) goto L_0x0111;
    L_0x00f7:
        if (r12 <= 0) goto L_0x00fb;
    L_0x00f9:
        if (r10 == r9) goto L_0x0111;
    L_0x00fb:
        r13.b(r5, r6, r3);
        r5 = r13.a;
        r6 = 1;
        if (r5 == r6) goto L_0x0111;
    L_0x0103:
        if (r0 == 0) goto L_0x010b;
    L_0x0105:
        r0 = r13.b(r4, r3);
        if (r0 != 0) goto L_0x0111;
    L_0x010b:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x009a;
    L_0x010f:
        r0 = 0;
        goto L_0x00c9;
    L_0x0111:
        r13.c(r14);
        goto L_0x001f;
    L_0x0116:
        r0 = r14.getPointerId(r1);
        r13.d(r0);
        goto L_0x001f;
    L_0x011f:
        r13.e();
        goto L_0x001f;
    L_0x0124:
        r0 = 0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.a(android.view.MotionEvent):boolean");
    }

    public void b(MotionEvent motionEvent) {
        int i = 0;
        int a = nh.a(motionEvent);
        int b = nh.b(motionEvent);
        if (a == 0) {
            e();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        float x;
        float y;
        View b2;
        int left;
        switch (a) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                i = motionEvent.getPointerId(0);
                b2 = b((int) x, (int) y);
                a(x, y, i);
                b(b2, i);
                if ((this.h[i] & this.p) != 0) {
                    this.r.c();
                    return;
                }
                return;
            case 1:
                if (this.a == 1) {
                    f();
                }
                e();
                return;
            case 2:
                int pointerCount;
                if (this.a != 1) {
                    pointerCount = motionEvent.getPointerCount();
                    while (i < pointerCount) {
                        a = motionEvent.getPointerId(i);
                        if (f(a)) {
                            float x2 = motionEvent.getX(i);
                            float y2 = motionEvent.getY(i);
                            float f = x2 - this.d[a];
                            float f2 = y2 - this.e[a];
                            b(f, f2, a);
                            if (this.a != 1) {
                                b2 = b((int) x2, (int) y2);
                                if (a(b2, f, f2) && b(b2, a)) {
                                }
                            }
                            c(motionEvent);
                            return;
                        }
                        i++;
                    }
                    c(motionEvent);
                    return;
                } else if (f(this.c)) {
                    i = motionEvent.findPointerIndex(this.c);
                    x = motionEvent.getX(i);
                    a = (int) (x - this.f[this.c]);
                    b = (int) (motionEvent.getY(i) - this.g[this.c]);
                    pointerCount = this.s.getLeft() + a;
                    i = this.s.getTop() + b;
                    left = this.s.getLeft();
                    int top = this.s.getTop();
                    if (a != 0) {
                        pointerCount = this.r.c(this.s, pointerCount);
                        oa.f(this.s, pointerCount - left);
                    }
                    if (b != 0) {
                        i = this.r.d(this.s, i);
                        oa.e(this.s, i - top);
                    }
                    if (!(a == 0 && b == 0)) {
                        this.r.a(this.s, pointerCount, i);
                    }
                    c(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.a == 1) {
                    a(0.0f, 0.0f);
                }
                e();
                return;
            case 5:
                i = motionEvent.getPointerId(b);
                x = motionEvent.getX(b);
                y = motionEvent.getY(b);
                a(x, y, i);
                if (this.a == 0) {
                    b(b((int) x, (int) y), i);
                    if ((this.h[i] & this.p) != 0) {
                        this.r.c();
                        return;
                    }
                    return;
                } else if (d((int) x, (int) y)) {
                    b(this.s, i);
                    return;
                } else {
                    return;
                }
            case 6:
                a = motionEvent.getPointerId(b);
                if (this.a == 1 && a == this.c) {
                    b = motionEvent.getPointerCount();
                    while (i < b) {
                        left = motionEvent.getPointerId(i);
                        if (left != this.c) {
                            if (b((int) motionEvent.getX(i), (int) motionEvent.getY(i)) == this.s && b(this.s, left)) {
                                i = this.c;
                                if (i == -1) {
                                    f();
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        f();
                    }
                }
                d(a);
                return;
            default:
                return;
        }
    }

    private void b(float f, float f2, int i) {
        int i2 = 1;
        if (!a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | i2;
            this.r.a(i2, i);
        }
    }

    private boolean a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (this.p & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        if ((abs > ((float) this.b) || abs2 > ((float) this.b)) && (this.i[i] & i2) == 0 && abs > ((float) this.b)) {
            return true;
        }
        return false;
    }

    private boolean a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z;
        boolean z2;
        if (this.r.a(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.r.d() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            if ((f * f) + (f2 * f2) > ((float) (this.b * this.b))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.b)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean c(int i) {
        int length = this.d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (c(3, i2)) {
                return true;
            }
        }
        return false;
    }

    private boolean c(int i, int i2) {
        if (!e(i2)) {
            return false;
        }
        boolean z;
        boolean z2 = (i & 1) == 1;
        if ((i & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        float f = this.f[i2] - this.d[i2];
        float f2 = this.g[i2] - this.e[i2];
        if (z2 && z) {
            if ((f * f) + (f2 * f2) > ((float) (this.b * this.b))) {
                return true;
            }
            return false;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.b)) {
                return true;
            }
            return false;
        } else if (!z || Math.abs(f2) <= ((float) this.b)) {
            return false;
        } else {
            return true;
        }
    }

    private void f() {
        this.l.computeCurrentVelocity(1000, this.m);
        a(tl.a(nw.a(this.l, this.c), this.n, this.m), tl.a(nw.b(this.l, this.c), this.n, this.m));
    }

    private boolean d(int i, int i2) {
        View view = this.s;
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public View b(int i, int i2) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.u.getChildAt(this.r.b(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private boolean f(int i) {
        if (e(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void a(float f, float f2, int i) {
        int i2 = 0;
        if (this.d == null || this.d.length <= i) {
            Object obj = new float[(i + 1)];
            Object obj2 = new float[(i + 1)];
            Object obj3 = new float[(i + 1)];
            Object obj4 = new float[(i + 1)];
            Object obj5 = new int[(i + 1)];
            Object obj6 = new int[(i + 1)];
            Object obj7 = new int[(i + 1)];
            if (this.d != null) {
                System.arraycopy(this.d, 0, obj, 0, this.d.length);
                System.arraycopy(this.e, 0, obj2, 0, this.e.length);
                System.arraycopy(this.f, 0, obj3, 0, this.f.length);
                System.arraycopy(this.g, 0, obj4, 0, this.g.length);
                System.arraycopy(this.h, 0, obj5, 0, this.h.length);
                System.arraycopy(this.i, 0, obj6, 0, this.i.length);
                System.arraycopy(this.j, 0, obj7, 0, this.j.length);
            }
            this.d = obj;
            this.e = obj2;
            this.f = obj3;
            this.g = obj4;
            this.h = obj5;
            this.i = obj6;
            this.j = obj7;
        }
        float[] fArr = this.d;
        this.f[i] = f;
        fArr[i] = f;
        fArr = this.e;
        this.g[i] = f2;
        fArr[i] = f2;
        int[] iArr = this.h;
        int i3 = (int) f;
        int i4 = (int) f2;
        if (i3 < this.u.getLeft() + this.o) {
            i2 = 1;
        }
        if (i4 < this.u.getTop() + this.o) {
            i2 |= 4;
        }
        if (i3 > this.u.getRight() - this.o) {
            i2 |= 2;
        }
        if (i4 > this.u.getBottom() - this.o) {
            i2 |= 8;
        }
        iArr[i] = i2;
        this.k |= 1 << i;
    }
}
