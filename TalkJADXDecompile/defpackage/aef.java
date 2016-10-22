package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import oa;
import ql;
import qv;
import qw;
import u;

/* renamed from: aef */
public abstract class aef {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    abq p;
    public RecyclerView q;
    public u r;
    public boolean s;
    boolean t;
    public boolean u;

    public abstract aeg e();

    public aef() {
        this.s = false;
        this.t = false;
        this.u = false;
        this.a = true;
    }

    public void a(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.q = null;
            this.p = null;
            this.d = 0;
            this.e = 0;
        } else {
            this.q = recyclerView;
            this.p = recyclerView.e;
            this.d = recyclerView.getWidth();
            this.e = recyclerView.getHeight();
        }
        this.b = 1073741824;
        this.c = 1073741824;
    }

    public void a(int i, int i2) {
        this.d = MeasureSpec.getSize(i);
        this.b = MeasureSpec.getMode(i);
        if (this.b == 0 && !RecyclerView.b) {
            this.d = 0;
        }
        this.e = MeasureSpec.getSize(i2);
        this.c = MeasureSpec.getMode(i2);
        if (this.c == 0 && !RecyclerView.b) {
            this.e = 0;
        }
    }

    public void b(int i, int i2) {
        int i3 = Integer.MAX_VALUE;
        int i4 = nzf.UNSET_ENUM_VALUE;
        int w = w();
        if (w == 0) {
            this.q.e(i, i2);
            return;
        }
        int i5 = nzf.UNSET_ENUM_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < w; i7++) {
            View g = g(i7);
            g.getLayoutParams();
            Rect rect = this.q.h;
            a(g, rect);
            if (rect.left < i6) {
                i6 = rect.left;
            }
            if (rect.right > i5) {
                i5 = rect.right;
            }
            if (rect.top < i3) {
                i3 = rect.top;
            }
            if (rect.bottom > i4) {
                i4 = rect.bottom;
            }
        }
        this.q.h.set(i6, i3, i5, i4);
        a(this.q.h, i, i2);
    }

    public void a(Rect rect, int i, int i2) {
        e(aef.a(i, (rect.width() + B()) + D(), H()), aef.a(i2, (rect.height() + C()) + E(), I()));
    }

    public void t() {
        if (this.q != null) {
            this.q.requestLayout();
        }
    }

    public static int a(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        switch (mode) {
            case nzf.UNSET_ENUM_VALUE /*-2147483648*/:
                return Math.min(size, Math.max(i2, i3));
            case 1073741824:
                return size;
            default:
                return Math.max(i2, i3);
        }
    }

    public void a(String str) {
        if (this.q != null) {
            this.q.a(str);
        }
    }

    public void c(boolean z) {
        this.u = true;
    }

    public boolean f() {
        return false;
    }

    public void b(RecyclerView recyclerView) {
        this.t = true;
    }

    public void b(RecyclerView recyclerView, aek aek) {
        this.t = false;
        a(recyclerView, aek);
    }

    public void a(RecyclerView recyclerView, aek aek) {
    }

    public void c(aek aek, aep aep) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void a(aep aep) {
    }

    public boolean a(aeg aeg) {
        return aeg != null;
    }

    public aeg a(LayoutParams layoutParams) {
        if (layoutParams instanceof aeg) {
            return new aeg((aeg) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new aeg((MarginLayoutParams) layoutParams);
        }
        return new aeg(layoutParams);
    }

    public aeg a(Context context, AttributeSet attributeSet) {
        return new aeg(context, attributeSet);
    }

    public int a(int i, aek aek, aep aep) {
        return 0;
    }

    public int b(int i, aek aek, aep aep) {
        return 0;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public void c(int i) {
    }

    public boolean u() {
        return this.r != null && this.r.e();
    }

    public int v() {
        return oa.d(this.q);
    }

    public void a(View view) {
        a(view, -1);
    }

    public void a(View view, int i) {
        a(view, i, true);
    }

    public void b(View view) {
        b(view, -1);
    }

    public void b(View view, int i) {
        a(view, i, false);
    }

    private void a(View view, int i, boolean z) {
        aer d = RecyclerView.d(view);
        if (z || d.n()) {
            this.q.f.e(d);
        } else {
            this.q.f.f(d);
        }
        aeg aeg = (aeg) view.getLayoutParams();
        if (d.h() || d.f()) {
            if (d.f()) {
                d.g();
            } else {
                d.i();
            }
            this.p.a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.q) {
            int b = this.p.b(view);
            if (i == -1) {
                i = this.p.b();
            }
            if (b == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.q.indexOfChild(view));
            } else if (b != i) {
                this.q.k.c(b, i);
            }
        } else {
            this.p.a(view, i, false);
            aeg.e = true;
            if (this.r != null && this.r.e()) {
                this.r.b(view);
            }
        }
        if (aeg.f) {
            d.a.invalidate();
            aeg.f = false;
        }
    }

    public void c(View view) {
        this.p.a(view);
    }

    public void e(int i) {
        if (g(i) != null) {
            this.p.a(i);
        }
    }

    public int d(View view) {
        return ((aeg) view.getLayoutParams()).f();
    }

    public View e(View view) {
        if (this.q == null) {
            return null;
        }
        View b = this.q.b(view);
        if (b == null || this.p.c(b)) {
            return null;
        }
        return b;
    }

    public View b(int i) {
        int w = w();
        for (int i2 = 0; i2 < w; i2++) {
            View g = g(i2);
            aer d = RecyclerView.d(g);
            if (d != null && d.d() == i && !d.c() && (this.q.x.a() || !d.n())) {
                return g;
            }
        }
        return null;
    }

    public void f(int i) {
        g(i);
        this.p.d(i);
    }

    public void a(View view, int i, aeg aeg) {
        aer d = RecyclerView.d(view);
        if (d.n()) {
            this.q.f.e(d);
        } else {
            this.q.f.f(d);
        }
        this.p.a(view, i, aeg, d.n());
    }

    public void c(View view, int i) {
        a(view, i, (aeg) view.getLayoutParams());
    }

    public void c(int i, int i2) {
        View g = g(i);
        if (g == null) {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i);
        }
        f(i);
        c(g, i2);
    }

    public void a(View view, aek aek) {
        c(view);
        aek.a(view);
    }

    public void a(int i, aek aek) {
        View g = g(i);
        e(i);
        aek.a(g);
    }

    public int w() {
        return this.p != null ? this.p.b() : 0;
    }

    public View g(int i) {
        return this.p != null ? this.p.b(i) : null;
    }

    public int x() {
        return this.b;
    }

    public int y() {
        return this.c;
    }

    public int z() {
        return this.d;
    }

    public int A() {
        return this.e;
    }

    public int B() {
        return this.q != null ? this.q.getPaddingLeft() : 0;
    }

    public int C() {
        return this.q != null ? this.q.getPaddingTop() : 0;
    }

    public int D() {
        return this.q != null ? this.q.getPaddingRight() : 0;
    }

    public int E() {
        return this.q != null ? this.q.getPaddingBottom() : 0;
    }

    public View F() {
        if (this.q == null) {
            return null;
        }
        View focusedChild = this.q.getFocusedChild();
        if (focusedChild == null || this.p.c(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int G() {
        ady b = this.q != null ? this.q.b() : null;
        return b != null ? b.a() : 0;
    }

    public void h(int i) {
        if (this.q != null) {
            this.q.f(i);
        }
    }

    public void i(int i) {
        if (this.q != null) {
            this.q.e(i);
        }
    }

    public void a(aek aek) {
        for (int w = w() - 1; w >= 0; w--) {
            View g = g(w);
            aer d = RecyclerView.d(g);
            if (!d.c()) {
                if (!d.k() || d.n() || this.q.j.a) {
                    f(w);
                    aek.c(g);
                    this.q.f.h(d);
                } else {
                    e(w);
                    aek.a(d);
                }
            }
        }
    }

    public void b(aek aek) {
        int c = aek.c();
        for (int i = c - 1; i >= 0; i--) {
            View c2 = aek.c(i);
            aer d = RecyclerView.d(c2);
            if (!d.c()) {
                d.a(false);
                if (d.o()) {
                    this.q.removeDetachedView(c2, false);
                }
                if (this.q.v != null) {
                    this.q.v.c(d);
                }
                d.a(true);
                aek.b(c2);
            }
        }
        aek.d();
        if (c > 0) {
            this.q.invalidate();
        }
    }

    boolean a(View view, int i, int i2, aeg aeg) {
        return (this.a && aef.b(view.getMeasuredWidth(), i, aeg.width) && aef.b(view.getMeasuredHeight(), i2, aeg.height)) ? false : true;
    }

    boolean b(View view, int i, int i2, aeg aeg) {
        return (!view.isLayoutRequested() && this.a && aef.b(view.getWidth(), i, aeg.width) && aef.b(view.getHeight(), i2, aeg.height)) ? false : true;
    }

    private static boolean b(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        switch (mode) {
            case nzf.UNSET_ENUM_VALUE /*-2147483648*/:
                if (size >= i) {
                    return true;
                }
                return false;
            case wi.w /*0*/:
                return true;
            case 1073741824:
                if (size == i) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public void a(View view, int i, int i2) {
        aeg aeg = (aeg) view.getLayoutParams();
        Rect f = this.q.f(view);
        int i3 = (f.left + f.right) + 0;
        int i4 = (f.bottom + f.top) + 0;
        i3 = aef.a(z(), x(), i3 + (((B() + D()) + aeg.leftMargin) + aeg.rightMargin), aeg.width, h());
        i4 = aef.a(A(), y(), i4 + (((C() + E()) + aeg.topMargin) + aeg.bottomMargin), aeg.height, i());
        if (b(view, i3, i4, aeg)) {
            view.measure(i3, i4);
        }
    }

    public static int a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = 0;
        int max = Math.max(0, i - i3);
        if (i4 >= 0) {
            i5 = 1073741824;
            max = i4;
        } else {
            if (z) {
                if (i4 == -1) {
                    switch (i2) {
                        case nzf.UNSET_ENUM_VALUE /*-2147483648*/:
                        case 1073741824:
                            i5 = i2;
                            break;
                        default:
                            max = 0;
                            break;
                    }
                } else if (i4 == -2) {
                    max = 0;
                }
            } else if (i4 == -1) {
                i5 = i2;
            } else if (i4 == -2) {
                if (i2 == nzf.UNSET_ENUM_VALUE || i2 == 1073741824) {
                    i5 = nzf.UNSET_ENUM_VALUE;
                }
            }
            max = 0;
        }
        return MeasureSpec.makeMeasureSpec(max, i5);
    }

    public int f(View view) {
        Rect rect = ((aeg) view.getLayoutParams()).d;
        return rect.right + (view.getMeasuredWidth() + rect.left);
    }

    public int g(View view) {
        Rect rect = ((aeg) view.getLayoutParams()).d;
        return rect.bottom + (view.getMeasuredHeight() + rect.top);
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        aeg aeg = (aeg) view.getLayoutParams();
        Rect rect = aeg.d;
        view.layout((rect.left + i) + aeg.leftMargin, (rect.top + i2) + aeg.topMargin, (i3 - rect.right) - aeg.rightMargin, (i4 - rect.bottom) - aeg.bottomMargin);
    }

    public void a(View view, boolean z, Rect rect) {
        Rect rect2 = ((aeg) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, rect2.bottom + view.getHeight());
        if (this.q != null) {
            Matrix g = oa.a.g(view);
            if (!(g == null || g.isIdentity())) {
                RectF rectF = this.q.i;
                rectF.set(rect);
                g.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void a(View view, Rect rect) {
        RecyclerView.a(view, rect);
    }

    public int h(View view) {
        return view.getLeft() - n(view);
    }

    public int i(View view) {
        return view.getTop() - l(view);
    }

    public int j(View view) {
        return view.getRight() + o(view);
    }

    public int k(View view) {
        return view.getBottom() + m(view);
    }

    public void b(View view, Rect rect) {
        if (this.q == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(this.q.f(view));
        }
    }

    public int l(View view) {
        return ((aeg) view.getLayoutParams()).d.top;
    }

    public int m(View view) {
        return ((aeg) view.getLayoutParams()).d.bottom;
    }

    public int n(View view) {
        return ((aeg) view.getLayoutParams()).d.left;
    }

    public int o(View view) {
        return ((aeg) view.getLayoutParams()).d.right;
    }

    public View a(View view, int i, aek aek, aep aep) {
        return null;
    }

    public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        int B = B();
        int C = C();
        int z2 = z() - D();
        int A = A() - E();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = left + rect.width();
        int height = top + rect.height();
        int min = Math.min(0, left - B);
        int min2 = Math.min(0, top - C);
        int max = Math.max(0, width - z2);
        A = Math.max(0, height - A);
        if (v() == 1) {
            if (max == 0) {
                max = Math.max(min, width - z2);
            }
            min = max;
        } else {
            if (min != 0) {
                max = min;
            } else {
                max = Math.min(left - B, max);
            }
            min = max;
        }
        if (min2 != 0) {
            max = min2;
        } else {
            max = Math.min(top - C, A);
        }
        if (min == 0 && max == 0) {
            return false;
        }
        if (z) {
            recyclerView.scrollBy(min, max);
        } else {
            recyclerView.a(min, max);
        }
        return true;
    }

    @Deprecated
    public boolean c(RecyclerView recyclerView) {
        return u() || recyclerView.o();
    }

    public boolean a(RecyclerView recyclerView, View view, View view2) {
        return c(recyclerView);
    }

    public void b() {
    }

    public void a() {
    }

    public void c() {
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
    }

    public void d() {
    }

    public int e(aep aep) {
        return 0;
    }

    public int c(aep aep) {
        return 0;
    }

    public int g(aep aep) {
        return 0;
    }

    public int f(aep aep) {
        return 0;
    }

    public int d(aep aep) {
        return 0;
    }

    public int h(aep aep) {
        return 0;
    }

    public void d(int i, int i2) {
        this.q.e(i, i2);
    }

    public void e(int i, int i2) {
        this.q.setMeasuredDimension(i, i2);
    }

    public int H() {
        return oa.k(this.q);
    }

    public int I() {
        return oa.l(this.q);
    }

    public Parcelable g() {
        return null;
    }

    public void a(Parcelable parcelable) {
    }

    public void J() {
        if (this.r != null) {
            this.r.c();
        }
    }

    public void c(aek aek) {
        for (int w = w() - 1; w >= 0; w--) {
            if (!RecyclerView.d(g(w)).c()) {
                a(w, aek);
            }
        }
    }

    void a(ql qlVar) {
        a(this.q.c, this.q.x, qlVar);
    }

    public void a(aek aek, aep aep, ql qlVar) {
        if (oa.b(this.q, -1) || oa.a(this.q, -1)) {
            qlVar.a(8192);
            qlVar.k(true);
        }
        if (oa.b(this.q, 1) || oa.a(this.q, 1)) {
            qlVar.a(4096);
            qlVar.k(true);
        }
        qlVar.a(new qv(ql.a.a(a(aek, aep), b(aek, aep), false, 0)));
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        aek aek = this.q.c;
        aep aep = this.q.x;
        b(accessibilityEvent);
    }

    public void b(AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        rf a = qf.a(accessibilityEvent);
        if (this.q != null) {
            if (!(oa.b(this.q, 1) || oa.b(this.q, -1) || oa.a(this.q, -1) || oa.a(this.q, 1))) {
                z = false;
            }
            a.a(z);
            if (this.q.j != null) {
                a.a(this.q.j.a());
            }
        }
    }

    void a(View view, ql qlVar) {
        aer d = RecyclerView.d(view);
        if (d != null && !d.n() && !this.p.c(d.a)) {
            a(this.q.c, this.q.x, view, qlVar);
        }
    }

    public void a(aek aek, aep aep, View view, ql qlVar) {
        int d;
        int d2 = i() ? d(view) : 0;
        if (h()) {
            d = d(view);
        } else {
            d = 0;
        }
        qlVar.b(qw.a(d2, 1, d, 1, false, false));
    }

    public int a(aek aek, aep aep) {
        if (this.q == null || this.q.j == null || !i()) {
            return 1;
        }
        return this.q.j.a();
    }

    public int b(aek aek, aep aep) {
        if (this.q == null || this.q.j == null || !h()) {
            return 1;
        }
        return this.q.j.a();
    }

    boolean a(int i, Bundle bundle) {
        aek aek = this.q.c;
        aep aep = this.q.x;
        return j(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(int r7) {
        /*
        r6 = this;
        r4 = -1;
        r2 = 1;
        r1 = 0;
        r0 = r6.q;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        switch(r7) {
            case 4096: goto L_0x004a;
            case 8192: goto L_0x0018;
            default: goto L_0x000b;
        };
    L_0x000b:
        r0 = r1;
        r3 = r1;
    L_0x000d:
        if (r3 != 0) goto L_0x0011;
    L_0x000f:
        if (r0 == 0) goto L_0x0007;
    L_0x0011:
        r1 = r6.q;
        r1.scrollBy(r0, r3);
        r1 = r2;
        goto L_0x0007;
    L_0x0018:
        r0 = r6.q;
        r0 = oa.b(r0, r4);
        if (r0 == 0) goto L_0x007f;
    L_0x0020:
        r0 = r6.A();
        r3 = r6.C();
        r0 = r0 - r3;
        r3 = r6.E();
        r0 = r0 - r3;
        r0 = -r0;
    L_0x002f:
        r3 = r6.q;
        r3 = oa.a(r3, r4);
        if (r3 == 0) goto L_0x007a;
    L_0x0037:
        r3 = r6.z();
        r4 = r6.B();
        r3 = r3 - r4;
        r4 = r6.D();
        r3 = r3 - r4;
        r3 = -r3;
        r5 = r3;
        r3 = r0;
        r0 = r5;
        goto L_0x000d;
    L_0x004a:
        r0 = r6.q;
        r0 = oa.b(r0, r2);
        if (r0 == 0) goto L_0x007d;
    L_0x0052:
        r0 = r6.A();
        r3 = r6.C();
        r0 = r0 - r3;
        r3 = r6.E();
        r0 = r0 - r3;
    L_0x0060:
        r3 = r6.q;
        r3 = oa.a(r3, r2);
        if (r3 == 0) goto L_0x007a;
    L_0x0068:
        r3 = r6.z();
        r4 = r6.B();
        r3 = r3 - r4;
        r4 = r6.D();
        r3 = r3 - r4;
        r5 = r3;
        r3 = r0;
        r0 = r5;
        goto L_0x000d;
    L_0x007a:
        r3 = r0;
        r0 = r1;
        goto L_0x000d;
    L_0x007d:
        r0 = r1;
        goto L_0x0060;
    L_0x007f:
        r0 = r1;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: aef.j(int):boolean");
    }

    boolean a(View view, int i, Bundle bundle) {
        aek aek = this.q.c;
        aep aep = this.q.x;
        return false;
    }

    public void d(RecyclerView recyclerView) {
        a(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public boolean o() {
        return false;
    }

    boolean K() {
        int w = w();
        for (int i = 0; i < w; i++) {
            LayoutParams layoutParams = g(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }
}
