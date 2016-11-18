package p000;

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

public abstract class aef {
    private boolean f251a = true;
    private int f252b;
    private int f253c;
    private int f254d;
    private int f255e;
    abq f256p;
    public RecyclerView f257q;
    public u f258r;
    public boolean f259s = false;
    boolean f260t = false;
    public boolean f261u = false;

    public abstract aeg mo55e();

    public void m423a(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f257q = null;
            this.f256p = null;
            this.f254d = 0;
            this.f255e = 0;
        } else {
            this.f257q = recyclerView;
            this.f256p = recyclerView.f1443e;
            this.f254d = recyclerView.getWidth();
            this.f255e = recyclerView.getHeight();
        }
        this.f252b = 1073741824;
        this.f253c = 1073741824;
    }

    public void m415a(int i, int i2) {
        this.f254d = MeasureSpec.getSize(i);
        this.f252b = MeasureSpec.getMode(i);
        if (this.f252b == 0 && !RecyclerView.f1421b) {
            this.f254d = 0;
        }
        this.f255e = MeasureSpec.getSize(i2);
        this.f253c = MeasureSpec.getMode(i2);
        if (this.f253c == 0 && !RecyclerView.f1421b) {
            this.f255e = 0;
        }
    }

    public void m448b(int i, int i2) {
        int i3 = Integer.MAX_VALUE;
        int i4 = nzf.UNSET_ENUM_VALUE;
        int w = m503w();
        if (w == 0) {
            this.f257q.m3084e(i, i2);
            return;
        }
        int i5 = nzf.UNSET_ENUM_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < w; i7++) {
            View g = m484g(i7);
            g.getLayoutParams();
            Rect rect = this.f257q.f1446h;
            m432a(g, rect);
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
        this.f257q.f1446h.set(i6, i3, i5, i4);
        mo72a(this.f257q.f1446h, i, i2);
    }

    public void mo72a(Rect rect, int i, int i2) {
        m476e(aef.m394a(i, (rect.width() + m399B()) + m401D(), m405H()), aef.m394a(i2, (rect.height() + m400C()) + m402E(), m406I()));
    }

    public void m500t() {
        if (this.f257q != null) {
            this.f257q.requestLayout();
        }
    }

    public static int m394a(int i, int i2, int i3) {
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

    public void mo47a(String str) {
        if (this.f257q != null) {
            this.f257q.m3060a(str);
        }
    }

    public void m465c(boolean z) {
        this.f261u = true;
    }

    public boolean mo57f() {
        return false;
    }

    public void m450b(RecyclerView recyclerView) {
        this.f260t = true;
    }

    public void m451b(RecyclerView recyclerView, aek aek) {
        this.f260t = false;
        mo45a(recyclerView, aek);
    }

    public void mo45a(RecyclerView recyclerView, aek aek) {
    }

    public void mo52c(aek aek, aep aep) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void mo43a(aep aep) {
    }

    public boolean mo74a(aeg aeg) {
        return aeg != null;
    }

    public aeg mo66a(LayoutParams layoutParams) {
        if (layoutParams instanceof aeg) {
            return new aeg((aeg) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new aeg((MarginLayoutParams) layoutParams);
        }
        return new aeg(layoutParams);
    }

    public aeg mo65a(Context context, AttributeSet attributeSet) {
        return new aeg(context, attributeSet);
    }

    public int mo41a(int i, aek aek, aep aep) {
        return 0;
    }

    public int mo48b(int i, aek aek, aep aep) {
        return 0;
    }

    public boolean mo61h() {
        return false;
    }

    public boolean mo62i() {
        return false;
    }

    public void mo51c(int i) {
    }

    public boolean m501u() {
        return this.f258r != null && this.f258r.e();
    }

    public int m502v() {
        return oa.d(this.f257q);
    }

    public void m426a(View view) {
        m427a(view, -1);
    }

    public void m427a(View view, int i) {
        m396a(view, i, true);
    }

    public void m452b(View view) {
        m453b(view, -1);
    }

    public void m453b(View view, int i) {
        m396a(view, i, false);
    }

    private void m396a(View view, int i, boolean z) {
        aer d = RecyclerView.m3038d(view);
        if (z || d.m874n()) {
            this.f257q.f1444f.m1013e(d);
        } else {
            this.f257q.f1444f.m1014f(d);
        }
        aeg aeg = (aeg) view.getLayoutParams();
        if (d.m868h() || d.m866f()) {
            if (d.m866f()) {
                d.m867g();
            } else {
                d.m869i();
            }
            this.f256p.m234a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f257q) {
            int b = this.f256p.m238b(view);
            if (i == -1) {
                i = this.f256p.m237b();
            }
            if (b == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f257q.indexOfChild(view));
            } else if (b != i) {
                this.f257q.f1449k.m460c(b, i);
            }
        } else {
            this.f256p.m235a(view, i, false);
            aeg.f288e = true;
            if (this.f258r != null && this.f258r.e()) {
                this.f258r.b(view);
            }
        }
        if (aeg.f289f) {
            d.f438a.invalidate();
            aeg.f289f = false;
        }
    }

    public void m463c(View view) {
        this.f256p.m233a(view);
    }

    public void m475e(int i) {
        if (m484g(i) != null) {
            this.f256p.m232a(i);
        }
    }

    public int m468d(View view) {
        return ((aeg) view.getLayoutParams()).m613f();
    }

    public View m474e(View view) {
        if (this.f257q == null) {
            return null;
        }
        View b = this.f257q.m3066b(view);
        if (b == null || this.f256p.m242c(b)) {
            return null;
        }
        return b;
    }

    public View mo49b(int i) {
        int w = m503w();
        for (int i2 = 0; i2 < w; i2++) {
            View g = m484g(i2);
            aer d = RecyclerView.m3038d(g);
            if (d != null && d.m864d() == i && !d.m863c() && (this.f257q.f1462x.m842a() || !d.m874n())) {
                return g;
            }
        }
        return null;
    }

    public void m479f(int i) {
        m484g(i);
        this.f256p.m243d(i);
    }

    public void m430a(View view, int i, aeg aeg) {
        aer d = RecyclerView.m3038d(view);
        if (d.m874n()) {
            this.f257q.f1444f.m1013e(d);
        } else {
            this.f257q.f1444f.m1014f(d);
        }
        this.f256p.m234a(view, i, aeg, d.m874n());
    }

    public void m464c(View view, int i) {
        m430a(view, i, (aeg) view.getLayoutParams());
    }

    public void m460c(int i, int i2) {
        View g = m484g(i);
        if (g == null) {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i);
        }
        m479f(i);
        m464c(g, i2);
    }

    public void m431a(View view, aek aek) {
        m463c(view);
        aek.m811a(view);
    }

    public void m416a(int i, aek aek) {
        View g = m484g(i);
        m475e(i);
        aek.m811a(g);
    }

    public int m503w() {
        return this.f256p != null ? this.f256p.m237b() : 0;
    }

    public View m484g(int i) {
        return this.f256p != null ? this.f256p.m239b(i) : null;
    }

    public int m504x() {
        return this.f252b;
    }

    public int m505y() {
        return this.f253c;
    }

    public int m506z() {
        return this.f254d;
    }

    public int m398A() {
        return this.f255e;
    }

    public int m399B() {
        return this.f257q != null ? this.f257q.getPaddingLeft() : 0;
    }

    public int m400C() {
        return this.f257q != null ? this.f257q.getPaddingTop() : 0;
    }

    public int m401D() {
        return this.f257q != null ? this.f257q.getPaddingRight() : 0;
    }

    public int m402E() {
        return this.f257q != null ? this.f257q.getPaddingBottom() : 0;
    }

    public View m403F() {
        if (this.f257q == null) {
            return null;
        }
        View focusedChild = this.f257q.getFocusedChild();
        if (focusedChild == null || this.f256p.m242c(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int m404G() {
        ady b = this.f257q != null ? this.f257q.m3065b() : null;
        return b != null ? b.mo736a() : 0;
    }

    public void m487h(int i) {
        if (this.f257q != null) {
            this.f257q.m3087f(i);
        }
    }

    public void m490i(int i) {
        if (this.f257q != null) {
            this.f257q.m3083e(i);
        }
    }

    public void m417a(aek aek) {
        for (int w = m503w() - 1; w >= 0; w--) {
            View g = m484g(w);
            aer d = RecyclerView.m3038d(g);
            if (!d.m863c()) {
                if (!d.m871k() || d.m874n() || this.f257q.f1448j.f362a) {
                    m479f(w);
                    aek.m820c(g);
                    this.f257q.f1444f.m1016h(d);
                } else {
                    m475e(w);
                    aek.m810a(d);
                }
            }
        }
    }

    public void m449b(aek aek) {
        int c = aek.m817c();
        for (int i = c - 1; i >= 0; i--) {
            View c2 = aek.m818c(i);
            aer d = RecyclerView.m3038d(c2);
            if (!d.m863c()) {
                d.m859a(false);
                if (d.m875o()) {
                    this.f257q.removeDetachedView(c2, false);
                }
                if (this.f257q.f1460v != null) {
                    this.f257q.f1460v.mo35c(d);
                }
                d.m859a(true);
                aek.m816b(c2);
            }
        }
        aek.m821d();
        if (c > 0) {
            this.f257q.invalidate();
        }
    }

    boolean m442a(View view, int i, int i2, aeg aeg) {
        return (this.f251a && aef.m397b(view.getMeasuredWidth(), i, aeg.width) && aef.m397b(view.getMeasuredHeight(), i2, aeg.height)) ? false : true;
    }

    boolean m456b(View view, int i, int i2, aeg aeg) {
        return (!view.isLayoutRequested() && this.f251a && aef.m397b(view.getWidth(), i, aeg.width) && aef.m397b(view.getHeight(), i2, aeg.height)) ? false : true;
    }

    private static boolean m397b(int i, int i2, int i3) {
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
            case 0:
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

    public void m428a(View view, int i, int i2) {
        aeg aeg = (aeg) view.getLayoutParams();
        Rect f = this.f257q.m3085f(view);
        int i3 = (f.left + f.right) + 0;
        int i4 = (f.bottom + f.top) + 0;
        i3 = aef.m395a(m506z(), m504x(), i3 + (((m399B() + m401D()) + aeg.leftMargin) + aeg.rightMargin), aeg.width, mo61h());
        i4 = aef.m395a(m398A(), m505y(), i4 + (((m400C() + m402E()) + aeg.topMargin) + aeg.bottomMargin), aeg.height, mo62i());
        if (m456b(view, i3, i4, aeg)) {
            view.measure(i3, i4);
        }
    }

    public static int m395a(int i, int i2, int i3, int i4, boolean z) {
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

    public int m478f(View view) {
        Rect rect = ((aeg) view.getLayoutParams()).f287d;
        return rect.right + (view.getMeasuredWidth() + rect.left);
    }

    public int m482g(View view) {
        Rect rect = ((aeg) view.getLayoutParams()).f287d;
        return rect.bottom + (view.getMeasuredHeight() + rect.top);
    }

    public void m429a(View view, int i, int i2, int i3, int i4) {
        aeg aeg = (aeg) view.getLayoutParams();
        Rect rect = aeg.f287d;
        view.layout((rect.left + i) + aeg.leftMargin, (rect.top + i2) + aeg.topMargin, (i3 - rect.right) - aeg.rightMargin, (i4 - rect.bottom) - aeg.bottomMargin);
    }

    public void m434a(View view, boolean z, Rect rect) {
        Rect rect2 = ((aeg) view.getLayoutParams()).f287d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, rect2.bottom + view.getHeight());
        if (this.f257q != null) {
            Matrix g = oa.a.g(view);
            if (!(g == null || g.isIdentity())) {
                RectF rectF = this.f257q.f1447i;
                rectF.set(rect);
                g.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void m432a(View view, Rect rect) {
        RecyclerView.m3033a(view, rect);
    }

    public int m486h(View view) {
        return view.getLeft() - m497n(view);
    }

    public int m489i(View view) {
        return view.getTop() - m495l(view);
    }

    public int m492j(View view) {
        return view.getRight() + m498o(view);
    }

    public int m494k(View view) {
        return view.getBottom() + m496m(view);
    }

    public void m454b(View view, Rect rect) {
        if (this.f257q == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(this.f257q.m3085f(view));
        }
    }

    public int m495l(View view) {
        return ((aeg) view.getLayoutParams()).f287d.top;
    }

    public int m496m(View view) {
        return ((aeg) view.getLayoutParams()).f287d.bottom;
    }

    public int m497n(View view) {
        return ((aeg) view.getLayoutParams()).f287d.left;
    }

    public int m498o(View view) {
        return ((aeg) view.getLayoutParams()).f287d.right;
    }

    public View mo42a(View view, int i, aek aek, aep aep) {
        return null;
    }

    public boolean m440a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        int B = m399B();
        int C = m400C();
        int z2 = m506z() - m401D();
        int A = m398A() - m402E();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = left + rect.width();
        int height = top + rect.height();
        int min = Math.min(0, left - B);
        int min2 = Math.min(0, top - C);
        int max = Math.max(0, width - z2);
        A = Math.max(0, height - A);
        if (m502v() == 1) {
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
            recyclerView.m3047a(min, max);
        }
        return true;
    }

    @Deprecated
    public boolean m466c(RecyclerView recyclerView) {
        return m501u() || recyclerView.m3101o();
    }

    public boolean m441a(RecyclerView recyclerView, View view, View view2) {
        return m466c(recyclerView);
    }

    public void mo76b() {
    }

    public void mo68a() {
    }

    public void mo77c() {
    }

    public void mo73a(RecyclerView recyclerView, int i, int i2) {
    }

    public void mo78d() {
    }

    public int mo54e(aep aep) {
        return 0;
    }

    public int mo50c(aep aep) {
        return 0;
    }

    public int mo58g(aep aep) {
        return 0;
    }

    public int mo56f(aep aep) {
        return 0;
    }

    public int mo53d(aep aep) {
        return 0;
    }

    public int mo60h(aep aep) {
        return 0;
    }

    public void m470d(int i, int i2) {
        this.f257q.m3084e(i, i2);
    }

    public void m476e(int i, int i2) {
        this.f257q.setMeasuredDimension(i, i2);
    }

    public int m405H() {
        return oa.k(this.f257q);
    }

    public int m406I() {
        return oa.l(this.f257q);
    }

    public Parcelable mo59g() {
        return null;
    }

    public void mo44a(Parcelable parcelable) {
    }

    public void m407J() {
        if (this.f258r != null) {
            this.f258r.c();
        }
    }

    public void m461c(aek aek) {
        for (int w = m503w() - 1; w >= 0; w--) {
            if (!RecyclerView.m3038d(m484g(w)).m863c()) {
                m416a(w, aek);
            }
        }
    }

    void m437a(ql qlVar) {
        m419a(this.f257q.f1441c, this.f257q.f1462x, qlVar);
    }

    public void m419a(aek aek, aep aep, ql qlVar) {
        if (oa.b(this.f257q, -1) || oa.a(this.f257q, -1)) {
            qlVar.a(8192);
            qlVar.k(true);
        }
        if (oa.b(this.f257q, 1) || oa.a(this.f257q, 1)) {
            qlVar.a(4096);
            qlVar.k(true);
        }
        qlVar.a(new qv(ql.a.a(mo64a(aek, aep), mo75b(aek, aep), false, 0)));
    }

    public void mo46a(AccessibilityEvent accessibilityEvent) {
        aek aek = this.f257q.f1441c;
        aep aep = this.f257q.f1462x;
        m455b(accessibilityEvent);
    }

    public void m455b(AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        rf a = qf.m33682a(accessibilityEvent);
        if (this.f257q != null) {
            if (!(oa.b(this.f257q, 1) || oa.b(this.f257q, -1) || oa.a(this.f257q, -1) || oa.a(this.f257q, 1))) {
                z = false;
            }
            a.m33693a(z);
            if (this.f257q.f1448j != null) {
                a.m33691a(this.f257q.f1448j.mo736a());
            }
        }
    }

    void m433a(View view, ql qlVar) {
        aer d = RecyclerView.m3038d(view);
        if (d != null && !d.m874n() && !this.f256p.m242c(d.f438a)) {
            mo71a(this.f257q.f1441c, this.f257q.f1462x, view, qlVar);
        }
    }

    public void mo71a(aek aek, aep aep, View view, ql qlVar) {
        int d;
        int d2 = mo62i() ? m468d(view) : 0;
        if (mo61h()) {
            d = m468d(view);
        } else {
            d = 0;
        }
        qlVar.b(qw.a(d2, 1, d, 1, false, false));
    }

    public int mo64a(aek aek, aep aep) {
        if (this.f257q == null || this.f257q.f1448j == null || !mo62i()) {
            return 1;
        }
        return this.f257q.f1448j.mo736a();
    }

    public int mo75b(aek aek, aep aep) {
        if (this.f257q == null || this.f257q.f1448j == null || !mo61h()) {
            return 1;
        }
        return this.f257q.f1448j.mo736a();
    }

    boolean m438a(int i, Bundle bundle) {
        aek aek = this.f257q.f1441c;
        aep aep = this.f257q.f1462x;
        return m493j(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m493j(int i) {
        if (this.f257q == null) {
            return false;
        }
        int A;
        int i2;
        switch (i) {
            case 4096:
                if (oa.b(this.f257q, 1)) {
                    A = (m398A() - m400C()) - m402E();
                } else {
                    A = 0;
                }
                if (oa.a(this.f257q, 1)) {
                    i2 = A;
                    A = (m506z() - m399B()) - m401D();
                    break;
                }
            case 8192:
                if (oa.b(this.f257q, -1)) {
                    A = -((m398A() - m400C()) - m402E());
                } else {
                    A = 0;
                }
                if (oa.a(this.f257q, -1)) {
                    i2 = A;
                    A = -((m506z() - m399B()) - m401D());
                    break;
                }
            default:
                A = 0;
                i2 = 0;
                break;
        }
        if (i2 == 0 && A == 0) {
            return false;
        }
        this.f257q.scrollBy(A, i2);
        return true;
    }

    boolean m443a(View view, int i, Bundle bundle) {
        aek aek = this.f257q.f1441c;
        aep aep = this.f257q.f1462x;
        return false;
    }

    public void m471d(RecyclerView recyclerView) {
        m415a(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public boolean mo63o() {
        return false;
    }

    boolean m408K() {
        int w = m503w();
        for (int i = 0; i < w; i++) {
            LayoutParams layoutParams = m484g(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }
}
