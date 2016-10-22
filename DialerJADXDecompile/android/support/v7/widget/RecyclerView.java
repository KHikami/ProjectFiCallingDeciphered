package android.support.v7.widget;

import aas;
import aat;
import aau;
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
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import buf;
import i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import jw;
import kb;
import kc;
import kh;
import kn;
import ml;
import nz;
import oe;
import rk;
import rl;
import rq;
import va;
import wq;
import ws;
import ww;
import yl;
import yp;
import yq;
import yr;
import ys;
import yv;
import yw;
import yx;
import yy;
import yz;
import za;
import zb;
import zc;
import zd;
import ze;
import zi;
import zj;
import zk;
import zl;

/* compiled from: PG */
public class RecyclerView extends ViewGroup implements kb, kh {
    public static final Interpolator F;
    private static final int[] G;
    private static final Class[] H;
    public static final boolean a;
    public static final boolean b;
    public final zi A;
    public boolean B;
    public boolean C;
    public boolean D;
    public zl E;
    private final zd I;
    private ze J;
    private boolean K;
    private final Rect L;
    private final ArrayList M;
    private i N;
    private int O;
    private boolean P;
    private int Q;
    private final AccessibilityManager R;
    private int S;
    private int T;
    private int U;
    private VelocityTracker V;
    private int W;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private final int ae;
    private final int af;
    private float ag;
    private boolean ah;
    private yw ai;
    private final int[] aj;
    private kc ak;
    private final int[] al;
    private final int[] am;
    private final int[] an;
    private Runnable ao;
    private final aau ap;
    public final zc c;
    public yl d;
    public wq e;
    public final aas f;
    public final Runnable g;
    public final Rect h;
    public final RectF i;
    public ys j;
    public yz k;
    public final ArrayList l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final boolean s;
    public boolean t;
    public nz u;
    public nz v;
    public nz w;
    public nz x;
    public yv y;
    public final zj z;

    static {
        G = new int[]{16843830};
        boolean z = VERSION.SDK_INT == 18 || VERSION.SDK_INT == 19 || VERSION.SDK_INT == 20;
        a = z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        b = z;
        H = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        F = new yr();
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
        this.I = new zd(this);
        this.c = new zc(this);
        this.f = new aas();
        this.K = true;
        this.g = new yp(this);
        this.h = new Rect();
        this.L = new Rect();
        this.i = new RectF();
        this.l = new ArrayList();
        this.M = new ArrayList();
        this.O = 0;
        this.t = false;
        this.S = 0;
        this.y = new ww();
        this.T = 0;
        this.U = -1;
        this.ag = Float.MIN_VALUE;
        this.ah = true;
        this.z = new zj(this);
        this.A = new zi();
        this.B = false;
        this.C = false;
        this.ai = new yw();
        this.D = false;
        this.aj = new int[2];
        this.al = new int[2];
        this.am = new int[2];
        this.an = new int[2];
        this.ao = new yq(this);
        this.ap = new aau(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        this.s = VERSION.SDK_INT >= 16;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ad = viewConfiguration.getScaledTouchSlop();
        this.ae = viewConfiguration.getScaledMinimumFlingVelocity();
        this.af = viewConfiguration.getScaledMaximumFlingVelocity();
        if (kn.a(this) == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.y.h = this.ai;
        this.d = new yl(new va(this));
        this.e = new wq(new ws(this));
        if (kn.d(this) == 0) {
            kn.c((View) this, 1);
        }
        this.R = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.E = new zl(this);
        kn.a((View) this, this.E);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rq.a, i, 0);
            String string = obtainStyledAttributes.getString(rq.c);
            if (obtainStyledAttributes.getInt(rq.b, -1) == -1) {
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
                        Class asSubclass = classLoader.loadClass(string).asSubclass(yz.class);
                        try {
                            objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(0)};
                            constructor = asSubclass.getConstructor(H);
                        } catch (Throwable e) {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        }
                        constructor.setAccessible(true);
                        a((yz) constructor.newInstance(objArr));
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
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G, i, 0);
                z2 = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    public void setClipToPadding(boolean z) {
        if (z != this.K) {
            o();
        }
        this.K = z;
        super.setClipToPadding(z);
        if (this.o) {
            requestLayout();
        }
    }

    public final void a(ys ysVar) {
        ys ysVar2;
        if (this.q) {
            a("Do not setLayoutFrozen in layout or scroll");
            this.q = false;
            if (!(!this.p || this.k == null || this.j == null)) {
                requestLayout();
            }
            this.p = false;
        }
        if (this.j != null) {
            ysVar2 = this.j;
            ysVar2.a.unregisterObserver(this.I);
        }
        if (this.y != null) {
            this.y.d();
        }
        if (this.k != null) {
            this.k.b(this.c);
            this.k.a(this.c);
        }
        this.c.a();
        this.d.a();
        ysVar2 = this.j;
        this.j = ysVar;
        if (ysVar != null) {
            ysVar.a.registerObserver(this.I);
        }
        zc zcVar = this.c;
        ys ysVar3 = this.j;
        zcVar.a();
        zb c = zcVar.c();
        if (ysVar2 != null) {
            c.c--;
        }
        if (c.c == 0) {
            c.a.clear();
        }
        if (ysVar3 != null) {
            c.c++;
        }
        this.A.f = true;
        y();
        requestLayout();
    }

    public int getBaseline() {
        if (this.k != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public final void a(yz yzVar) {
        if (yzVar != this.k) {
            m();
            if (this.k != null) {
                if (this.m) {
                    this.k.a(this, this.c);
                }
                this.k.a(null);
            }
            this.c.a();
            wq wqVar = this.e;
            wqVar.b.a();
            for (int size = wqVar.c.size() - 1; size >= 0; size--) {
                wqVar.a.d((View) wqVar.c.get(size));
                wqVar.c.remove(size);
            }
            wqVar.a.b();
            this.k = yzVar;
            if (yzVar != null) {
                if (yzVar.e != null) {
                    throw new IllegalArgumentException("LayoutManager " + yzVar + " is already attached to a RecyclerView: " + yzVar.e);
                }
                this.k.a(this);
            }
            requestLayout();
        }
    }

    protected Parcelable onSaveInstanceState() {
        ze zeVar = new ze(super.onSaveInstanceState());
        if (this.J != null) {
            zeVar.a = this.J.a;
        } else if (this.k != null) {
            zeVar.a = this.k.b();
        } else {
            zeVar.a = null;
        }
        return zeVar;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof ze) {
            this.J = (ze) parcelable;
            super.onRestoreInstanceState(this.J.e);
            if (this.k != null && this.J.a != null) {
                this.k.a(this.J.a);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void a(zk zkVar) {
        View view = zkVar.a;
        boolean z = view.getParent() == this;
        this.c.b(a(view));
        if (zkVar.n()) {
            this.e.a(view, -1, view.getLayoutParams(), true);
        } else if (z) {
            wq wqVar = this.e;
            int a = wqVar.a.a(view);
            if (a < 0) {
                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
            }
            wqVar.b.a(a);
            wqVar.a(view);
        } else {
            this.e.a(view, -1, true);
        }
    }

    public final void a(int i) {
        if (i != this.T) {
            this.T = i;
            if (i != 2) {
                n();
            }
        }
    }

    public final void b(int i) {
        if (this.k != null) {
            this.k.b(i);
            awakenScrollBars();
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollBy(int i, int i2) {
        if (this.k == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.q) {
            boolean c = this.k.c();
            boolean d = this.k.d();
            if (c || d) {
                if (!c) {
                    i = 0;
                }
                if (!d) {
                    i2 = 0;
                }
                a(i, i2, null);
            }
        }
    }

    public final void a() {
        boolean z = false;
        if (!this.o || this.t) {
            buf.d("RV FullInvalidate");
            t();
            buf.d();
        } else if (!this.d.d()) {
        } else {
            if (this.d.b(4) && !this.d.b(11)) {
                buf.d("RV PartialInvalidate");
                b();
                this.d.b();
                if (!this.p) {
                    int a = this.e.a();
                    for (int i = 0; i < a; i++) {
                        zk b = b(this.e.b(i));
                        if (b != null && !b.b() && b.s()) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        t();
                    } else {
                        this.d.c();
                    }
                }
                a(true);
                buf.d();
            } else if (this.d.d()) {
                buf.d("RV FullInvalidate");
                t();
                buf.d();
            }
        }
    }

    private boolean a(int i, int i2, MotionEvent motionEvent) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        a();
        if (this.j != null) {
            b();
            g();
            buf.d("RV Scroll");
            if (i != 0) {
                i5 = this.k.a(i, this.c, this.A);
                i3 = i - i5;
            }
            if (i2 != 0) {
                i6 = this.k.b(i2, this.c, this.A);
                i4 = i2 - i6;
            }
            buf.d();
            l();
            h();
            a(false);
        }
        int i7 = i4;
        i4 = i5;
        i5 = i6;
        if (!this.l.isEmpty()) {
            invalidate();
        }
        if (dispatchNestedScroll(i4, i5, i3, i7, this.al)) {
            this.ab -= this.al[0];
            this.ac -= this.al[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) this.al[0], (float) this.al[1]);
            }
            int[] iArr = this.an;
            iArr[0] = iArr[0] + this.al[0];
            iArr = this.an;
            iArr[1] = iArr[1] + this.al[1];
        } else if (kn.a(this) != 2) {
            if (motionEvent != null) {
                float x = motionEvent.getX();
                float f = (float) i3;
                float y = motionEvent.getY();
                float f2 = (float) i7;
                Object obj = null;
                if (f < 0.0f) {
                    c();
                    if (this.u.a((-f) / ((float) getWidth()), 1.0f - (y / ((float) getHeight())))) {
                        obj = 1;
                    }
                } else if (f > 0.0f) {
                    d();
                    if (this.w.a(f / ((float) getWidth()), y / ((float) getHeight()))) {
                        obj = 1;
                    }
                }
                if (f2 < 0.0f) {
                    e();
                    if (this.v.a((-f2) / ((float) getHeight()), x / ((float) getWidth()))) {
                        obj = 1;
                    }
                } else if (f2 > 0.0f) {
                    f();
                    if (this.x.a(f2 / ((float) getHeight()), 1.0f - (x / ((float) getWidth())))) {
                        obj = 1;
                    }
                }
                if (!(obj == null && f == 0.0f && f2 == 0.0f)) {
                    kn.c(this);
                }
            }
            a(i, i2);
        }
        if (!(i4 == 0 && i5 == 0)) {
            c(i4, i5);
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
        if (this.k != null && this.k.c()) {
            return this.k.b(this.A);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        if (this.k != null && this.k.c()) {
            return this.k.d(this.A);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        if (this.k != null && this.k.c()) {
            return this.k.f(this.A);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        if (this.k != null && this.k.d()) {
            return this.k.c(this.A);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        if (this.k != null && this.k.d()) {
            return this.k.e(this.A);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        if (this.k != null && this.k.d()) {
            return this.k.g(this.A);
        }
        return 0;
    }

    public final void b() {
        this.O++;
        if (this.O == 1 && !this.q) {
            this.p = false;
        }
    }

    public final void a(boolean z) {
        if (this.O <= 0) {
            this.O = 1;
        }
        if (!z) {
            this.p = false;
        }
        if (this.O == 1) {
            if (!(!z || !this.p || this.q || this.k == null || this.j == null)) {
                t();
            }
            if (!this.q) {
                this.p = false;
            }
        }
        this.O--;
    }

    private void m() {
        a(0);
        n();
    }

    private final void n() {
        this.z.b();
        if (this.k != null) {
            yz yzVar = this.k;
            if (yzVar.f != null) {
                yzVar.f.a();
            }
        }
    }

    public final void a(int i, int i2) {
        int i3 = 0;
        if (!(this.u == null || this.u.a() || i <= 0)) {
            i3 = this.u.c();
        }
        if (!(this.w == null || this.w.a() || i >= 0)) {
            i3 |= this.w.c();
        }
        if (!(this.v == null || this.v.a() || i2 <= 0)) {
            i3 |= this.v.c();
        }
        if (!(this.x == null || this.x.a() || i2 >= 0)) {
            i3 |= this.x.c();
        }
        if (i3 != 0) {
            kn.c(this);
        }
    }

    public final void c() {
        if (this.u == null) {
            this.u = new nz(getContext());
            if (this.K) {
                this.u.a((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.u.a(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void d() {
        if (this.w == null) {
            this.w = new nz(getContext());
            if (this.K) {
                this.w.a((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.w.a(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void e() {
        if (this.v == null) {
            this.v = new nz(getContext());
            if (this.K) {
                this.v.a((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.v.a(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void f() {
        if (this.x == null) {
            this.x = new nz(getContext());
            if (this.K) {
                this.x.a((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.x.a(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    private void o() {
        this.x = null;
        this.v = null;
        this.w = null;
        this.u = null;
    }

    public View focusSearch(View view, int i) {
        int i2;
        View findNextFocus;
        int i3 = 17;
        int i4 = 0;
        boolean z = true;
        boolean z2 = (this.j == null || this.k == null || j() || this.q) ? false : true;
        FocusFinder instance = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            int i5;
            if (this.k.d()) {
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
            if (!z2 && this.k.c()) {
                if (kn.f(this.k.e) == 1) {
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
                a();
                b();
                this.k.c(i, this.c, this.A);
                a(false);
            }
            findNextFocus = instance.findNextFocus(this, view, i);
        } else {
            View findNextFocus2 = instance.findNextFocus(this, view, i);
            if (findNextFocus2 == null && z2) {
                a();
                b();
                findNextFocus = this.k.c(i, this.c, this.A);
                a(false);
            } else {
                findNextFocus = findNextFocus2;
            }
        }
        if (findNextFocus == null || findNextFocus == this) {
            z = false;
        } else if (view != null) {
            if (i == 2 || i == 1) {
                i2 = kn.f(this.k.e) == 1 ? 1 : 0;
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
        return z ? findNextFocus : super.focusSearch(view, i);
    }

    private final boolean a(View view, View view2, int i) {
        this.h.set(0, 0, view.getWidth(), view.getHeight());
        this.L.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.h);
        offsetDescendantRectToMyCoords(view2, this.L);
        switch (i) {
            case rk.bZ /*17*/:
                if ((this.h.right > this.L.right || this.h.left >= this.L.right) && this.h.left > this.L.left) {
                    return true;
                }
                return false;
            case 33:
                if ((this.h.bottom > this.L.bottom || this.h.top >= this.L.bottom) && this.h.top > this.L.top) {
                    return true;
                }
                return false;
            case 66:
                if ((this.h.left < this.L.left || this.h.right <= this.L.left) && this.h.right < this.L.right) {
                    return true;
                }
                return false;
            case 130:
                if ((this.h.top < this.L.top || this.h.bottom <= this.L.top) && this.h.bottom < this.L.bottom) {
                    return true;
                }
                return false;
            default:
                throw new IllegalArgumentException("direction must be absolute. received:" + i);
        }
    }

    public void requestChildFocus(View view, View view2) {
        int i;
        yz yzVar = this.k;
        if (yzVar.f == null || !yzVar.f.e) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0 || j()) {
            i = 1;
        } else {
            i = 0;
        }
        if (i == 0 && view2 != null) {
            this.h.set(0, 0, view2.getWidth(), view2.getHeight());
            LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof za) {
                za zaVar = (za) layoutParams;
                if (!zaVar.c) {
                    Rect rect = zaVar.b;
                    Rect rect2 = this.h;
                    rect2.left -= rect.left;
                    rect2 = this.h;
                    rect2.right += rect.right;
                    rect2 = this.h;
                    rect2.top -= rect.top;
                    rect2 = this.h;
                    rect2.bottom = rect.bottom + rect2.bottom;
                }
            }
            offsetDescendantRectToMyCoords(view2, this.h);
            offsetRectIntoDescendantCoords(view, this.h);
            requestChildRectangleOnScreen(view, this.h, !this.o);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        yz yzVar = this.k;
        int i = yzVar.i();
        int j = yzVar.j();
        int k = yzVar.l - yzVar.k();
        int l = yzVar.m - yzVar.l();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = left + rect.width();
        int height = top + rect.height();
        int min = Math.min(0, left - i);
        int min2 = Math.min(0, top - j);
        int max = Math.max(0, width - k);
        l = Math.max(0, height - l);
        if (kn.f(yzVar.e) == 1) {
            if (max == 0) {
                max = Math.max(min, width - k);
            }
        } else if (min != 0) {
            max = min;
        } else {
            max = Math.min(left - i, max);
        }
        if (min2 != 0) {
            min = min2;
        } else {
            min = Math.min(top - j, l);
        }
        if (max == 0 && min == 0) {
            return false;
        }
        if (z) {
            scrollBy(max, min);
        } else if (this.k == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.q) {
            if (!this.k.c()) {
                max = 0;
            }
            if (!this.k.d()) {
                min = 0;
            }
            if (!(max == 0 && min == 0)) {
                this.z.a(max, min);
            }
        }
        return true;
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (j()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    protected void onAttachedToWindow() {
        boolean z = true;
        super.onAttachedToWindow();
        this.S = 0;
        this.m = true;
        if (!this.o || isLayoutRequested()) {
            z = false;
        }
        this.o = z;
        this.D = false;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.y != null) {
            this.y.d();
        }
        m();
        this.m = false;
        if (this.k != null) {
            this.k.a(this, this.c);
        }
        removeCallbacks(this.ao);
        do {
        } while (aat.d.a() != null);
    }

    public boolean isAttachedToWindow() {
        return this.m;
    }

    public final void a(String str) {
        if (!j()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
        }
        throw new IllegalStateException(str);
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
            this.N = null;
        }
        int size = this.M.size();
        for (i2 = 0; i2 < size; i2++) {
            i iVar = (i) this.M.get(i2);
            if (iVar.a() && action != 3) {
                this.N = iVar;
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            q();
            return true;
        } else if (this.k == null) {
            return false;
        } else {
            z = this.k.c();
            boolean d = this.k.d();
            if (this.V == null) {
                this.V = VelocityTracker.obtain();
            }
            this.V.addMovement(motionEvent);
            action = jw.a(motionEvent);
            size = jw.b(motionEvent);
            int i3;
            switch (action) {
                case rl.c /*0*/:
                    if (this.P) {
                        this.P = false;
                    }
                    this.U = jw.b(motionEvent, 0);
                    i = (int) (motionEvent.getX() + 0.5f);
                    this.ab = i;
                    this.W = i;
                    i = (int) (motionEvent.getY() + 0.5f);
                    this.ac = i;
                    this.aa = i;
                    if (this.T == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        a(1);
                    }
                    int[] iArr = this.an;
                    this.an[1] = 0;
                    iArr[0] = 0;
                    if (z) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if (d) {
                        i3 |= 2;
                    }
                    startNestedScroll(i3);
                    break;
                case rq.b /*1*/:
                    this.V.clear();
                    stopNestedScroll();
                    break;
                case rq.c /*2*/:
                    action = jw.a(motionEvent, this.U);
                    if (action >= 0) {
                        size = (int) (jw.c(motionEvent, action) + 0.5f);
                        action = (int) (jw.d(motionEvent, action) + 0.5f);
                        if (this.T != 1) {
                            size -= this.W;
                            action -= this.aa;
                            if (!z || Math.abs(size) <= this.ad) {
                                z = false;
                            } else {
                                this.ab = ((size < 0 ? -1 : 1) * this.ad) + this.W;
                                z = true;
                            }
                            if (d && Math.abs(action) > this.ad) {
                                i3 = this.aa;
                                i2 = this.ad;
                                if (action >= 0) {
                                    i = 1;
                                }
                                this.ac = i3 + (i * i2);
                                z = true;
                            }
                            if (z) {
                                a(1);
                                break;
                            }
                        }
                    }
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.U + " not found. Did any MotionEvents get skipped?");
                    return false;
                    break;
                case rl.e /*3*/:
                    q();
                    break;
                case rl.g /*5*/:
                    this.U = jw.b(motionEvent, size);
                    i3 = (int) (jw.c(motionEvent, size) + 0.5f);
                    this.ab = i3;
                    this.W = i3;
                    i3 = (int) (jw.d(motionEvent, size) + 0.5f);
                    this.ac = i3;
                    this.aa = i3;
                    break;
                case rl.i /*6*/:
                    a(motionEvent);
                    break;
            }
            if (this.T != 1) {
                return false;
            }
            return true;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            this.M.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
        r12 = this;
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r2 = 0;
        r11 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r9 = 1;
        r1 = 0;
        r0 = r12.q;
        if (r0 != 0) goto L_0x000f;
    L_0x000b:
        r0 = r12.P;
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r0 = r13.getAction();
        r3 = r12.N;
        if (r3 == 0) goto L_0x001d;
    L_0x0018:
        if (r0 != 0) goto L_0x0040;
    L_0x001a:
        r3 = 0;
        r12.N = r3;
    L_0x001d:
        if (r0 == 0) goto L_0x004e;
    L_0x001f:
        r0 = r12.M;
        r4 = r0.size();
        r3 = r1;
    L_0x0026:
        if (r3 >= r4) goto L_0x004e;
    L_0x0028:
        r0 = r12.M;
        r0 = r0.get(r3);
        r0 = (i) r0;
        r6 = r0.a();
        if (r6 == 0) goto L_0x004a;
    L_0x0036:
        r12.N = r0;
        r0 = r9;
    L_0x0039:
        if (r0 == 0) goto L_0x0050;
    L_0x003b:
        r12.q();
        r1 = r9;
        goto L_0x000f;
    L_0x0040:
        r3 = 3;
        if (r0 == r3) goto L_0x0045;
    L_0x0043:
        if (r0 != r9) goto L_0x0048;
    L_0x0045:
        r0 = 0;
        r12.N = r0;
    L_0x0048:
        r0 = r9;
        goto L_0x0039;
    L_0x004a:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0026;
    L_0x004e:
        r0 = r1;
        goto L_0x0039;
    L_0x0050:
        r0 = r12.k;
        if (r0 == 0) goto L_0x000f;
    L_0x0054:
        r0 = r12.k;
        r4 = r0.c();
        r0 = r12.k;
        r6 = r0.d();
        r0 = r12.V;
        if (r0 != 0) goto L_0x006a;
    L_0x0064:
        r0 = android.view.VelocityTracker.obtain();
        r12.V = r0;
    L_0x006a:
        r10 = android.view.MotionEvent.obtain(r13);
        r0 = jw.a(r13);
        r3 = jw.b(r13);
        if (r0 != 0) goto L_0x0080;
    L_0x0078:
        r7 = r12.an;
        r8 = r12.an;
        r8[r9] = r1;
        r7[r1] = r1;
    L_0x0080:
        r7 = r12.an;
        r7 = r7[r1];
        r7 = (float) r7;
        r8 = r12.an;
        r8 = r8[r9];
        r8 = (float) r8;
        r10.offsetLocation(r7, r8);
        switch(r0) {
            case 0: goto L_0x009d;
            case 1: goto L_0x01ae;
            case 2: goto L_0x00dd;
            case 3: goto L_0x0272;
            case 4: goto L_0x0090;
            case 5: goto L_0x00c2;
            case 6: goto L_0x01a9;
            default: goto L_0x0090;
        };
    L_0x0090:
        if (r1 != 0) goto L_0x0097;
    L_0x0092:
        r0 = r12.V;
        r0.addMovement(r10);
    L_0x0097:
        r10.recycle();
        r1 = r9;
        goto L_0x000f;
    L_0x009d:
        r0 = jw.b(r13, r1);
        r12.U = r0;
        r0 = r13.getX();
        r0 = r0 + r11;
        r0 = (int) r0;
        r12.ab = r0;
        r12.W = r0;
        r0 = r13.getY();
        r0 = r0 + r11;
        r0 = (int) r0;
        r12.ac = r0;
        r12.aa = r0;
        if (r4 == 0) goto L_0x027e;
    L_0x00b9:
        r0 = r9;
    L_0x00ba:
        if (r6 == 0) goto L_0x00be;
    L_0x00bc:
        r0 = r0 | 2;
    L_0x00be:
        r12.startNestedScroll(r0);
        goto L_0x0090;
    L_0x00c2:
        r0 = jw.b(r13, r3);
        r12.U = r0;
        r0 = jw.c(r13, r3);
        r0 = r0 + r11;
        r0 = (int) r0;
        r12.ab = r0;
        r12.W = r0;
        r0 = jw.d(r13, r3);
        r0 = r0 + r11;
        r0 = (int) r0;
        r12.ac = r0;
        r12.aa = r0;
        goto L_0x0090;
    L_0x00dd:
        r0 = r12.U;
        r0 = jw.a(r13, r0);
        if (r0 >= 0) goto L_0x0103;
    L_0x00e5:
        r0 = "RecyclerView";
        r2 = new java.lang.StringBuilder;
        r3 = "Error processing scroll; pointer index for id ";
        r2.<init>(r3);
        r3 = r12.U;
        r2 = r2.append(r3);
        r3 = " not found. Did any MotionEvents get skipped?";
        r2 = r2.append(r3);
        r2 = r2.toString();
        android.util.Log.e(r0, r2);
        goto L_0x000f;
    L_0x0103:
        r2 = jw.c(r13, r0);
        r2 = r2 + r11;
        r5 = (int) r2;
        r0 = jw.d(r13, r0);
        r0 = r0 + r11;
        r7 = (int) r0;
        r0 = r12.ab;
        r2 = r0 - r5;
        r0 = r12.ac;
        r0 = r0 - r7;
        r3 = r12.am;
        r8 = r12.al;
        r3 = r12.dispatchNestedPreScroll(r2, r0, r3, r8);
        if (r3 == 0) goto L_0x014d;
    L_0x0120:
        r3 = r12.am;
        r3 = r3[r1];
        r2 = r2 - r3;
        r3 = r12.am;
        r3 = r3[r9];
        r0 = r0 - r3;
        r3 = r12.al;
        r3 = r3[r1];
        r3 = (float) r3;
        r8 = r12.al;
        r8 = r8[r9];
        r8 = (float) r8;
        r10.offsetLocation(r3, r8);
        r3 = r12.an;
        r8 = r3[r1];
        r11 = r12.al;
        r11 = r11[r1];
        r8 = r8 + r11;
        r3[r1] = r8;
        r3 = r12.an;
        r8 = r3[r9];
        r11 = r12.al;
        r11 = r11[r9];
        r8 = r8 + r11;
        r3[r9] = r8;
    L_0x014d:
        r3 = r12.T;
        if (r3 == r9) goto L_0x0176;
    L_0x0151:
        if (r4 == 0) goto L_0x027b;
    L_0x0153:
        r3 = java.lang.Math.abs(r2);
        r8 = r12.ad;
        if (r3 <= r8) goto L_0x027b;
    L_0x015b:
        if (r2 <= 0) goto L_0x019d;
    L_0x015d:
        r3 = r12.ad;
        r2 = r2 - r3;
    L_0x0160:
        r3 = r9;
    L_0x0161:
        if (r6 == 0) goto L_0x0171;
    L_0x0163:
        r8 = java.lang.Math.abs(r0);
        r11 = r12.ad;
        if (r8 <= r11) goto L_0x0171;
    L_0x016b:
        if (r0 <= 0) goto L_0x01a1;
    L_0x016d:
        r3 = r12.ad;
        r0 = r0 - r3;
    L_0x0170:
        r3 = r9;
    L_0x0171:
        if (r3 == 0) goto L_0x0176;
    L_0x0173:
        r12.a(r9);
    L_0x0176:
        r3 = r12.T;
        if (r3 != r9) goto L_0x0090;
    L_0x017a:
        r3 = r12.al;
        r3 = r3[r1];
        r3 = r5 - r3;
        r12.ab = r3;
        r3 = r12.al;
        r3 = r3[r9];
        r3 = r7 - r3;
        r12.ac = r3;
        if (r4 == 0) goto L_0x01a5;
    L_0x018c:
        if (r6 == 0) goto L_0x01a7;
    L_0x018e:
        r0 = r12.a(r2, r0, r10);
        if (r0 == 0) goto L_0x0090;
    L_0x0194:
        r0 = r12.getParent();
        r0.requestDisallowInterceptTouchEvent(r9);
        goto L_0x0090;
    L_0x019d:
        r3 = r12.ad;
        r2 = r2 + r3;
        goto L_0x0160;
    L_0x01a1:
        r3 = r12.ad;
        r0 = r0 + r3;
        goto L_0x0170;
    L_0x01a5:
        r2 = r1;
        goto L_0x018c;
    L_0x01a7:
        r0 = r1;
        goto L_0x018e;
    L_0x01a9:
        r12.a(r13);
        goto L_0x0090;
    L_0x01ae:
        r0 = r12.V;
        r0.addMovement(r10);
        r0 = r12.V;
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r7 = r12.af;
        r7 = (float) r7;
        r0.computeCurrentVelocity(r3, r7);
        if (r4 == 0) goto L_0x01f5;
    L_0x01bf:
        r0 = r12.V;
        r3 = r12.U;
        r0 = kj.a(r0, r3);
        r0 = -r0;
        r3 = r0;
    L_0x01c9:
        if (r6 == 0) goto L_0x01f7;
    L_0x01cb:
        r0 = r12.V;
        r4 = r12.U;
        r0 = kj.b(r0, r4);
        r0 = -r0;
    L_0x01d4:
        r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x01dc;
    L_0x01d8:
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x01ec;
    L_0x01dc:
        r2 = (int) r3;
        r0 = (int) r0;
        r3 = r12.k;
        if (r3 != 0) goto L_0x01f9;
    L_0x01e2:
        r0 = "RecyclerView";
        r2 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.";
        android.util.Log.e(r0, r2);
    L_0x01e9:
        r0 = r1;
    L_0x01ea:
        if (r0 != 0) goto L_0x01ef;
    L_0x01ec:
        r12.a(r1);
    L_0x01ef:
        r12.p();
        r1 = r9;
        goto L_0x0090;
    L_0x01f5:
        r3 = r2;
        goto L_0x01c9;
    L_0x01f7:
        r0 = r2;
        goto L_0x01d4;
    L_0x01f9:
        r3 = r12.q;
        if (r3 != 0) goto L_0x01e9;
    L_0x01fd:
        r3 = r12.k;
        r4 = r3.c();
        r3 = r12.k;
        r6 = r3.d();
        if (r4 == 0) goto L_0x0213;
    L_0x020b:
        r3 = java.lang.Math.abs(r2);
        r7 = r12.ae;
        if (r3 >= r7) goto L_0x0279;
    L_0x0213:
        r3 = r1;
    L_0x0214:
        if (r6 == 0) goto L_0x021e;
    L_0x0216:
        r2 = java.lang.Math.abs(r0);
        r7 = r12.ae;
        if (r2 >= r7) goto L_0x0277;
    L_0x021e:
        r2 = r1;
    L_0x021f:
        if (r3 != 0) goto L_0x0223;
    L_0x0221:
        if (r2 == 0) goto L_0x01e9;
    L_0x0223:
        r0 = (float) r3;
        r7 = (float) r2;
        r0 = r12.dispatchNestedPreFling(r0, r7);
        if (r0 != 0) goto L_0x01e9;
    L_0x022b:
        if (r4 != 0) goto L_0x022f;
    L_0x022d:
        if (r6 == 0) goto L_0x0270;
    L_0x022f:
        r0 = r9;
    L_0x0230:
        r4 = (float) r3;
        r6 = (float) r2;
        r12.dispatchNestedFling(r4, r6, r0);
        if (r0 == 0) goto L_0x01e9;
    L_0x0237:
        r0 = r12.af;
        r0 = -r0;
        r4 = r12.af;
        r3 = java.lang.Math.min(r3, r4);
        r3 = java.lang.Math.max(r0, r3);
        r0 = r12.af;
        r0 = -r0;
        r4 = r12.af;
        r2 = java.lang.Math.min(r2, r4);
        r4 = java.lang.Math.max(r0, r2);
        r11 = r12.z;
        r0 = r11.d;
        r2 = 2;
        r0.a(r2);
        r11.b = r1;
        r11.a = r1;
        r0 = r11.c;
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r2 = r1;
        r7 = r5;
        r0.a(r1, r2, r3, r4, r5, r6, r7, r8);
        r11.a();
        r0 = r9;
        goto L_0x01ea;
    L_0x0270:
        r0 = r1;
        goto L_0x0230;
    L_0x0272:
        r12.q();
        goto L_0x0090;
    L_0x0277:
        r2 = r0;
        goto L_0x021f;
    L_0x0279:
        r3 = r2;
        goto L_0x0214;
    L_0x027b:
        r3 = r1;
        goto L_0x0161;
    L_0x027e:
        r0 = r1;
        goto L_0x00ba;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private final void p() {
        if (this.V != null) {
            this.V.clear();
        }
        stopNestedScroll();
        int i = 0;
        if (this.u != null) {
            i = this.u.c();
        }
        if (this.v != null) {
            i |= this.v.c();
        }
        if (this.w != null) {
            i |= this.w.c();
        }
        if (this.x != null) {
            i |= this.x.c();
        }
        if (i != 0) {
            kn.c(this);
        }
    }

    private final void q() {
        p();
        a(0);
    }

    private final void a(MotionEvent motionEvent) {
        int b = jw.b(motionEvent);
        if (jw.b(motionEvent, b) == this.U) {
            b = b == 0 ? 1 : 0;
            this.U = jw.b(motionEvent, b);
            int c = (int) (jw.c(motionEvent, b) + 0.5f);
            this.ab = c;
            this.W = c;
            b = (int) (jw.d(motionEvent, b) + 0.5f);
            this.ac = b;
            this.aa = b;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f = 0.0f;
        if (!(this.k == null || this.q || (jw.d(motionEvent) & 2) == 0 || motionEvent.getAction() != 8)) {
            float f2;
            float e;
            if (this.k.d()) {
                f2 = -jw.e(motionEvent, 9);
            } else {
                f2 = 0.0f;
            }
            if (this.k.c()) {
                e = jw.e(motionEvent, 10);
            } else {
                e = 0.0f;
            }
            if (!(f2 == 0.0f && e == 0.0f)) {
                if (this.ag == Float.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (getContext().getTheme().resolveAttribute(16842829, typedValue, true)) {
                        this.ag = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
                    }
                    a((int) (e * f), (int) (f2 * f), motionEvent);
                }
                f = this.ag;
                a((int) (e * f), (int) (f2 * f), motionEvent);
            }
        }
        return false;
    }

    protected void onMeasure(int i, int i2) {
        boolean z = false;
        if (this.k == null) {
            b(i, i2);
        } else if (this.k.h) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.k.c(i, i2);
            if (!z && this.j != null) {
                if (this.A.b == 1) {
                    v();
                }
                this.k.a(i, i2);
                w();
                this.k.b(i, i2);
                if (this.k.e()) {
                    this.k.a(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    w();
                    this.k.b(i, i2);
                }
            }
        } else if (this.n) {
            this.k.c(i, i2);
        } else {
            if (this.r) {
                b();
                s();
                if (this.A.i) {
                    this.A.g = true;
                } else {
                    this.d.e();
                    this.A.g = false;
                }
                this.r = false;
                a(false);
            }
            if (this.j != null) {
                this.A.c = this.j.a();
            } else {
                this.A.c = 0;
            }
            b();
            this.k.c(i, i2);
            a(false);
            this.A.g = false;
        }
    }

    public final void b(int i, int i2) {
        setMeasuredDimension(yz.a(i, getPaddingLeft() + getPaddingRight(), kn.j(this)), yz.a(i2, getPaddingTop() + getPaddingBottom(), kn.k(this)));
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            o();
        }
    }

    public final void g() {
        this.S++;
    }

    public final void h() {
        this.S--;
        if (this.S <= 0) {
            this.S = 0;
            int i = this.Q;
            this.Q = 0;
            if (i != 0 && i()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(2048);
                ml.a(obtain, i);
                sendAccessibilityEventUnchecked(obtain);
            }
        }
    }

    public final boolean i() {
        return this.R != null && this.R.isEnabled();
    }

    public final boolean j() {
        return this.S > 0;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (j()) {
            int a;
            if (accessibilityEvent != null) {
                a = ml.a.a(accessibilityEvent);
            } else {
                a = 0;
            }
            if (a != 0) {
                i = a;
            }
            this.Q = i | this.Q;
            i = 1;
        }
        if (i == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public final void k() {
        if (!this.D && this.m) {
            kn.a((View) this, this.ao);
            this.D = true;
        }
    }

    private final boolean r() {
        return this.y != null && this.k.f();
    }

    private final void s() {
        boolean z;
        boolean z2 = true;
        if (this.t) {
            this.d.a();
            y();
        }
        if (r()) {
            this.d.b();
        } else {
            this.d.e();
        }
        boolean z3;
        if (this.B || this.C) {
            z3 = true;
        } else {
            z3 = false;
        }
        zi ziVar = this.A;
        if (!this.o || this.y == null || (!(this.t || r0 || this.k.g) || (this.t && !this.j.b))) {
            z = false;
        } else {
            z = true;
        }
        ziVar.h = z;
        zi ziVar2 = this.A;
        if (!(this.A.h && r0 && !this.t && r())) {
            z2 = false;
        }
        ziVar2.i = z2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t() {
        /*
        r10 = this;
        r0 = r10.j;
        if (r0 != 0) goto L_0x000c;
    L_0x0004:
        r0 = "RecyclerView";
        r1 = "No adapter attached; skipping layout";
        android.util.Log.e(r0, r1);
    L_0x000b:
        return;
    L_0x000c:
        r0 = r10.k;
        if (r0 != 0) goto L_0x0018;
    L_0x0010:
        r0 = "RecyclerView";
        r1 = "No layout manager attached; skipping layout";
        android.util.Log.e(r0, r1);
        goto L_0x000b;
    L_0x0018:
        r0 = r10.A;
        r0 = r0.b;
        r1 = 1;
        if (r0 != r1) goto L_0x00a6;
    L_0x001f:
        r10.v();
        r0 = r10.k;
        r0.b(r10);
        r10.w();
    L_0x002a:
        r0 = r10.A;
        r1 = 4;
        r0.a(r1);
        r10.b();
        r10.g();
        r0 = r10.A;
        r1 = 1;
        r0.b = r1;
        r0 = r10.A;
        r0 = r0.h;
        if (r0 == 0) goto L_0x01ac;
    L_0x0041:
        r0 = r10.e;
        r0 = r0.a();
        r0 = r0 + -1;
        r1 = r0;
    L_0x004a:
        if (r1 < 0) goto L_0x01a5;
    L_0x004c:
        r0 = r10.e;
        r0 = r0.b(r1);
        r3 = b(r0);
        r0 = r3.b();
        if (r0 != 0) goto L_0x00a2;
    L_0x005c:
        r4 = r10.c(r3);
        r0 = r10.y;
        r2 = new yx;
        r2.<init>();
        r0 = r3.a;
        r6 = r0.getLeft();
        r2.a = r6;
        r6 = r0.getTop();
        r2.b = r6;
        r0.getRight();
        r0.getBottom();
        r0 = r10.f;
        r0 = r0.b;
        r0 = r0.a(r4);
        r0 = (zk) r0;
        if (r0 == 0) goto L_0x019e;
    L_0x0087:
        r6 = r0.b();
        if (r6 != 0) goto L_0x019e;
    L_0x008d:
        r6 = r10.f;
        r6 = r6.a(r0);
        r7 = r10.f;
        r7 = r7.a(r3);
        if (r6 == 0) goto L_0x00d3;
    L_0x009b:
        if (r0 != r3) goto L_0x00d3;
    L_0x009d:
        r0 = r10.f;
        r0.b(r3, r2);
    L_0x00a2:
        r0 = r1 + -1;
        r1 = r0;
        goto L_0x004a;
    L_0x00a6:
        r0 = r10.d;
        r0 = r0.f();
        if (r0 != 0) goto L_0x00c2;
    L_0x00ae:
        r0 = r10.k;
        r0 = r0.l;
        r1 = r10.getWidth();
        if (r0 != r1) goto L_0x00c2;
    L_0x00b8:
        r0 = r10.k;
        r0 = r0.m;
        r1 = r10.getHeight();
        if (r0 == r1) goto L_0x00cc;
    L_0x00c2:
        r0 = r10.k;
        r0.b(r10);
        r10.w();
        goto L_0x002a;
    L_0x00cc:
        r0 = r10.k;
        r0.b(r10);
        goto L_0x002a;
    L_0x00d3:
        r8 = r10.f;
        r9 = 4;
        r8 = r8.a(r0, r9);
        r9 = r10.f;
        r9.b(r3, r2);
        r2 = r10.f;
        r9 = 8;
        r2 = r2.a(r3, r9);
        if (r8 != 0) goto L_0x0171;
    L_0x00e9:
        r2 = r10.e;
        r6 = r2.a();
        r2 = 0;
    L_0x00f0:
        if (r2 >= r6) goto L_0x0151;
    L_0x00f2:
        r7 = r10.e;
        r7 = r7.b(r2);
        r7 = b(r7);
        if (r7 == r3) goto L_0x014e;
    L_0x00fe:
        r8 = r10.c(r7);
        r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r8 != 0) goto L_0x014e;
    L_0x0106:
        r0 = r10.j;
        if (r0 == 0) goto L_0x012f;
    L_0x010a:
        r0 = r10.j;
        r0 = r0.b;
        if (r0 == 0) goto L_0x012f;
    L_0x0110:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:";
        r1.<init>(r2);
        r1 = r1.append(r7);
        r2 = " \n View Holder 2:";
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x012f:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:";
        r1.<init>(r2);
        r1 = r1.append(r7);
        r2 = " \n View Holder 2:";
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x014e:
        r2 = r2 + 1;
        goto L_0x00f0;
    L_0x0151:
        r2 = "RecyclerView";
        r4 = new java.lang.StringBuilder;
        r5 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder ";
        r4.<init>(r5);
        r0 = r4.append(r0);
        r4 = " cannot be found but it is necessary for ";
        r0 = r0.append(r4);
        r0 = r0.append(r3);
        r0 = r0.toString();
        android.util.Log.e(r2, r0);
        goto L_0x00a2;
    L_0x0171:
        r4 = 0;
        r0.a(r4);
        if (r6 == 0) goto L_0x017a;
    L_0x0177:
        r10.a(r0);
    L_0x017a:
        if (r0 == r3) goto L_0x0191;
    L_0x017c:
        if (r7 == 0) goto L_0x0181;
    L_0x017e:
        r10.a(r3);
    L_0x0181:
        r0.g = r3;
        r10.a(r0);
        r4 = r10.c;
        r4.b(r0);
        r4 = 0;
        r3.a(r4);
        r3.h = r0;
    L_0x0191:
        r4 = r10.y;
        r0 = r4.a(r0, r3, r8, r2);
        if (r0 == 0) goto L_0x00a2;
    L_0x0199:
        r10.k();
        goto L_0x00a2;
    L_0x019e:
        r0 = r10.f;
        r0.b(r3, r2);
        goto L_0x00a2;
    L_0x01a5:
        r0 = r10.f;
        r1 = r10.ap;
        r0.a(r1);
    L_0x01ac:
        r0 = r10.k;
        r1 = r10.c;
        r0.a(r1);
        r0 = r10.A;
        r1 = r10.A;
        r1 = r1.c;
        r0.d = r1;
        r0 = 0;
        r10.t = r0;
        r0 = r10.A;
        r1 = 0;
        r0.h = r1;
        r0 = r10.A;
        r1 = 0;
        r0.i = r1;
        r0 = r10.k;
        r1 = 0;
        r0.g = r1;
        r0 = r10.c;
        r0 = r0.b;
        if (r0 == 0) goto L_0x01da;
    L_0x01d3:
        r0 = r10.c;
        r0 = r0.b;
        r0.clear();
    L_0x01da:
        r0 = r10.k;
        r1 = r10.A;
        r0.a(r1);
        r10.h();
        r0 = 0;
        r10.a(r0);
        r0 = r10.f;
        r0.a();
        r0 = r10.aj;
        r1 = 0;
        r0 = r0[r1];
        r1 = r10.aj;
        r2 = 1;
        r1 = r1[r2];
        r2 = r10.e;
        r2 = r2.a();
        if (r2 != 0) goto L_0x0220;
    L_0x01ff:
        if (r0 != 0) goto L_0x0203;
    L_0x0201:
        if (r1 == 0) goto L_0x021e;
    L_0x0203:
        r0 = 1;
    L_0x0204:
        if (r0 == 0) goto L_0x020b;
    L_0x0206:
        r0 = 0;
        r1 = 0;
        r10.c(r0, r1);
    L_0x020b:
        r0 = r10.ah;
        if (r0 == 0) goto L_0x0219;
    L_0x020f:
        r0 = r10.j;
        if (r0 == 0) goto L_0x0219;
    L_0x0213:
        r0 = r10.hasFocus();
        if (r0 != 0) goto L_0x0237;
    L_0x0219:
        r10.u();
        goto L_0x000b;
    L_0x021e:
        r0 = 0;
        goto L_0x0204;
    L_0x0220:
        r2 = r10.aj;
        r10.a(r2);
        r2 = r10.aj;
        r3 = 0;
        r2 = r2[r3];
        if (r2 != r0) goto L_0x0233;
    L_0x022c:
        r0 = r10.aj;
        r2 = 1;
        r0 = r0[r2];
        if (r0 == r1) goto L_0x0235;
    L_0x0233:
        r0 = 1;
        goto L_0x0204;
    L_0x0235:
        r0 = 0;
        goto L_0x0204;
    L_0x0237:
        r0 = r10.isFocused();
        if (r0 != 0) goto L_0x024b;
    L_0x023d:
        r0 = r10.getFocusedChild();
        if (r0 == 0) goto L_0x0219;
    L_0x0243:
        r1 = r10.e;
        r0 = r1.d(r0);
        if (r0 == 0) goto L_0x0219;
    L_0x024b:
        r0 = 0;
        r1 = r10.A;
        r1 = r1.k;
        r2 = -1;
        if (r1 == r2) goto L_0x025b;
    L_0x0253:
        r0 = r10.A;
        r0 = r0.k;
        r0 = r10.c(r0);
    L_0x025b:
        if (r0 != 0) goto L_0x0275;
    L_0x025d:
        r1 = r10.A;
        r2 = r1.l;
        r4 = -1;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 == 0) goto L_0x0275;
    L_0x0267:
        r1 = r10.j;
        r1 = r1.b;
        if (r1 == 0) goto L_0x0275;
    L_0x026d:
        r0 = r10.A;
        r0 = r0.l;
        r0 = r10.a(r0);
    L_0x0275:
        if (r0 == 0) goto L_0x0219;
    L_0x0277:
        r1 = r0.a;
        r1 = r1.hasFocus();
        if (r1 != 0) goto L_0x0219;
    L_0x027f:
        r1 = r0.a;
        r1 = r1.hasFocusable();
        if (r1 == 0) goto L_0x0219;
    L_0x0287:
        r1 = r0.a;
        r2 = r10.A;
        r2 = r2.m;
        r2 = (long) r2;
        r4 = -1;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x02ab;
    L_0x0294:
        r0 = r0.a;
        r2 = r10.A;
        r2 = r2.m;
        r0 = r0.findViewById(r2);
        if (r0 == 0) goto L_0x02ab;
    L_0x02a0:
        r2 = r0.isFocusable();
        if (r2 == 0) goto L_0x02ab;
    L_0x02a6:
        r0.requestFocus();
        goto L_0x0219;
    L_0x02ab:
        r0 = r1;
        goto L_0x02a6;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.t():void");
    }

    private final void u() {
        this.A.l = -1;
        this.A.k = -1;
        this.A.m = -1;
    }

    private final void v() {
        View focusedChild;
        zk zkVar;
        View view;
        zi ziVar;
        int i;
        int id;
        boolean z;
        this.A.a(1);
        b();
        this.f.a();
        g();
        if (this.ah && hasFocus() && this.j != null) {
            focusedChild = getFocusedChild();
        } else {
            focusedChild = null;
        }
        if (focusedChild == null) {
            zkVar = null;
        } else {
            RecyclerView parent = focusedChild.getParent();
            while (parent != null && parent != this && (parent instanceof View)) {
                view = parent;
                focusedChild = view;
                ViewParent parent2 = view.getParent();
            }
            view = parent == this ? focusedChild : null;
            zkVar = view == null ? null : a(view);
        }
        if (zkVar == null) {
            u();
        } else {
            long j;
            zi ziVar2 = this.A;
            if (this.j.b) {
                j = zkVar.d;
            } else {
                j = -1;
            }
            ziVar2.l = j;
            ziVar = this.A;
            if (this.t) {
                i = -1;
            } else {
                i = zkVar.d();
            }
            ziVar.k = i;
            ziVar2 = this.A;
            View view2 = zkVar.a;
            view = view2;
            id = view2.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                focusedChild = ((ViewGroup) view).getFocusedChild();
                if (focusedChild.getId() != -1) {
                    i = focusedChild.getId();
                } else {
                    i = id;
                }
                id = i;
                view = focusedChild;
            }
            ziVar2.m = id;
        }
        s();
        ziVar = this.A;
        if (this.A.h && this.C) {
            z = true;
        } else {
            z = false;
        }
        ziVar.j = z;
        this.C = false;
        this.B = false;
        this.A.g = this.A.i;
        this.A.c = this.j.a();
        a(this.aj);
        if (this.A.h) {
            id = this.e.a();
            for (i = 0; i < id; i++) {
                zkVar = b(this.e.b(i));
                if (!zkVar.b() && (!zkVar.j() || this.j.b)) {
                    yv yvVar = this.y;
                    yv.d(zkVar);
                    zkVar.p();
                    yx yxVar = new yx();
                    View view3 = zkVar.a;
                    yxVar.a = view3.getLeft();
                    yxVar.b = view3.getTop();
                    view3.getRight();
                    view3.getBottom();
                    this.f.a(zkVar, yxVar);
                    if (!(!this.A.j || !zkVar.s() || zkVar.m() || zkVar.b() || zkVar.j())) {
                        this.f.a(c(zkVar), zkVar);
                    }
                }
            }
        }
        if (this.A.i) {
            id = this.e.b();
            for (i = 0; i < id; i++) {
                zkVar = b(this.e.c(i));
                if (!zkVar.b() && zkVar.c == -1) {
                    zkVar.c = zkVar.b;
                }
            }
            z = this.A.f;
            this.A.f = false;
            this.k.a(this.c, this.A);
            this.A.f = z;
            for (id = 0; id < this.e.a(); id++) {
                zk b = b(this.e.b(id));
                if (!b.b()) {
                    aat aat = (aat) this.f.a.get(b);
                    if (aat == null || (aat.a & 4) == 0) {
                        z = false;
                    } else {
                        i = 1;
                    }
                    if (i == 0) {
                        yv.d(b);
                        z = b.a(8192);
                        yv yvVar2 = this.y;
                        b.p();
                        yx yxVar2 = new yx();
                        View view4 = b.a;
                        yxVar2.a = view4.getLeft();
                        yxVar2.b = view4.getTop();
                        view4.getRight();
                        view4.getBottom();
                        if (z) {
                            a(b, yxVar2);
                        } else {
                            aas aas = this.f;
                            aat = (aat) aas.a.get(b);
                            if (aat == null) {
                                aat = aat.a();
                                aas.a.put(b, aat);
                            }
                            aat.a |= 2;
                            aat.b = yxVar2;
                        }
                    }
                }
            }
            x();
        } else {
            x();
        }
        h();
        a(false);
        this.A.b = 2;
    }

    private final void w() {
        boolean z;
        b();
        g();
        this.A.a(6);
        this.d.e();
        this.A.c = this.j.a();
        this.A.e = 0;
        this.A.g = false;
        this.k.a(this.c, this.A);
        this.A.f = false;
        this.J = null;
        zi ziVar = this.A;
        if (!this.A.h || this.y == null) {
            z = false;
        } else {
            z = true;
        }
        ziVar.h = z;
        this.A.b = 4;
        h();
        a(false);
    }

    public final void a(zk zkVar, yx yxVar) {
        zkVar.a(0, 8192);
        if (this.A.j && zkVar.s() && !zkVar.m() && !zkVar.b()) {
            this.f.a(c(zkVar), zkVar);
        }
        this.f.a(zkVar, yxVar);
    }

    private final void a(int[] iArr) {
        int a = this.e.a();
        if (a == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = oe.INVALID_ID;
        int i3 = 0;
        while (i3 < a) {
            int c;
            zk b = b(this.e.b(i3));
            if (!b.b()) {
                c = b.c();
                if (c < i) {
                    i = c;
                }
                if (c > i2) {
                    i2 = i;
                    i3++;
                    i = i2;
                    i2 = c;
                }
            }
            c = i2;
            i2 = i;
            i3++;
            i = i2;
            i2 = c;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void removeDetachedView(View view, boolean z) {
        zk b = b(view);
        if (b != null) {
            if (b.n()) {
                b.i();
            } else if (!b.b()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + b);
            }
        }
        e(view);
        super.removeDetachedView(view, z);
    }

    private long c(zk zkVar) {
        if (this.j.b) {
            return zkVar.d;
        }
        return (long) zkVar.b;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        buf.d("RV OnLayout");
        t();
        buf.d();
        this.o = true;
    }

    public void requestLayout() {
        if (this.O != 0 || this.q) {
            this.p = true;
        } else {
            super.requestLayout();
        }
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
        if (this.u == null || this.u.a()) {
            i = 0;
        } else {
            size = canvas.save();
            i = this.K ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) (i + (-getHeight())), 0.0f);
            if (this.u == null || !this.u.a(canvas)) {
                i = 0;
            } else {
                i = 1;
            }
            canvas.restoreToCount(size);
        }
        if (!(this.v == null || this.v.a())) {
            int save = canvas.save();
            if (this.K) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            if (this.v == null || !this.v.a(canvas)) {
                size = 0;
            } else {
                size = 1;
            }
            i |= size;
            canvas.restoreToCount(save);
        }
        if (!(this.w == null || this.w.a())) {
            save = canvas.save();
            int width = getWidth();
            if (this.K) {
                size = getPaddingTop();
            } else {
                size = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) (-size), (float) (-width));
            if (this.w == null || !this.w.a(canvas)) {
                size = 0;
            } else {
                size = 1;
            }
            i |= size;
            canvas.restoreToCount(save);
        }
        if (!(this.x == null || this.x.a())) {
            size = canvas.save();
            canvas.rotate(180.0f);
            if (this.K) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            if (this.x != null && this.x.a(canvas)) {
                i3 = 1;
            }
            i |= i3;
            canvas.restoreToCount(size);
        }
        if (i != 0 || this.y == null || this.l.size() <= 0 || !this.y.b()) {
            i2 = i;
        }
        if (i2 != 0) {
            kn.c(this);
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
        if (layoutParams instanceof za) {
            boolean z;
            if (((za) layoutParams) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public LayoutParams generateDefaultLayoutParams() {
        if (this.k != null) {
            return this.k.a();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.k != null) {
            return new za(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (this.k == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else if (layoutParams instanceof za) {
            return new za((za) layoutParams);
        } else {
            if (layoutParams instanceof MarginLayoutParams) {
                return new za((MarginLayoutParams) layoutParams);
            }
            return new za(layoutParams);
        }
    }

    private void x() {
        int i = 0;
        int b = this.e.b();
        for (int i2 = 0; i2 < b; i2++) {
            zk b2 = b(this.e.c(i2));
            if (!b2.b()) {
                b2.a();
            }
        }
        zc zcVar = this.c;
        int size = zcVar.c.size();
        for (b = 0; b < size; b++) {
            ((zk) zcVar.c.get(b)).a();
        }
        size = zcVar.a.size();
        for (b = 0; b < size; b++) {
            ((zk) zcVar.a.get(b)).a();
        }
        if (zcVar.b != null) {
            b = zcVar.b.size();
            while (i < b) {
                ((zk) zcVar.b.get(i)).a();
                i++;
            }
        }
    }

    public final void a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.e.b();
        for (int i4 = 0; i4 < b; i4++) {
            zk b2 = b(this.e.c(i4));
            if (!(b2 == null || b2.b())) {
                if (b2.b >= i3) {
                    b2.a(-i2, z);
                    this.A.f = true;
                } else if (b2.b >= i) {
                    int i5 = i - 1;
                    int i6 = -i2;
                    b2.b(8);
                    b2.a(i6, z);
                    b2.b = i5;
                    this.A.f = true;
                }
            }
        }
        zc zcVar = this.c;
        int i7 = i + i2;
        for (i3 = zcVar.c.size() - 1; i3 >= 0; i3--) {
            zk zkVar = (zk) zcVar.c.get(i3);
            if (zkVar != null) {
                if (zkVar.b >= i7) {
                    zkVar.a(-i2, z);
                } else if (zkVar.b >= i) {
                    zkVar.b(8);
                    zcVar.a(i3);
                }
            }
        }
        requestLayout();
    }

    private void y() {
        int i = 0;
        int b = this.e.b();
        for (int i2 = 0; i2 < b; i2++) {
            zk b2 = b(this.e.c(i2));
            if (!(b2 == null || b2.b())) {
                b2.b(6);
            }
        }
        int b3 = this.e.b();
        for (b = 0; b < b3; b++) {
            ((za) this.e.c(b).getLayoutParams()).c = true;
        }
        zc zcVar = this.c;
        int size = zcVar.c.size();
        for (b = 0; b < size; b++) {
            za zaVar = (za) ((zk) zcVar.c.get(b)).a.getLayoutParams();
            if (zaVar != null) {
                zaVar.c = true;
            }
        }
        zc zcVar2 = this.c;
        if (zcVar2.e.j == null || !zcVar2.e.j.b) {
            zcVar2.b();
            return;
        }
        b3 = zcVar2.c.size();
        while (i < b3) {
            zk zkVar = (zk) zcVar2.c.get(i);
            if (zkVar != null) {
                zkVar.b(6);
                zkVar.a(null);
            }
            i++;
        }
    }

    public final zk a(View view) {
        Object parent = view.getParent();
        if (parent == null || parent == this) {
            return b(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public static zk b(View view) {
        if (view == null) {
            return null;
        }
        return ((za) view.getLayoutParams()).a;
    }

    public static int c(View view) {
        zk b = b(view);
        return b != null ? b.c() : -1;
    }

    private zk c(int i) {
        if (this.t) {
            return null;
        }
        int b = this.e.b();
        int i2 = 0;
        zk zkVar = null;
        while (i2 < b) {
            zk b2 = b(this.e.c(i2));
            if (b2 == null || b2.m() || b(b2) != i) {
                b2 = zkVar;
            } else if (!this.e.d(b2.a)) {
                return b2;
            }
            i2++;
            zkVar = b2;
        }
        return zkVar;
    }

    private zk a(long j) {
        if (this.j == null || !this.j.b) {
            return null;
        }
        int b = this.e.b();
        int i = 0;
        zk zkVar = null;
        while (i < b) {
            zk b2 = b(this.e.c(i));
            if (b2 == null || b2.m() || b2.d != j) {
                b2 = zkVar;
            } else if (!this.e.d(b2.a)) {
                return b2;
            }
            i++;
            zkVar = b2;
        }
        return zkVar;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final Rect d(View view) {
        za zaVar = (za) view.getLayoutParams();
        if (!zaVar.c) {
            return zaVar.b;
        }
        Rect rect = zaVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            this.h.set(0, 0, 0, 0);
            yy yyVar = (yy) this.l.get(i);
            Rect rect2 = this.h;
            ((za) view.getLayoutParams()).a.c();
            rect2.set(0, 0, 0, 0);
            rect.left += this.h.left;
            rect.top += this.h.top;
            rect.right += this.h.right;
            rect.bottom += this.h.bottom;
        }
        zaVar.c = false;
        return rect;
    }

    public final void c(int i, int i2) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
    }

    public final void l() {
        int a = this.e.a();
        for (int i = 0; i < a; i++) {
            View b = this.e.b(i);
            zk a2 = a(b);
            if (!(a2 == null || a2.h == null)) {
                View view = a2.h.a;
                int left = b.getLeft();
                int top = b.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public final void e(View view) {
        zk b = b(view);
        if (this.j != null && b != null) {
            this.j.c(b);
        }
    }

    public final int b(zk zkVar) {
        if (zkVar.a(524) || !zkVar.l()) {
            return -1;
        }
        return this.d.d(zkVar.b);
    }

    public void setNestedScrollingEnabled(boolean z) {
        z().a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return z().a;
    }

    public boolean startNestedScroll(int i) {
        return z().a(i);
    }

    public void stopNestedScroll() {
        z().b();
    }

    public boolean hasNestedScrollingParent() {
        return z().a();
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return z().a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return z().a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return z().a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return z().a(f, f2);
    }

    protected int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    private final kc z() {
        if (this.ak == null) {
            this.ak = new kc(this);
        }
        return this.ak;
    }
}
