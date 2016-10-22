package android.support.v7.widget;

import aah;
import aai;
import aak;
import aal;
import aam;
import aao;
import aav;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import buf;
import iy;
import java.util.ArrayList;
import java.util.List;
import jm;
import jq;
import jw;
import kn;
import oe;
import pm;
import rk;
import rl;
import rq;
import su;
import sv;
import sy;
import tk;
import ud;
import uo;
import vi;
import wv;
import zr;

/* compiled from: PG */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private final ArrayList J;
    private final int[] K;
    private final uo L;
    private aao M;
    private final Runnable N;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageButton d;
    public Drawable e;
    public CharSequence f;
    public ImageButton g;
    public View h;
    public Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public final zr n;
    public CharSequence o;
    public CharSequence p;
    public final ArrayList q;
    public ud r;
    public aak s;
    public tk t;
    public sv u;
    public boolean v;
    private ImageView w;
    private int x;
    private int y;
    private int z;

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, buf.Z);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = new zr();
        this.E = 8388627;
        this.J = new ArrayList();
        this.q = new ArrayList();
        this.K = new int[2];
        this.L = new uo(this);
        this.N = new aai(this);
        aah a = aah.a(getContext(), attributeSet, rk.bA, i, 0);
        this.k = a.g(rk.cb, 0);
        this.l = a.g(rk.bS, 0);
        this.E = a.c(rk.bB, this.E);
        this.m = a.c(rk.bC, 48);
        int d = a.d(rk.bV, 0);
        if (a.e(rk.ca)) {
            d = a.d(rk.ca, d);
        }
        this.B = d;
        this.A = d;
        this.z = d;
        this.y = d;
        d = a.d(rk.bY, -1);
        if (d >= 0) {
            this.y = d;
        }
        d = a.d(rk.bX, -1);
        if (d >= 0) {
            this.z = d;
        }
        d = a.d(rk.bZ, -1);
        if (d >= 0) {
            this.A = d;
        }
        d = a.d(rk.bW, -1);
        if (d >= 0) {
            this.B = d;
        }
        this.x = a.e(rk.bN, -1);
        d = a.d(rk.bJ, oe.INVALID_ID);
        int d2 = a.d(rk.bF, oe.INVALID_ID);
        int e = a.e(rk.bH, 0);
        int e2 = a.e(rk.bI, 0);
        zr zrVar = this.n;
        zrVar.h = false;
        if (e != oe.INVALID_ID) {
            zrVar.e = e;
            zrVar.a = e;
        }
        if (e2 != oe.INVALID_ID) {
            zrVar.f = e2;
            zrVar.b = e2;
        }
        if (!(d == oe.INVALID_ID && d2 == oe.INVALID_ID)) {
            this.n.a(d, d2);
        }
        this.C = a.d(rk.bK, oe.INVALID_ID);
        this.D = a.d(rk.bG, oe.INVALID_ID);
        this.e = a.a(rk.bE);
        this.f = a.c(rk.bD);
        CharSequence c = a.c(rk.bU);
        if (!TextUtils.isEmpty(c)) {
            a(c);
        }
        c = a.c(rk.bR);
        if (!TextUtils.isEmpty(c)) {
            b(c);
        }
        this.i = getContext();
        a(a.g(rk.bQ, 0));
        Drawable a2 = a.a(rk.bP);
        if (a2 != null) {
            b(a2);
        }
        c = a.c(rk.bO);
        if (!TextUtils.isEmpty(c)) {
            c(c);
        }
        a2 = a.a(rk.bL);
        if (a2 != null) {
            a(a2);
        }
        c = a.c(rk.bM);
        if (!TextUtils.isEmpty(c)) {
            if (!TextUtils.isEmpty(c)) {
                k();
            }
            if (this.w != null) {
                this.w.setContentDescription(c);
            }
        }
        if (a.e(rk.cc)) {
            d = a.b(rk.cc, -1);
            this.F = d;
            if (this.b != null) {
                this.b.setTextColor(d);
            }
        }
        if (a.e(rk.bT)) {
            d = a.b(rk.bT, -1);
            this.G = d;
            if (this.c != null) {
                this.c.setTextColor(d);
            }
        }
        a.a.recycle();
        vi.a();
    }

    public final void a(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void onRtlPropertiesChanged(int i) {
        boolean z = true;
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        zr zrVar = this.n;
        if (i != 1) {
            z = false;
        }
        if (z != zrVar.g) {
            zrVar.g = z;
            if (!zrVar.h) {
                zrVar.a = zrVar.e;
                zrVar.b = zrVar.f;
            } else if (z) {
                zrVar.a = zrVar.d != oe.INVALID_ID ? zrVar.d : zrVar.e;
                zrVar.b = zrVar.c != oe.INVALID_ID ? zrVar.c : zrVar.f;
            } else {
                zrVar.a = zrVar.c != oe.INVALID_ID ? zrVar.c : zrVar.e;
                zrVar.b = zrVar.d != oe.INVALID_ID ? zrVar.d : zrVar.f;
            }
        }
    }

    public final boolean a() {
        if (this.a != null) {
            boolean z;
            ActionMenuView actionMenuView = this.a;
            if (actionMenuView.c == null || !actionMenuView.c.f()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        if (this.a != null) {
            boolean z;
            ActionMenuView actionMenuView = this.a;
            if (actionMenuView.c == null || !actionMenuView.c.b()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            k();
            if (!d(this.w)) {
                a(this.w, true);
            }
        } else if (this.w != null && d(this.w)) {
            removeView(this.w);
            this.q.remove(this.w);
        }
        if (this.w != null) {
            this.w.setImageDrawable(drawable);
        }
    }

    private final void k() {
        if (this.w == null) {
            this.w = new ImageView(getContext());
        }
    }

    public final void c() {
        sy syVar = this.s == null ? null : this.s.a;
        if (syVar != null) {
            syVar.collapseActionView();
        }
    }

    public final void a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                Context context = getContext();
                this.b = new TextView(context);
                this.b.setSingleLine();
                this.b.setEllipsize(TruncateAt.END);
                if (this.k != 0) {
                    this.b.setTextAppearance(context, this.k);
                }
                if (this.F != 0) {
                    this.b.setTextColor(this.F);
                }
            }
            if (!d(this.b)) {
                a(this.b, true);
            }
        } else if (this.b != null && d(this.b)) {
            removeView(this.b);
            this.q.remove(this.b);
        }
        if (this.b != null) {
            this.b.setText(charSequence);
        }
        this.o = charSequence;
    }

    public final void b(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                this.c = new TextView(context);
                this.c.setSingleLine();
                this.c.setEllipsize(TruncateAt.END);
                if (this.l != 0) {
                    this.c.setTextAppearance(context, this.l);
                }
                if (this.G != 0) {
                    this.c.setTextColor(this.G);
                }
            }
            if (!d(this.c)) {
                a(this.c, true);
            }
        } else if (this.c != null && d(this.c)) {
            removeView(this.c);
            this.q.remove(this.c);
        }
        if (this.c != null) {
            this.c.setText(charSequence);
        }
        this.p = charSequence;
    }

    public final CharSequence d() {
        return this.d != null ? this.d.getContentDescription() : null;
    }

    public final void c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        if (this.d != null) {
            this.d.setContentDescription(charSequence);
        }
    }

    public final void b(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!d(this.d)) {
                a(this.d, true);
            }
        } else if (this.d != null && d(this.d)) {
            removeView(this.d);
            this.q.remove(this.d);
        }
        if (this.d != null) {
            this.d.setImageDrawable(drawable);
        }
    }

    public final Drawable e() {
        return this.d != null ? this.d.getDrawable() : null;
    }

    public final void f() {
        if (this.a == null) {
            this.a = new ActionMenuView(getContext());
            this.a.a(this.j);
            this.a.e = this.L;
            this.a.a(this.t, this.u);
            LayoutParams h = h();
            h.a = 8388613 | (this.m & 112);
            this.a.setLayoutParams(h);
            a(this.a, false);
        }
    }

    private int l() {
        zr zrVar = this.n;
        return zrVar.g ? zrVar.b : zrVar.a;
    }

    private int m() {
        zr zrVar = this.n;
        return zrVar.g ? zrVar.a : zrVar.b;
    }

    private int n() {
        if (e() != null) {
            return Math.max(l(), Math.max(this.C, 0));
        }
        return l();
    }

    private int o() {
        int i;
        if (this.a != null) {
            su suVar = this.a.a;
            i = (suVar == null || !suVar.hasVisibleItems()) ? 0 : 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            return Math.max(m(), Math.max(this.D, 0));
        }
        return m();
    }

    public final void g() {
        if (this.d == null) {
            this.d = new ImageButton(getContext(), null, buf.Y);
            LayoutParams h = h();
            h.a = 8388611 | (this.m & 112);
            this.d.setLayoutParams(h);
        }
    }

    private final void a(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = h();
        } else if (checkLayoutParams(layoutParams)) {
            aal aal = (aal) layoutParams;
        } else {
            layoutParams = a(layoutParams);
        }
        layoutParams.b = 1;
        if (!z || this.h == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.q.add(view);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable aam = new aam(super.onSaveInstanceState());
        if (!(this.s == null || this.s.a == null)) {
            aam.a = this.s.a.getItemId();
        }
        aam.b = a();
        return aam;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof aam) {
            Menu menu;
            aam aam = (aam) parcelable;
            super.onRestoreInstanceState(aam.e);
            if (this.a != null) {
                menu = this.a.a;
            } else {
                menu = null;
            }
            if (!(aam.a == 0 || this.s == null || menu == null)) {
                MenuItem findItem = menu.findItem(aam.a);
                if (findItem != null) {
                    jq.b(findItem);
                }
            }
            if (aam.b) {
                removeCallbacks(this.N);
                post(this.N);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.N);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = jw.a(motionEvent);
        if (a == 0) {
            this.H = false;
        }
        if (!this.H) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a == 0 && !onTouchEvent) {
                this.H = true;
            }
        }
        if (a == 1 || a == 3) {
            this.H = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a = jw.a(motionEvent);
        if (a == 9) {
            this.I = false;
        }
        if (!this.I) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a == 9 && !onHoverEvent) {
                this.I = true;
            }
        }
        if (a == 10 || a == 3) {
            this.I = false;
        }
        return true;
    }

    private final void a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, ((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private final int a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + max) + i2, marginLayoutParams.width), getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int max;
        int a;
        int i5;
        Object obj;
        int[] iArr = this.K;
        if (aav.a(this)) {
            i3 = 0;
            i4 = 1;
        } else {
            i3 = 1;
            i4 = 0;
        }
        int i6 = 0;
        if (a(this.d)) {
            a(this.d, i, 0, i2, 0, this.x);
            i6 = this.d.getMeasuredWidth() + b(this.d);
            max = Math.max(0, this.d.getMeasuredHeight() + c(this.d));
            a = aav.a(0, kn.g(this.d));
            i5 = max;
        } else {
            a = 0;
            i5 = 0;
        }
        if (a(this.g)) {
            a(this.g, i, 0, i2, 0, this.x);
            i6 = this.g.getMeasuredWidth() + b(this.g);
            i5 = Math.max(i5, this.g.getMeasuredHeight() + c(this.g));
            a = aav.a(a, kn.g(this.g));
        }
        int n = n();
        int max2 = Math.max(n, i6) + 0;
        iArr[i4] = Math.max(0, n - i6);
        i6 = 0;
        if (a(this.a)) {
            a(this.a, i, max2, i2, 0, this.x);
            i6 = this.a.getMeasuredWidth() + b(this.a);
            i5 = Math.max(i5, this.a.getMeasuredHeight() + c(this.a));
            a = aav.a(a, kn.g(this.a));
        }
        n = o();
        max2 += Math.max(n, i6);
        iArr[i3] = Math.max(0, n - i6);
        if (a(this.h)) {
            max2 += a(this.h, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.h.getMeasuredHeight() + c(this.h));
            a = aav.a(a, kn.g(this.h));
        }
        if (a(this.w)) {
            max2 += a(this.w, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.w.getMeasuredHeight() + c(this.w));
            a = aav.a(a, kn.g(this.w));
        }
        i4 = getChildCount();
        i3 = 0;
        int i7 = i5;
        i5 = a;
        while (i3 < i4) {
            View childAt = getChildAt(i3);
            if (((aal) childAt.getLayoutParams()).b == 0 && a(childAt)) {
                max2 += a(childAt, i, max2, i2, 0, iArr);
                max = Math.max(i7, childAt.getMeasuredHeight() + c(childAt));
                i6 = aav.a(i5, kn.g(childAt));
                n = max;
            } else {
                i6 = i5;
                n = i7;
            }
            i3++;
            i5 = i6;
            i7 = n;
        }
        n = 0;
        i6 = 0;
        a = this.A + this.B;
        max = this.y + this.z;
        if (a(this.b)) {
            a(this.b, i, max2 + max, i2, a, iArr);
            n = b(this.b) + this.b.getMeasuredWidth();
            i6 = this.b.getMeasuredHeight() + c(this.b);
            i5 = aav.a(i5, kn.g(this.b));
        }
        if (a(this.c)) {
            n = Math.max(n, a(this.c, i, max2 + max, i2, a + i6, iArr));
            i6 += this.c.getMeasuredHeight() + c(this.c);
            i5 = aav.a(i5, kn.g(this.c));
        }
        n += max2;
        i6 = Math.max(i7, i6) + (getPaddingTop() + getPaddingBottom());
        max = kn.a(Math.max(n + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, -16777216 & i5);
        i6 = kn.a(Math.max(i6, getSuggestedMinimumHeight()), i2, i5 << 16);
        if (this.v) {
            max2 = getChildCount();
            for (n = 0; n < max2; n++) {
                View childAt2 = getChildAt(n);
                if (a(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    obj = null;
                    break;
                }
            }
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            i6 = 0;
        }
        setMeasuredDimension(max, i6);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object obj;
        int i5;
        int o;
        int n;
        int measuredHeight;
        aal aal;
        int paddingTop;
        int measuredWidth;
        if (kn.f(this) == 1) {
            obj = 1;
        } else {
            obj = null;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i6 = width - paddingRight;
        int[] iArr = this.K;
        iArr[1] = 0;
        iArr[0] = 0;
        int k = kn.k(this);
        if (!a(this.d)) {
            i5 = paddingLeft;
        } else if (obj != null) {
            i6 = b(this.d, i6, iArr, k);
            i5 = paddingLeft;
        } else {
            i5 = a(this.d, paddingLeft, iArr, k);
        }
        if (a(this.g)) {
            if (obj != null) {
                i6 = b(this.g, i6, iArr, k);
            } else {
                i5 = a(this.g, i5, iArr, k);
            }
        }
        if (a(this.a)) {
            if (obj != null) {
                i5 = a(this.a, i5, iArr, k);
            } else {
                i6 = b(this.a, i6, iArr, k);
            }
        }
        if (kn.f(this) == 1) {
            o = o();
        } else {
            o = n();
        }
        if (kn.f(this) == 1) {
            n = n();
        } else {
            n = o();
        }
        iArr[0] = Math.max(0, o - i5);
        iArr[1] = Math.max(0, n - ((width - paddingRight) - i6));
        i5 = Math.max(i5, o);
        i6 = Math.min(i6, (width - paddingRight) - n);
        if (a(this.h)) {
            if (obj != null) {
                i6 = b(this.h, i6, iArr, k);
            } else {
                i5 = a(this.h, i5, iArr, k);
            }
        }
        if (!a(this.w)) {
            o = i6;
            n = i5;
        } else if (obj != null) {
            o = b(this.w, i6, iArr, k);
            n = i5;
        } else {
            o = i6;
            n = a(this.w, i5, iArr, k);
        }
        boolean a = a(this.b);
        boolean a2 = a(this.c);
        i5 = 0;
        if (a) {
            aal aal2 = (aal) this.b.getLayoutParams();
            i5 = (aal2.bottomMargin + (aal2.topMargin + this.b.getMeasuredHeight())) + 0;
        }
        if (a2) {
            aal2 = (aal) this.c.getLayoutParams();
            measuredHeight = (aal2.bottomMargin + (aal2.topMargin + this.c.getMeasuredHeight())) + i5;
        } else {
            measuredHeight = i5;
        }
        if (a || a2) {
            aal2 = (aal) (a ? this.b : this.c).getLayoutParams();
            aal = (aal) (a2 ? this.c : this.b).getLayoutParams();
            Object obj2 = ((!a || this.b.getMeasuredWidth() <= 0) && (!a2 || this.c.getMeasuredWidth() <= 0)) ? null : 1;
            switch (this.E & 112) {
                case 48:
                    paddingTop = (aal2.topMargin + getPaddingTop()) + this.A;
                    break;
                case 80:
                    paddingTop = (((height - paddingBottom) - aal.bottomMargin) - this.B) - measuredHeight;
                    break;
                default:
                    paddingTop = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    if (paddingTop < aal2.topMargin + this.A) {
                        i6 = aal2.topMargin + this.A;
                    } else {
                        measuredHeight = (((height - paddingBottom) - measuredHeight) - paddingTop) - paddingTop2;
                        if (measuredHeight < aal2.bottomMargin + this.B) {
                            i6 = Math.max(0, paddingTop - ((aal.bottomMargin + this.B) - measuredHeight));
                        } else {
                            i6 = paddingTop;
                        }
                    }
                    paddingTop = paddingTop2 + i6;
                    break;
            }
            if (obj != null) {
                i6 = (obj2 != null ? this.y : 0) - iArr[1];
                i5 = o - Math.max(0, i6);
                iArr[1] = Math.max(0, -i6);
                if (a) {
                    aal2 = (aal) this.b.getLayoutParams();
                    measuredWidth = i5 - this.b.getMeasuredWidth();
                    o = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth, paddingTop, i5, o);
                    paddingTop = o + aal2.bottomMargin;
                    o = measuredWidth - this.z;
                } else {
                    o = i5;
                }
                if (a2) {
                    aal2 = (aal) this.c.getLayoutParams();
                    measuredWidth = aal2.topMargin + paddingTop;
                    this.c.layout(i5 - this.c.getMeasuredWidth(), measuredWidth, i5, this.c.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i5 - this.z;
                    i6 = aal2.bottomMargin;
                    i6 = measuredWidth;
                } else {
                    i6 = i5;
                }
                if (obj2 != null) {
                    i6 = Math.min(o, i6);
                } else {
                    i6 = i5;
                }
                o = i6;
            } else {
                i6 = (obj2 != null ? this.y : 0) - iArr[0];
                n += Math.max(0, i6);
                iArr[0] = Math.max(0, -i6);
                if (a) {
                    aal2 = (aal) this.b.getLayoutParams();
                    i5 = this.b.getMeasuredWidth() + n;
                    measuredWidth = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(n, paddingTop, i5, measuredWidth);
                    i6 = aal2.bottomMargin + measuredWidth;
                    measuredWidth = i5 + this.z;
                    i5 = i6;
                } else {
                    measuredWidth = n;
                    i5 = paddingTop;
                }
                if (a2) {
                    aal2 = (aal) this.c.getLayoutParams();
                    i5 += aal2.topMargin;
                    paddingTop = this.c.getMeasuredWidth() + n;
                    this.c.layout(n, i5, paddingTop, this.c.getMeasuredHeight() + i5);
                    i5 = this.z + paddingTop;
                    i6 = aal2.bottomMargin;
                    i6 = i5;
                } else {
                    i6 = n;
                }
                if (obj2 != null) {
                    n = Math.max(measuredWidth, i6);
                }
            }
        }
        a(this.J, 3);
        int size = this.J.size();
        measuredWidth = n;
        for (i5 = 0; i5 < size; i5++) {
            measuredWidth = a((View) this.J.get(i5), measuredWidth, iArr, k);
        }
        a(this.J, 5);
        n = this.J.size();
        i5 = 0;
        measuredHeight = o;
        while (i5 < n) {
            o = b((View) this.J.get(i5), measuredHeight, iArr, k);
            i5++;
            measuredHeight = o;
        }
        a(this.J, 1);
        List list = this.J;
        n = iArr[0];
        o = iArr[1];
        paddingTop2 = list.size();
        size = o;
        paddingTop = n;
        o = 0;
        n = 0;
        while (o < paddingTop2) {
            View view = (View) list.get(o);
            aal = (aal) view.getLayoutParams();
            paddingTop = aal.leftMargin - paddingTop;
            i5 = aal.rightMargin - size;
            paddingBottom = Math.max(0, paddingTop);
            int max = Math.max(0, i5);
            paddingTop = Math.max(0, -paddingTop);
            size = Math.max(0, -i5);
            o++;
            n += (view.getMeasuredWidth() + paddingBottom) + max;
        }
        i6 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (n / 2);
        i5 = i6 + n;
        if (i6 < measuredWidth) {
            i6 = measuredWidth;
        } else if (i5 > measuredHeight) {
            i6 -= i5 - measuredHeight;
        }
        paddingLeft = this.J.size();
        measuredWidth = i6;
        for (i5 = 0; i5 < paddingLeft; i5++) {
            measuredWidth = a((View) this.J.get(i5), measuredWidth, iArr, k);
        }
        this.J.clear();
    }

    private final int a(View view, int i, int[] iArr, int i2) {
        aal aal = (aal) view.getLayoutParams();
        int i3 = aal.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        i3 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i3, max + measuredWidth, view.getMeasuredHeight() + i3);
        return (aal.rightMargin + measuredWidth) + max;
    }

    private final int b(View view, int i, int[] iArr, int i2) {
        aal aal = (aal) view.getLayoutParams();
        int i3 = aal.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        i3 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i3, max, view.getMeasuredHeight() + i3);
        return max - (aal.leftMargin + measuredWidth);
    }

    private final int a(View view, int i) {
        aal aal = (aal) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = aal.a & 112;
        switch (i3) {
            case rk.bX /*16*/:
            case 48:
            case 80:
                break;
            default:
                i3 = this.E & 112;
                break;
        }
        switch (i3) {
            case 48:
                return getPaddingTop() - i2;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - aal.bottomMargin) - i2;
            default:
                int i4;
                i3 = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                i2 = (((height - i3) - paddingBottom) - measuredHeight) / 2;
                if (i2 < aal.topMargin) {
                    i4 = aal.topMargin;
                } else {
                    measuredHeight = (((height - paddingBottom) - measuredHeight) - i2) - i3;
                    i4 = measuredHeight < aal.bottomMargin ? Math.max(0, i2 - (aal.bottomMargin - measuredHeight)) : i2;
                }
                return i4 + i3;
        }
    }

    private final void a(List list, int i) {
        int i2 = 1;
        int i3 = 0;
        if (kn.f(this) != 1) {
            i2 = 0;
        }
        int childCount = getChildCount();
        int a = iy.a(i, kn.f(this));
        list.clear();
        aal aal;
        if (i2 != 0) {
            for (i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                aal = (aal) childAt.getLayoutParams();
                if (aal.b == 0 && a(childAt) && b(aal.a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (i3 < childCount) {
            View childAt2 = getChildAt(i3);
            aal = (aal) childAt2.getLayoutParams();
            if (aal.b == 0 && a(childAt2) && b(aal.a) == a) {
                list.add(childAt2);
            }
            i3++;
        }
    }

    private final int b(int i) {
        int f = kn.f(this);
        int a = iy.a(i, f) & 7;
        switch (a) {
            case rq.b /*1*/:
            case rl.e /*3*/:
            case rl.g /*5*/:
                return a;
            default:
                return f == 1 ? 5 : 3;
        }
    }

    private final boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static int b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return jm.a.b(marginLayoutParams) + jm.a.a(marginLayoutParams);
    }

    private static int c(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    private static aal a(LayoutParams layoutParams) {
        if (layoutParams instanceof aal) {
            return new aal((aal) layoutParams);
        }
        if (layoutParams instanceof pm) {
            return new aal((pm) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new aal((MarginLayoutParams) layoutParams);
        }
        return new aal(layoutParams);
    }

    public static aal h() {
        return new aal(-2, -2);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof aal);
    }

    public final wv i() {
        if (this.M == null) {
            this.M = new aao(this, true);
        }
        return this.M;
    }

    public final void j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((aal) childAt.getLayoutParams()).b == 2 || childAt == this.a)) {
                removeViewAt(childCount);
                this.q.add(childAt);
            }
        }
    }

    private final boolean d(View view) {
        return view.getParent() == this || this.q.contains(view);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aal(getContext(), attributeSet);
    }
}
