package android.support.v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import jw;
import kg;
import kj;
import kn;
import kz;
import le;
import lf;
import lg;
import lh;
import li;
import lj;
import lk;
import ll;
import lm;
import ln;
import lo;
import lq;
import nz;
import oe;
import rk;
import rl;
import rq;

/* compiled from: PG */
public class ViewPager extends ViewGroup {
    private static final lq U;
    public static final int[] a;
    private static final Comparator f;
    private static final Interpolator g;
    private boolean A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private float G;
    private float H;
    private int I;
    private VelocityTracker J;
    private int K;
    private int L;
    private int M;
    private int N;
    private nz O;
    private nz P;
    private boolean Q;
    private boolean R;
    private int S;
    private ArrayList T;
    private final Runnable V;
    private int W;
    public kg b;
    public int c;
    public lm d;
    private int e;
    private final ArrayList h;
    private final lj i;
    private final Rect j;
    private int k;
    private Parcelable l;
    private ClassLoader m;
    private Scroller n;
    private boolean o;
    private ln p;
    private int q;
    private int r;
    private float s;
    private float t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;

    static {
        a = new int[]{16842931};
        f = new le();
        g = new lf();
        U = new lq();
    }

    public ViewPager(Context context) {
        super(context);
        this.h = new ArrayList();
        this.i = new lj();
        this.j = new Rect();
        this.k = -1;
        this.l = null;
        this.m = null;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.y = 1;
        this.I = -1;
        this.Q = true;
        this.V = new lg(this);
        this.W = 0;
        c();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new ArrayList();
        this.i = new lj();
        this.j = new Rect();
        this.k = -1;
        this.l = null;
        this.m = null;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.y = 1;
        this.I = -1;
        this.Q = true;
        this.V = new lg(this);
        this.W = 0;
        c();
    }

    private void c() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.n = new Scroller(context, g);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.D = kz.a.a(viewConfiguration);
        this.K = (int) (400.0f * f);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.O = new nz(context);
        this.P = new nz(context);
        this.M = (int) (25.0f * f);
        this.N = (int) (2.0f * f);
        this.B = (int) (16.0f * f);
        kn.a((View) this, new ll(this));
        if (kn.d(this) == 0) {
            kn.c((View) this, 1);
        }
        kn.a((View) this, new lh(this));
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.V);
        if (!(this.n == null || this.n.isFinished())) {
            this.n.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public final void a(int i) {
        if (this.W != i) {
            this.W = i;
            if (this.d != null) {
                this.d.a_(i);
            }
        }
    }

    public final void a(kg kgVar) {
        if (this.b != null) {
            int i;
            this.b.a(null);
            this.b.a((ViewGroup) this);
            for (i = 0; i < this.h.size(); i++) {
                lj ljVar = (lj) this.h.get(i);
                this.b.a(this, ljVar.b, ljVar.a);
            }
            this.b.b(this);
            this.h.clear();
            i = 0;
            while (i < getChildCount()) {
                if (!((lk) getChildAt(i).getLayoutParams()).a) {
                    removeViewAt(i);
                    i--;
                }
                i++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = kgVar;
        this.e = 0;
        if (this.b != null) {
            if (this.p == null) {
                this.p = new ln(this);
            }
            this.b.a(this.p);
            this.x = false;
            boolean z = this.Q;
            this.Q = true;
            this.e = this.b.a();
            if (this.k >= 0) {
                a(this.k, false, true);
                this.k = -1;
                this.l = null;
                this.m = null;
            } else if (z) {
                requestLayout();
            } else {
                b();
            }
        }
    }

    private final int d() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public final void b(int i) {
        boolean z;
        this.x = false;
        if (this.Q) {
            z = false;
        } else {
            z = true;
        }
        a(i, z, false);
    }

    private void a(int i, boolean z) {
        this.x = false;
        a(i, true, false);
    }

    private void a(int i, boolean z, boolean z2) {
        a(i, z, z2, 0);
    }

    private void a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.b == null || this.b.a() <= 0) {
            c(false);
        } else if (z2 || this.c != i || this.h.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.b.a()) {
                i = this.b.a() - 1;
            }
            int i3 = this.y;
            if (i > this.c + i3 || i < this.c - i3) {
                for (int i4 = 0; i4 < this.h.size(); i4++) {
                    ((lj) this.h.get(i4)).c = true;
                }
            }
            if (this.c != i) {
                z3 = true;
            }
            if (this.Q) {
                this.c = i;
                if (z3) {
                    g(i);
                }
                requestLayout();
                return;
            }
            d(i);
            a(i, z, i2, z3);
        } else {
            c(false);
        }
    }

    private final void a(int i, boolean z, int i2, boolean z2) {
        int d;
        lj e = e(i);
        if (e != null) {
            d = (int) (((float) d()) * Math.max(this.s, Math.min(e.e, this.t)));
        } else {
            d = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                c(false);
            } else {
                int currX;
                int i3;
                Object obj = (this.n == null || this.n.isFinished()) ? null : 1;
                if (obj != null) {
                    currX = this.o ? this.n.getCurrX() : this.n.getStartX();
                    this.n.abortAnimation();
                    c(false);
                    i3 = currX;
                } else {
                    i3 = getScrollX();
                }
                int scrollY = getScrollY();
                d -= i3;
                int i4 = 0 - scrollY;
                if (d == 0 && i4 == 0) {
                    a(false);
                    b();
                    a(0);
                } else {
                    c(true);
                    a(2);
                    currX = d();
                    int i5 = currX / 2;
                    float sin = (((float) i5) * ((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, (1.0f * ((float) Math.abs(d))) / ((float) currX)) - 0.5f)) * 0.4712389167638204d))))) + ((float) i5);
                    int abs = Math.abs(i2);
                    if (abs > 0) {
                        currX = Math.round(1000.0f * Math.abs(sin / ((float) abs))) * 4;
                    } else {
                        currX = (int) (((((float) Math.abs(d)) / (((float) currX) + 0.0f)) + 1.0f) * 100.0f);
                    }
                    i5 = Math.min(currX, 600);
                    this.o = false;
                    this.n.startScroll(i3, scrollY, d, i4, i5);
                    kn.c(this);
                }
            }
            if (z2) {
                g(i);
                return;
            }
            return;
        }
        if (z2) {
            g(i);
        }
        a(false);
        scrollTo(d, 0);
        f(d);
    }

    protected int getChildDrawingOrder(int i, int i2) {
        return ((lk) ((View) this.T.get(i2)).getLayoutParams()).f;
    }

    public final void c(int i) {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.y) {
            this.y = i;
            b();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
    }

    private lj a(int i, int i2) {
        lj ljVar = new lj();
        ljVar.b = i;
        ljVar.a = this.b.a((ViewGroup) this, i);
        ljVar.d = 1.0f;
        if (i2 < 0 || i2 >= this.h.size()) {
            this.h.add(ljVar);
        } else {
            this.h.add(i2, ljVar);
        }
        return ljVar;
    }

    public final void a() {
        boolean z;
        int a = this.b.a();
        this.e = a;
        if (this.h.size() >= (this.y << 1) + 1 || this.h.size() >= a) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = false;
        int i = this.c;
        boolean z3 = z;
        int i2 = 0;
        while (i2 < this.h.size()) {
            int i3;
            boolean z4;
            int max;
            boolean z5;
            lj ljVar = (lj) this.h.get(i2);
            int a2 = this.b.a(ljVar.a);
            if (a2 != -1) {
                if (a2 == -2) {
                    this.h.remove(i2);
                    i2--;
                    if (!z2) {
                        this.b.a((ViewGroup) this);
                        z2 = true;
                    }
                    this.b.a(this, ljVar.b, ljVar.a);
                    if (this.c == ljVar.b) {
                        i3 = i2;
                        z4 = z2;
                        max = Math.max(0, Math.min(this.c, a - 1));
                        z5 = true;
                    } else {
                        i3 = i2;
                        z4 = z2;
                        max = i;
                        z5 = true;
                    }
                } else if (ljVar.b != a2) {
                    if (ljVar.b == this.c) {
                        i = a2;
                    }
                    ljVar.b = a2;
                    i3 = i2;
                    z4 = z2;
                    max = i;
                    z5 = true;
                }
                z3 = z5;
                i = max;
                z2 = z4;
                i2 = i3 + 1;
            }
            i3 = i2;
            z4 = z2;
            max = i;
            z5 = z3;
            z3 = z5;
            i = max;
            z2 = z4;
            i2 = i3 + 1;
        }
        if (z2) {
            this.b.b(this);
        }
        Collections.sort(this.h, f);
        if (z3) {
            max = getChildCount();
            for (i2 = 0; i2 < max; i2++) {
                lk lkVar = (lk) getChildAt(i2).getLayoutParams();
                if (!lkVar.a) {
                    lkVar.c = 0.0f;
                }
            }
            a(i, false, true);
            requestLayout();
        }
    }

    public final void b() {
        d(this.c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(int r18) {
        /*
        r17 = this;
        r2 = 0;
        r0 = r17;
        r3 = r0.c;
        r0 = r18;
        if (r3 == r0) goto L_0x030e;
    L_0x0009:
        r0 = r17;
        r2 = r0.c;
        r0 = r17;
        r2 = r0.e(r2);
        r0 = r18;
        r1 = r17;
        r1.c = r0;
        r3 = r2;
    L_0x001a:
        r0 = r17;
        r2 = r0.b;
        if (r2 != 0) goto L_0x0021;
    L_0x0020:
        return;
    L_0x0021:
        r0 = r17;
        r2 = r0.x;
        if (r2 != 0) goto L_0x0020;
    L_0x0027:
        r2 = r17.getWindowToken();
        if (r2 == 0) goto L_0x0020;
    L_0x002d:
        r0 = r17;
        r2 = r0.b;
        r0 = r17;
        r2.a(r0);
        r0 = r17;
        r2 = r0.y;
        r4 = 0;
        r0 = r17;
        r5 = r0.c;
        r5 = r5 - r2;
        r10 = java.lang.Math.max(r4, r5);
        r0 = r17;
        r4 = r0.b;
        r11 = r4.a();
        r4 = r11 + -1;
        r0 = r17;
        r5 = r0.c;
        r2 = r2 + r5;
        r12 = java.lang.Math.min(r4, r2);
        r0 = r17;
        r2 = r0.e;
        if (r11 == r2) goto L_0x00c0;
    L_0x005d:
        r2 = r17.getResources();	 Catch:{ NotFoundException -> 0x00b6 }
        r3 = r17.getId();	 Catch:{ NotFoundException -> 0x00b6 }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00b6 }
    L_0x0069:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r4.<init>(r5);
        r0 = r17;
        r5 = r0.e;
        r4 = r4.append(r5);
        r5 = ", found: ";
        r4 = r4.append(r5);
        r4 = r4.append(r11);
        r5 = " Pager id: ";
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = " Pager class: ";
        r2 = r2.append(r4);
        r4 = r17.getClass();
        r2 = r2.append(r4);
        r4 = " Problematic adapter: ";
        r2 = r2.append(r4);
        r0 = r17;
        r4 = r0.b;
        r4 = r4.getClass();
        r2 = r2.append(r4);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x00b6:
        r2 = move-exception;
        r2 = r17.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x0069;
    L_0x00c0:
        r5 = 0;
        r2 = 0;
        r4 = r2;
    L_0x00c3:
        r0 = r17;
        r2 = r0.h;
        r2 = r2.size();
        if (r4 >= r2) goto L_0x030b;
    L_0x00cd:
        r0 = r17;
        r2 = r0.h;
        r2 = r2.get(r4);
        r2 = (lj) r2;
        r6 = r2.b;
        r0 = r17;
        r7 = r0.c;
        if (r6 < r7) goto L_0x0153;
    L_0x00df:
        r6 = r2.b;
        r0 = r17;
        r7 = r0.c;
        if (r6 != r7) goto L_0x030b;
    L_0x00e7:
        if (r2 != 0) goto L_0x0308;
    L_0x00e9:
        if (r11 <= 0) goto L_0x0308;
    L_0x00eb:
        r0 = r17;
        r2 = r0.c;
        r0 = r17;
        r2 = r0.a(r2, r4);
        r9 = r2;
    L_0x00f6:
        if (r9 == 0) goto L_0x026d;
    L_0x00f8:
        r8 = 0;
        r7 = r4 + -1;
        if (r7 < 0) goto L_0x0158;
    L_0x00fd:
        r0 = r17;
        r2 = r0.h;
        r2 = r2.get(r7);
        r2 = (lj) r2;
    L_0x0107:
        r13 = r17.d();
        if (r13 > 0) goto L_0x015a;
    L_0x010d:
        r5 = 0;
    L_0x010e:
        r0 = r17;
        r6 = r0.c;
        r6 = r6 + -1;
        r15 = r6;
        r6 = r8;
        r8 = r15;
        r16 = r7;
        r7 = r4;
        r4 = r16;
    L_0x011c:
        if (r8 < 0) goto L_0x01a0;
    L_0x011e:
        r14 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r14 < 0) goto L_0x016a;
    L_0x0122:
        if (r8 >= r10) goto L_0x016a;
    L_0x0124:
        if (r2 == 0) goto L_0x01a0;
    L_0x0126:
        r14 = r2.b;
        if (r8 != r14) goto L_0x0150;
    L_0x012a:
        r14 = r2.c;
        if (r14 != 0) goto L_0x0150;
    L_0x012e:
        r0 = r17;
        r14 = r0.h;
        r14.remove(r4);
        r0 = r17;
        r14 = r0.b;
        r2 = r2.a;
        r0 = r17;
        r14.a(r0, r8, r2);
        r4 = r4 + -1;
        r7 = r7 + -1;
        if (r4 < 0) goto L_0x0168;
    L_0x0146:
        r0 = r17;
        r2 = r0.h;
        r2 = r2.get(r4);
        r2 = (lj) r2;
    L_0x0150:
        r8 = r8 + -1;
        goto L_0x011c;
    L_0x0153:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x00c3;
    L_0x0158:
        r2 = 0;
        goto L_0x0107;
    L_0x015a:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r9.d;
        r5 = r5 - r6;
        r6 = r17.getPaddingLeft();
        r6 = (float) r6;
        r14 = (float) r13;
        r6 = r6 / r14;
        r5 = r5 + r6;
        goto L_0x010e;
    L_0x0168:
        r2 = 0;
        goto L_0x0150;
    L_0x016a:
        if (r2 == 0) goto L_0x0184;
    L_0x016c:
        r14 = r2.b;
        if (r8 != r14) goto L_0x0184;
    L_0x0170:
        r2 = r2.d;
        r6 = r6 + r2;
        r4 = r4 + -1;
        if (r4 < 0) goto L_0x0182;
    L_0x0177:
        r0 = r17;
        r2 = r0.h;
        r2 = r2.get(r4);
        r2 = (lj) r2;
        goto L_0x0150;
    L_0x0182:
        r2 = 0;
        goto L_0x0150;
    L_0x0184:
        r2 = r4 + 1;
        r0 = r17;
        r2 = r0.a(r8, r2);
        r2 = r2.d;
        r6 = r6 + r2;
        r7 = r7 + 1;
        if (r4 < 0) goto L_0x019e;
    L_0x0193:
        r0 = r17;
        r2 = r0.h;
        r2 = r2.get(r4);
        r2 = (lj) r2;
        goto L_0x0150;
    L_0x019e:
        r2 = 0;
        goto L_0x0150;
    L_0x01a0:
        r5 = r9.d;
        r8 = r7 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x0268;
    L_0x01aa:
        r0 = r17;
        r2 = r0.h;
        r2 = r2.size();
        if (r8 >= r2) goto L_0x020e;
    L_0x01b4:
        r0 = r17;
        r2 = r0.h;
        r2 = r2.get(r8);
        r2 = (lj) r2;
        r6 = r2;
    L_0x01bf:
        if (r13 > 0) goto L_0x0210;
    L_0x01c1:
        r2 = 0;
        r4 = r2;
    L_0x01c3:
        r0 = r17;
        r2 = r0.c;
        r2 = r2 + 1;
        r15 = r2;
        r2 = r6;
        r6 = r8;
        r8 = r15;
    L_0x01cd:
        if (r8 >= r11) goto L_0x0268;
    L_0x01cf:
        r10 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r10 < 0) goto L_0x021e;
    L_0x01d3:
        if (r8 <= r12) goto L_0x021e;
    L_0x01d5:
        if (r2 == 0) goto L_0x0268;
    L_0x01d7:
        r10 = r2.b;
        if (r8 != r10) goto L_0x0303;
    L_0x01db:
        r10 = r2.c;
        if (r10 != 0) goto L_0x0303;
    L_0x01df:
        r0 = r17;
        r10 = r0.h;
        r10.remove(r6);
        r0 = r17;
        r10 = r0.b;
        r2 = r2.a;
        r0 = r17;
        r10.a(r0, r8, r2);
        r0 = r17;
        r2 = r0.h;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x021c;
    L_0x01fb:
        r0 = r17;
        r2 = r0.h;
        r2 = r2.get(r6);
        r2 = (lj) r2;
    L_0x0205:
        r15 = r5;
        r5 = r2;
        r2 = r15;
    L_0x0208:
        r8 = r8 + 1;
        r15 = r2;
        r2 = r5;
        r5 = r15;
        goto L_0x01cd;
    L_0x020e:
        r6 = 0;
        goto L_0x01bf;
    L_0x0210:
        r2 = r17.getPaddingRight();
        r2 = (float) r2;
        r4 = (float) r13;
        r2 = r2 / r4;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 + r4;
        r4 = r2;
        goto L_0x01c3;
    L_0x021c:
        r2 = 0;
        goto L_0x0205;
    L_0x021e:
        if (r2 == 0) goto L_0x0243;
    L_0x0220:
        r10 = r2.b;
        if (r8 != r10) goto L_0x0243;
    L_0x0224:
        r2 = r2.d;
        r5 = r5 + r2;
        r6 = r6 + 1;
        r0 = r17;
        r2 = r0.h;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x0241;
    L_0x0233:
        r0 = r17;
        r2 = r0.h;
        r2 = r2.get(r6);
        r2 = (lj) r2;
    L_0x023d:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x0208;
    L_0x0241:
        r2 = 0;
        goto L_0x023d;
    L_0x0243:
        r0 = r17;
        r2 = r0.a(r8, r6);
        r6 = r6 + 1;
        r2 = r2.d;
        r5 = r5 + r2;
        r0 = r17;
        r2 = r0.h;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x0266;
    L_0x0258:
        r0 = r17;
        r2 = r0.h;
        r2 = r2.get(r6);
        r2 = (lj) r2;
    L_0x0262:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x0208;
    L_0x0266:
        r2 = 0;
        goto L_0x0262;
    L_0x0268:
        r0 = r17;
        r0.a(r9, r7, r3);
    L_0x026d:
        r0 = r17;
        r3 = r0.b;
        r0 = r17;
        r4 = r0.c;
        if (r9 == 0) goto L_0x02bc;
    L_0x0277:
        r2 = r9.a;
    L_0x0279:
        r0 = r17;
        r3.b(r0, r4, r2);
        r0 = r17;
        r2 = r0.b;
        r0 = r17;
        r2.b(r0);
        r4 = r17.getChildCount();
        r2 = 0;
        r3 = r2;
    L_0x028d:
        if (r3 >= r4) goto L_0x02be;
    L_0x028f:
        r0 = r17;
        r5 = r0.getChildAt(r3);
        r2 = r5.getLayoutParams();
        r2 = (lk) r2;
        r2.f = r3;
        r6 = r2.a;
        if (r6 != 0) goto L_0x02b8;
    L_0x02a1:
        r6 = r2.c;
        r7 = 0;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 != 0) goto L_0x02b8;
    L_0x02a8:
        r0 = r17;
        r5 = r0.a(r5);
        if (r5 == 0) goto L_0x02b8;
    L_0x02b0:
        r6 = r5.d;
        r2.c = r6;
        r5 = r5.b;
        r2.e = r5;
    L_0x02b8:
        r2 = r3 + 1;
        r3 = r2;
        goto L_0x028d;
    L_0x02bc:
        r2 = 0;
        goto L_0x0279;
    L_0x02be:
        r2 = r17.hasFocus();
        if (r2 == 0) goto L_0x0020;
    L_0x02c4:
        r2 = r17.findFocus();
        if (r2 == 0) goto L_0x0301;
    L_0x02ca:
        r0 = r17;
        r2 = r0.b(r2);
    L_0x02d0:
        if (r2 == 0) goto L_0x02da;
    L_0x02d2:
        r2 = r2.b;
        r0 = r17;
        r3 = r0.c;
        if (r2 == r3) goto L_0x0020;
    L_0x02da:
        r2 = 0;
    L_0x02db:
        r3 = r17.getChildCount();
        if (r2 >= r3) goto L_0x0020;
    L_0x02e1:
        r0 = r17;
        r3 = r0.getChildAt(r2);
        r0 = r17;
        r4 = r0.a(r3);
        if (r4 == 0) goto L_0x02fe;
    L_0x02ef:
        r4 = r4.b;
        r0 = r17;
        r5 = r0.c;
        if (r4 != r5) goto L_0x02fe;
    L_0x02f7:
        r4 = 2;
        r3 = r3.requestFocus(r4);
        if (r3 != 0) goto L_0x0020;
    L_0x02fe:
        r2 = r2 + 1;
        goto L_0x02db;
    L_0x0301:
        r2 = 0;
        goto L_0x02d0;
    L_0x0303:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x0208;
    L_0x0308:
        r9 = r2;
        goto L_0x00f6;
    L_0x030b:
        r2 = r5;
        goto L_0x00e7;
    L_0x030e:
        r3 = r2;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.d(int):void");
    }

    private final void a(lj ljVar, int i, lj ljVar2) {
        int i2;
        float f;
        lj ljVar3;
        int a = this.b.a();
        int d = d();
        float f2 = d > 0 ? 0.0f / ((float) d) : 0.0f;
        if (ljVar2 != null) {
            int i3 = ljVar2.b;
            int i4;
            float f3;
            int i5;
            if (i3 < ljVar.b) {
                i2 = 0;
                f = (ljVar2.e + ljVar2.d) + f2;
                d = i3 + 1;
                while (d <= ljVar.b && i2 < this.h.size()) {
                    ljVar3 = (lj) this.h.get(i2);
                    while (d > ljVar3.b && i2 < this.h.size() - 1) {
                        i2++;
                        ljVar3 = (lj) this.h.get(i2);
                    }
                    i4 = d;
                    f3 = f;
                    i5 = i4;
                    while (i5 < ljVar3.b) {
                        i5++;
                        f3 = (f2 + 1.0f) + f3;
                    }
                    ljVar3.e = f3;
                    f3 += ljVar3.d + f2;
                    i3 = i5 + 1;
                    f = f3;
                    d = i3;
                }
            } else if (i3 > ljVar.b) {
                i2 = this.h.size() - 1;
                f = ljVar2.e;
                d = i3 - 1;
                while (d >= ljVar.b && i2 >= 0) {
                    ljVar3 = (lj) this.h.get(i2);
                    while (d < ljVar3.b && i2 > 0) {
                        i2--;
                        ljVar3 = (lj) this.h.get(i2);
                    }
                    i4 = d;
                    f3 = f;
                    i5 = i4;
                    while (i5 > ljVar3.b) {
                        i5--;
                        f3 -= f2 + 1.0f;
                    }
                    f3 -= ljVar3.d + f2;
                    ljVar3.e = f3;
                    i3 = i5 - 1;
                    f = f3;
                    d = i3;
                }
            }
        }
        int size = this.h.size();
        f = ljVar.e;
        d = ljVar.b - 1;
        this.s = ljVar.b == 0 ? ljVar.e : -3.4028235E38f;
        this.t = ljVar.b == a + -1 ? (ljVar.e + ljVar.d) - 1.0f : Float.MAX_VALUE;
        for (i2 = i - 1; i2 >= 0; i2--) {
            ljVar3 = (lj) this.h.get(i2);
            while (d > ljVar3.b) {
                d--;
                f -= f2 + 1.0f;
            }
            f -= ljVar3.d + f2;
            ljVar3.e = f;
            if (ljVar3.b == 0) {
                this.s = f;
            }
            d--;
        }
        f = (ljVar.e + ljVar.d) + f2;
        d = ljVar.b + 1;
        for (i2 = i + 1; i2 < size; i2++) {
            ljVar3 = (lj) this.h.get(i2);
            while (d < ljVar3.b) {
                d++;
                f += f2 + 1.0f;
            }
            if (ljVar3.b == a - 1) {
                this.t = (ljVar3.d + f) - 1.0f;
            }
            ljVar3.e = f;
            f += ljVar3.d + f2;
            d++;
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable loVar = new lo(super.onSaveInstanceState());
        loVar.a = this.c;
        if (this.b != null) {
            loVar.b = null;
        }
        return loVar;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof lo) {
            lo loVar = (lo) parcelable;
            super.onRestoreInstanceState(loVar.e);
            if (this.b != null) {
                Parcelable parcelable2 = loVar.b;
                ClassLoader classLoader = loVar.c;
                a(loVar.a, false, true);
                return;
            }
            this.k = loVar.a;
            this.l = loVar.b;
            this.m = loVar.c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        int i2;
        if (checkLayoutParams(layoutParams)) {
            layoutParams2 = layoutParams;
        } else {
            layoutParams2 = generateLayoutParams(layoutParams);
        }
        lk lkVar = (lk) layoutParams2;
        boolean z = lkVar.a;
        if (view.getClass().getAnnotation(li.class) != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        lkVar.a = i2 | z;
        if (!this.v) {
            super.addView(view, i, layoutParams2);
        } else if (lkVar == null || !lkVar.a) {
            lkVar.d = true;
            addViewInLayout(view, i, layoutParams2);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void removeView(View view) {
        if (this.v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    private lj a(View view) {
        for (int i = 0; i < this.h.size(); i++) {
            lj ljVar = (lj) this.h.get(i);
            if (this.b.a(view, ljVar.a)) {
                return ljVar;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private lj b(android.view.View r3) {
        /*
        r2 = this;
    L_0x0000:
        r0 = r3.getParent();
        if (r0 == r2) goto L_0x0012;
    L_0x0006:
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r1 = r0 instanceof android.view.View;
        if (r1 != 0) goto L_0x000e;
    L_0x000c:
        r0 = 0;
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = (android.view.View) r0;
        r3 = r0;
        goto L_0x0000;
    L_0x0012:
        r0 = r2.a(r3);
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.b(android.view.View):lj");
    }

    private lj e(int i) {
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            lj ljVar = (lj) this.h.get(i2);
            if (ljVar.b == i) {
                return ljVar;
            }
        }
        return null;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.C = Math.min(measuredWidth / 10, this.B);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            lk lkVar;
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                lkVar = (lk) childAt.getLayoutParams();
                if (lkVar != null && lkVar.a) {
                    int i6 = lkVar.b & 7;
                    int i7 = lkVar.b & 112;
                    i3 = oe.INVALID_ID;
                    i4 = oe.INVALID_ID;
                    Object obj = (i7 == 48 || i7 == 80) ? 1 : null;
                    Object obj2 = (i6 == 3 || i6 == 5) ? 1 : null;
                    if (obj != null) {
                        i3 = 1073741824;
                    } else if (obj2 != null) {
                        i4 = 1073741824;
                    }
                    if (lkVar.width != -2) {
                        i7 = 1073741824;
                        i3 = lkVar.width != -1 ? lkVar.width : paddingLeft;
                    } else {
                        i7 = i3;
                        i3 = paddingLeft;
                    }
                    if (lkVar.height != -2) {
                        i4 = 1073741824;
                        if (lkVar.height != -1) {
                            measuredWidth = lkVar.height;
                            childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i4));
                            if (obj != null) {
                                measuredHeight -= childAt.getMeasuredHeight();
                            } else if (obj2 != null) {
                                paddingLeft -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    measuredWidth = measuredHeight;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i4));
                    if (obj != null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (obj2 != null) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.u = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.v = true;
        b();
        this.v = false;
        i3 = getChildCount();
        for (i4 = 0; i4 < i3; i4++) {
            View childAt2 = getChildAt(i4);
            if (childAt2.getVisibility() != 8) {
                lkVar = (lk) childAt2.getLayoutParams();
                if (lkVar == null || !lkVar.a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (lkVar.c * ((float) paddingLeft)), 1073741824), this.u);
                }
            }
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3) {
            return;
        }
        if (i3 <= 0 || this.h.isEmpty()) {
            lj e = e(this.c);
            int min = (int) ((e != null ? Math.min(e.e, this.t) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                a(false);
                scrollTo(min, getScrollY());
            }
        } else if (this.n.isFinished()) {
            scrollTo((int) (((float) (((i - getPaddingLeft()) - getPaddingRight()) + 0)) * (((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + 0)))), getScrollY());
        } else {
            this.n.setFinalX(this.c * d());
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            lk lkVar;
            int measuredWidth;
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                lkVar = (lk) childAt.getLayoutParams();
                if (lkVar.a) {
                    int i9 = lkVar.b & 112;
                    switch (lkVar.b & 7) {
                        case rq.b /*1*/:
                            max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case rl.e /*3*/:
                            max = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case rl.g /*5*/:
                            measuredWidth = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            max = measuredWidth;
                            break;
                        default:
                            max = paddingLeft;
                            break;
                    }
                    int i10;
                    switch (i9) {
                        case rk.bX /*16*/:
                            measuredWidth = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        case 48:
                            measuredWidth = childAt.getMeasuredHeight() + paddingTop;
                            i10 = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = measuredWidth;
                            measuredWidth = i10;
                            break;
                        case 80:
                            measuredWidth = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            i10 = paddingBottom + childAt.getMeasuredHeight();
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        default:
                            measuredWidth = paddingTop;
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                    }
                    max += scrollX;
                    childAt.layout(max, measuredWidth, childAt.getMeasuredWidth() + max, childAt.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i7 + 1;
                    i7 = paddingBottom;
                    paddingBottom = paddingTop;
                    paddingTop = paddingRight;
                    paddingRight = paddingLeft;
                    i8++;
                    paddingLeft = paddingRight;
                    paddingRight = paddingTop;
                    paddingTop = i7;
                    i7 = measuredWidth;
                }
            }
            measuredWidth = i7;
            i7 = paddingTop;
            paddingTop = paddingRight;
            paddingRight = paddingLeft;
            i8++;
            paddingLeft = paddingRight;
            paddingRight = paddingTop;
            paddingTop = i7;
            i7 = measuredWidth;
        }
        max = (i5 - paddingLeft) - paddingRight;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt2 = getChildAt(paddingRight);
            if (childAt2.getVisibility() != 8) {
                lkVar = (lk) childAt2.getLayoutParams();
                if (!lkVar.a) {
                    lj a = a(childAt2);
                    if (a != null) {
                        i5 = ((int) (a.e * ((float) max))) + paddingLeft;
                        if (lkVar.d) {
                            lkVar.d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (lkVar.c * ((float) max)), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                        }
                        childAt2.layout(i5, paddingTop, childAt2.getMeasuredWidth() + i5, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.q = paddingTop;
        this.r = i6 - paddingBottom;
        this.S = i7;
        if (this.Q) {
            a(this.c, false, 0, false);
        }
        this.Q = false;
    }

    public void computeScroll() {
        this.o = true;
        if (this.n.isFinished() || !this.n.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.n.getCurrX();
        int currY = this.n.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!f(currX)) {
                this.n.abortAnimation();
                scrollTo(0, currY);
            }
        }
        kn.c(this);
    }

    private final boolean f(int i) {
        if (this.h.size() != 0) {
            lj f = f();
            int d = d();
            float f2 = 0.0f / ((float) d);
            int i2 = f.b;
            float f3 = ((((float) i) / ((float) d)) - f.e) / (f.d + f2);
            d = (int) (((float) d) * f3);
            this.R = false;
            a(i2, f3, d);
            if (this.R) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.Q) {
            return false;
        } else {
            this.R = false;
            a(0, 0.0f, 0);
            if (this.R) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private void a(int i, float f, int i2) {
        if (this.S > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                int i4;
                View childAt = getChildAt(i3);
                lk lkVar = (lk) childAt.getLayoutParams();
                if (lkVar.a) {
                    int max;
                    switch (lkVar.b & 7) {
                        case rq.b /*1*/:
                            max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        case rl.e /*3*/:
                            max = childAt.getWidth() + paddingLeft;
                            i4 = paddingLeft;
                            paddingLeft = paddingRight;
                            paddingRight = max;
                            max = i4;
                            break;
                        case rl.g /*5*/:
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            i4 = paddingRight + childAt.getMeasuredWidth();
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        default:
                            max = paddingLeft;
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                    }
                    max = (max + scrollX) - childAt.getLeft();
                    if (max != 0) {
                        childAt.offsetLeftAndRight(max);
                    }
                } else {
                    i4 = paddingRight;
                    paddingRight = paddingLeft;
                    paddingLeft = i4;
                }
                i3++;
                i4 = paddingLeft;
                paddingLeft = paddingRight;
                paddingRight = i4;
            }
        }
        if (this.d != null) {
            this.d.a(i, f, i2);
        }
        this.R = true;
    }

    private final void g(int i) {
        if (this.d != null) {
            this.d.a(i);
        }
    }

    private final void a(boolean z) {
        int scrollX;
        boolean z2 = this.W == 2;
        if (z2) {
            boolean z3;
            c(false);
            if (this.n.isFinished()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                this.n.abortAnimation();
                scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.n.getCurrX();
                int currY = this.n.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        f(currX);
                    }
                }
            }
        }
        this.x = false;
        boolean z4 = z2;
        for (scrollX = 0; scrollX < this.h.size(); scrollX++) {
            lj ljVar = (lj) this.h.get(scrollX);
            if (ljVar.c) {
                ljVar.c = false;
                z4 = true;
            }
        }
        if (!z4) {
            return;
        }
        if (z) {
            kn.a((View) this, this.V);
        } else {
            this.V.run();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            e();
            return false;
        }
        if (action != 0) {
            if (this.z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        float x;
        switch (action) {
            case rl.c /*0*/:
                x = motionEvent.getX();
                this.G = x;
                this.E = x;
                x = motionEvent.getY();
                this.H = x;
                this.F = x;
                this.I = jw.b(motionEvent, 0);
                this.A = false;
                this.o = true;
                this.n.computeScrollOffset();
                if (this.W == 2 && Math.abs(this.n.getFinalX() - this.n.getCurrX()) > this.N) {
                    this.n.abortAnimation();
                    this.x = false;
                    b();
                    this.z = true;
                    b(true);
                    a(1);
                    break;
                }
                a(false);
                this.z = false;
                break;
                break;
            case rq.c /*2*/:
                action = this.I;
                if (action != -1) {
                    action = jw.a(motionEvent, action);
                    float c = jw.c(motionEvent, action);
                    float f = c - this.E;
                    float abs = Math.abs(f);
                    float d = jw.d(motionEvent, action);
                    float abs2 = Math.abs(d - this.H);
                    if (f != 0.0f) {
                        boolean z;
                        x = this.E;
                        if ((x >= ((float) this.C) || f <= 0.0f) && (x <= ((float) (getWidth() - this.C)) || f >= 0.0f)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z && a(this, false, (int) f, (int) c, (int) d)) {
                            this.E = c;
                            this.F = d;
                            this.A = true;
                            return false;
                        }
                    }
                    if (abs > ((float) this.D) && 0.5f * abs > abs2) {
                        this.z = true;
                        b(true);
                        a(1);
                        this.E = f > 0.0f ? this.G + ((float) this.D) : this.G - ((float) this.D);
                        this.F = d;
                        c(true);
                    } else if (abs2 > ((float) this.D)) {
                        this.A = true;
                    }
                    if (this.z && a(c)) {
                        kn.c(this);
                        break;
                    }
                }
                break;
            case rl.i /*6*/:
                a(motionEvent);
                break;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        return this.z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.b == null || this.b.a() == 0) {
            return false;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        float x;
        int i;
        float f;
        switch (motionEvent.getAction() & 255) {
            case rl.c /*0*/:
                this.n.abortAnimation();
                this.x = false;
                b();
                x = motionEvent.getX();
                this.G = x;
                this.E = x;
                x = motionEvent.getY();
                this.H = x;
                this.F = x;
                this.I = jw.b(motionEvent, 0);
                break;
            case rq.b /*1*/:
                if (this.z) {
                    VelocityTracker velocityTracker = this.J;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.L);
                    int a = (int) kj.a(velocityTracker, this.I);
                    this.x = true;
                    int d = d();
                    int scrollX = getScrollX();
                    lj f2 = f();
                    float f3 = 0.0f / ((float) d);
                    i = f2.b;
                    f = ((((float) scrollX) / ((float) d)) - f2.e) / (f2.d + f3);
                    if (Math.abs((int) (jw.c(motionEvent, jw.a(motionEvent, this.I)) - this.G)) <= this.M || Math.abs(a) <= this.K) {
                        scrollX = (int) ((((float) i) + f) + (i >= this.c ? 0.4f : 0.6f));
                    } else {
                        if (a <= 0) {
                            i++;
                        }
                        scrollX = i;
                    }
                    if (this.h.size() > 0) {
                        scrollX = Math.max(((lj) this.h.get(0)).b, Math.min(scrollX, ((lj) this.h.get(this.h.size() - 1)).b));
                    }
                    a(scrollX, true, true, a);
                    z = e();
                    break;
                }
                break;
            case rq.c /*2*/:
                if (!this.z) {
                    i = jw.a(motionEvent, this.I);
                    if (i == -1) {
                        z = e();
                        break;
                    }
                    float c = jw.c(motionEvent, i);
                    f = Math.abs(c - this.E);
                    float d2 = jw.d(motionEvent, i);
                    x = Math.abs(d2 - this.F);
                    if (f > ((float) this.D) && f > x) {
                        this.z = true;
                        b(true);
                        if (c - this.G > 0.0f) {
                            x = this.G + ((float) this.D);
                        } else {
                            x = this.G - ((float) this.D);
                        }
                        this.E = x;
                        this.F = d2;
                        a(1);
                        c(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.z) {
                    z = a(jw.c(motionEvent, jw.a(motionEvent, this.I))) | 0;
                    break;
                }
                break;
            case rl.e /*3*/:
                if (this.z) {
                    a(this.c, true, 0, false);
                    z = e();
                    break;
                }
                break;
            case rl.g /*5*/:
                i = jw.b(motionEvent);
                this.E = jw.c(motionEvent, i);
                this.I = jw.b(motionEvent, i);
                break;
            case rl.i /*6*/:
                a(motionEvent);
                this.E = jw.c(motionEvent, jw.a(motionEvent, this.I));
                break;
        }
        if (z) {
            kn.c(this);
        }
        return true;
    }

    private final boolean e() {
        this.I = -1;
        this.z = false;
        this.A = false;
        if (this.J != null) {
            this.J.recycle();
            this.J = null;
        }
        return this.O.c() | this.P.c();
    }

    private final void b(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final boolean a(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean z3 = false;
        float f3 = this.E - f;
        this.E = f;
        float scrollX = ((float) getScrollX()) + f3;
        int d = d();
        float f4 = ((float) d) * this.s;
        float f5 = ((float) d) * this.t;
        lj ljVar = (lj) this.h.get(0);
        lj ljVar2 = (lj) this.h.get(this.h.size() - 1);
        if (ljVar.b != 0) {
            f4 = ljVar.e * ((float) d);
            z = false;
        } else {
            z = true;
        }
        if (ljVar2.b != this.b.a() - 1) {
            f2 = ljVar2.e * ((float) d);
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                z3 = this.O.a(Math.abs(f4 - scrollX) / ((float) d));
            }
        } else if (scrollX > f2) {
            if (z2) {
                z3 = this.P.a(Math.abs(scrollX - f2) / ((float) d));
            }
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.E += f4 - ((float) ((int) f4));
        scrollTo((int) f4, getScrollY());
        f((int) f4);
        return z3;
    }

    private final lj f() {
        float f;
        int d = d();
        float scrollX = d > 0 ? ((float) getScrollX()) / ((float) d) : 0.0f;
        if (d > 0) {
            f = 0.0f / ((float) d);
        } else {
            f = 0.0f;
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        lj ljVar = null;
        while (i2 < this.h.size()) {
            int i3;
            lj ljVar2;
            lj ljVar3 = (lj) this.h.get(i2);
            lj ljVar4;
            if (obj != null || ljVar3.b == i + 1) {
                ljVar4 = ljVar3;
                i3 = i2;
                ljVar2 = ljVar4;
            } else {
                ljVar3 = this.i;
                ljVar3.e = (f2 + f3) + f;
                ljVar3.b = i + 1;
                ljVar3.d = 1.0f;
                ljVar4 = ljVar3;
                i3 = i2 - 1;
                ljVar2 = ljVar4;
            }
            f2 = ljVar2.e;
            f3 = (ljVar2.d + f2) + f;
            if (obj == null && scrollX < f2) {
                return ljVar;
            }
            if (scrollX < f3 || i3 == this.h.size() - 1) {
                return ljVar2;
            }
            f3 = f2;
            i = ljVar2.b;
            obj = null;
            f2 = ljVar2.d;
            ljVar = ljVar2;
            i2 = i3 + 1;
        }
        return ljVar;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = 0;
        int a = kn.a(this);
        if (a == 0 || (a == 1 && this.b != null && this.b.a() > 1)) {
            int width;
            if (!this.O.a()) {
                a = canvas.save();
                i = (getHeight() - getPaddingTop()) - getPaddingBottom();
                width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-i) + getPaddingTop()), this.s * ((float) width));
                this.O.a(i, width);
                i = this.O.a(canvas) | 0;
                canvas.restoreToCount(a);
            }
            if (!this.P.a()) {
                a = canvas.save();
                width = getWidth();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.t + 1.0f)) * ((float) width));
                this.P.a(height, width);
                i |= this.P.a(canvas);
                canvas.restoreToCount(a);
            }
        } else {
            this.O.b();
            this.P.b();
        }
        if (i != 0) {
            kn.c(this);
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    private final void a(MotionEvent motionEvent) {
        int b = jw.b(motionEvent);
        if (jw.b(motionEvent, b) == this.I) {
            b = b == 0 ? 1 : 0;
            this.E = jw.c(motionEvent, b);
            this.I = jw.b(motionEvent, b);
            if (this.J != null) {
                this.J.clear();
            }
        }
    }

    private final void c(boolean z) {
        if (this.w != z) {
            this.w = z;
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.b == null) {
            return false;
        }
        int d = d();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) d) * this.s))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) d) * this.t))) {
            return false;
        } else {
            return true;
        }
    }

    private boolean a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (z && kn.a(view, -i)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = 1;
        r2 = super.dispatchKeyEvent(r5);
        if (r2 != 0) goto L_0x0018;
    L_0x0008:
        r2 = r5.getAction();
        if (r2 != 0) goto L_0x0015;
    L_0x000e:
        r2 = r5.getKeyCode();
        switch(r2) {
            case 21: goto L_0x001a;
            case 22: goto L_0x0021;
            case 61: goto L_0x0028;
            default: goto L_0x0015;
        };
    L_0x0015:
        r2 = r0;
    L_0x0016:
        if (r2 == 0) goto L_0x0019;
    L_0x0018:
        r0 = r1;
    L_0x0019:
        return r0;
    L_0x001a:
        r2 = 17;
        r2 = r4.h(r2);
        goto L_0x0016;
    L_0x0021:
        r2 = 66;
        r2 = r4.h(r2);
        goto L_0x0016;
    L_0x0028:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 11;
        if (r2 < r3) goto L_0x0015;
    L_0x002e:
        r2 = jc.a(r5);
        if (r2 == 0) goto L_0x003a;
    L_0x0034:
        r2 = 2;
        r2 = r4.h(r2);
        goto L_0x0016;
    L_0x003a:
        r2 = jc.a(r5, r1);
        if (r2 == 0) goto L_0x0015;
    L_0x0040:
        r2 = r4.h(r1);
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    private boolean h(int i) {
        View view;
        boolean g;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            if (findFocus != null) {
                Object obj;
                for (ViewPager parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        stringBuilder.append(" => ").append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + stringBuilder.toString());
                    view = null;
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus == null || findNextFocus == view) {
            if (i == 17 || i == 1) {
                g = g();
            } else {
                if (i == 66 || i == 2) {
                    g = h();
                }
                g = false;
            }
        } else if (i == 17) {
            g = (view == null || a(this.j, findNextFocus).left < a(this.j, view).left) ? findNextFocus.requestFocus() : g();
        } else {
            if (i == 66) {
                g = (view == null || a(this.j, findNextFocus).left > a(this.j, view).left) ? findNextFocus.requestFocus() : h();
            }
            g = false;
        }
        if (g) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return g;
    }

    private final Rect a(Rect rect, View view) {
        Rect rect2;
        if (rect == null) {
            rect2 = new Rect();
        } else {
            rect2 = rect;
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private boolean g() {
        if (this.c <= 0) {
            return false;
        }
        a(this.c - 1, true);
        return true;
    }

    private boolean h() {
        if (this.b == null || this.c >= this.b.a() - 1) {
            return false;
        }
        a(this.c + 1, true);
        return true;
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    lj a = a(childAt);
                    if (a != null && a.b == this.c) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                lj a = a(childAt);
                if (a != null && a.b == this.c) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                lj a = a(childAt);
                if (a != null && a.b == this.c && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += i3;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                lj a = a(childAt);
                if (a != null && a.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new lk();
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof lk) && super.checkLayoutParams(layoutParams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new lk(getContext(), attributeSet);
    }
}
