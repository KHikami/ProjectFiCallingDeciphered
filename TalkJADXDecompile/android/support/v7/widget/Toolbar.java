package android.support.v7.widget;

import aan;
import aap;
import abh;
import abv;
import aey;
import afp;
import afq;
import afs;
import aft;
import afu;
import afv;
import afx;
import age;
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
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import gwb;
import java.util.ArrayList;
import java.util.List;
import mj;
import mx;
import nb;
import nh;
import nzf;
import oa;
import tq;
import wi;
import wk;
import xy;
import xz;
import yc;
import yo;
import zh;
import zs;

public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    private final zs H;
    private afx I;
    private zh J;
    private afs K;
    private yo L;
    private xz M;
    private boolean N;
    private final Runnable O;
    public Drawable a;
    public CharSequence b;
    public ImageButton c;
    public View d;
    public int e;
    public afu f;
    private ActionMenuView g;
    private TextView h;
    private TextView i;
    private ImageButton j;
    private ImageView k;
    private Context l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private aey u;
    private int v;
    private int w;
    private int x;
    private CharSequence y;
    private CharSequence z;

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return t();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.ad);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x = 8388627;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new int[2];
        this.H = new zs(this);
        this.O = new afq(this);
        afp a = afp.a(getContext(), attributeSet, wi.dl, i, 0);
        this.n = a.g(wi.dM, 0);
        this.o = a.g(wi.dD, 0);
        this.x = a.c(wi.dm, this.x);
        this.e = a.c(wi.dn, 48);
        int d = a.d(wi.dG, 0);
        if (a.g(wi.dL)) {
            d = a.d(wi.dL, d);
        }
        this.t = d;
        this.s = d;
        this.r = d;
        this.q = d;
        d = a.d(wi.dJ, -1);
        if (d >= 0) {
            this.q = d;
        }
        d = a.d(wi.dI, -1);
        if (d >= 0) {
            this.r = d;
        }
        d = a.d(wi.dK, -1);
        if (d >= 0) {
            this.s = d;
        }
        d = a.d(wi.dH, -1);
        if (d >= 0) {
            this.t = d;
        }
        this.p = a.e(wi.dy, -1);
        d = a.d(wi.du, nzf.UNSET_ENUM_VALUE);
        int d2 = a.d(wi.dq, nzf.UNSET_ENUM_VALUE);
        int e = a.e(wi.ds, 0);
        int e2 = a.e(wi.dt, 0);
        A();
        this.u.b(e, e2);
        if (!(d == nzf.UNSET_ENUM_VALUE && d2 == nzf.UNSET_ENUM_VALUE)) {
            this.u.a(d, d2);
        }
        this.v = a.d(wi.dv, nzf.UNSET_ENUM_VALUE);
        this.w = a.d(wi.dr, nzf.UNSET_ENUM_VALUE);
        this.a = a.a(wi.dp);
        this.b = a.c(wi.do);
        CharSequence c = a.c(wi.dF);
        if (!TextUtils.isEmpty(c)) {
            b(c);
        }
        c = a.c(wi.dC);
        if (!TextUtils.isEmpty(c)) {
            c(c);
        }
        this.l = getContext();
        a(a.g(wi.dB, 0));
        Drawable a2 = a.a(wi.dA);
        if (a2 != null) {
            b(a2);
        }
        c = a.c(wi.dz);
        if (!TextUtils.isEmpty(c)) {
            d(c);
        }
        a2 = a.a(wi.dw);
        if (a2 != null) {
            a(a2);
        }
        c = a.c(wi.dx);
        if (!TextUtils.isEmpty(c)) {
            a(c);
        }
        if (a.g(wi.dN)) {
            b(a.b(wi.dN, -1));
        }
        if (a.g(wi.dE)) {
            c(a.b(wi.dE, -1));
        }
        a.a();
    }

    public void a(int i) {
        if (this.m != i) {
            this.m = i;
            if (i == 0) {
                this.l = getContext();
            } else {
                this.l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void onRtlPropertiesChanged(int i) {
        boolean z = true;
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        A();
        aey aey = this.u;
        if (i != 1) {
            z = false;
        }
        aey.a(z);
    }

    public boolean a() {
        return getVisibility() == 0 && this.g != null && this.g.a();
    }

    public boolean b() {
        return this.g != null && this.g.h();
    }

    public boolean c() {
        return this.g != null && this.g.i();
    }

    public boolean d() {
        return this.g != null && this.g.f();
    }

    public boolean e() {
        return this.g != null && this.g.g();
    }

    public void a(xy xyVar, zh zhVar) {
        if (xyVar != null || this.g != null) {
            y();
            xy e = this.g.e();
            if (e != xyVar) {
                if (e != null) {
                    e.b(this.J);
                    e.b(this.K);
                }
                if (this.K == null) {
                    this.K = new afs(this);
                }
                zhVar.d(true);
                if (xyVar != null) {
                    xyVar.a(zhVar, this.l);
                    xyVar.a(this.K, this.l);
                } else {
                    zhVar.a(this.l, null);
                    this.K.a(this.l, null);
                    zhVar.b(true);
                    this.K.b(true);
                }
                this.g.a(this.m);
                this.g.a(zhVar);
                this.J = zhVar;
            }
        }
    }

    public void f() {
        if (this.g != null) {
            this.g.j();
        }
    }

    public void a(Drawable drawable) {
        if (drawable != null) {
            x();
            if (!d(this.k)) {
                a(this.k, true);
            }
        } else if (this.k != null && d(this.k)) {
            removeView(this.k);
            this.F.remove(this.k);
        }
        if (this.k != null) {
            this.k.setImageDrawable(drawable);
        }
    }

    public void a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            x();
        }
        if (this.k != null) {
            this.k.setContentDescription(charSequence);
        }
    }

    private void x() {
        if (this.k == null) {
            this.k = new aap(getContext());
        }
    }

    public boolean g() {
        return (this.K == null || this.K.b == null) ? false : true;
    }

    public void h() {
        yc ycVar = this.K == null ? null : this.K.b;
        if (ycVar != null) {
            ycVar.collapseActionView();
        }
    }

    public CharSequence i() {
        return this.y;
    }

    public void b(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.h == null) {
                Context context = getContext();
                this.h = new abh(context);
                this.h.setSingleLine();
                this.h.setEllipsize(TruncateAt.END);
                if (this.n != 0) {
                    this.h.setTextAppearance(context, this.n);
                }
                if (this.A != 0) {
                    this.h.setTextColor(this.A);
                }
            }
            if (!d(this.h)) {
                a(this.h, true);
            }
        } else if (this.h != null && d(this.h)) {
            removeView(this.h);
            this.F.remove(this.h);
        }
        if (this.h != null) {
            this.h.setText(charSequence);
        }
        this.y = charSequence;
    }

    public CharSequence j() {
        return this.z;
    }

    public void c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.i == null) {
                Context context = getContext();
                this.i = new abh(context);
                this.i.setSingleLine();
                this.i.setEllipsize(TruncateAt.END);
                if (this.o != 0) {
                    this.i.setTextAppearance(context, this.o);
                }
                if (this.B != 0) {
                    this.i.setTextColor(this.B);
                }
            }
            if (!d(this.i)) {
                a(this.i, true);
            }
        } else if (this.i != null && d(this.i)) {
            removeView(this.i);
            this.F.remove(this.i);
        }
        if (this.i != null) {
            this.i.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void a(Context context, int i) {
        this.n = i;
        if (this.h != null) {
            this.h.setTextAppearance(context, i);
        }
    }

    public void b(Context context, int i) {
        this.o = i;
        if (this.i != null) {
            this.i.setTextAppearance(context, i);
        }
    }

    public void b(int i) {
        this.A = i;
        if (this.h != null) {
            this.h.setTextColor(i);
        }
    }

    public void c(int i) {
        this.B = i;
        if (this.i != null) {
            this.i.setTextColor(i);
        }
    }

    public CharSequence k() {
        return this.j != null ? this.j.getContentDescription() : null;
    }

    public void d(int i) {
        d(i != 0 ? getContext().getText(i) : null);
    }

    public void d(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            z();
        }
        if (this.j != null) {
            this.j.setContentDescription(charSequence);
        }
    }

    public void e(int i) {
        b(wk.b(getContext(), i));
    }

    public void b(Drawable drawable) {
        if (drawable != null) {
            z();
            if (!d(this.j)) {
                a(this.j, true);
            }
        } else if (this.j != null && d(this.j)) {
            removeView(this.j);
            this.F.remove(this.j);
        }
        if (this.j != null) {
            this.j.setImageDrawable(drawable);
        }
    }

    public Drawable l() {
        return this.j != null ? this.j.getDrawable() : null;
    }

    public void a(OnClickListener onClickListener) {
        z();
        this.j.setOnClickListener(onClickListener);
    }

    private void y() {
        if (this.g == null) {
            this.g = new ActionMenuView(getContext());
            this.g.a(this.m);
            this.g.a(this.H);
            this.g.a(this.L, this.M);
            aft t = t();
            t.a = 8388613 | (this.e & 112);
            this.g.setLayoutParams(t);
            a(this.g, false);
        }
    }

    public void a(afu afu) {
        this.f = afu;
    }

    public void a(int i, int i2) {
        A();
        this.u.a(i, i2);
    }

    public int n() {
        return this.u != null ? this.u.a() : 0;
    }

    public int o() {
        return this.u != null ? this.u.b() : 0;
    }

    public int p() {
        if (l() != null) {
            return Math.max(n(), Math.max(this.v, 0));
        }
        return n();
    }

    public int q() {
        int i;
        if (this.g != null) {
            xy e = this.g.e();
            i = (e == null || !e.hasVisibleItems()) ? 0 : 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            return Math.max(o(), Math.max(this.w, 0));
        }
        return o();
    }

    public int r() {
        if (oa.d(this) == 1) {
            return q();
        }
        return p();
    }

    public int s() {
        if (oa.d(this) == 1) {
            return p();
        }
        return q();
    }

    private void z() {
        if (this.j == null) {
            this.j = new aan(getContext(), null, gwb.ac);
            aft t = t();
            t.a = 8388611 | (this.e & 112);
            this.j.setLayoutParams(t);
        }
    }

    private void a(View view, boolean z) {
        aft t;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            t = t();
        } else if (checkLayoutParams(layoutParams)) {
            t = (aft) layoutParams;
        } else {
            t = a(layoutParams);
        }
        t.b = 1;
        if (!z || this.d == null) {
            addView(view, t);
            return;
        }
        view.setLayoutParams(t);
        this.F.add(view);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable afv = new afv(super.onSaveInstanceState());
        if (!(this.K == null || this.K.b == null)) {
            afv.a = this.K.b.getItemId();
        }
        afv.b = b();
        return afv;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof afv) {
            afv afv = (afv) parcelable;
            super.onRestoreInstanceState(afv.e);
            Menu e = this.g != null ? this.g.e() : null;
            if (!(afv.a == 0 || this.K == null || e == null)) {
                MenuItem findItem = e.findItem(afv.a);
                if (findItem != null) {
                    nb.b(findItem);
                }
            }
            if (afv.b) {
                removeCallbacks(this.O);
                post(this.O);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = nh.a(motionEvent);
        if (a == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (a == 1 || a == 3) {
            this.C = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a = nh.a(motionEvent);
        if (a == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (a == 10 || a == 3) {
            this.D = false;
        }
        return true;
    }

    private void a(View view, int i, int i2, int i3, int i4, int i5) {
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

    private int a(View view, int i, int i2, int i3, int i4, int[] iArr) {
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
        int[] iArr = this.G;
        if (age.a(this)) {
            i3 = 0;
            i4 = 1;
        } else {
            i3 = 1;
            i4 = 0;
        }
        int i6 = 0;
        if (a(this.j)) {
            a(this.j, i, 0, i2, 0, this.p);
            i6 = this.j.getMeasuredWidth() + b(this.j);
            max = Math.max(0, this.j.getMeasuredHeight() + c(this.j));
            a = age.a(0, oa.f(this.j));
            i5 = max;
        } else {
            a = 0;
            i5 = 0;
        }
        if (a(this.c)) {
            a(this.c, i, 0, i2, 0, this.p);
            i6 = this.c.getMeasuredWidth() + b(this.c);
            i5 = Math.max(i5, this.c.getMeasuredHeight() + c(this.c));
            a = age.a(a, oa.f(this.c));
        }
        int p = p();
        int max2 = Math.max(p, i6) + 0;
        iArr[i4] = Math.max(0, p - i6);
        i6 = 0;
        if (a(this.g)) {
            a(this.g, i, max2, i2, 0, this.p);
            i6 = this.g.getMeasuredWidth() + b(this.g);
            i5 = Math.max(i5, this.g.getMeasuredHeight() + c(this.g));
            a = age.a(a, oa.f(this.g));
        }
        p = q();
        max2 += Math.max(p, i6);
        iArr[i3] = Math.max(0, p - i6);
        if (a(this.d)) {
            max2 += a(this.d, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.d.getMeasuredHeight() + c(this.d));
            a = age.a(a, oa.f(this.d));
        }
        if (a(this.k)) {
            max2 += a(this.k, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.k.getMeasuredHeight() + c(this.k));
            a = age.a(a, oa.f(this.k));
        }
        i4 = getChildCount();
        i3 = 0;
        int i7 = i5;
        i5 = a;
        while (i3 < i4) {
            View childAt = getChildAt(i3);
            if (((aft) childAt.getLayoutParams()).b == 0 && a(childAt)) {
                max2 += a(childAt, i, max2, i2, 0, iArr);
                max = Math.max(i7, childAt.getMeasuredHeight() + c(childAt));
                i6 = age.a(i5, oa.f(childAt));
                p = max;
            } else {
                i6 = i5;
                p = i7;
            }
            i3++;
            i5 = i6;
            i7 = p;
        }
        p = 0;
        i6 = 0;
        a = this.s + this.t;
        max = this.q + this.r;
        if (a(this.h)) {
            a(this.h, i, max2 + max, i2, a, iArr);
            p = b(this.h) + this.h.getMeasuredWidth();
            i6 = this.h.getMeasuredHeight() + c(this.h);
            i5 = age.a(i5, oa.f(this.h));
        }
        if (a(this.i)) {
            p = Math.max(p, a(this.i, i, max2 + max, i2, a + i6, iArr));
            i6 += this.i.getMeasuredHeight() + c(this.i);
            i5 = age.a(i5, oa.f(this.i));
        }
        p += max2;
        i6 = Math.max(i7, i6) + (getPaddingTop() + getPaddingBottom());
        max = oa.a(Math.max(p + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, -16777216 & i5);
        i6 = oa.a(Math.max(i6, getSuggestedMinimumHeight()), i2, i5 << 16);
        if (this.N) {
            max2 = getChildCount();
            for (p = 0; p < max2; p++) {
                View childAt2 = getChildAt(p);
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
        int measuredHeight;
        aft aft;
        int paddingTop;
        int measuredWidth;
        if (oa.d(this) == 1) {
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
        int i5 = width - paddingRight;
        int[] iArr = this.G;
        iArr[1] = 0;
        iArr[0] = 0;
        int l = oa.l(this);
        int min = l >= 0 ? Math.min(l, i4 - i2) : 0;
        if (!a(this.j)) {
            l = i5;
            i5 = paddingLeft;
        } else if (obj != null) {
            l = b(this.j, i5, iArr, min);
            i5 = paddingLeft;
        } else {
            int i6 = i5;
            i5 = a(this.j, paddingLeft, iArr, min);
            l = i6;
        }
        if (a(this.c)) {
            if (obj != null) {
                l = b(this.c, l, iArr, min);
            } else {
                i5 = a(this.c, i5, iArr, min);
            }
        }
        if (a(this.g)) {
            if (obj != null) {
                i5 = a(this.g, i5, iArr, min);
            } else {
                l = b(this.g, l, iArr, min);
            }
        }
        int r = r();
        int s = s();
        iArr[0] = Math.max(0, r - i5);
        iArr[1] = Math.max(0, s - ((width - paddingRight) - l));
        i5 = Math.max(i5, r);
        l = Math.min(l, (width - paddingRight) - s);
        if (a(this.d)) {
            if (obj != null) {
                l = b(this.d, l, iArr, min);
            } else {
                i5 = a(this.d, i5, iArr, min);
            }
        }
        if (!a(this.k)) {
            r = l;
            s = i5;
        } else if (obj != null) {
            r = b(this.k, l, iArr, min);
            s = i5;
        } else {
            r = l;
            s = a(this.k, i5, iArr, min);
        }
        boolean a = a(this.h);
        boolean a2 = a(this.i);
        i5 = 0;
        if (a) {
            aft aft2 = (aft) this.h.getLayoutParams();
            i5 = (aft2.bottomMargin + (aft2.topMargin + this.h.getMeasuredHeight())) + 0;
        }
        if (a2) {
            aft2 = (aft) this.i.getLayoutParams();
            measuredHeight = (aft2.bottomMargin + (aft2.topMargin + this.i.getMeasuredHeight())) + i5;
        } else {
            measuredHeight = i5;
        }
        if (a || a2) {
            aft2 = (aft) (a ? this.h : this.i).getLayoutParams();
            aft = (aft) (a2 ? this.i : this.h).getLayoutParams();
            Object obj2 = ((!a || this.h.getMeasuredWidth() <= 0) && (!a2 || this.i.getMeasuredWidth() <= 0)) ? null : 1;
            switch (this.x & 112) {
                case 48:
                    paddingTop = (aft2.topMargin + getPaddingTop()) + this.s;
                    break;
                case 80:
                    paddingTop = (((height - paddingBottom) - aft.bottomMargin) - this.t) - measuredHeight;
                    break;
                default:
                    paddingTop = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    if (paddingTop < aft2.topMargin + this.s) {
                        l = aft2.topMargin + this.s;
                    } else {
                        measuredHeight = (((height - paddingBottom) - measuredHeight) - paddingTop) - paddingTop2;
                        if (measuredHeight < aft2.bottomMargin + this.t) {
                            l = Math.max(0, paddingTop - ((aft.bottomMargin + this.t) - measuredHeight));
                        } else {
                            l = paddingTop;
                        }
                    }
                    paddingTop = paddingTop2 + l;
                    break;
            }
            if (obj != null) {
                l = (obj2 != null ? this.q : 0) - iArr[1];
                i5 = r - Math.max(0, l);
                iArr[1] = Math.max(0, -l);
                if (a) {
                    aft2 = (aft) this.h.getLayoutParams();
                    measuredWidth = i5 - this.h.getMeasuredWidth();
                    r = this.h.getMeasuredHeight() + paddingTop;
                    this.h.layout(measuredWidth, paddingTop, i5, r);
                    paddingTop = r + aft2.bottomMargin;
                    r = measuredWidth - this.r;
                } else {
                    r = i5;
                }
                if (a2) {
                    aft2 = (aft) this.i.getLayoutParams();
                    measuredWidth = aft2.topMargin + paddingTop;
                    this.i.layout(i5 - this.i.getMeasuredWidth(), measuredWidth, i5, this.i.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i5 - this.r;
                    l = aft2.bottomMargin;
                    l = measuredWidth;
                } else {
                    l = i5;
                }
                if (obj2 != null) {
                    l = Math.min(r, l);
                } else {
                    l = i5;
                }
                r = l;
            } else {
                l = (obj2 != null ? this.q : 0) - iArr[0];
                s += Math.max(0, l);
                iArr[0] = Math.max(0, -l);
                if (a) {
                    aft2 = (aft) this.h.getLayoutParams();
                    i5 = this.h.getMeasuredWidth() + s;
                    measuredWidth = this.h.getMeasuredHeight() + paddingTop;
                    this.h.layout(s, paddingTop, i5, measuredWidth);
                    l = aft2.bottomMargin + measuredWidth;
                    measuredWidth = i5 + this.r;
                    i5 = l;
                } else {
                    measuredWidth = s;
                    i5 = paddingTop;
                }
                if (a2) {
                    aft2 = (aft) this.i.getLayoutParams();
                    i5 += aft2.topMargin;
                    paddingTop = this.i.getMeasuredWidth() + s;
                    this.i.layout(s, i5, paddingTop, this.i.getMeasuredHeight() + i5);
                    i5 = this.r + paddingTop;
                    l = aft2.bottomMargin;
                    l = i5;
                } else {
                    l = s;
                }
                if (obj2 != null) {
                    s = Math.max(measuredWidth, l);
                }
            }
        }
        a(this.E, 3);
        int size = this.E.size();
        measuredWidth = s;
        for (i5 = 0; i5 < size; i5++) {
            measuredWidth = a((View) this.E.get(i5), measuredWidth, iArr, min);
        }
        a(this.E, 5);
        s = this.E.size();
        i5 = 0;
        measuredHeight = r;
        while (i5 < s) {
            r = b((View) this.E.get(i5), measuredHeight, iArr, min);
            i5++;
            measuredHeight = r;
        }
        a(this.E, 1);
        List list = this.E;
        s = iArr[0];
        r = iArr[1];
        paddingTop2 = list.size();
        size = r;
        paddingTop = s;
        r = 0;
        s = 0;
        while (r < paddingTop2) {
            View view = (View) list.get(r);
            aft = (aft) view.getLayoutParams();
            paddingTop = aft.leftMargin - paddingTop;
            i5 = aft.rightMargin - size;
            paddingBottom = Math.max(0, paddingTop);
            int max = Math.max(0, i5);
            paddingTop = Math.max(0, -paddingTop);
            size = Math.max(0, -i5);
            r++;
            s += (view.getMeasuredWidth() + paddingBottom) + max;
        }
        l = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (s / 2);
        i5 = l + s;
        if (l < measuredWidth) {
            l = measuredWidth;
        } else if (i5 > measuredHeight) {
            l -= i5 - measuredHeight;
        }
        paddingLeft = this.E.size();
        measuredWidth = l;
        for (i5 = 0; i5 < paddingLeft; i5++) {
            measuredWidth = a((View) this.E.get(i5), measuredWidth, iArr, min);
        }
        this.E.clear();
    }

    private int a(View view, int i, int[] iArr, int i2) {
        aft aft = (aft) view.getLayoutParams();
        int i3 = aft.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        i3 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i3, max + measuredWidth, view.getMeasuredHeight() + i3);
        return (aft.rightMargin + measuredWidth) + max;
    }

    private int b(View view, int i, int[] iArr, int i2) {
        aft aft = (aft) view.getLayoutParams();
        int i3 = aft.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        i3 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i3, max, view.getMeasuredHeight() + i3);
        return max - (aft.leftMargin + measuredWidth);
    }

    private int a(View view, int i) {
        aft aft = (aft) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = aft.a & 112;
        switch (i3) {
            case wi.dI /*16*/:
            case 48:
            case 80:
                break;
            default:
                i3 = this.x & 112;
                break;
        }
        switch (i3) {
            case 48:
                return getPaddingTop() - i2;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - aft.bottomMargin) - i2;
            default:
                int i4;
                i3 = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                i2 = (((height - i3) - paddingBottom) - measuredHeight) / 2;
                if (i2 < aft.topMargin) {
                    i4 = aft.topMargin;
                } else {
                    measuredHeight = (((height - paddingBottom) - measuredHeight) - i2) - i3;
                    i4 = measuredHeight < aft.bottomMargin ? Math.max(0, i2 - (aft.bottomMargin - measuredHeight)) : i2;
                }
                return i4 + i3;
        }
    }

    private void a(List<View> list, int i) {
        int i2 = 1;
        int i3 = 0;
        if (oa.d(this) != 1) {
            i2 = 0;
        }
        int childCount = getChildCount();
        int a = mj.a(i, oa.d(this));
        list.clear();
        aft aft;
        if (i2 != 0) {
            for (i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                aft = (aft) childAt.getLayoutParams();
                if (aft.b == 0 && a(childAt) && f(aft.a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (i3 < childCount) {
            View childAt2 = getChildAt(i3);
            aft = (aft) childAt2.getLayoutParams();
            if (aft.b == 0 && a(childAt2) && f(aft.a) == a) {
                list.add(childAt2);
            }
            i3++;
        }
    }

    private int f(int i) {
        int d = oa.d(this);
        int a = mj.a(i, d) & 7;
        switch (a) {
            case wi.j /*1*/:
            case wi.z /*3*/:
            case wi.p /*5*/:
                return a;
            default:
                return d == 1 ? 5 : 3;
        }
    }

    private boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static int b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return mx.a.b(marginLayoutParams) + mx.a.a(marginLayoutParams);
    }

    private static int c(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    public aft a(AttributeSet attributeSet) {
        return new aft(getContext(), attributeSet);
    }

    protected aft a(LayoutParams layoutParams) {
        if (layoutParams instanceof aft) {
            return new aft((aft) layoutParams);
        }
        if (layoutParams instanceof tq) {
            return new aft((tq) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new aft((MarginLayoutParams) layoutParams);
        }
        return new aft(layoutParams);
    }

    public aft t() {
        return new aft(-2, -2);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof aft);
    }

    public abv u() {
        if (this.I == null) {
            this.I = new afx(this, true);
        }
        return this.I;
    }

    public void v() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((aft) childAt.getLayoutParams()).b == 2 || childAt == this.g)) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public void w() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView((View) this.F.get(size));
        }
        this.F.clear();
    }

    private boolean d(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public void a(boolean z) {
        this.N = z;
        requestLayout();
    }

    public void a(yo yoVar, xz xzVar) {
        this.L = yoVar;
        this.M = xzVar;
        if (this.g != null) {
            this.g.a(yoVar, xzVar);
        }
    }

    private void A() {
        if (this.u == null) {
            this.u = new aey();
        }
    }

    public Menu m() {
        y();
        if (this.g.e() == null) {
            xy xyVar = (xy) this.g.d();
            if (this.K == null) {
                this.K = new afs(this);
            }
            this.g.b(true);
            xyVar.a(this.K, this.l);
        }
        return this.g.d();
    }
}
