package android.support.v7.widget;

import a;
import abq;
import abs;
import abw;
import adr;
import adv;
import adw;
import adx;
import ady;
import aeb;
import aec;
import aed;
import aee;
import aef;
import aeg;
import aeh;
import aei;
import aek;
import ael;
import aem;
import aep;
import aeq;
import aer;
import aes;
import agb;
import agc;
import agd;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import gwb;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import nh;
import nk;
import nl;
import nu;
import nw;
import nzf;
import oa;
import qf;
import sp;
import u;
import wi;
import wp;
import zz;

public class RecyclerView extends ViewGroup implements nk, nu {
    public static final Interpolator C;
    private static final int[] D;
    private static final int[] E;
    private static final Class<?>[] F;
    public static final boolean a;
    public static final boolean b;
    public boolean A;
    public aes B;
    private final ael G;
    private aem H;
    private boolean I;
    private final Rect J;
    private a K;
    private final ArrayList<aeh> L;
    private aeh M;
    private int N;
    private boolean O;
    private int P;
    private final AccessibilityManager Q;
    private int R;
    private int S;
    private sp T;
    private sp U;
    private sp V;
    private sp W;
    private int aa;
    private int ab;
    private VelocityTracker ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private u ai;
    private final int aj;
    private final int ak;
    private float al;
    private boolean am;
    private aei an;
    private List<aei> ao;
    private aec ap;
    private a aq;
    private final int[] ar;
    private nl as;
    private final int[] at;
    private final int[] au;
    private final int[] av;
    private Runnable aw;
    private final agd ax;
    public final aek c;
    public adr d;
    public abq e;
    public final agb f;
    public final Runnable g;
    public final Rect h;
    public final RectF i;
    public ady j;
    public aef k;
    public final ArrayList<aee> l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final boolean s;
    public List<a> t;
    public boolean u;
    public aeb v;
    public final aeq w;
    public final aep x;
    public boolean y;
    public boolean z;

    static {
        D = new int[]{16843830};
        E = new int[]{16842987};
        boolean z = VERSION.SDK_INT == 18 || VERSION.SDK_INT == 19 || VERSION.SDK_INT == 20;
        a = z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        b = z;
        F = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        C = new adx();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2 = true;
        super(context, attributeSet, i);
        this.G = new ael(this);
        this.c = new aek(this);
        this.f = new agb();
        this.g = new adv(this);
        this.h = new Rect();
        this.J = new Rect();
        this.i = new RectF();
        this.l = new ArrayList();
        this.L = new ArrayList();
        this.N = 0;
        this.u = false;
        this.R = 0;
        this.S = 0;
        this.v = new abw();
        this.aa = 0;
        this.ab = -1;
        this.al = Float.MIN_VALUE;
        this.am = true;
        this.w = new aeq(this);
        this.x = new aep();
        this.y = false;
        this.z = false;
        this.ap = new aec();
        this.A = false;
        this.ar = new int[2];
        this.at = new int[2];
        this.au = new int[2];
        this.av = new int[2];
        this.aw = new adw(this);
        this.ax = new agd(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E, i, 0);
            this.I = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.I = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        if (VERSION.SDK_INT >= 16) {
            z = true;
        } else {
            z = false;
        }
        this.s = z;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ah = viewConfiguration.getScaledTouchSlop();
        this.aj = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ak = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.v.a(this.ap);
        a();
        this.e = new abq(new abs(this));
        if (oa.c(this) == 0) {
            oa.c(this, 1);
        }
        this.Q = (AccessibilityManager) getContext().getSystemService("accessibility");
        a(new aes(this));
        if (attributeSet != null) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wp.ab, i, 0);
            String string = obtainStyledAttributes.getString(wp.ad);
            if (obtainStyledAttributes.getInt(wp.ac, -1) == -1) {
                setDescendantFocusability(262144);
            }
            obtainStyledAttributes.recycle();
            if (string != null) {
                String trim = string.trim();
                if (trim.length() != 0) {
                    if (trim.charAt(0) == '.') {
                        string = context.getPackageName() + trim;
                    } else if (trim.contains(".")) {
                        string = trim;
                    } else {
                        string = RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        ClassLoader classLoader;
                        Object[] objArr;
                        Constructor constructor;
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class asSubclass = classLoader.loadClass(string).asSubclass(aef.class);
                        try {
                            objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(0)};
                            constructor = asSubclass.getConstructor(F);
                        } catch (Throwable e) {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        }
                        constructor.setAccessible(true);
                        a((aef) constructor.newInstance(objArr));
                    } catch (Throwable e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + string, e2);
                    } catch (Throwable e3) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + string, e3);
                    } catch (Throwable e32) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + string, e32);
                    } catch (Throwable e322) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + string, e322);
                    } catch (Throwable e3222) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + string, e3222);
                    } catch (Throwable e32222) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + string, e32222);
                    }
                }
            }
            if (VERSION.SDK_INT >= 21) {
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D, i, 0);
                z2 = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    public void a(aes aes) {
        this.B = aes;
        oa.a(this, this.B);
    }

    void a() {
        this.d = new adr(new zz(this));
    }

    public void a(boolean z) {
        this.n = true;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.I) {
            k();
        }
        this.I = z;
        super.setClipToPadding(z);
        if (this.o) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.I;
    }

    public void a(ady ady) {
        c(false);
        if (this.j != null) {
            this.j.b(this.G);
        }
        if (this.v != null) {
            this.v.d();
        }
        if (this.k != null) {
            this.k.c(this.c);
            this.k.b(this.c);
        }
        this.c.a();
        this.d.a();
        ady ady2 = this.j;
        this.j = ady;
        if (ady != null) {
            ady.a(this.G);
        }
        this.c.a(ady2, this.j, false);
        this.x.f = true;
        u();
        requestLayout();
    }

    public ady b() {
        return this.j;
    }

    public int getBaseline() {
        if (this.k != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public void a(aef aef) {
        if (aef != this.k) {
            f();
            if (this.k != null) {
                if (this.v != null) {
                    this.v.d();
                }
                this.k.c(this.c);
                this.k.b(this.c);
                this.c.a();
                if (this.m) {
                    this.k.b(this, this.c);
                }
                this.k.a(null);
                this.k = null;
            } else {
                this.c.a();
            }
            this.e.a();
            this.k = aef;
            if (aef != null) {
                if (aef.q != null) {
                    throw new IllegalArgumentException("LayoutManager " + aef + " is already attached to a RecyclerView: " + aef.q);
                }
                this.k.a(this);
                if (this.m) {
                    this.k.b(this);
                }
            }
            requestLayout();
        }
    }

    protected Parcelable onSaveInstanceState() {
        aem aem = new aem(super.onSaveInstanceState());
        if (this.H != null) {
            aem.a = this.H.a;
        } else if (this.k != null) {
            aem.a = this.k.g();
        } else {
            aem.a = null;
        }
        return aem;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof aem) {
            this.H = (aem) parcelable;
            super.onRestoreInstanceState(this.H.e);
            if (this.k != null && this.H.a != null) {
                this.k.a(this.H.a);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void a(aer aer) {
        View view = aer.a;
        boolean z = view.getParent() == this;
        this.c.b(a(view));
        if (aer.o()) {
            this.e.a(view, -1, view.getLayoutParams(), true);
        } else if (z) {
            this.e.d(view);
        } else {
            this.e.a(view, true);
        }
    }

    public aef c() {
        return this.k;
    }

    public void a(int i) {
        if (i != this.aa) {
            this.aa = i;
            if (i != 2) {
                x();
            }
            g(i);
        }
    }

    public void a(aee aee, int i) {
        if (this.k != null) {
            this.k.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.l.isEmpty()) {
            setWillNotDraw(false);
        }
        this.l.add(aee);
        r();
        requestLayout();
    }

    public void a(aee aee) {
        a(aee, -1);
    }

    @Deprecated
    public void a(aei aei) {
        this.an = aei;
    }

    public void b(aei aei) {
        if (this.ao == null) {
            this.ao = new ArrayList();
        }
        this.ao.add(aei);
    }

    public void c(aei aei) {
        if (this.ao != null) {
            this.ao.remove(aei);
        }
    }

    public void b(int i) {
        if (!this.q) {
            f();
            if (this.k == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            this.k.c(i);
            awakenScrollBars();
        }
    }

    public void c(int i) {
        if (this.k != null) {
            this.k.c(i);
            awakenScrollBars();
        }
    }

    public void scrollTo(int i, int i2) {
    }

    public void scrollBy(int i, int i2) {
        if (this.k == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.q) {
            boolean h = this.k.h();
            boolean i3 = this.k.i();
            if (h || i3) {
                if (!h) {
                    i = 0;
                }
                if (!i3) {
                    i2 = 0;
                }
                a(i, i2, null);
            }
        }
    }

    public void d() {
        boolean z = false;
        if (!this.o || this.u) {
            gwb.d("RV FullInvalidate");
            q();
            gwb.e();
        } else if (!this.d.d()) {
        } else {
            if (this.d.b(4) && !this.d.b(11)) {
                gwb.d("RV PartialInvalidate");
                e();
                this.d.b();
                if (!this.p) {
                    int b = this.e.b();
                    for (int i = 0; i < b; i++) {
                        aer d = d(this.e.b(i));
                        if (d != null && !d.c() && d.u()) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        q();
                    } else {
                        this.d.c();
                    }
                }
                b(true);
                gwb.e();
            } else if (this.d.d()) {
                gwb.d("RV FullInvalidate");
                q();
                gwb.e();
            }
        }
    }

    boolean a(int i, int i2, MotionEvent motionEvent) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        d();
        if (this.j != null) {
            e();
            l();
            gwb.d("RV Scroll");
            if (i != 0) {
                i5 = this.k.a(i, this.c, this.x);
                i3 = i - i5;
            }
            if (i2 != 0) {
                i6 = this.k.b(i2, this.c, this.x);
                i4 = i2 - i6;
            }
            gwb.e();
            w();
            m();
            b(false);
        }
        int i7 = i4;
        i4 = i5;
        i5 = i6;
        if (!this.l.isEmpty()) {
            invalidate();
        }
        if (dispatchNestedScroll(i4, i5, i3, i7, this.at)) {
            this.af -= this.at[0];
            this.ag -= this.at[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) this.at[0], (float) this.at[1]);
            }
            int[] iArr = this.av;
            iArr[0] = iArr[0] + this.at[0];
            iArr = this.av;
            iArr[1] = iArr[1] + this.at[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                float x = motionEvent.getX();
                float f = (float) i3;
                float y = motionEvent.getY();
                float f2 = (float) i7;
                Object obj = null;
                if (f < 0.0f) {
                    g();
                    if (this.T.a((-f) / ((float) getWidth()), 1.0f - (y / ((float) getHeight())))) {
                        obj = 1;
                    }
                } else if (f > 0.0f) {
                    h();
                    if (this.V.a(f / ((float) getWidth()), y / ((float) getHeight()))) {
                        obj = 1;
                    }
                }
                if (f2 < 0.0f) {
                    i();
                    if (this.U.a((-f2) / ((float) getHeight()), x / ((float) getWidth()))) {
                        obj = 1;
                    }
                } else if (f2 > 0.0f) {
                    j();
                    if (this.W.a(f2 / ((float) getHeight()), 1.0f - (x / ((float) getWidth())))) {
                        obj = 1;
                    }
                }
                if (!(obj == null && f == 0.0f && f2 == 0.0f)) {
                    oa.b(this);
                }
            }
            c(i, i2);
        }
        if (!(i4 == 0 && i5 == 0)) {
            h(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (i4 == 0 && i5 == 0) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollOffset() {
        if (this.k != null && this.k.h()) {
            return this.k.c(this.x);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        if (this.k != null && this.k.h()) {
            return this.k.e(this.x);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        if (this.k != null && this.k.h()) {
            return this.k.g(this.x);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        if (this.k != null && this.k.i()) {
            return this.k.d(this.x);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        if (this.k != null && this.k.i()) {
            return this.k.f(this.x);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        if (this.k != null && this.k.i()) {
            return this.k.h(this.x);
        }
        return 0;
    }

    public void e() {
        this.N++;
        if (this.N == 1 && !this.q) {
            this.p = false;
        }
    }

    public void b(boolean z) {
        if (this.N <= 0) {
            this.N = 1;
        }
        if (!z) {
            this.p = false;
        }
        if (this.N == 1) {
            if (!(!z || !this.p || this.q || this.k == null || this.j == null)) {
                q();
            }
            if (!this.q) {
                this.p = false;
            }
        }
        this.N--;
    }

    public void c(boolean z) {
        if (this.q) {
            a("Do not setLayoutFrozen in layout or scroll");
            this.q = false;
            if (!(!this.p || this.k == null || this.j == null)) {
                requestLayout();
            }
            this.p = false;
        }
    }

    public void a(int i, int i2) {
        int i3 = 0;
        if (this.k == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.q) {
            if (!this.k.h()) {
                i = 0;
            }
            if (this.k.i()) {
                i3 = i2;
            }
            if (i != 0 || i3 != 0) {
                this.w.b(i, i3);
            }
        }
    }

    public boolean b(int i, int i2) {
        if (this.k == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.q) {
            return false;
        } else {
            boolean h = this.k.h();
            boolean i3 = this.k.i();
            if (!h || Math.abs(i) < this.aj) {
                i = 0;
            }
            if (!i3 || Math.abs(i2) < this.aj) {
                i2 = 0;
            }
            if ((i == 0 && i2 == 0) || dispatchNestedPreFling((float) i, (float) i2)) {
                return false;
            }
            if (h || i3) {
                h = true;
            } else {
                h = false;
            }
            dispatchNestedFling((float) i, (float) i2, h);
            if (this.ai != null && this.ai.b()) {
                return true;
            }
            if (!h) {
                return false;
            }
            this.w.a(Math.max(-this.ak, Math.min(i, this.ak)), Math.max(-this.ak, Math.min(i2, this.ak)));
            return true;
        }
    }

    public void f() {
        a(0);
        x();
    }

    private void x() {
        this.w.b();
        if (this.k != null) {
            this.k.J();
        }
    }

    public void c(int i, int i2) {
        int i3 = 0;
        if (!(this.T == null || this.T.a() || i <= 0)) {
            i3 = this.T.c();
        }
        if (!(this.V == null || this.V.a() || i >= 0)) {
            i3 |= this.V.c();
        }
        if (!(this.U == null || this.U.a() || i2 <= 0)) {
            i3 |= this.U.c();
        }
        if (!(this.W == null || this.W.a() || i2 >= 0)) {
            i3 |= this.W.c();
        }
        if (i3 != 0) {
            oa.b(this);
        }
    }

    public void d(int i, int i2) {
        if (i < 0) {
            g();
            this.T.a(-i);
        } else if (i > 0) {
            h();
            this.V.a(i);
        }
        if (i2 < 0) {
            i();
            this.U.a(-i2);
        } else if (i2 > 0) {
            j();
            this.W.a(i2);
        }
        if (i != 0 || i2 != 0) {
            oa.b(this);
        }
    }

    void g() {
        if (this.T == null) {
            this.T = new sp(getContext());
            if (this.I) {
                this.T.a((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.T.a(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    void h() {
        if (this.V == null) {
            this.V = new sp(getContext());
            if (this.I) {
                this.V.a((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.V.a(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    void i() {
        if (this.U == null) {
            this.U = new sp(getContext());
            if (this.I) {
                this.U.a((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.U.a(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    void j() {
        if (this.W == null) {
            this.W = new sp(getContext());
            if (this.I) {
                this.W.a((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.W.a(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    void k() {
        this.W = null;
        this.U = null;
        this.V = null;
        this.T = null;
    }

    public View focusSearch(View view, int i) {
        int i2;
        View findNextFocus;
        int i3 = 17;
        int i4 = 0;
        boolean z = true;
        boolean z2 = (this.j == null || this.k == null || o() || this.q) ? false : true;
        FocusFinder instance = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            int i5;
            if (this.k.i()) {
                if (i == 2) {
                    i5 = 130;
                } else {
                    i5 = 33;
                }
                if (instance.findNextFocus(this, view, i5) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.k.h()) {
                if (this.k.v() == 1) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (i == 2) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                if (instance.findNextFocus(this, view, (i5 ^ i2) != 0 ? 66 : 17) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                d();
                if (b(view) == null) {
                    return null;
                }
                e();
                this.k.a(view, i, this.c, this.x);
                b(false);
            }
            findNextFocus = instance.findNextFocus(this, view, i);
        } else {
            View findNextFocus2 = instance.findNextFocus(this, view, i);
            if (findNextFocus2 == null && z2) {
                d();
                if (b(view) == null) {
                    return null;
                }
                e();
                findNextFocus = this.k.a(view, i, this.c, this.x);
                b(false);
            } else {
                findNextFocus = findNextFocus2;
            }
        }
        if (findNextFocus == null || findNextFocus == this) {
            z = false;
        } else if (view != null) {
            if (i == 2 || i == 1) {
                i2 = this.k.v() == 1 ? 1 : 0;
                if (i == 2) {
                    i4 = 1;
                }
                if ((i4 ^ i2) != 0) {
                    i3 = 66;
                }
                if (!a(view, findNextFocus, i3)) {
                    z = i == 2 ? a(view, findNextFocus, 130) : a(view, findNextFocus, 33);
                }
            } else {
                z = a(view, findNextFocus, i);
            }
        }
        return !z ? super.focusSearch(view, i) : findNextFocus;
    }

    private boolean a(View view, View view2, int i) {
        this.h.set(0, 0, view.getWidth(), view.getHeight());
        this.J.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.h);
        offsetDescendantRectToMyCoords(view2, this.J);
        switch (i) {
            case wi.dK /*17*/:
                if ((this.h.right > this.J.right || this.h.left >= this.J.right) && this.h.left > this.J.left) {
                    return true;
                }
                return false;
            case 33:
                if ((this.h.bottom > this.J.bottom || this.h.top >= this.J.bottom) && this.h.top > this.J.top) {
                    return true;
                }
                return false;
            case 66:
                if ((this.h.left < this.J.left || this.h.right <= this.J.left) && this.h.right < this.J.right) {
                    return true;
                }
                return false;
            case 130:
                if ((this.h.top < this.J.top || this.h.bottom <= this.J.top) && this.h.bottom < this.J.bottom) {
                    return true;
                }
                return false;
            default:
                throw new IllegalArgumentException("direction must be absolute. received:" + i);
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!(this.k.a(this, view, view2) || view2 == null)) {
            Rect rect;
            boolean z;
            this.h.set(0, 0, view2.getWidth(), view2.getHeight());
            LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof aeg) {
                aeg aeg = (aeg) layoutParams;
                if (!aeg.e) {
                    Rect rect2 = aeg.d;
                    rect = this.h;
                    rect.left -= rect2.left;
                    rect = this.h;
                    rect.right += rect2.right;
                    rect = this.h;
                    rect.top -= rect2.top;
                    rect = this.h;
                    rect.bottom = rect2.bottom + rect.bottom;
                }
            }
            offsetDescendantRectToMyCoords(view2, this.h);
            offsetRectIntoDescendantCoords(view, this.h);
            rect = this.h;
            if (this.o) {
                z = false;
            } else {
                z = true;
            }
            requestChildRectangleOnScreen(view, rect, z);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.k.a(this, view, rect, z);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (o()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    protected void onAttachedToWindow() {
        boolean z = true;
        super.onAttachedToWindow();
        this.R = 0;
        this.m = true;
        if (!this.o || isLayoutRequested()) {
            z = false;
        }
        this.o = z;
        if (this.k != null) {
            this.k.b(this);
        }
        this.A = false;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.v != null) {
            this.v.d();
        }
        f();
        this.m = false;
        if (this.k != null) {
            this.k.b(this, this.c);
        }
        removeCallbacks(this.aw);
        do {
        } while (agc.d.a() != null);
    }

    public boolean isAttachedToWindow() {
        return this.m;
    }

    public void a(String str) {
        if (o()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
            }
            throw new IllegalStateException(str);
        } else if (this.S > 0) {
            IllegalStateException illegalStateException = new IllegalStateException("");
        }
    }

    public void a(aeh aeh) {
        this.L.add(aeh);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = -1;
        if (this.q) {
            return false;
        }
        int i2;
        boolean z;
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.M = null;
        }
        int size = this.L.size();
        for (i2 = 0; i2 < size; i2++) {
            aeh aeh = (aeh) this.L.get(i2);
            if (aeh.a(motionEvent) && action != 3) {
                this.M = aeh;
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            z();
            return true;
        } else if (this.k == null) {
            return false;
        } else {
            z = this.k.h();
            boolean i3 = this.k.i();
            if (this.ac == null) {
                this.ac = VelocityTracker.obtain();
            }
            this.ac.addMovement(motionEvent);
            action = nh.a(motionEvent);
            size = nh.b(motionEvent);
            int i4;
            switch (action) {
                case wi.w /*0*/:
                    if (this.O) {
                        this.O = false;
                    }
                    this.ab = motionEvent.getPointerId(0);
                    i = (int) (motionEvent.getX() + 0.5f);
                    this.af = i;
                    this.ad = i;
                    i = (int) (motionEvent.getY() + 0.5f);
                    this.ag = i;
                    this.ae = i;
                    if (this.aa == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        a(1);
                    }
                    int[] iArr = this.av;
                    this.av[1] = 0;
                    iArr[0] = 0;
                    if (z) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    if (i3) {
                        i4 |= 2;
                    }
                    startNestedScroll(i4);
                    break;
                case wi.j /*1*/:
                    this.ac.clear();
                    stopNestedScroll();
                    break;
                case wi.l /*2*/:
                    action = motionEvent.findPointerIndex(this.ab);
                    if (action >= 0) {
                        size = (int) (motionEvent.getX(action) + 0.5f);
                        action = (int) (motionEvent.getY(action) + 0.5f);
                        if (this.aa != 1) {
                            size -= this.ad;
                            action -= this.ae;
                            if (!z || Math.abs(size) <= this.ah) {
                                z = false;
                            } else {
                                this.af = ((size < 0 ? -1 : 1) * this.ah) + this.ad;
                                z = true;
                            }
                            if (i3 && Math.abs(action) > this.ah) {
                                i4 = this.ae;
                                i2 = this.ah;
                                if (action >= 0) {
                                    i = 1;
                                }
                                this.ag = i4 + (i * i2);
                                z = true;
                            }
                            if (z) {
                                a(1);
                                break;
                            }
                        }
                    }
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ab + " not found. Did any MotionEvents get skipped?");
                    return false;
                    break;
                case wi.z /*3*/:
                    z();
                    break;
                case wi.p /*5*/:
                    this.ab = motionEvent.getPointerId(size);
                    i4 = (int) (motionEvent.getX(size) + 0.5f);
                    this.af = i4;
                    this.ad = i4;
                    i4 = (int) (motionEvent.getY(size) + 0.5f);
                    this.ag = i4;
                    this.ae = i4;
                    break;
                case wi.s /*6*/:
                    a(motionEvent);
                    break;
            }
            if (this.aa != 1) {
                return false;
            }
            return true;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.L.size();
        for (int i = 0; i < size; i++) {
            this.L.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.q || this.O) {
            return false;
        }
        boolean z2;
        boolean h;
        boolean i;
        MotionEvent obtain;
        int b;
        float f;
        int x;
        int y;
        int i2;
        boolean z3;
        int action = motionEvent.getAction();
        if (this.M != null) {
            if (action == 0) {
                this.M = null;
            } else {
                this.M.a(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.M = null;
                }
                z2 = true;
                if (z2) {
                    z();
                    return true;
                } else if (this.k != null) {
                    return false;
                } else {
                    h = this.k.h();
                    i = this.k.i();
                    if (this.ac == null) {
                        this.ac = VelocityTracker.obtain();
                    }
                    obtain = MotionEvent.obtain(motionEvent);
                    action = nh.a(motionEvent);
                    b = nh.b(motionEvent);
                    if (action == 0) {
                        int[] iArr = this.av;
                        this.av[1] = 0;
                        iArr[0] = 0;
                    }
                    obtain.offsetLocation((float) this.av[0], (float) this.av[1]);
                    switch (action) {
                        case wi.w /*0*/:
                            this.ab = motionEvent.getPointerId(0);
                            action = (int) (motionEvent.getX() + 0.5f);
                            this.af = action;
                            this.ad = action;
                            action = (int) (motionEvent.getY() + 0.5f);
                            this.ag = action;
                            this.ae = action;
                            if (h) {
                                action = 0;
                            } else {
                                action = 1;
                            }
                            if (i) {
                                action |= 2;
                            }
                            startNestedScroll(action);
                            break;
                        case wi.j /*1*/:
                            this.ac.addMovement(obtain);
                            this.ac.computeCurrentVelocity(1000, (float) this.ak);
                            float f2 = h ? -nw.a(this.ac, this.ab) : 0.0f;
                            if (i) {
                                f = 0.0f;
                            } else {
                                f = -nw.b(this.ac, this.ab);
                            }
                            if ((f2 == 0.0f && r0 == 0.0f) || !b((int) f2, (int) r0)) {
                                a(0);
                            }
                            y();
                            z = true;
                            break;
                        case wi.l /*2*/:
                            action = motionEvent.findPointerIndex(this.ab);
                            if (action < 0) {
                                x = (int) (motionEvent.getX(action) + 0.5f);
                                y = (int) (motionEvent.getY(action) + 0.5f);
                                i2 = this.af - x;
                                action = this.ag - y;
                                if (dispatchNestedPreScroll(i2, action, this.au, this.at)) {
                                    i2 -= this.au[0];
                                    action -= this.au[1];
                                    obtain.offsetLocation((float) this.at[0], (float) this.at[1]);
                                    int[] iArr2 = this.av;
                                    iArr2[0] = iArr2[0] + this.at[0];
                                    iArr2 = this.av;
                                    iArr2[1] = iArr2[1] + this.at[1];
                                }
                                if (this.aa != 1) {
                                    if (h || Math.abs(i2) <= this.ah) {
                                        z3 = false;
                                    } else {
                                        if (i2 > 0) {
                                            i2 -= this.ah;
                                        } else {
                                            i2 += this.ah;
                                        }
                                        z3 = true;
                                    }
                                    if (i && Math.abs(action) > this.ah) {
                                        if (action <= 0) {
                                            action -= this.ah;
                                        } else {
                                            action += this.ah;
                                        }
                                        z3 = true;
                                    }
                                    if (z3) {
                                        a(1);
                                    }
                                }
                                if (this.aa == 1) {
                                    this.af = x - this.at[0];
                                    this.ag = y - this.at[1];
                                    if (!h) {
                                        i2 = 0;
                                    }
                                    if (!i) {
                                        action = 0;
                                    }
                                    if (a(i2, action, obtain)) {
                                        getParent().requestDisallowInterceptTouchEvent(true);
                                        break;
                                    }
                                }
                            }
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ab + " not found. Did any MotionEvents get skipped?");
                            return false;
                            break;
                        case wi.z /*3*/:
                            z();
                            break;
                        case wi.p /*5*/:
                            this.ab = motionEvent.getPointerId(b);
                            action = (int) (motionEvent.getX(b) + 0.5f);
                            this.af = action;
                            this.ad = action;
                            action = (int) (motionEvent.getY(b) + 0.5f);
                            this.ag = action;
                            this.ae = action;
                            break;
                        case wi.s /*6*/:
                            a(motionEvent);
                            break;
                    }
                    if (!z) {
                        this.ac.addMovement(obtain);
                    }
                    obtain.recycle();
                    return true;
                }
            }
        }
        if (action != 0) {
            int size = this.L.size();
            for (b = 0; b < size; b++) {
                aeh aeh = (aeh) this.L.get(b);
                if (aeh.a(motionEvent)) {
                    this.M = aeh;
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            z();
            return true;
        } else if (this.k != null) {
            return false;
        } else {
            h = this.k.h();
            i = this.k.i();
            if (this.ac == null) {
                this.ac = VelocityTracker.obtain();
            }
            obtain = MotionEvent.obtain(motionEvent);
            action = nh.a(motionEvent);
            b = nh.b(motionEvent);
            if (action == 0) {
                int[] iArr3 = this.av;
                this.av[1] = 0;
                iArr3[0] = 0;
            }
            obtain.offsetLocation((float) this.av[0], (float) this.av[1]);
            switch (action) {
                case wi.w /*0*/:
                    this.ab = motionEvent.getPointerId(0);
                    action = (int) (motionEvent.getX() + 0.5f);
                    this.af = action;
                    this.ad = action;
                    action = (int) (motionEvent.getY() + 0.5f);
                    this.ag = action;
                    this.ae = action;
                    if (h) {
                        action = 0;
                    } else {
                        action = 1;
                    }
                    if (i) {
                        action |= 2;
                    }
                    startNestedScroll(action);
                    break;
                case wi.j /*1*/:
                    this.ac.addMovement(obtain);
                    this.ac.computeCurrentVelocity(1000, (float) this.ak);
                    if (h) {
                    }
                    if (i) {
                        f = 0.0f;
                    } else {
                        f = -nw.b(this.ac, this.ab);
                    }
                    a(0);
                    y();
                    z = true;
                    break;
                case wi.l /*2*/:
                    action = motionEvent.findPointerIndex(this.ab);
                    if (action < 0) {
                        x = (int) (motionEvent.getX(action) + 0.5f);
                        y = (int) (motionEvent.getY(action) + 0.5f);
                        i2 = this.af - x;
                        action = this.ag - y;
                        if (dispatchNestedPreScroll(i2, action, this.au, this.at)) {
                            i2 -= this.au[0];
                            action -= this.au[1];
                            obtain.offsetLocation((float) this.at[0], (float) this.at[1]);
                            int[] iArr22 = this.av;
                            iArr22[0] = iArr22[0] + this.at[0];
                            iArr22 = this.av;
                            iArr22[1] = iArr22[1] + this.at[1];
                        }
                        if (this.aa != 1) {
                            if (h) {
                                break;
                            }
                            z3 = false;
                            if (action <= 0) {
                                action += this.ah;
                            } else {
                                action -= this.ah;
                            }
                            z3 = true;
                            if (z3) {
                                a(1);
                            }
                            break;
                        }
                        if (this.aa == 1) {
                            this.af = x - this.at[0];
                            this.ag = y - this.at[1];
                            if (h) {
                                i2 = 0;
                            }
                            if (i) {
                                action = 0;
                            }
                            if (a(i2, action, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    }
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ab + " not found. Did any MotionEvents get skipped?");
                    return false;
                    break;
                case wi.z /*3*/:
                    z();
                    break;
                case wi.p /*5*/:
                    this.ab = motionEvent.getPointerId(b);
                    action = (int) (motionEvent.getX(b) + 0.5f);
                    this.af = action;
                    this.ad = action;
                    action = (int) (motionEvent.getY(b) + 0.5f);
                    this.ag = action;
                    this.ae = action;
                    break;
                case wi.s /*6*/:
                    a(motionEvent);
                    break;
            }
            if (z) {
                this.ac.addMovement(obtain);
            }
            obtain.recycle();
            return true;
        }
    }

    private void y() {
        if (this.ac != null) {
            this.ac.clear();
        }
        stopNestedScroll();
        int i = 0;
        if (this.T != null) {
            i = this.T.c();
        }
        if (this.U != null) {
            i |= this.U.c();
        }
        if (this.V != null) {
            i |= this.V.c();
        }
        if (this.W != null) {
            i |= this.W.c();
        }
        if (i != 0) {
            oa.b(this);
        }
    }

    private void z() {
        y();
        a(0);
    }

    private void a(MotionEvent motionEvent) {
        int b = nh.b(motionEvent);
        if (motionEvent.getPointerId(b) == this.ab) {
            b = b == 0 ? 1 : 0;
            this.ab = motionEvent.getPointerId(b);
            int x = (int) (motionEvent.getX(b) + 0.5f);
            this.af = x;
            this.ad = x;
            b = (int) (motionEvent.getY(b) + 0.5f);
            this.ag = b;
            this.ae = b;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f = 0.0f;
        if (!(this.k == null || this.q || (motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8)) {
            float f2;
            float d;
            if (this.k.i()) {
                f2 = -nh.d(motionEvent, 9);
            } else {
                f2 = 0.0f;
            }
            if (this.k.h()) {
                d = nh.d(motionEvent, 10);
            } else {
                d = 0.0f;
            }
            if (!(f2 == 0.0f && d == 0.0f)) {
                if (this.al == Float.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (getContext().getTheme().resolveAttribute(16842829, typedValue, true)) {
                        this.al = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
                    }
                    a((int) (d * f), (int) (f2 * f), motionEvent);
                }
                f = this.al;
                a((int) (d * f), (int) (f2 * f), motionEvent);
            }
        }
        return false;
    }

    protected void onMeasure(int i, int i2) {
        boolean z = false;
        if (this.k == null) {
            e(i, i2);
        } else if (this.k.u) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.k.d(i, i2);
            if (!z && this.j != null) {
                if (this.x.b == 1) {
                    D();
                }
                this.k.a(i, i2);
                this.x.k = true;
                E();
                this.k.b(i, i2);
                if (this.k.o()) {
                    this.k.a(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.x.k = true;
                    E();
                    this.k.b(i, i2);
                }
            }
        } else if (this.n) {
            this.k.d(i, i2);
        } else {
            if (this.r) {
                e();
                B();
                if (this.x.i) {
                    this.x.g = true;
                } else {
                    this.d.e();
                    this.x.g = false;
                }
                this.r = false;
                b(false);
            }
            if (this.j != null) {
                this.x.c = this.j.a();
            } else {
                this.x.c = 0;
            }
            e();
            this.k.d(i, i2);
            b(false);
            this.x.g = false;
        }
    }

    public void e(int i, int i2) {
        setMeasuredDimension(aef.a(i, getPaddingLeft() + getPaddingRight(), oa.k(this)), aef.a(i2, getPaddingTop() + getPaddingBottom(), oa.l(this)));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            k();
        }
    }

    public void a(aeb aeb) {
        if (this.v != null) {
            this.v.d();
            this.v.a(null);
        }
        this.v = aeb;
        if (this.v != null) {
            this.v.a(this.ap);
        }
    }

    public void l() {
        this.R++;
    }

    public void m() {
        this.R--;
        if (this.R <= 0) {
            this.R = 0;
            int i = this.P;
            this.P = 0;
            if (i != 0 && n()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(2048);
                qf.a.a(obtain, i);
                sendAccessibilityEventUnchecked(obtain);
            }
        }
    }

    public boolean n() {
        return this.Q != null && this.Q.isEnabled();
    }

    public boolean o() {
        return this.R > 0;
    }

    boolean a(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!o()) {
            return false;
        }
        int a;
        if (accessibilityEvent != null) {
            a = qf.a.a(accessibilityEvent);
        } else {
            a = 0;
        }
        if (a != 0) {
            i = a;
        }
        this.P = i | this.P;
        return true;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void p() {
        if (!this.A && this.m) {
            oa.a(this, this.aw);
            this.A = true;
        }
    }

    private boolean A() {
        return this.v != null && this.k.f();
    }

    private void B() {
        boolean z;
        boolean z2 = true;
        if (this.u) {
            this.d.a();
            u();
            this.k.b();
        }
        if (A()) {
            this.d.b();
        } else {
            this.d.e();
        }
        boolean z3;
        if (this.y || this.z) {
            z3 = true;
        } else {
            z3 = false;
        }
        aep aep = this.x;
        if (!this.o || this.v == null || (!(this.u || r0 || this.k.s) || (this.u && !this.j.a))) {
            z = false;
        } else {
            z = true;
        }
        aep.h = z;
        aep aep2 = this.x;
        if (!(this.x.h && r0 && !this.u && A())) {
            z2 = false;
        }
        aep2.i = z2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void q() {
        /*
        r14 = this;
        r12 = -1;
        r0 = 1;
        r1 = 0;
        r2 = r14.j;
        if (r2 != 0) goto L_0x0010;
    L_0x0008:
        r0 = "RecyclerView";
        r1 = "No adapter attached; skipping layout";
        android.util.Log.e(r0, r1);
    L_0x000f:
        return;
    L_0x0010:
        r2 = r14.k;
        if (r2 != 0) goto L_0x001c;
    L_0x0014:
        r0 = "RecyclerView";
        r1 = "No layout manager attached; skipping layout";
        android.util.Log.e(r0, r1);
        goto L_0x000f;
    L_0x001c:
        r2 = r14.x;
        r2.k = r1;
        r2 = r14.x;
        r2 = r2.b;
        if (r2 != r0) goto L_0x0091;
    L_0x0026:
        r14.D();
        r2 = r14.k;
        r2.d(r14);
        r14.E();
    L_0x0031:
        r2 = r14.x;
        r3 = 4;
        r2.a(r3);
        r14.e();
        r14.l();
        r2 = r14.x;
        r2.b = r0;
        r2 = r14.x;
        r2 = r2.h;
        if (r2 == 0) goto L_0x0196;
    L_0x0047:
        r2 = r14.e;
        r2 = r2.b();
        r2 = r2 + -1;
    L_0x004f:
        if (r2 < 0) goto L_0x018f;
    L_0x0051:
        r3 = r14.e;
        r3 = r3.b(r2);
        r4 = d(r3);
        r3 = r4.c();
        if (r3 != 0) goto L_0x008e;
    L_0x0061:
        r6 = r14.b(r4);
        r3 = r14.v;
        r3 = r3.d(r4);
        r5 = r14.f;
        r5 = r5.a(r6);
        if (r5 == 0) goto L_0x0188;
    L_0x0073:
        r8 = r5.c();
        if (r8 != 0) goto L_0x0188;
    L_0x0079:
        r8 = r14.f;
        r8 = r8.a(r5);
        r9 = r14.f;
        r9 = r9.a(r4);
        if (r8 == 0) goto L_0x00c2;
    L_0x0087:
        if (r5 != r4) goto L_0x00c2;
    L_0x0089:
        r5 = r14.f;
        r5.c(r4, r3);
    L_0x008e:
        r2 = r2 + -1;
        goto L_0x004f;
    L_0x0091:
        r2 = r14.d;
        r2 = r2.f();
        if (r2 != 0) goto L_0x00b1;
    L_0x0099:
        r2 = r14.k;
        r2 = r2.z();
        r3 = r14.getWidth();
        if (r2 != r3) goto L_0x00b1;
    L_0x00a5:
        r2 = r14.k;
        r2 = r2.A();
        r3 = r14.getHeight();
        if (r2 == r3) goto L_0x00bb;
    L_0x00b1:
        r2 = r14.k;
        r2.d(r14);
        r14.E();
        goto L_0x0031;
    L_0x00bb:
        r2 = r14.k;
        r2.d(r14);
        goto L_0x0031;
    L_0x00c2:
        r10 = r14.f;
        r10 = r10.b(r5);
        r11 = r14.f;
        r11.c(r4, r3);
        r3 = r14.f;
        r3 = r3.c(r4);
        if (r10 != 0) goto L_0x015d;
    L_0x00d5:
        r3 = r14.e;
        r8 = r3.b();
        r3 = r1;
    L_0x00dc:
        if (r3 >= r8) goto L_0x013d;
    L_0x00de:
        r9 = r14.e;
        r9 = r9.b(r3);
        r9 = d(r9);
        if (r9 == r4) goto L_0x013a;
    L_0x00ea:
        r10 = r14.b(r9);
        r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r10 != 0) goto L_0x013a;
    L_0x00f2:
        r0 = r14.j;
        if (r0 == 0) goto L_0x011b;
    L_0x00f6:
        r0 = r14.j;
        r0 = r0.a;
        if (r0 == 0) goto L_0x011b;
    L_0x00fc:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r2 = " \n View Holder 2:";
        r1 = r1.append(r2);
        r1 = r1.append(r4);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x011b:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r2 = " \n View Holder 2:";
        r1 = r1.append(r2);
        r1 = r1.append(r4);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x013a:
        r3 = r3 + 1;
        goto L_0x00dc;
    L_0x013d:
        r3 = "RecyclerView";
        r6 = new java.lang.StringBuilder;
        r7 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder ";
        r6.<init>(r7);
        r5 = r6.append(r5);
        r6 = " cannot be found but it is necessary for ";
        r5 = r5.append(r6);
        r4 = r5.append(r4);
        r4 = r4.toString();
        android.util.Log.e(r3, r4);
        goto L_0x008e;
    L_0x015d:
        r5.a(r1);
        if (r8 == 0) goto L_0x0165;
    L_0x0162:
        r14.a(r5);
    L_0x0165:
        if (r5 == r4) goto L_0x017b;
    L_0x0167:
        if (r9 == 0) goto L_0x016c;
    L_0x0169:
        r14.a(r4);
    L_0x016c:
        r5.g = r4;
        r14.a(r5);
        r6 = r14.c;
        r6.b(r5);
        r4.a(r1);
        r4.h = r5;
    L_0x017b:
        r6 = r14.v;
        r3 = r6.a(r5, r4, r10, r3);
        if (r3 == 0) goto L_0x008e;
    L_0x0183:
        r14.p();
        goto L_0x008e;
    L_0x0188:
        r5 = r14.f;
        r5.c(r4, r3);
        goto L_0x008e;
    L_0x018f:
        r2 = r14.f;
        r3 = r14.ax;
        r2.a(r3);
    L_0x0196:
        r2 = r14.k;
        r3 = r14.c;
        r2.b(r3);
        r2 = r14.x;
        r3 = r14.x;
        r3 = r3.c;
        r2.d = r3;
        r14.u = r1;
        r2 = r14.x;
        r2.h = r1;
        r2 = r14.x;
        r2.i = r1;
        r2 = r14.k;
        r2.s = r1;
        r2 = r14.c;
        r2 = r2.b;
        if (r2 == 0) goto L_0x01c0;
    L_0x01b9:
        r2 = r14.c;
        r2 = r2.b;
        r2.clear();
    L_0x01c0:
        r2 = r14.k;
        r3 = r14.x;
        r2.a(r3);
        r14.m();
        r14.b(r1);
        r2 = r14.f;
        r2.a();
        r2 = r14.ar;
        r2 = r2[r1];
        r3 = r14.ar;
        r3 = r3[r0];
        r4 = r14.ar;
        r14.a(r4);
        r4 = r14.ar;
        r4 = r4[r1];
        if (r4 != r2) goto L_0x01eb;
    L_0x01e5:
        r2 = r14.ar;
        r2 = r2[r0];
        if (r2 == r3) goto L_0x0203;
    L_0x01eb:
        if (r0 == 0) goto L_0x01f0;
    L_0x01ed:
        r14.h(r1, r1);
    L_0x01f0:
        r0 = r14.am;
        if (r0 == 0) goto L_0x01fe;
    L_0x01f4:
        r0 = r14.j;
        if (r0 == 0) goto L_0x01fe;
    L_0x01f8:
        r0 = r14.hasFocus();
        if (r0 != 0) goto L_0x0205;
    L_0x01fe:
        r14.C();
        goto L_0x000f;
    L_0x0203:
        r0 = r1;
        goto L_0x01eb;
    L_0x0205:
        r0 = r14.isFocused();
        if (r0 != 0) goto L_0x0219;
    L_0x020b:
        r0 = r14.getFocusedChild();
        if (r0 == 0) goto L_0x01fe;
    L_0x0211:
        r1 = r14.e;
        r0 = r1.c(r0);
        if (r0 == 0) goto L_0x01fe;
    L_0x0219:
        r0 = 0;
        r1 = r14.x;
        r1 = r1.l;
        r2 = -1;
        if (r1 == r2) goto L_0x0229;
    L_0x0221:
        r0 = r14.x;
        r0 = r0.l;
        r0 = r14.d(r0);
    L_0x0229:
        if (r0 != 0) goto L_0x0241;
    L_0x022b:
        r1 = r14.x;
        r2 = r1.m;
        r1 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
        if (r1 == 0) goto L_0x0241;
    L_0x0233:
        r1 = r14.j;
        r1 = r1.a;
        if (r1 == 0) goto L_0x0241;
    L_0x0239:
        r0 = r14.x;
        r0 = r0.m;
        r0 = r14.a(r0);
    L_0x0241:
        if (r0 == 0) goto L_0x01fe;
    L_0x0243:
        r1 = r0.a;
        r1 = r1.hasFocus();
        if (r1 != 0) goto L_0x01fe;
    L_0x024b:
        r1 = r0.a;
        r1 = r1.hasFocusable();
        if (r1 == 0) goto L_0x01fe;
    L_0x0253:
        r1 = r0.a;
        r2 = r14.x;
        r2 = r2.n;
        r2 = (long) r2;
        r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
        if (r2 == 0) goto L_0x0274;
    L_0x025e:
        r0 = r0.a;
        r2 = r14.x;
        r2 = r2.n;
        r0 = r0.findViewById(r2);
        if (r0 == 0) goto L_0x0274;
    L_0x026a:
        r2 = r0.isFocusable();
        if (r2 == 0) goto L_0x0274;
    L_0x0270:
        r0.requestFocus();
        goto L_0x01fe;
    L_0x0274:
        r0 = r1;
        goto L_0x0270;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.q():void");
    }

    private void C() {
        this.x.m = -1;
        this.x.l = -1;
        this.x.n = -1;
    }

    private void D() {
        View focusedChild;
        aep aep;
        int i;
        int id;
        boolean z;
        this.x.a(1);
        this.x.k = false;
        e();
        this.f.a();
        l();
        if (this.am && hasFocus() && this.j != null) {
            focusedChild = getFocusedChild();
        } else {
            focusedChild = null;
        }
        aer c = focusedChild == null ? null : c(focusedChild);
        if (c == null) {
            C();
        } else {
            long j;
            aep aep2 = this.x;
            if (this.j.a) {
                j = c.d;
            } else {
                j = -1;
            }
            aep2.m = j;
            aep = this.x;
            if (this.u) {
                i = -1;
            } else {
                i = c.e();
            }
            aep.l = i;
            aep2 = this.x;
            focusedChild = c.a;
            View view = focusedChild;
            id = focusedChild.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                View focusedChild2 = ((ViewGroup) view).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    i = focusedChild2.getId();
                } else {
                    i = id;
                }
                id = i;
                view = focusedChild2;
            }
            aep2.n = id;
        }
        B();
        aep = this.x;
        if (this.x.h && this.z) {
            z = true;
        } else {
            z = false;
        }
        aep.j = z;
        this.z = false;
        this.y = false;
        this.x.g = this.x.i;
        this.x.c = this.j.a();
        a(this.ar);
        if (this.x.h) {
            id = this.e.b();
            for (i = 0; i < id; i++) {
                aer d = d(this.e.b(i));
                if (!d.c() && (!d.k() || this.j.a)) {
                    aeb aeb = this.v;
                    aeb.e(d);
                    this.f.a(d, aeb.b(d, d.r()));
                    if (!(!this.x.j || !d.u() || d.n() || d.c() || d.k())) {
                        this.f.a(b(d), d);
                    }
                }
            }
        }
        if (this.x.i) {
            s();
            z = this.x.f;
            this.x.f = false;
            this.k.c(this.c, this.x);
            this.x.f = z;
            for (i = 0; i < this.e.b(); i++) {
                aer d2 = d(this.e.b(i));
                if (!(d2.c() || this.f.d(d2))) {
                    aeb.e(d2);
                    boolean a = d2.a(8192);
                    aed b = this.v.b(d2, d2.r());
                    if (a) {
                        a(d2, b);
                    } else {
                        this.f.b(d2, b);
                    }
                }
            }
            t();
        } else {
            t();
        }
        m();
        b(false);
        this.x.b = 2;
    }

    private void E() {
        boolean z;
        e();
        l();
        this.x.a(6);
        this.d.e();
        this.x.c = this.j.a();
        this.x.e = 0;
        this.x.g = false;
        this.k.c(this.c, this.x);
        this.x.f = false;
        this.H = null;
        aep aep = this.x;
        if (!this.x.h || this.v == null) {
            z = false;
        } else {
            z = true;
        }
        aep.h = z;
        this.x.b = 4;
        m();
        b(false);
    }

    public void a(aer aer, aed aed) {
        aer.a(0, 8192);
        if (this.x.j && aer.u() && !aer.n() && !aer.c()) {
            this.f.a(b(aer), aer);
        }
        this.f.a(aer, aed);
    }

    private void a(int[] iArr) {
        int b = this.e.b();
        if (b == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = nzf.UNSET_ENUM_VALUE;
        int i3 = 0;
        while (i3 < b) {
            int d;
            aer d2 = d(this.e.b(i3));
            if (!d2.c()) {
                d = d2.d();
                if (d < i) {
                    i = d;
                }
                if (d > i2) {
                    i2 = i;
                    i3++;
                    i = i2;
                    i2 = d;
                }
            }
            d = i2;
            i2 = i;
            i3++;
            i = i2;
            i2 = d;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void removeDetachedView(View view, boolean z) {
        aer d = d(view);
        if (d != null) {
            if (d.o()) {
                d.j();
            } else if (!d.c()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + d);
            }
        }
        g(view);
        super.removeDetachedView(view, z);
    }

    long b(aer aer) {
        if (this.j.a) {
            return aer.d;
        }
        return (long) aer.b;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        gwb.d("RV OnLayout");
        q();
        gwb.e();
        this.o = true;
    }

    public void requestLayout() {
        if (this.N != 0 || this.q) {
            this.p = true;
        } else {
            super.requestLayout();
        }
    }

    void r() {
        int c = this.e.c();
        for (int i = 0; i < c; i++) {
            ((aeg) this.e.c(i).getLayoutParams()).e = true;
        }
        this.c.g();
    }

    public void draw(Canvas canvas) {
        int i;
        int i2 = 1;
        int i3 = 0;
        super.draw(canvas);
        int size = this.l.size();
        for (i = 0; i < size; i++) {
            this.l.get(i);
        }
        if (this.T == null || this.T.a()) {
            i = 0;
        } else {
            size = canvas.save();
            i = this.I ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) (i + (-getHeight())), 0.0f);
            if (this.T == null || !this.T.a(canvas)) {
                i = 0;
            } else {
                i = 1;
            }
            canvas.restoreToCount(size);
        }
        if (!(this.U == null || this.U.a())) {
            int save = canvas.save();
            if (this.I) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            if (this.U == null || !this.U.a(canvas)) {
                size = 0;
            } else {
                size = 1;
            }
            i |= size;
            canvas.restoreToCount(save);
        }
        if (!(this.V == null || this.V.a())) {
            save = canvas.save();
            int width = getWidth();
            if (this.I) {
                size = getPaddingTop();
            } else {
                size = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) (-size), (float) (-width));
            if (this.V == null || !this.V.a(canvas)) {
                size = 0;
            } else {
                size = 1;
            }
            i |= size;
            canvas.restoreToCount(save);
        }
        if (!(this.W == null || this.W.a())) {
            size = canvas.save();
            canvas.rotate(180.0f);
            if (this.I) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            if (this.W != null && this.W.a(canvas)) {
                i3 = 1;
            }
            i |= i3;
            canvas.restoreToCount(size);
        }
        if (i != 0 || this.v == null || this.l.size() <= 0 || !this.v.b()) {
            i2 = i;
        }
        if (i2 != 0) {
            oa.b(this);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            this.l.get(i);
        }
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof aeg) && this.k.a((aeg) layoutParams);
    }

    public LayoutParams generateDefaultLayoutParams() {
        if (this.k != null) {
            return this.k.e();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.k != null) {
            return this.k.a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (this.k != null) {
            return this.k.a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    void s() {
        int c = this.e.c();
        for (int i = 0; i < c; i++) {
            aer d = d(this.e.c(i));
            if (!d.c()) {
                d.b();
            }
        }
    }

    void t() {
        int c = this.e.c();
        for (int i = 0; i < c; i++) {
            aer d = d(this.e.c(i));
            if (!d.c()) {
                d.a();
            }
        }
        this.c.f();
    }

    public void f(int i, int i2) {
        int i3;
        int c = this.e.c();
        int i4;
        int i5;
        if (i < i2) {
            i3 = -1;
            i4 = i2;
            i5 = i;
        } else {
            i3 = 1;
            i4 = i;
            i5 = i2;
        }
        for (int i6 = 0; i6 < c; i6++) {
            aer d = d(this.e.c(i6));
            if (d != null && d.b >= r3 && d.b <= r2) {
                if (d.b == i) {
                    d.a(i2 - i, false);
                } else {
                    d.a(i3, false);
                }
                this.x.f = true;
            }
        }
        this.c.a(i, i2);
        requestLayout();
    }

    public void g(int i, int i2) {
        int c = this.e.c();
        for (int i3 = 0; i3 < c; i3++) {
            aer d = d(this.e.c(i3));
            if (!(d == null || d.c() || d.b < i)) {
                d.a(i2, false);
                this.x.f = true;
            }
        }
        this.c.b(i, i2);
        requestLayout();
    }

    public void a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int c = this.e.c();
        for (int i4 = 0; i4 < c; i4++) {
            aer d = d(this.e.c(i4));
            if (!(d == null || d.c())) {
                if (d.b >= i3) {
                    d.a(-i2, z);
                    this.x.f = true;
                } else if (d.b >= i) {
                    d.a(i - 1, -i2, z);
                    this.x.f = true;
                }
            }
        }
        this.c.a(i, i2, z);
        requestLayout();
    }

    public void a(int i, int i2, Object obj) {
        int c = this.e.c();
        int i3 = i + i2;
        for (int i4 = 0; i4 < c; i4++) {
            View c2 = this.e.c(i4);
            aer d = d(c2);
            if (d != null && !d.c() && d.b >= i && d.b < i3) {
                d.b(2);
                d.a(obj);
                ((aeg) c2.getLayoutParams()).e = true;
            }
        }
        this.c.c(i, i2);
    }

    void u() {
        int c = this.e.c();
        for (int i = 0; i < c; i++) {
            aer d = d(this.e.c(i));
            if (!(d == null || d.c())) {
                d.b(6);
            }
        }
        r();
        this.c.e();
    }

    public aer a(View view) {
        Object parent = view.getParent();
        if (parent == null || parent == this) {
            return d(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public View b(View view) {
        RecyclerView parent = view.getParent();
        View view2 = view;
        while (parent != null && parent != this && (parent instanceof View)) {
            View view3 = parent;
            view2 = view3;
            ViewParent parent2 = view3.getParent();
        }
        return parent == this ? view2 : null;
    }

    public aer c(View view) {
        View b = b(view);
        return b == null ? null : a(b);
    }

    public static aer d(View view) {
        if (view == null) {
            return null;
        }
        return ((aeg) view.getLayoutParams()).c;
    }

    public int e(View view) {
        aer d = d(view);
        return d != null ? d.d() : -1;
    }

    public aer d(int i) {
        if (this.u) {
            return null;
        }
        int c = this.e.c();
        int i2 = 0;
        aer aer = null;
        while (i2 < c) {
            aer d = d(this.e.c(i2));
            if (d == null || d.n() || c(d) != i) {
                d = aer;
            } else if (!this.e.c(d.a)) {
                return d;
            }
            i2++;
            aer = d;
        }
        return aer;
    }

    public aer a(int i, boolean z) {
        int c = this.e.c();
        aer aer = null;
        int i2 = 0;
        while (i2 < c) {
            aer d = d(this.e.c(i2));
            if (d == null || d.n() || d.b != i) {
                d = aer;
            } else if (!this.e.c(d.a)) {
                return d;
            }
            i2++;
            aer = d;
        }
        return aer;
    }

    public aer a(long j) {
        if (this.j == null || !this.j.a) {
            return null;
        }
        int c = this.e.c();
        int i = 0;
        aer aer = null;
        while (i < c) {
            aer d = d(this.e.c(i));
            if (d == null || d.n() || d.d != j) {
                d = aer;
            } else if (!this.e.c(d.a)) {
                return d;
            }
            i++;
            aer = d;
        }
        return aer;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void e(int i) {
        int b = this.e.b();
        for (int i2 = 0; i2 < b; i2++) {
            this.e.b(i2).offsetTopAndBottom(i);
        }
    }

    public void f(int i) {
        int b = this.e.b();
        for (int i2 = 0; i2 < b; i2++) {
            this.e.b(i2).offsetLeftAndRight(i);
        }
    }

    public static void a(View view, Rect rect) {
        aeg aeg = (aeg) view.getLayoutParams();
        Rect rect2 = aeg.d;
        rect.set((view.getLeft() - rect2.left) - aeg.leftMargin, (view.getTop() - rect2.top) - aeg.topMargin, (view.getRight() + rect2.right) + aeg.rightMargin, aeg.bottomMargin + (rect2.bottom + view.getBottom()));
    }

    public Rect f(View view) {
        aeg aeg = (aeg) view.getLayoutParams();
        if (!aeg.e) {
            return aeg.d;
        }
        if (this.x.a() && (aeg.e() || aeg.c())) {
            return aeg.d;
        }
        Rect rect = aeg.d;
        rect.set(0, 0, 0, 0);
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            this.h.set(0, 0, 0, 0);
            ((aee) this.l.get(i)).a(this.h, view, this, this.x);
            rect.left += this.h.left;
            rect.top += this.h.top;
            rect.right += this.h.right;
            rect.bottom += this.h.bottom;
        }
        aeg.e = false;
        return rect;
    }

    public void h(int i, int i2) {
        this.S++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        if (this.an != null) {
            this.an.a(this, i, i2);
        }
        if (this.ao != null) {
            for (scrollY = this.ao.size() - 1; scrollY >= 0; scrollY--) {
                ((aei) this.ao.get(scrollY)).a(this, i, i2);
            }
        }
        this.S--;
    }

    void g(int i) {
        if (this.an != null) {
            this.an.a(this, i);
        }
        if (this.ao != null) {
            for (int size = this.ao.size() - 1; size >= 0; size--) {
                ((aei) this.ao.get(size)).a(this, i);
            }
        }
    }

    public boolean v() {
        return !this.o || this.u || this.d.d();
    }

    public void w() {
        int b = this.e.b();
        for (int i = 0; i < b; i++) {
            View b2 = this.e.b(i);
            aer a = a(b2);
            if (!(a == null || a.h == null)) {
                View view = a.h.a;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void g(View view) {
        d(view);
        if (this.t != null) {
            for (int size = this.t.size() - 1; size >= 0; size--) {
                this.t.get(size);
            }
        }
    }

    public int c(aer aer) {
        if (aer.a(524) || !aer.m()) {
            return -1;
        }
        return this.d.d(aer.b);
    }

    public void setNestedScrollingEnabled(boolean z) {
        F().a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return F().a();
    }

    public boolean startNestedScroll(int i) {
        return F().a(i);
    }

    public void stopNestedScroll() {
        F().c();
    }

    public boolean hasNestedScrollingParent() {
        return F().b();
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return F().a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return F().a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return F().a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return F().a(f, f2);
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.aq == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return this.aq.b();
    }

    private nl F() {
        if (this.as == null) {
            this.as = new nl(this);
        }
        return this.as;
    }
}
