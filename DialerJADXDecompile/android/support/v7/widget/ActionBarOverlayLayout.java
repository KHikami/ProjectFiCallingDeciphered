package android.support.v7.widget;

import aav;
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
import buf;
import kd;
import ke;
import kn;
import lv;
import mg;
import oe;
import ox;
import tk;
import ty;
import tz;
import ua;
import ub;
import uc;
import wu;
import wv;

/* compiled from: PG */
public class ActionBarOverlayLayout extends ViewGroup implements kd, wu {
    private static int[] z;
    private final ke A;
    public int a;
    public ActionBarContainer b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public ub g;
    public lv h;
    public final mg i;
    private int j;
    private ContentFrameLayout k;
    private wv l;
    private Drawable m;
    private boolean n;
    private boolean o;
    private int p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private ox w;
    private final Runnable x;
    private final Runnable y;

    static {
        z = new int[]{buf.p, 16842841};
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.i = new ty(this);
        this.x = new tz(this);
        this.y = new ua(this);
        a(context);
        this.A = new ke(this);
    }

    private final void a(Context context) {
        boolean z = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(z);
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.m = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.m == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion >= 19) {
            z = false;
        }
        this.n = z;
        this.w = ox.a(context, null);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public static void a() {
    }

    protected void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        a(getContext());
        kn.n(this);
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2 = true;
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        k();
        int i2 = this.f ^ i;
        this.f = i;
        boolean z3 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.g != null) {
            ub ubVar = this.g;
            if (z) {
                z2 = false;
            }
            ubVar.h(z2);
            if (z3 || !z) {
                this.g.i();
            } else {
                this.g.j();
            }
        }
        if ((i2 & 256) != 0 && this.g != null) {
            kn.n(this);
        }
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.a = i;
        if (this.g != null) {
            this.g.d(i);
        }
    }

    private static boolean a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        uc ucVar = (uc) view.getLayoutParams();
        if (ucVar.leftMargin != rect.left) {
            ucVar.leftMargin = rect.left;
            z5 = true;
        }
        if (ucVar.topMargin != rect.top) {
            ucVar.topMargin = rect.top;
            z5 = true;
        }
        if (ucVar.rightMargin != rect.right) {
            ucVar.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || ucVar.bottomMargin == rect.bottom) {
            return z5;
        }
        ucVar.bottomMargin = rect.bottom;
        return true;
    }

    protected boolean fitSystemWindows(Rect rect) {
        k();
        kn.m(this);
        boolean a = a(this.b, rect, true, true, false, true);
        this.t.set(rect);
        aav.a(this, this.t, this.q);
        if (!this.r.equals(this.q)) {
            this.r.set(this.q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new uc(layoutParams);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof uc;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        k();
        measureChildWithMargins(this.b, i, 0, i2, 0);
        uc ucVar = (uc) this.b.getLayoutParams();
        int max = Math.max(0, (this.b.getMeasuredWidth() + ucVar.leftMargin) + ucVar.rightMargin);
        int max2 = Math.max(0, ucVar.bottomMargin + (this.b.getMeasuredHeight() + ucVar.topMargin));
        int a = aav.a(0, kn.g(this.b));
        boolean z = (kn.m(this) & 256) != 0;
        if (z) {
            i3 = this.j;
            if (this.d && this.b.a != null) {
                i3 += this.j;
            }
        } else {
            i3 = this.b.getVisibility() != 8 ? this.b.getMeasuredHeight() : 0;
        }
        this.s.set(this.q);
        this.u.set(this.t);
        Rect rect;
        Rect rect2;
        if (this.c || z) {
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
        a(this.k, this.s, true, true, true, true);
        if (!this.v.equals(this.u)) {
            this.v.set(this.u);
            this.k.a(this.u);
        }
        measureChildWithMargins(this.k, i, 0, i2, 0);
        ucVar = (uc) this.k.getLayoutParams();
        int max3 = Math.max(max, (this.k.getMeasuredWidth() + ucVar.leftMargin) + ucVar.rightMargin);
        i3 = Math.max(max2, ucVar.bottomMargin + (this.k.getMeasuredHeight() + ucVar.topMargin));
        int a2 = aav.a(a, kn.g(this.k));
        setMeasuredDimension(kn.a(Math.max(max3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, a2), kn.a(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, a2 << 16));
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
                uc ucVar = (uc) childAt.getLayoutParams();
                int i6 = ucVar.leftMargin + paddingLeft;
                int i7 = ucVar.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.m != null && !this.n) {
            int bottom = this.b.getVisibility() == 0 ? (int) ((((float) this.b.getBottom()) + kn.i(this.b)) + 0.5f) : 0;
            this.m.setBounds(0, bottom, getWidth(), this.m.getIntrinsicHeight() + bottom);
            this.m.draw(canvas);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.b.getVisibility() != 0) {
            return false;
        }
        return this.o;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.A.a = i;
        this.p = b();
        c();
        if (this.g != null) {
            this.g.k();
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.p += i2;
        a(this.p);
    }

    public void onStopNestedScroll(View view) {
        if (this.o && !this.e) {
            if (this.p <= this.b.getHeight()) {
                c();
                postDelayed(this.x, 600);
                return;
            }
            c();
            postDelayed(this.y, 600);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.o || !z) {
            return false;
        }
        this.w.a(0, 0, 0, (int) f2, 0, 0, oe.INVALID_ID, Integer.MAX_VALUE);
        if (this.w.e() > this.b.getHeight()) {
            z2 = true;
        }
        if (z2) {
            c();
            this.y.run();
        } else {
            c();
            this.x.run();
        }
        this.e = true;
        return true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public int getNestedScrollAxes() {
        return this.A.a;
    }

    private void k() {
        if (this.k == null) {
            wv wvVar;
            this.k = (ContentFrameLayout) findViewById(buf.bd);
            this.b = (ActionBarContainer) findViewById(buf.be);
            View findViewById = findViewById(buf.bc);
            if (findViewById instanceof wv) {
                wvVar = (wv) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wvVar = ((Toolbar) findViewById).i();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
            }
            this.l = wvVar;
        }
    }

    public final void a(boolean z) {
        if (z != this.o) {
            this.o = z;
            if (!z) {
                c();
                a(0);
            }
        }
    }

    public final int b() {
        return this.b != null ? -((int) kn.i(this.b)) : 0;
    }

    public final void a(int i) {
        c();
        kn.b(this.b, (float) (-Math.max(0, Math.min(i, this.b.getHeight()))));
    }

    public final void c() {
        removeCallbacks(this.x);
        removeCallbacks(this.y);
        if (this.h != null) {
            this.h.a();
        }
    }

    public final void a(Callback callback) {
        k();
        this.l.a(callback);
    }

    public final void a(CharSequence charSequence) {
        k();
        this.l.a(charSequence);
    }

    public final void b(int i) {
        boolean z = true;
        k();
        switch (i) {
            case 109:
                this.c = true;
                if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                    z = false;
                }
                this.n = z;
            default:
        }
    }

    public final boolean d() {
        k();
        return this.l.e();
    }

    public final boolean e() {
        k();
        return this.l.f();
    }

    public final boolean f() {
        k();
        return this.l.g();
    }

    public final boolean g() {
        k();
        return this.l.h();
    }

    public final boolean h() {
        k();
        return this.l.i();
    }

    public final void i() {
        k();
        this.l.j();
    }

    public final void a(Menu menu, tk tkVar) {
        k();
        this.l.a(menu, tkVar);
    }

    public final void j() {
        k();
        this.l.k();
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new uc(-1, -1);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new uc(getContext(), attributeSet);
    }
}
