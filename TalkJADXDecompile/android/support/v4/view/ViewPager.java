package android.support.v4.view;

import a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import mn;
import nh;
import np;
import nw;
import nzf;
import oa;
import ou;
import ov;
import ow;
import ox;
import oy;
import oz;
import pa;
import pb;
import pc;
import pd;
import pe;
import pf;
import pi;
import sp;
import wi;

public class ViewPager extends ViewGroup {
    public static final int[] a;
    private static final pi aj;
    private static final Comparator<oz> e;
    private static final Interpolator f;
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private float G;
    private float H;
    private float I;
    private float J;
    private int K;
    private VelocityTracker L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private sp R;
    private sp S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private List<pc> aa;
    private pc ab;
    private pc ac;
    private List<a> ad;
    private pd ae;
    private int af;
    private Method ag;
    private int ah;
    private ArrayList<View> ai;
    private final Runnable ak;
    private int al;
    public np b;
    public int c;
    private int d;
    private final ArrayList<oz> g;
    private final oz h;
    private final Rect i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private boolean n;
    private pe o;
    private int p;
    private Drawable q;
    private int r;
    private int s;
    private float t;
    private float u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    static {
        a = new int[]{16842931};
        e = new ou();
        f = new ov();
        aj = new pi();
    }

    public ViewPager(Context context) {
        super(context);
        this.g = new ArrayList();
        this.h = new oz();
        this.i = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.A = 1;
        this.K = -1;
        this.T = true;
        this.U = false;
        this.ak = new ow(this);
        this.al = 0;
        a();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new ArrayList();
        this.h = new oz();
        this.i = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.A = 1;
        this.K = -1;
        this.T = true;
        this.U = false;
        this.ak = new ow(this);
        this.al = 0;
        a();
    }

    void a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.m = new Scroller(context, f);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.F = viewConfiguration.getScaledPagingTouchSlop();
        this.M = (int) (400.0f * f);
        this.N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.R = new sp(context);
        this.S = new sp(context);
        this.O = (int) (25.0f * f);
        this.P = (int) (2.0f * f);
        this.D = (int) (16.0f * f);
        oa.a(this, new pb(this));
        if (oa.c(this) == 0) {
            oa.c(this, 1);
        }
        oa.a(this, new ox(this));
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.ak);
        if (!(this.m == null || this.m.isFinished())) {
            this.m.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public void a(int i) {
        int i2 = 0;
        if (this.al != i) {
            this.al = i;
            if (this.ae != null) {
                int i3;
                if (i != 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    oa.a(getChildAt(i4), i3 != 0 ? this.af : 0, null);
                }
            }
            if (this.ab != null) {
                this.ab.b(i);
            }
            if (this.aa != null) {
                int size = this.aa.size();
                while (i2 < size) {
                    pc pcVar = (pc) this.aa.get(i2);
                    if (pcVar != null) {
                        pcVar.b(i);
                    }
                    i2++;
                }
            }
            if (this.ac != null) {
                this.ac.b(i);
            }
        }
    }

    public void a(np npVar) {
        int i = false;
        if (this.b != null) {
            int i2;
            this.b.a(null);
            this.b.a(this);
            for (i2 = 0; i2 < this.g.size(); i2++) {
                oz ozVar = (oz) this.g.get(i2);
                this.b.a(this, ozVar.b, ozVar.a);
            }
            this.b.b(this);
            this.g.clear();
            i2 = 0;
            while (i2 < getChildCount()) {
                if (!((pa) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = npVar;
        this.d = 0;
        if (this.b != null) {
            if (this.o == null) {
                this.o = new pe(this);
            }
            this.b.a(this.o);
            this.z = false;
            boolean z = this.T;
            this.T = true;
            this.d = this.b.a();
            if (this.j >= 0) {
                a(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (z) {
                requestLayout();
            } else {
                e();
            }
        }
        if (this.ad != null && !this.ad.isEmpty()) {
            int size = this.ad.size();
            while (i < size) {
                this.ad.get(i);
                i++;
            }
        }
    }

    public np b() {
        return this.b;
    }

    private int h() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void b(int i) {
        boolean z;
        this.z = false;
        if (this.T) {
            z = false;
        } else {
            z = true;
        }
        a(i, z, false);
    }

    public void a(int i, boolean z) {
        this.z = false;
        a(i, z, false);
    }

    public int c() {
        return this.c;
    }

    void a(int i, boolean z, boolean z2) {
        a(i, z, z2, 0);
    }

    void a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.b == null || this.b.a() <= 0) {
            d(false);
        } else if (z2 || this.c != i || this.g.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.b.a()) {
                i = this.b.a() - 1;
            }
            int i3 = this.A;
            if (i > this.c + i3 || i < this.c - i3) {
                for (int i4 = 0; i4 < this.g.size(); i4++) {
                    ((oz) this.g.get(i4)).c = true;
                }
            }
            if (this.c != i) {
                z3 = true;
            }
            if (this.T) {
                this.c = i;
                if (z3) {
                    i(i);
                }
                requestLayout();
                return;
            }
            e(i);
            a(i, z, i2, z3);
        } else {
            d(false);
        }
    }

    private void a(int i, boolean z, int i2, boolean z2) {
        int max;
        oz f = f(i);
        if (f != null) {
            max = (int) (Math.max(this.t, Math.min(f.e, this.u)) * ((float) h()));
        } else {
            max = 0;
        }
        if (z) {
            a(max, 0, i2);
            if (z2) {
                i(i);
                return;
            }
            return;
        }
        if (z2) {
            i(i);
        }
        b(false);
        scrollTo(max, 0);
        h(max);
    }

    @Deprecated
    public void a(pc pcVar) {
        this.ab = pcVar;
    }

    public void b(pc pcVar) {
        if (this.aa == null) {
            this.aa = new ArrayList();
        }
        this.aa.add(pcVar);
    }

    public void a(boolean z, pd pdVar) {
        a(true, pdVar, 2);
    }

    public void a(boolean z, pd pdVar, int i) {
        int i2 = 1;
        if (VERSION.SDK_INT >= 11) {
            boolean z2;
            boolean z3 = pdVar != null;
            if (this.ae != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = z3 != z2 ? 1 : 0;
            this.ae = pdVar;
            a(z3);
            if (z3) {
                if (z) {
                    i2 = 2;
                }
                this.ah = i2;
                this.af = 2;
            } else {
                this.ah = 0;
            }
            if (i3 != 0) {
                e();
            }
        }
    }

    void a(boolean z) {
        if (VERSION.SDK_INT >= 7) {
            if (this.ag == null) {
                try {
                    this.ag = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (Throwable e) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.ag.invoke(this, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.e("ViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ah == 2) {
            i2 = (i - 1) - i2;
        }
        return ((pa) ((View) this.ai.get(i2)).getLayoutParams()).f;
    }

    public void c(int i) {
        if (i <= 0) {
            new StringBuilder("Requested offscreen page limit ").append(i).append(" too small; defaulting to 1");
            i = 1;
        }
        if (i != this.A) {
            this.A = i;
            e();
        }
    }

    public void d(int i) {
        int i2 = this.p;
        this.p = i;
        int width = getWidth();
        a(width, width, i, i2);
        requestLayout();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    float a(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    void a(int i, int i2, int i3) {
        if (getChildCount() == 0) {
            d(false);
            return;
        }
        int i4;
        boolean z = (this.m == null || this.m.isFinished()) ? false : true;
        if (z) {
            int currX = this.n ? this.m.getCurrX() : this.m.getStartX();
            this.m.abortAnimation();
            d(false);
            i4 = currX;
        } else {
            i4 = getScrollX();
        }
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = 0 - scrollY;
        if (i5 == 0 && i6 == 0) {
            b(false);
            e();
            a(0);
            return;
        }
        d(true);
        a(2);
        currX = h();
        int i7 = currX / 2;
        float a = (((float) i7) * a(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / ((float) currX)))) + ((float) i7);
        int abs = Math.abs(i3);
        if (abs > 0) {
            currX = Math.round(1000.0f * Math.abs(a / ((float) abs))) * 4;
        } else {
            currX = (int) (((((float) Math.abs(i5)) / (((float) currX) + ((float) this.p))) + 1.0f) * 100.0f);
        }
        i7 = Math.min(currX, 600);
        this.n = false;
        this.m.startScroll(i4, scrollY, i5, i6, i7);
        oa.b(this);
    }

    oz a(int i, int i2) {
        oz ozVar = new oz();
        ozVar.b = i;
        ozVar.a = this.b.a(this, i);
        ozVar.d = 1.0f;
        if (i2 < 0 || i2 >= this.g.size()) {
            this.g.add(ozVar);
        } else {
            this.g.add(i2, ozVar);
        }
        return ozVar;
    }

    public void d() {
        boolean z;
        int max;
        int a = this.b.a();
        this.d = a;
        if (this.g.size() >= (this.A << 1) + 1 || this.g.size() >= a) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = false;
        int i = this.c;
        boolean z3 = z;
        int i2 = 0;
        while (i2 < this.g.size()) {
            int i3;
            boolean z4;
            boolean z5;
            oz ozVar = (oz) this.g.get(i2);
            int b = this.b.b(ozVar.a);
            if (b != -1) {
                if (b == -2) {
                    this.g.remove(i2);
                    i2--;
                    if (!z2) {
                        this.b.a(this);
                        z2 = true;
                    }
                    this.b.a(this, ozVar.b, ozVar.a);
                    if (this.c == ozVar.b) {
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
                } else if (ozVar.b != b) {
                    if (ozVar.b == this.c) {
                        i = b;
                    }
                    ozVar.b = b;
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
        Collections.sort(this.g, e);
        if (z3) {
            max = getChildCount();
            for (i2 = 0; i2 < max; i2++) {
                pa paVar = (pa) getChildAt(i2).getLayoutParams();
                if (!paVar.a) {
                    paVar.c = 0.0f;
                }
            }
            a(i, false, true);
            requestLayout();
        }
    }

    public void e() {
        e(this.c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void e(int r18) {
        /*
        r17 = this;
        r2 = 0;
        r0 = r17;
        r3 = r0.c;
        r0 = r18;
        if (r3 == r0) goto L_0x0318;
    L_0x0009:
        r0 = r17;
        r2 = r0.c;
        r0 = r17;
        r2 = r0.f(r2);
        r0 = r18;
        r1 = r17;
        r1.c = r0;
        r3 = r2;
    L_0x001a:
        r0 = r17;
        r2 = r0.b;
        if (r2 != 0) goto L_0x0024;
    L_0x0020:
        r17.i();
    L_0x0023:
        return;
    L_0x0024:
        r0 = r17;
        r2 = r0.z;
        if (r2 == 0) goto L_0x002e;
    L_0x002a:
        r17.i();
        goto L_0x0023;
    L_0x002e:
        r2 = r17.getWindowToken();
        if (r2 == 0) goto L_0x0023;
    L_0x0034:
        r0 = r17;
        r2 = r0.b;
        r0 = r17;
        r2.a(r0);
        r0 = r17;
        r2 = r0.A;
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
        r2 = r0.d;
        if (r11 == r2) goto L_0x00c7;
    L_0x0064:
        r2 = r17.getResources();	 Catch:{ NotFoundException -> 0x00bd }
        r3 = r17.getId();	 Catch:{ NotFoundException -> 0x00bd }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00bd }
    L_0x0070:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r4.<init>(r5);
        r0 = r17;
        r5 = r0.d;
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
    L_0x00bd:
        r2 = move-exception;
        r2 = r17.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x0070;
    L_0x00c7:
        r5 = 0;
        r2 = 0;
        r4 = r2;
    L_0x00ca:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.size();
        if (r4 >= r2) goto L_0x0315;
    L_0x00d4:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r4);
        r2 = (oz) r2;
        r6 = r2.b;
        r0 = r17;
        r7 = r0.c;
        if (r6 < r7) goto L_0x015a;
    L_0x00e6:
        r6 = r2.b;
        r0 = r17;
        r7 = r0.c;
        if (r6 != r7) goto L_0x0315;
    L_0x00ee:
        if (r2 != 0) goto L_0x0312;
    L_0x00f0:
        if (r11 <= 0) goto L_0x0312;
    L_0x00f2:
        r0 = r17;
        r2 = r0.c;
        r0 = r17;
        r2 = r0.a(r2, r4);
        r9 = r2;
    L_0x00fd:
        if (r9 == 0) goto L_0x0274;
    L_0x00ff:
        r8 = 0;
        r7 = r4 + -1;
        if (r7 < 0) goto L_0x015f;
    L_0x0104:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r7);
        r2 = (oz) r2;
    L_0x010e:
        r13 = r17.h();
        if (r13 > 0) goto L_0x0161;
    L_0x0114:
        r5 = 0;
    L_0x0115:
        r0 = r17;
        r6 = r0.c;
        r6 = r6 + -1;
        r15 = r6;
        r6 = r8;
        r8 = r15;
        r16 = r7;
        r7 = r4;
        r4 = r16;
    L_0x0123:
        if (r8 < 0) goto L_0x01a7;
    L_0x0125:
        r14 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r14 < 0) goto L_0x0171;
    L_0x0129:
        if (r8 >= r10) goto L_0x0171;
    L_0x012b:
        if (r2 == 0) goto L_0x01a7;
    L_0x012d:
        r14 = r2.b;
        if (r8 != r14) goto L_0x0157;
    L_0x0131:
        r14 = r2.c;
        if (r14 != 0) goto L_0x0157;
    L_0x0135:
        r0 = r17;
        r14 = r0.g;
        r14.remove(r4);
        r0 = r17;
        r14 = r0.b;
        r2 = r2.a;
        r0 = r17;
        r14.a(r0, r8, r2);
        r4 = r4 + -1;
        r7 = r7 + -1;
        if (r4 < 0) goto L_0x016f;
    L_0x014d:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r4);
        r2 = (oz) r2;
    L_0x0157:
        r8 = r8 + -1;
        goto L_0x0123;
    L_0x015a:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x00ca;
    L_0x015f:
        r2 = 0;
        goto L_0x010e;
    L_0x0161:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r9.d;
        r5 = r5 - r6;
        r6 = r17.getPaddingLeft();
        r6 = (float) r6;
        r14 = (float) r13;
        r6 = r6 / r14;
        r5 = r5 + r6;
        goto L_0x0115;
    L_0x016f:
        r2 = 0;
        goto L_0x0157;
    L_0x0171:
        if (r2 == 0) goto L_0x018b;
    L_0x0173:
        r14 = r2.b;
        if (r8 != r14) goto L_0x018b;
    L_0x0177:
        r2 = r2.d;
        r6 = r6 + r2;
        r4 = r4 + -1;
        if (r4 < 0) goto L_0x0189;
    L_0x017e:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r4);
        r2 = (oz) r2;
        goto L_0x0157;
    L_0x0189:
        r2 = 0;
        goto L_0x0157;
    L_0x018b:
        r2 = r4 + 1;
        r0 = r17;
        r2 = r0.a(r8, r2);
        r2 = r2.d;
        r6 = r6 + r2;
        r7 = r7 + 1;
        if (r4 < 0) goto L_0x01a5;
    L_0x019a:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r4);
        r2 = (oz) r2;
        goto L_0x0157;
    L_0x01a5:
        r2 = 0;
        goto L_0x0157;
    L_0x01a7:
        r5 = r9.d;
        r8 = r7 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x026f;
    L_0x01b1:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.size();
        if (r8 >= r2) goto L_0x0215;
    L_0x01bb:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r8);
        r2 = (oz) r2;
        r6 = r2;
    L_0x01c6:
        if (r13 > 0) goto L_0x0217;
    L_0x01c8:
        r2 = 0;
        r4 = r2;
    L_0x01ca:
        r0 = r17;
        r2 = r0.c;
        r2 = r2 + 1;
        r15 = r2;
        r2 = r6;
        r6 = r8;
        r8 = r15;
    L_0x01d4:
        if (r8 >= r11) goto L_0x026f;
    L_0x01d6:
        r10 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r10 < 0) goto L_0x0225;
    L_0x01da:
        if (r8 <= r12) goto L_0x0225;
    L_0x01dc:
        if (r2 == 0) goto L_0x026f;
    L_0x01de:
        r10 = r2.b;
        if (r8 != r10) goto L_0x030d;
    L_0x01e2:
        r10 = r2.c;
        if (r10 != 0) goto L_0x030d;
    L_0x01e6:
        r0 = r17;
        r10 = r0.g;
        r10.remove(r6);
        r0 = r17;
        r10 = r0.b;
        r2 = r2.a;
        r0 = r17;
        r10.a(r0, r8, r2);
        r0 = r17;
        r2 = r0.g;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x0223;
    L_0x0202:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r6);
        r2 = (oz) r2;
    L_0x020c:
        r15 = r5;
        r5 = r2;
        r2 = r15;
    L_0x020f:
        r8 = r8 + 1;
        r15 = r2;
        r2 = r5;
        r5 = r15;
        goto L_0x01d4;
    L_0x0215:
        r6 = 0;
        goto L_0x01c6;
    L_0x0217:
        r2 = r17.getPaddingRight();
        r2 = (float) r2;
        r4 = (float) r13;
        r2 = r2 / r4;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 + r4;
        r4 = r2;
        goto L_0x01ca;
    L_0x0223:
        r2 = 0;
        goto L_0x020c;
    L_0x0225:
        if (r2 == 0) goto L_0x024a;
    L_0x0227:
        r10 = r2.b;
        if (r8 != r10) goto L_0x024a;
    L_0x022b:
        r2 = r2.d;
        r5 = r5 + r2;
        r6 = r6 + 1;
        r0 = r17;
        r2 = r0.g;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x0248;
    L_0x023a:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r6);
        r2 = (oz) r2;
    L_0x0244:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x020f;
    L_0x0248:
        r2 = 0;
        goto L_0x0244;
    L_0x024a:
        r0 = r17;
        r2 = r0.a(r8, r6);
        r6 = r6 + 1;
        r2 = r2.d;
        r5 = r5 + r2;
        r0 = r17;
        r2 = r0.g;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x026d;
    L_0x025f:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r6);
        r2 = (oz) r2;
    L_0x0269:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x020f;
    L_0x026d:
        r2 = 0;
        goto L_0x0269;
    L_0x026f:
        r0 = r17;
        r0.a(r9, r7, r3);
    L_0x0274:
        r0 = r17;
        r3 = r0.b;
        r0 = r17;
        r4 = r0.c;
        if (r9 == 0) goto L_0x02c3;
    L_0x027e:
        r2 = r9.a;
    L_0x0280:
        r0 = r17;
        r3.b(r0, r4, r2);
        r0 = r17;
        r2 = r0.b;
        r0 = r17;
        r2.b(r0);
        r4 = r17.getChildCount();
        r2 = 0;
        r3 = r2;
    L_0x0294:
        if (r3 >= r4) goto L_0x02c5;
    L_0x0296:
        r0 = r17;
        r5 = r0.getChildAt(r3);
        r2 = r5.getLayoutParams();
        r2 = (pa) r2;
        r2.f = r3;
        r6 = r2.a;
        if (r6 != 0) goto L_0x02bf;
    L_0x02a8:
        r6 = r2.c;
        r7 = 0;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 != 0) goto L_0x02bf;
    L_0x02af:
        r0 = r17;
        r5 = r0.a(r5);
        if (r5 == 0) goto L_0x02bf;
    L_0x02b7:
        r6 = r5.d;
        r2.c = r6;
        r5 = r5.b;
        r2.e = r5;
    L_0x02bf:
        r2 = r3 + 1;
        r3 = r2;
        goto L_0x0294;
    L_0x02c3:
        r2 = 0;
        goto L_0x0280;
    L_0x02c5:
        r17.i();
        r2 = r17.hasFocus();
        if (r2 == 0) goto L_0x0023;
    L_0x02ce:
        r2 = r17.findFocus();
        if (r2 == 0) goto L_0x030b;
    L_0x02d4:
        r0 = r17;
        r2 = r0.b(r2);
    L_0x02da:
        if (r2 == 0) goto L_0x02e4;
    L_0x02dc:
        r2 = r2.b;
        r0 = r17;
        r3 = r0.c;
        if (r2 == r3) goto L_0x0023;
    L_0x02e4:
        r2 = 0;
    L_0x02e5:
        r3 = r17.getChildCount();
        if (r2 >= r3) goto L_0x0023;
    L_0x02eb:
        r0 = r17;
        r3 = r0.getChildAt(r2);
        r0 = r17;
        r4 = r0.a(r3);
        if (r4 == 0) goto L_0x0308;
    L_0x02f9:
        r4 = r4.b;
        r0 = r17;
        r5 = r0.c;
        if (r4 != r5) goto L_0x0308;
    L_0x0301:
        r4 = 2;
        r3 = r3.requestFocus(r4);
        if (r3 != 0) goto L_0x0023;
    L_0x0308:
        r2 = r2 + 1;
        goto L_0x02e5;
    L_0x030b:
        r2 = 0;
        goto L_0x02da;
    L_0x030d:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x020f;
    L_0x0312:
        r9 = r2;
        goto L_0x00fd;
    L_0x0315:
        r2 = r5;
        goto L_0x00ee;
    L_0x0318:
        r3 = r2;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.e(int):void");
    }

    private void i() {
        if (this.ah != 0) {
            if (this.ai == null) {
                this.ai = new ArrayList();
            } else {
                this.ai.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ai.add(getChildAt(i));
            }
            Collections.sort(this.ai, aj);
        }
    }

    private void a(oz ozVar, int i, oz ozVar2) {
        float f;
        float f2;
        int i2;
        int i3;
        oz ozVar3;
        int a = this.b.a();
        int h = h();
        if (h > 0) {
            f = ((float) this.p) / ((float) h);
        } else {
            f = 0.0f;
        }
        if (ozVar2 != null) {
            h = ozVar2.b;
            int i4;
            float f3;
            int i5;
            if (h < ozVar.b) {
                f2 = (ozVar2.e + ozVar2.d) + f;
                i2 = 0;
                i3 = h + 1;
                while (i3 <= ozVar.b && i2 < this.g.size()) {
                    ozVar3 = (oz) this.g.get(i2);
                    while (i3 > ozVar3.b && i2 < this.g.size() - 1) {
                        i2++;
                        ozVar3 = (oz) this.g.get(i2);
                    }
                    i4 = i3;
                    f3 = f2;
                    i5 = i4;
                    while (i5 < ozVar3.b) {
                        i5++;
                        f3 = (f + 1.0f) + f3;
                    }
                    ozVar3.e = f3;
                    f3 += ozVar3.d + f;
                    h = i5 + 1;
                    f2 = f3;
                    i3 = h;
                }
            } else if (h > ozVar.b) {
                i2 = this.g.size() - 1;
                f2 = ozVar2.e;
                i3 = h - 1;
                while (i3 >= ozVar.b && i2 >= 0) {
                    ozVar3 = (oz) this.g.get(i2);
                    while (i3 < ozVar3.b && i2 > 0) {
                        i2--;
                        ozVar3 = (oz) this.g.get(i2);
                    }
                    i4 = i3;
                    f3 = f2;
                    i5 = i4;
                    while (i5 > ozVar3.b) {
                        i5--;
                        f3 -= f + 1.0f;
                    }
                    f3 -= ozVar3.d + f;
                    ozVar3.e = f3;
                    h = i5 - 1;
                    f2 = f3;
                    i3 = h;
                }
            }
        }
        int size = this.g.size();
        f2 = ozVar.e;
        i3 = ozVar.b - 1;
        this.t = ozVar.b == 0 ? ozVar.e : -3.4028235E38f;
        this.u = ozVar.b == a + -1 ? (ozVar.e + ozVar.d) - 1.0f : Float.MAX_VALUE;
        for (i2 = i - 1; i2 >= 0; i2--) {
            ozVar3 = (oz) this.g.get(i2);
            while (i3 > ozVar3.b) {
                i3--;
                f2 -= f + 1.0f;
            }
            f2 -= ozVar3.d + f;
            ozVar3.e = f2;
            if (ozVar3.b == 0) {
                this.t = f2;
            }
            i3--;
        }
        f2 = (ozVar.e + ozVar.d) + f;
        i3 = ozVar.b + 1;
        for (i2 = i + 1; i2 < size; i2++) {
            ozVar3 = (oz) this.g.get(i2);
            while (i3 < ozVar3.b) {
                i3++;
                f2 += f + 1.0f;
            }
            if (ozVar3.b == a - 1) {
                this.u = (ozVar3.d + f2) - 1.0f;
            }
            ozVar3.e = f2;
            f2 += ozVar3.d + f;
            i3++;
        }
        this.U = false;
    }

    public Parcelable onSaveInstanceState() {
        pf pfVar = new pf(super.onSaveInstanceState());
        pfVar.a = this.c;
        if (this.b != null) {
            pfVar.b = null;
        }
        return pfVar;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof pf) {
            pf pfVar = (pf) parcelable;
            super.onRestoreInstanceState(pfVar.e);
            if (this.b != null) {
                Parcelable parcelable2 = pfVar.b;
                ClassLoader classLoader = pfVar.c;
                a(pfVar.a, false, true);
                return;
            }
            this.j = pfVar.a;
            this.k = pfVar.b;
            this.l = pfVar.c;
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
        pa paVar = (pa) layoutParams2;
        boolean z = paVar.a;
        if (view.getClass().getAnnotation(oy.class) != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        paVar.a = i2 | z;
        if (!this.x) {
            super.addView(view, i, layoutParams2);
        } else if (paVar == null || !paVar.a) {
            paVar.d = true;
            addViewInLayout(view, i, layoutParams2);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void removeView(View view) {
        if (this.x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    oz a(View view) {
        for (int i = 0; i < this.g.size(); i++) {
            oz ozVar = (oz) this.g.get(i);
            if (this.b.a(view, ozVar.a)) {
                return ozVar;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    oz b(android.view.View r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.b(android.view.View):oz");
    }

    oz f(int i) {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            oz ozVar = (oz) this.g.get(i2);
            if (ozVar.b == i) {
                return ozVar;
            }
        }
        return null;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
    }

    protected void onMeasure(int i, int i2) {
        pa paVar;
        int i3;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.E = Math.min(measuredWidth / 10, this.D);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            int i5;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                paVar = (pa) childAt.getLayoutParams();
                if (paVar != null && paVar.a) {
                    int i6 = paVar.b & 7;
                    int i7 = paVar.b & 112;
                    i3 = nzf.UNSET_ENUM_VALUE;
                    i5 = nzf.UNSET_ENUM_VALUE;
                    Object obj = (i7 == 48 || i7 == 80) ? 1 : null;
                    Object obj2 = (i6 == 3 || i6 == 5) ? 1 : null;
                    if (obj != null) {
                        i3 = 1073741824;
                    } else if (obj2 != null) {
                        i5 = 1073741824;
                    }
                    if (paVar.width != -2) {
                        i7 = 1073741824;
                        i3 = paVar.width != -1 ? paVar.width : paddingLeft;
                    } else {
                        i7 = i3;
                        i3 = paddingLeft;
                    }
                    if (paVar.height != -2) {
                        i5 = 1073741824;
                        if (paVar.height != -1) {
                            measuredWidth = paVar.height;
                            childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                            if (obj != null) {
                                measuredHeight -= childAt.getMeasuredHeight();
                            } else if (obj2 != null) {
                                paddingLeft -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    measuredWidth = measuredHeight;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                    if (obj != null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (obj2 != null) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        this.v = MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.w = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.x = true;
        e();
        this.x = false;
        i3 = getChildCount();
        for (i5 = 0; i5 < i3; i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                paVar = (pa) childAt2.getLayoutParams();
                if (paVar == null || !paVar.a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (paVar.c * ((float) paddingLeft)), 1073741824), this.w);
                }
            }
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            a(i, i3, this.p, this.p);
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.g.isEmpty()) {
            oz f = f(this.c);
            int min = (int) ((f != null ? Math.min(f.e, this.u) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                b(false);
                scrollTo(min, getScrollY());
            }
        } else if (this.m.isFinished()) {
            scrollTo((int) (((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)) * (((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)))), getScrollY());
        } else {
            this.m.setFinalX(c() * h());
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        pa paVar;
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
            int measuredWidth;
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                paVar = (pa) childAt.getLayoutParams();
                if (paVar.a) {
                    int i9 = paVar.b & 112;
                    switch (paVar.b & 7) {
                        case wi.j /*1*/:
                            max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case wi.z /*3*/:
                            max = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case wi.p /*5*/:
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
                        case wi.dI /*16*/:
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
                paVar = (pa) childAt2.getLayoutParams();
                if (!paVar.a) {
                    oz a = a(childAt2);
                    if (a != null) {
                        i5 = ((int) (a.e * ((float) max))) + paddingLeft;
                        if (paVar.d) {
                            paVar.d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (paVar.c * ((float) max)), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                        }
                        childAt2.layout(i5, paddingTop, childAt2.getMeasuredWidth() + i5, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.r = paddingTop;
        this.s = i6 - paddingBottom;
        this.W = i7;
        if (this.T) {
            a(this.c, false, 0, false);
        }
        this.T = false;
    }

    public void computeScroll() {
        this.n = true;
        if (this.m.isFinished() || !this.m.computeScrollOffset()) {
            b(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.m.getCurrX();
        int currY = this.m.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!h(currX)) {
                this.m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        oa.b(this);
    }

    private boolean h(int i) {
        if (this.g.size() != 0) {
            oz k = k();
            int h = h();
            int i2 = this.p + h;
            float f = ((float) this.p) / ((float) h);
            int i3 = k.b;
            float f2 = ((((float) i) / ((float) h)) - k.e) / (k.d + f);
            h = (int) (((float) i2) * f2);
            this.V = false;
            a(i3, f2, h);
            if (this.V) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.T) {
            return false;
        } else {
            this.V = false;
            a(0, 0.0f, 0);
            if (this.V) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    protected void a(int i, float f, int i2) {
        int paddingLeft;
        int paddingRight;
        int i3;
        if (this.W > 0) {
            int scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            i3 = 0;
            while (i3 < childCount) {
                int i4;
                View childAt = getChildAt(i3);
                pa paVar = (pa) childAt.getLayoutParams();
                if (paVar.a) {
                    int max;
                    switch (paVar.b & 7) {
                        case wi.j /*1*/:
                            max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        case wi.z /*3*/:
                            max = childAt.getWidth() + paddingLeft;
                            i4 = paddingLeft;
                            paddingLeft = paddingRight;
                            paddingRight = max;
                            max = i4;
                            break;
                        case wi.p /*5*/:
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
        if (this.ab != null) {
            this.ab.a(i, f, i2);
        }
        if (this.aa != null) {
            paddingRight = this.aa.size();
            for (paddingLeft = 0; paddingLeft < paddingRight; paddingLeft++) {
                pc pcVar = (pc) this.aa.get(paddingLeft);
                if (pcVar != null) {
                    pcVar.a(i, f, i2);
                }
            }
        }
        if (this.ac != null) {
            this.ac.a(i, f, i2);
        }
        if (this.ae != null) {
            paddingRight = getScrollX();
            i3 = getChildCount();
            for (paddingLeft = 0; paddingLeft < i3; paddingLeft++) {
                View childAt2 = getChildAt(paddingLeft);
                if (!((pa) childAt2.getLayoutParams()).a) {
                    this.ae.a(childAt2, ((float) (childAt2.getLeft() - paddingRight)) / ((float) h()));
                }
            }
        }
        this.V = true;
    }

    private void i(int i) {
        if (this.ab != null) {
            this.ab.a(i);
        }
        if (this.aa != null) {
            int size = this.aa.size();
            for (int i2 = 0; i2 < size; i2++) {
                pc pcVar = (pc) this.aa.get(i2);
                if (pcVar != null) {
                    pcVar.a(i);
                }
            }
        }
        if (this.ac != null) {
            this.ac.a(i);
        }
    }

    private void b(boolean z) {
        int scrollX;
        boolean z2 = this.al == 2;
        if (z2) {
            boolean z3;
            d(false);
            if (this.m.isFinished()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                this.m.abortAnimation();
                scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.m.getCurrX();
                int currY = this.m.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        h(currX);
                    }
                }
            }
        }
        this.z = false;
        boolean z4 = z2;
        for (scrollX = 0; scrollX < this.g.size(); scrollX++) {
            oz ozVar = (oz) this.g.get(scrollX);
            if (ozVar.c) {
                ozVar.c = false;
                z4 = true;
            }
        }
        if (!z4) {
            return;
        }
        if (z) {
            oa.a(this, this.ak);
        } else {
            this.ak.run();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            j();
            return false;
        }
        if (action != 0) {
            if (this.B) {
                return true;
            }
            if (this.C) {
                return false;
            }
        }
        float x;
        switch (action) {
            case wi.w /*0*/:
                x = motionEvent.getX();
                this.I = x;
                this.G = x;
                x = motionEvent.getY();
                this.J = x;
                this.H = x;
                this.K = motionEvent.getPointerId(0);
                this.C = false;
                this.n = true;
                this.m.computeScrollOffset();
                if (this.al == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.P) {
                    this.m.abortAnimation();
                    this.z = false;
                    e();
                    this.B = true;
                    c(true);
                    a(1);
                    break;
                }
                b(false);
                this.B = false;
                break;
                break;
            case wi.l /*2*/:
                action = this.K;
                if (action != -1) {
                    action = motionEvent.findPointerIndex(action);
                    float x2 = motionEvent.getX(action);
                    float f = x2 - this.G;
                    float abs = Math.abs(f);
                    float y = motionEvent.getY(action);
                    float abs2 = Math.abs(y - this.J);
                    if (f != 0.0f) {
                        boolean z;
                        x = this.G;
                        if ((x >= ((float) this.E) || f <= 0.0f) && (x <= ((float) (getWidth() - this.E)) || f >= 0.0f)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z && a(this, false, (int) f, (int) x2, (int) y)) {
                            this.G = x2;
                            this.H = y;
                            this.C = true;
                            return false;
                        }
                    }
                    if (abs > ((float) this.F) && 0.5f * abs > abs2) {
                        this.B = true;
                        c(true);
                        a(1);
                        this.G = f > 0.0f ? this.I + ((float) this.F) : this.I - ((float) this.F);
                        this.H = y;
                        d(true);
                    } else if (abs2 > ((float) this.F)) {
                        this.C = true;
                    }
                    if (this.B && b(x2)) {
                        oa.b(this);
                        break;
                    }
                }
                break;
            case wi.s /*6*/:
                a(motionEvent);
                break;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        return this.B;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.Q) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.b == null || this.b.a() == 0) {
            return false;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        float x;
        int i;
        float f;
        switch (motionEvent.getAction() & 255) {
            case wi.w /*0*/:
                this.m.abortAnimation();
                this.z = false;
                e();
                x = motionEvent.getX();
                this.I = x;
                this.G = x;
                x = motionEvent.getY();
                this.J = x;
                this.H = x;
                this.K = motionEvent.getPointerId(0);
                break;
            case wi.j /*1*/:
                if (this.B) {
                    VelocityTracker velocityTracker = this.L;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.N);
                    int a = (int) nw.a(velocityTracker, this.K);
                    this.z = true;
                    int h = h();
                    int scrollX = getScrollX();
                    oz k = k();
                    float f2 = ((float) this.p) / ((float) h);
                    i = k.b;
                    f = ((((float) scrollX) / ((float) h)) - k.e) / (k.d + f2);
                    if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.K)) - this.I)) <= this.O || Math.abs(a) <= this.M) {
                        scrollX = i + ((int) ((i >= this.c ? 0.4f : 0.6f) + f));
                    } else {
                        if (a <= 0) {
                            i++;
                        }
                        scrollX = i;
                    }
                    if (this.g.size() > 0) {
                        scrollX = Math.max(((oz) this.g.get(0)).b, Math.min(scrollX, ((oz) this.g.get(this.g.size() - 1)).b));
                    }
                    a(scrollX, true, true, a);
                    z = j();
                    break;
                }
                break;
            case wi.l /*2*/:
                if (!this.B) {
                    i = motionEvent.findPointerIndex(this.K);
                    if (i == -1) {
                        z = j();
                        break;
                    }
                    float x2 = motionEvent.getX(i);
                    f = Math.abs(x2 - this.G);
                    float y = motionEvent.getY(i);
                    x = Math.abs(y - this.H);
                    if (f > ((float) this.F) && f > x) {
                        this.B = true;
                        c(true);
                        if (x2 - this.I > 0.0f) {
                            x = this.I + ((float) this.F);
                        } else {
                            x = this.I - ((float) this.F);
                        }
                        this.G = x;
                        this.H = y;
                        a(1);
                        d(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.B) {
                    z = b(motionEvent.getX(motionEvent.findPointerIndex(this.K))) | 0;
                    break;
                }
                break;
            case wi.z /*3*/:
                if (this.B) {
                    a(this.c, true, 0, false);
                    z = j();
                    break;
                }
                break;
            case wi.p /*5*/:
                i = nh.b(motionEvent);
                this.G = motionEvent.getX(i);
                this.K = motionEvent.getPointerId(i);
                break;
            case wi.s /*6*/:
                a(motionEvent);
                this.G = motionEvent.getX(motionEvent.findPointerIndex(this.K));
                break;
        }
        if (z) {
            oa.b(this);
        }
        return true;
    }

    private boolean j() {
        this.K = -1;
        this.B = false;
        this.C = false;
        if (this.L != null) {
            this.L.recycle();
            this.L = null;
        }
        return this.R.c() | this.S.c();
    }

    private void c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private boolean b(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean z3 = false;
        float f3 = this.G - f;
        this.G = f;
        float scrollX = ((float) getScrollX()) + f3;
        int h = h();
        float f4 = ((float) h) * this.t;
        float f5 = ((float) h) * this.u;
        oz ozVar = (oz) this.g.get(0);
        oz ozVar2 = (oz) this.g.get(this.g.size() - 1);
        if (ozVar.b != 0) {
            f4 = ozVar.e * ((float) h);
            z = false;
        } else {
            z = true;
        }
        if (ozVar2.b != this.b.a() - 1) {
            f2 = ozVar2.e * ((float) h);
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                z3 = this.R.a(Math.abs(f4 - scrollX) / ((float) h));
            }
        } else if (scrollX > f2) {
            if (z2) {
                z3 = this.S.a(Math.abs(scrollX - f2) / ((float) h));
            }
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.G += f4 - ((float) ((int) f4));
        scrollTo((int) f4, getScrollY());
        h((int) f4);
        return z3;
    }

    private oz k() {
        float f;
        int h = h();
        float scrollX = h > 0 ? ((float) getScrollX()) / ((float) h) : 0.0f;
        if (h > 0) {
            f = ((float) this.p) / ((float) h);
        } else {
            f = 0.0f;
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        oz ozVar = null;
        while (i2 < this.g.size()) {
            int i3;
            oz ozVar2;
            oz ozVar3 = (oz) this.g.get(i2);
            oz ozVar4;
            if (obj != null || ozVar3.b == i + 1) {
                ozVar4 = ozVar3;
                i3 = i2;
                ozVar2 = ozVar4;
            } else {
                ozVar3 = this.h;
                ozVar3.e = (f2 + f3) + f;
                ozVar3.b = i + 1;
                ozVar3.d = 1.0f;
                ozVar4 = ozVar3;
                i3 = i2 - 1;
                ozVar2 = ozVar4;
            }
            f2 = ozVar2.e;
            f3 = (ozVar2.d + f2) + f;
            if (obj == null && scrollX < f2) {
                return ozVar;
            }
            if (scrollX < f3 || i3 == this.g.size() - 1) {
                return ozVar2;
            }
            f3 = f2;
            i = ozVar2.b;
            obj = null;
            f2 = ozVar2.d;
            ozVar = ozVar2;
            i2 = i3 + 1;
        }
        return ozVar;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = 0;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && this.b != null && this.b.a() > 1)) {
            int width;
            if (!this.R.a()) {
                overScrollMode = canvas.save();
                i = (getHeight() - getPaddingTop()) - getPaddingBottom();
                width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-i) + getPaddingTop()), this.t * ((float) width));
                this.R.a(i, width);
                i = this.R.a(canvas) | 0;
                canvas.restoreToCount(overScrollMode);
            }
            if (!this.S.a()) {
                overScrollMode = canvas.save();
                width = getWidth();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.u + 1.0f)) * ((float) width));
                this.S.a(height, width);
                i |= this.S.a(canvas);
                canvas.restoreToCount(overScrollMode);
            }
        } else {
            this.R.b();
            this.S.b();
        }
        if (i != 0) {
            oa.b(this);
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.p > 0 && this.q != null && this.g.size() > 0 && this.b != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = ((float) this.p) / ((float) width);
            oz ozVar = (oz) this.g.get(0);
            float f2 = ozVar.e;
            int size = this.g.size();
            int i = ozVar.b;
            int i2 = ((oz) this.g.get(size - 1)).b;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                float f3;
                while (i4 > ozVar.b && i3 < size) {
                    i3++;
                    ozVar = (oz) this.g.get(i3);
                }
                if (i4 == ozVar.b) {
                    f3 = (ozVar.e + ozVar.d) * ((float) width);
                    f2 = (ozVar.e + ozVar.d) + f;
                } else {
                    f3 = (1.0f + f2) * ((float) width);
                    f2 += 1.0f + f;
                }
                if (((float) this.p) + f3 > ((float) scrollX)) {
                    this.q.setBounds(Math.round(f3), this.r, Math.round(((float) this.p) + f3), this.s);
                    this.q.draw(canvas);
                }
                if (f3 <= ((float) (scrollX + width))) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    private void a(MotionEvent motionEvent) {
        int b = nh.b(motionEvent);
        if (motionEvent.getPointerId(b) == this.K) {
            b = b == 0 ? 1 : 0;
            this.G = motionEvent.getX(b);
            this.K = motionEvent.getPointerId(b);
            if (this.L != null) {
                this.L.clear();
            }
        }
    }

    private void d(boolean z) {
        if (this.y != z) {
            this.y = z;
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.b == null) {
            return false;
        }
        int h = h();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) h) * this.t))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) h) * this.u))) {
            return false;
        } else {
            return true;
        }
    }

    protected boolean a(View view, boolean z, int i, int i2, int i3) {
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
        if (z && oa.a(view, -i)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case wi.f /*21*/:
                return g(17);
            case wi.e /*22*/:
                return g(66);
            case 61:
                if (VERSION.SDK_INT < 11) {
                    return false;
                }
                if (mn.a.b(keyEvent.getMetaState())) {
                    return g(2);
                }
                if (mn.a.a(keyEvent.getMetaState(), 1)) {
                    return g(1);
                }
                return false;
            default:
                return false;
        }
    }

    public boolean g(int i) {
        View view;
        boolean f;
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
                f = f();
            } else {
                if (i == 66 || i == 2) {
                    f = g();
                }
                f = false;
            }
        } else if (i == 17) {
            f = (view == null || a(this.i, findNextFocus).left < a(this.i, view).left) ? findNextFocus.requestFocus() : f();
        } else {
            if (i == 66) {
                f = (view == null || a(this.i, findNextFocus).left > a(this.i, view).left) ? findNextFocus.requestFocus() : g();
            }
            f = false;
        }
        if (f) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return f;
    }

    private Rect a(Rect rect, View view) {
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

    boolean f() {
        if (this.c <= 0) {
            return false;
        }
        a(this.c - 1, true);
        return true;
    }

    boolean g() {
        if (this.b == null || this.c >= this.b.a() - 1) {
            return false;
        }
        a(this.c + 1, true);
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    oz a = a(childAt);
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

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                oz a = a(childAt);
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
                oz a = a(childAt);
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
                oz a = a(childAt);
                if (a != null && a.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new pa();
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof pa) && super.checkLayoutParams(layoutParams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new pa(getContext(), attributeSet);
    }
}
