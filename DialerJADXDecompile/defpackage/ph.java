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

/* compiled from: PG */
/* renamed from: ph */
public final class ph {
    private static final Interpolator u;
    public int a;
    public int b;
    public int c;
    public View d;
    private float[] e;
    private float[] f;
    private float[] g;
    private float[] h;
    private int[] i;
    private int[] j;
    private int[] k;
    private int l;
    private VelocityTracker m;
    private float n;
    private float o;
    private int p;
    private ox q;
    private final pk r;
    private boolean s;
    private final ViewGroup t;
    private final Runnable v;

    static {
        u = new pi();
    }

    public static ph a(ViewGroup viewGroup, pk pkVar) {
        return new ph(viewGroup.getContext(), viewGroup, pkVar);
    }

    private ph(Context context, ViewGroup viewGroup, pk pkVar) {
        this.c = -1;
        this.v = new pj(this);
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (pkVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.t = viewGroup;
            this.r = pkVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.n = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.o = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.q = ox.a(context, u);
        }
    }

    public final void a(View view, int i) {
        if (view.getParent() != this.t) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.t + ")");
        }
        this.d = view;
        this.c = i;
        this.r.b(view, i);
        a(1);
    }

    private void a() {
        this.c = -1;
        if (this.e != null) {
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            this.l = 0;
        }
        if (this.m != null) {
            this.m.recycle();
            this.m = null;
        }
    }

    public final boolean a(int i, int i2) {
        if (this.s) {
            return a(i, i2, (int) kj.a(this.m, this.c), (int) kj.b(this.m, this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean a(int i, int i2, int i3, int i4) {
        int left = this.d.getLeft();
        int top = this.d.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.q.h();
            a(0);
            return false;
        }
        View view = this.d;
        int b = ph.b(i3, (int) this.o, (int) this.n);
        int b2 = ph.b(i4, (int) this.o, (int) this.n);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        this.q.a(left, top, i5, i6, (int) (((b2 != 0 ? ((float) abs4) / ((float) i7) : ((float) abs2) / ((float) i8)) * ((float) a(i6, b2, this.r.a()))) + ((b != 0 ? ((float) abs3) / ((float) i7) : ((float) abs) / ((float) i8)) * ((float) a(i5, b, this.r.a(view))))));
        a(2);
        return true;
    }

    private final int a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.t.getWidth();
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

    public final boolean a(boolean z) {
        if (this.a == 2) {
            boolean g = this.q.g();
            int b = this.q.b();
            int c = this.q.c();
            int left = b - this.d.getLeft();
            int top = c - this.d.getTop();
            if (left != 0) {
                kn.e(this.d, left);
            }
            if (top != 0) {
                kn.d(this.d, top);
            }
            if (!(left == 0 && top == 0)) {
                this.r.a(this.d, b, c);
            }
            if (g && b == this.q.d() && c == this.q.e()) {
                this.q.h();
                g = false;
            }
            if (!g) {
                this.t.post(this.v);
            }
        }
        if (this.a == 2) {
            return true;
        }
        return false;
    }

    private final void a(float f, float f2) {
        this.s = true;
        this.r.a(this.d, f, f2);
        this.s = false;
        if (this.a == 1) {
            a(0);
        }
    }

    private final void b(int i) {
        if (this.e != null) {
            this.e[i] = 0.0f;
            this.f[i] = 0.0f;
            this.g[i] = 0.0f;
            this.h[i] = 0.0f;
            this.i[i] = 0;
            this.j[i] = 0;
            this.k[i] = 0;
            this.l &= (1 << i) ^ -1;
        }
    }

    private final void a(float f, float f2, int i) {
        int i2 = 0;
        if (this.e == null || this.e.length <= i) {
            Object obj = new float[(i + 1)];
            Object obj2 = new float[(i + 1)];
            Object obj3 = new float[(i + 1)];
            Object obj4 = new float[(i + 1)];
            Object obj5 = new int[(i + 1)];
            Object obj6 = new int[(i + 1)];
            Object obj7 = new int[(i + 1)];
            if (this.e != null) {
                System.arraycopy(this.e, 0, obj, 0, this.e.length);
                System.arraycopy(this.f, 0, obj2, 0, this.f.length);
                System.arraycopy(this.g, 0, obj3, 0, this.g.length);
                System.arraycopy(this.h, 0, obj4, 0, this.h.length);
                System.arraycopy(this.i, 0, obj5, 0, this.i.length);
                System.arraycopy(this.j, 0, obj6, 0, this.j.length);
                System.arraycopy(this.k, 0, obj7, 0, this.k.length);
            }
            this.e = obj;
            this.f = obj2;
            this.g = obj3;
            this.h = obj4;
            this.i = obj5;
            this.j = obj6;
            this.k = obj7;
        }
        float[] fArr = this.e;
        this.g[i] = f;
        fArr[i] = f;
        fArr = this.f;
        this.h[i] = f2;
        fArr[i] = f2;
        int[] iArr = this.i;
        int i3 = (int) f;
        int i4 = (int) f2;
        if (i3 < this.t.getLeft() + this.p) {
            i2 = 1;
        }
        if (i4 < this.t.getTop() + this.p) {
            i2 |= 4;
        }
        if (i3 > this.t.getRight() - this.p) {
            i2 |= 2;
        }
        if (i4 > this.t.getBottom() - this.p) {
            i2 |= 8;
        }
        iArr[i] = i2;
        this.l |= 1 << i;
    }

    private final void c(MotionEvent motionEvent) {
        int c = jw.c(motionEvent);
        for (int i = 0; i < c; i++) {
            int b = jw.b(motionEvent, i);
            float c2 = jw.c(motionEvent, i);
            float d = jw.d(motionEvent, i);
            this.g[b] = c2;
            this.h[b] = d;
        }
    }

    final void a(int i) {
        this.t.removeCallbacks(this.v);
        if (this.a != i) {
            this.a = i;
            this.r.a(i);
            if (this.a == 0) {
                this.d = null;
            }
        }
    }

    private boolean b(View view, int i) {
        if (view == this.d && this.c == i) {
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
    public final boolean a(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r0 = defpackage.jw.a(r14);
        r1 = defpackage.jw.b(r14);
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        r13.a();
    L_0x000d:
        r2 = r13.m;
        if (r2 != 0) goto L_0x0017;
    L_0x0011:
        r2 = android.view.VelocityTracker.obtain();
        r13.m = r2;
    L_0x0017:
        r2 = r13.m;
        r2.addMovement(r14);
        switch(r0) {
            case 0: goto L_0x0026;
            case 1: goto L_0x0106;
            case 2: goto L_0x0073;
            case 3: goto L_0x0106;
            case 4: goto L_0x001f;
            case 5: goto L_0x004d;
            case 6: goto L_0x00fd;
            default: goto L_0x001f;
        };
    L_0x001f:
        r0 = r13.a;
        r1 = 1;
        if (r0 != r1) goto L_0x010b;
    L_0x0024:
        r0 = 1;
    L_0x0025:
        return r0;
    L_0x0026:
        r0 = r14.getX();
        r1 = r14.getY();
        r2 = 0;
        r2 = defpackage.jw.b(r14, r2);
        r13.a(r0, r1, r2);
        r0 = (int) r0;
        r1 = (int) r1;
        r0 = r13.b(r0, r1);
        r1 = r13.d;
        if (r0 != r1) goto L_0x0048;
    L_0x0040:
        r1 = r13.a;
        r3 = 2;
        if (r1 != r3) goto L_0x0048;
    L_0x0045:
        r13.b(r0, r2);
    L_0x0048:
        r0 = r13.i;
        r0 = r0[r2];
        goto L_0x001f;
    L_0x004d:
        r0 = defpackage.jw.b(r14, r1);
        r2 = defpackage.jw.c(r14, r1);
        r1 = defpackage.jw.d(r14, r1);
        r13.a(r2, r1, r0);
        r3 = r13.a;
        if (r3 == 0) goto L_0x001f;
    L_0x0060:
        r3 = r13.a;
        r4 = 2;
        if (r3 != r4) goto L_0x001f;
    L_0x0065:
        r2 = (int) r2;
        r1 = (int) r1;
        r1 = r13.b(r2, r1);
        r2 = r13.d;
        if (r1 != r2) goto L_0x001f;
    L_0x006f:
        r13.b(r1, r0);
        goto L_0x001f;
    L_0x0073:
        r0 = r13.e;
        if (r0 == 0) goto L_0x001f;
    L_0x0077:
        r0 = r13.f;
        if (r0 == 0) goto L_0x001f;
    L_0x007b:
        r2 = defpackage.jw.c(r14);
        r0 = 0;
        r1 = r0;
    L_0x0081:
        if (r1 >= r2) goto L_0x00f8;
    L_0x0083:
        r3 = defpackage.jw.b(r14, r1);
        r0 = r13.c(r3);
        if (r0 == 0) goto L_0x00f2;
    L_0x008d:
        r0 = defpackage.jw.c(r14, r1);
        r4 = defpackage.jw.d(r14, r1);
        r5 = r13.e;
        r5 = r5[r3];
        r5 = r0 - r5;
        r6 = r13.f;
        r6 = r6[r3];
        r6 = r4 - r6;
        r0 = (int) r0;
        r4 = (int) r4;
        r4 = r13.b(r0, r4);
        if (r4 == 0) goto L_0x00f6;
    L_0x00a9:
        r0 = r13.a(r4, r5, r6);
        if (r0 == 0) goto L_0x00f6;
    L_0x00af:
        r0 = 1;
    L_0x00b0:
        if (r0 == 0) goto L_0x00e2;
    L_0x00b2:
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
        r12 = r12.a();
        if (r11 == 0) goto L_0x00dc;
    L_0x00d8:
        if (r11 <= 0) goto L_0x00e2;
    L_0x00da:
        if (r8 != r7) goto L_0x00e2;
    L_0x00dc:
        if (r12 == 0) goto L_0x00f8;
    L_0x00de:
        if (r12 <= 0) goto L_0x00e2;
    L_0x00e0:
        if (r10 == r9) goto L_0x00f8;
    L_0x00e2:
        r13.b(r5, r6, r3);
        r5 = r13.a;
        r6 = 1;
        if (r5 == r6) goto L_0x00f8;
    L_0x00ea:
        if (r0 == 0) goto L_0x00f2;
    L_0x00ec:
        r0 = r13.b(r4, r3);
        if (r0 != 0) goto L_0x00f8;
    L_0x00f2:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0081;
    L_0x00f6:
        r0 = 0;
        goto L_0x00b0;
    L_0x00f8:
        r13.c(r14);
        goto L_0x001f;
    L_0x00fd:
        r0 = defpackage.jw.b(r14, r1);
        r13.b(r0);
        goto L_0x001f;
    L_0x0106:
        r13.a();
        goto L_0x001f;
    L_0x010b:
        r0 = 0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.a(android.view.MotionEvent):boolean");
    }

    public final void b(MotionEvent motionEvent) {
        int i = 0;
        int a = jw.a(motionEvent);
        int b = jw.b(motionEvent);
        if (a == 0) {
            a();
        }
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
        this.m.addMovement(motionEvent);
        float x;
        int c;
        float c2;
        int i2;
        switch (a) {
            case rl.c /*0*/:
                x = motionEvent.getX();
                float y = motionEvent.getY();
                i = jw.b(motionEvent, 0);
                View b2 = b((int) x, (int) y);
                a(x, y, i);
                b(b2, i);
                i = this.i[i];
            case rq.b /*1*/:
                if (this.a == 1) {
                    b();
                }
                a();
            case rq.c /*2*/:
                if (this.a != 1) {
                    c = jw.c(motionEvent);
                    while (i < c) {
                        a = jw.b(motionEvent, i);
                        if (c(a)) {
                            c2 = jw.c(motionEvent, i);
                            float d = jw.d(motionEvent, i);
                            float f = c2 - this.e[a];
                            float f2 = d - this.f[a];
                            b(f, f2, a);
                            if (this.a != 1) {
                                View b3 = b((int) c2, (int) d);
                                if (a(b3, f, f2) && b(b3, a)) {
                                }
                            }
                            c(motionEvent);
                        }
                        i++;
                    }
                    c(motionEvent);
                } else if (c(this.c)) {
                    i = jw.a(motionEvent, this.c);
                    x = jw.c(motionEvent, i);
                    i2 = (int) (x - this.g[this.c]);
                    a = (int) (jw.d(motionEvent, i) - this.h[this.c]);
                    c = this.d.getLeft() + i2;
                    i = this.d.getTop() + a;
                    b = this.d.getLeft();
                    int top = this.d.getTop();
                    if (i2 != 0) {
                        c = this.r.c(this.d, c);
                        kn.e(this.d, c - b);
                    }
                    if (a != 0) {
                        i = this.r.d(this.d, i);
                        kn.d(this.d, i - top);
                    }
                    if (!(i2 == 0 && a == 0)) {
                        this.r.a(this.d, c, i);
                    }
                    c(motionEvent);
                }
            case rl.e /*3*/:
                if (this.a == 1) {
                    a(0.0f, 0.0f);
                }
                a();
            case rl.g /*5*/:
                c = jw.b(motionEvent, b);
                float c3 = jw.c(motionEvent, b);
                c2 = jw.d(motionEvent, b);
                a(c3, c2, c);
                if (this.a == 0) {
                    b(b((int) c3, (int) c2), c);
                    return;
                }
                a = (int) c3;
                b = (int) c2;
                View view = this.d;
                if (view != null && a >= view.getLeft() && a < view.getRight() && b >= view.getTop() && b < view.getBottom()) {
                    i = 1;
                }
                if (i != 0) {
                    b(this.d, c);
                }
            case rl.i /*6*/:
                a = jw.b(motionEvent, b);
                if (this.a == 1 && a == this.c) {
                    i2 = jw.c(motionEvent);
                    while (i < i2) {
                        b = jw.b(motionEvent, i);
                        if (b != this.c) {
                            if (b((int) jw.c(motionEvent, i), (int) jw.d(motionEvent, i)) == this.d && b(this.d, b)) {
                                i = this.c;
                                if (i == -1) {
                                    b();
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        b();
                    }
                }
                b(a);
            default:
        }
    }

    private final void b(float f, float f2, int i) {
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
            int[] iArr = this.j;
            iArr[i] = i2 | iArr[i];
        }
    }

    private final boolean a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.i[i] & i2) != i2 || (i2 & 0) == 0 || (this.k[i] & i2) == i2 || (this.j[i] & i2) == i2) {
            return false;
        }
        if ((abs > ((float) this.b) || abs2 > ((float) this.b)) && (this.j[i] & i2) == 0 && abs > ((float) this.b)) {
            return true;
        }
        return false;
    }

    private final boolean a(View view, float f, float f2) {
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
        if (this.r.a() > 0) {
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

    private final void b() {
        this.m.computeCurrentVelocity(1000, this.n);
        a(ph.a(kj.a(this.m, this.c), this.o, this.n), ph.a(kj.b(this.m, this.c), this.o, this.n));
    }

    private View b(int i, int i2) {
        for (int childCount = this.t.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.t.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private final boolean c(int i) {
        if ((this.l & (1 << i)) != 0) {
            int i2 = 1;
        } else {
            boolean z = false;
        }
        if (i2 != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
