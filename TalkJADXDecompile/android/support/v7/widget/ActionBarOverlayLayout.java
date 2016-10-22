package android.support.v7.widget;

import abu;
import abv;
import age;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import gwb;
import nm;
import nn;
import nzf;
import oa;
import pn;
import py;
import tf;
import yo;
import zc;
import zd;
import ze;
import zf;
import zg;

public class ActionBarOverlayLayout extends ViewGroup implements abu, nm {
    static final int[] e;
    private final Runnable A;
    private final nn B;
    public ActionBarContainer a;
    public boolean b;
    public pn c;
    public final py d;
    private int f;
    private int g;
    private ContentFrameLayout h;
    private abv i;
    private Drawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private zf w;
    private final int x;
    private tf y;
    private final Runnable z;

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return c();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    static {
        e = new int[]{gwb.r, 16842841};
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.x = 600;
        this.d = new zc(this);
        this.z = new zd(this);
        this.A = new ze(this);
        a(context);
        this.B = new nn(this);
    }

    private void a(Context context) {
        boolean z = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(e);
        this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.j == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion >= 19) {
            z = false;
        }
        this.k = z;
        this.y = tf.a(context, null);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    public void a(zf zfVar) {
        this.w = zfVar;
        if (getWindowToken() != null) {
            this.w.d(this.g);
            if (this.p != 0) {
                onWindowSystemUiVisibilityChanged(this.p);
                oa.o(this);
            }
        }
    }

    public void a(boolean z) {
        boolean z2 = true;
        this.l = true;
        if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        }
        this.k = z2;
    }

    public boolean a() {
        return this.l;
    }

    public void b(boolean z) {
        this.m = z;
    }

    public void b() {
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        oa.o(this);
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2 = true;
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        d();
        int i2 = this.p ^ i;
        this.p = i;
        boolean z3 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.w != null) {
            zf zfVar = this.w;
            if (z) {
                z2 = false;
            }
            zfVar.i(z2);
            if (z3 || !z) {
                this.w.o();
            } else {
                this.w.p();
            }
        }
        if ((i2 & 256) != 0 && this.w != null) {
            oa.o(this);
        }
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.g = i;
        if (this.w != null) {
            this.w.d(i);
        }
    }

    private static boolean a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        zg zgVar = (zg) view.getLayoutParams();
        if (zgVar.leftMargin != rect.left) {
            zgVar.leftMargin = rect.left;
            z5 = true;
        }
        if (zgVar.topMargin != rect.top) {
            zgVar.topMargin = rect.top;
            z5 = true;
        }
        if (zgVar.rightMargin != rect.right) {
            zgVar.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || zgVar.bottomMargin == rect.bottom) {
            return z5;
        }
        zgVar.bottomMargin = rect.bottom;
        return true;
    }

    protected boolean fitSystemWindows(Rect rect) {
        d();
        oa.n(this);
        boolean a = a(this.a, rect, true, true, false, true);
        this.t.set(rect);
        age.a(this, this.t, this.q);
        if (!this.r.equals(this.q)) {
            this.r.set(this.q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    protected zg c() {
        return new zg(-1, -1);
    }

    public zg a(AttributeSet attributeSet) {
        return new zg(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new zg(layoutParams);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof zg;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        d();
        measureChildWithMargins(this.a, i, 0, i2, 0);
        zg zgVar = (zg) this.a.getLayoutParams();
        int max = Math.max(0, (this.a.getMeasuredWidth() + zgVar.leftMargin) + zgVar.rightMargin);
        int max2 = Math.max(0, zgVar.bottomMargin + (this.a.getMeasuredHeight() + zgVar.topMargin));
        int a = age.a(0, oa.f(this.a));
        boolean z = (oa.n(this) & 256) != 0;
        if (z) {
            i3 = this.f;
            if (this.m && this.a.a() != null) {
                i3 += this.f;
            }
        } else {
            i3 = this.a.getVisibility() != 8 ? this.a.getMeasuredHeight() : 0;
        }
        this.s.set(this.q);
        this.u.set(this.t);
        Rect rect;
        Rect rect2;
        if (this.l || z) {
            rect = this.u;
            rect.top = i3 + rect.top;
            rect2 = this.u;
            rect2.bottom = rect2.bottom;
        } else {
            rect = this.s;
            rect.top = i3 + rect.top;
            rect2 = this.s;
            rect2.bottom = rect2.bottom;
        }
        a(this.h, this.s, true, true, true, true);
        if (!this.v.equals(this.u)) {
            this.v.set(this.u);
            this.h.a(this.u);
        }
        measureChildWithMargins(this.h, i, 0, i2, 0);
        zgVar = (zg) this.h.getLayoutParams();
        int max3 = Math.max(max, (this.h.getMeasuredWidth() + zgVar.leftMargin) + zgVar.rightMargin);
        i3 = Math.max(max2, zgVar.bottomMargin + (this.h.getMeasuredHeight() + zgVar.topMargin));
        int a2 = age.a(a, oa.f(this.h));
        setMeasuredDimension(oa.a(Math.max(max3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, a2), oa.a(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, a2 << 16));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                zg zgVar = (zg) childAt.getLayoutParams();
                int i6 = zgVar.leftMargin + paddingLeft;
                int i7 = zgVar.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.j != null && !this.k) {
            int bottom = this.a.getVisibility() == 0 ? (int) ((((float) this.a.getBottom()) + oa.j(this.a)) + 0.5f) : 0;
            this.j.setBounds(0, bottom, getWidth(), this.j.getIntrinsicHeight() + bottom);
            this.j.draw(canvas);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.a.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.B.a(i);
        this.o = e();
        f();
        if (this.w != null) {
            this.w.q();
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.o += i2;
        a(this.o);
    }

    public void onStopNestedScroll(View view) {
        if (this.n && !this.b) {
            if (this.o <= this.a.getHeight()) {
                f();
                postDelayed(this.z, 600);
                return;
            }
            f();
            postDelayed(this.A, 600);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.n || !z) {
            return false;
        }
        this.y.a(0, 0, 0, (int) f2, 0, 0, nzf.UNSET_ENUM_VALUE, Integer.MAX_VALUE);
        if (this.y.e() > this.a.getHeight()) {
            f();
            this.A.run();
        } else {
            f();
            this.z.run();
        }
        this.b = true;
        return true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public int getNestedScrollAxes() {
        return this.B.a();
    }

    void d() {
        if (this.h == null) {
            abv abv;
            this.h = (ContentFrameLayout) findViewById(gwb.bk);
            this.a = (ActionBarContainer) findViewById(gwb.bl);
            View findViewById = findViewById(gwb.bj);
            if (findViewById instanceof abv) {
                abv = (abv) findViewById;
            } else if (findViewById instanceof Toolbar) {
                abv = ((Toolbar) findViewById).u();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
            }
            this.i = abv;
        }
    }

    public void c(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (!z) {
                f();
                a(0);
            }
        }
    }

    public int e() {
        return this.a != null ? -((int) oa.j(this.a)) : 0;
    }

    public void a(int i) {
        f();
        oa.b(this.a, (float) (-Math.max(0, Math.min(i, this.a.getHeight()))));
    }

    public void f() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        if (this.c != null) {
            this.c.b();
        }
    }

    public void a(Callback callback) {
        d();
        this.i.a(callback);
    }

    public void a(CharSequence charSequence) {
        d();
        this.i.a(charSequence);
    }

    public void b(int i) {
        d();
        switch (i) {
            case 109:
                a(true);
            default:
        }
    }

    public boolean g() {
        d();
        return this.i.e();
    }

    public boolean h() {
        d();
        return this.i.f();
    }

    public boolean i() {
        d();
        return this.i.g();
    }

    public boolean j() {
        d();
        return this.i.h();
    }

    public boolean k() {
        d();
        return this.i.i();
    }

    public void l() {
        d();
        this.i.j();
    }

    public void a(Menu menu, yo yoVar) {
        d();
        this.i.a(menu, yoVar);
    }

    public void m() {
        d();
        this.i.k();
    }
}
