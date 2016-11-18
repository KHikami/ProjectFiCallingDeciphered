package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public final class acr extends acx {
    boolean a = false;
    int b = -1;
    int[] c;
    View[] d;
    final SparseIntArray e = new SparseIntArray();
    final SparseIntArray f = new SparseIntArray();
    acu g = new acs();
    final Rect h = new Rect();

    public acr(Context context, int i) {
        super(context);
        l(1);
    }

    public int a(aek aek, aep aep) {
        if (this.i == 0) {
            return this.b;
        }
        if (aep.d() <= 0) {
            return 0;
        }
        return a(aek, aep, aep.d() - 1) + 1;
    }

    public int b(aek aek, aep aep) {
        if (this.i == 1) {
            return this.b;
        }
        if (aep.d() <= 0) {
            return 0;
        }
        return a(aek, aep, aep.d() - 1) + 1;
    }

    public void a(aek aek, aep aep, View view, ql qlVar) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof act) {
            act act = (act) layoutParams;
            int a = a(aek, aep, act.f());
            if (this.i == 0) {
                int a2 = act.a();
                int b = act.b();
                boolean z = this.b > 1 && act.b() == this.b;
                qlVar.b(qw.a(a2, b, a, 1, z, false));
                return;
            }
            int a3 = act.a();
            int b2 = act.b();
            boolean z2 = this.b > 1 && act.b() == this.b;
            qlVar.b(qw.a(a, 1, a3, b2, z2, false));
            return;
        }
        super.a(view, qlVar);
    }

    public void c(aek aek, aep aep) {
        if (aep.a()) {
            int w = w();
            for (int i = 0; i < w; i++) {
                act act = (act) g(i).getLayoutParams();
                int f = act.f();
                this.e.put(f, act.b());
                this.f.put(f, act.a());
            }
        }
        super.c(aek, aep);
        this.e.clear();
        this.f.clear();
    }

    public void a(aep aep) {
        super.a(aep);
        this.a = false;
    }

    public void a() {
        this.g.a();
    }

    public void b() {
        this.g.a();
    }

    public void c() {
        this.g.a();
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        this.g.a();
    }

    public void d() {
        this.g.a();
    }

    public aeg e() {
        if (this.i == 0) {
            return new act(-2, -1);
        }
        return new act(-1, -2);
    }

    public aeg a(Context context, AttributeSet attributeSet) {
        return new act(context, attributeSet);
    }

    public aeg a(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new act((MarginLayoutParams) layoutParams);
        }
        return new act(layoutParams);
    }

    public boolean a(aeg aeg) {
        return aeg instanceof act;
    }

    private void L() {
        int z;
        if (j() == 1) {
            z = (z() - D()) - B();
        } else {
            z = (A() - E()) - C();
        }
        k(z);
    }

    public void a(Rect rect, int i, int i2) {
        if (this.c == null) {
            super.a(rect, i, i2);
        }
        int D = D() + B();
        int C = C() + E();
        if (this.i == 1) {
            C = aef.a(i2, C + rect.height(), I());
            D = aef.a(i, D + this.c[this.c.length - 1], H());
        } else {
            D = aef.a(i, D + rect.width(), H());
            C = aef.a(i2, C + this.c[this.c.length - 1], I());
        }
        e(D, C);
    }

    private void k(int i) {
        int i2 = 0;
        int[] iArr = this.c;
        int i3 = this.b;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        iArr[0] = 0;
        int i4 = i / i3;
        int i5 = i % i3;
        int i6 = 0;
        for (int i7 = 1; i7 <= i3; i7++) {
            int i8;
            i2 += i5;
            if (i2 <= 0 || i3 - i2 >= i5) {
                i8 = i4;
            } else {
                i8 = i4 + 1;
                i2 -= i3;
            }
            i6 += i8;
            iArr[i7] = i6;
        }
        this.c = iArr;
    }

    private int f(int i, int i2) {
        if (this.i == 1 && k()) {
            return this.c[this.b - i] - this.c[(this.b - i) - i2];
        }
        return this.c[i + i2] - this.c[i];
    }

    void a(aek aek, aep aep, acy acy, int i) {
        Object obj = 1;
        super.a(aek, aep, acy, i);
        L();
        if (aep.d() > 0 && !aep.a()) {
            if (i != 1) {
                obj = null;
            }
            int b = b(aek, aep, acy.a);
            if (obj != null) {
                while (b > 0 && acy.a > 0) {
                    acy.a--;
                    b = b(aek, aep, acy.a);
                }
            } else {
                int d = aep.d() - 1;
                int i2 = acy.a;
                int i3 = b;
                while (i2 < d) {
                    b = b(aek, aep, i2 + 1);
                    if (b <= i3) {
                        break;
                    }
                    i2++;
                    i3 = b;
                }
                acy.a = i2;
            }
        }
        M();
    }

    private void M() {
        if (this.d == null || this.d.length != this.b) {
            this.d = new View[this.b];
        }
    }

    public int a(int i, aek aek, aep aep) {
        L();
        M();
        return super.a(i, aek, aep);
    }

    public int b(int i, aek aek, aep aep) {
        L();
        M();
        return super.b(i, aek, aep);
    }

    View a(aek aek, aep aep, int i, int i2, int i3) {
        int i4;
        View view = null;
        l();
        int c = this.j.c();
        int d = this.j.d();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view2 = null;
        while (i != i2) {
            View view3;
            View g = g(i);
            int d2 = d(g);
            if (d2 >= 0 && d2 < i3 && b(aek, aep, d2) == 0) {
                if (((aeg) g.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view3 = view;
                        i += i4;
                        view = view3;
                        view2 = g;
                    }
                } else if (this.j.a(g) < d && this.j.b(g) >= c) {
                    return g;
                } else {
                    if (view == null) {
                        view3 = g;
                        g = view2;
                        i += i4;
                        view = view3;
                        view2 = g;
                    }
                }
            }
            view3 = view;
            g = view2;
            i += i4;
            view = view3;
            view2 = g;
        }
        return view != null ? view : view2;
    }

    private int a(aek aek, aep aep, int i) {
        if (!aep.a()) {
            return this.g.c(i, this.b);
        }
        int a = aek.a(i);
        if (a != -1) {
            return this.g.c(a, this.b);
        }
        new StringBuilder("Cannot find span size for pre layout position. ").append(i);
        return 0;
    }

    private int b(aek aek, aep aep, int i) {
        if (!aep.a()) {
            return this.g.b(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        i2 = aek.a(i);
        if (i2 != -1) {
            return this.g.b(i2, this.b);
        }
        new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i);
        return 0;
    }

    private int c(aek aek, aep aep, int i) {
        if (!aep.a()) {
            return 1;
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (aek.a(i) != -1) {
            return 1;
        }
        new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i);
        return 1;
    }

    void a(aek aek, aep aep, ada ada, acz acz) {
        boolean z;
        int i;
        int i2 = this.j.i();
        Object obj = i2 != 1073741824 ? 1 : null;
        int i3 = w() > 0 ? this.c[this.b] : 0;
        if (obj != null) {
            L();
        }
        if (ada.e == 1) {
            z = true;
        } else {
            z = false;
        }
        int i4 = this.b;
        if (z) {
            i = 0;
        } else {
            i4 = b(aek, aep, ada.d) + c(aek, aep, ada.d);
            i = 0;
        }
        while (i < this.b && ada.a(aep) && i4 > 0) {
            int i5 = ada.d;
            int c = c(aek, aep, i5);
            if (c <= this.b) {
                i4 -= c;
                if (i4 < 0) {
                    break;
                }
                View a = ada.a(aek);
                if (a == null) {
                    break;
                }
                this.d[i] = a;
                i++;
            } else {
                throw new IllegalArgumentException("Item at position " + i5 + " requires " + c + " spans but GridLayoutManager has only " + this.b + " spans.");
            }
        }
        if (i == 0) {
            acz.b = true;
            return;
        }
        int i6;
        int i7;
        i5 = 0;
        float f = 0.0f;
        a(aek, aep, i, z);
        int i8 = 0;
        while (i8 < i) {
            View view = this.d[i8];
            if (ada.k == null) {
                if (z) {
                    b(view);
                } else {
                    b(view, 0);
                }
            } else if (z) {
                a(view);
            } else {
                a(view, 0);
            }
            b(view, this.h);
            a(view, i2, false);
            i4 = this.j.e(view);
            if (i4 > i5) {
                i5 = i4;
            }
            float f2 = (((float) this.j.f(view)) * 1.0f) / ((float) ((act) view.getLayoutParams()).b);
            if (f2 <= f) {
                f2 = f;
            }
            i8++;
            f = f2;
        }
        if (obj != null) {
            k(Math.max(Math.round(((float) this.b) * f), i3));
            i6 = 0;
            i7 = 0;
            while (i7 < i) {
                View view2 = this.d[i7];
                a(view2, 1073741824, true);
                i4 = this.j.e(view2);
                if (i4 <= i6) {
                    i4 = i6;
                }
                i7++;
                i6 = i4;
            }
        } else {
            i6 = i5;
        }
        for (i5 = 0; i5 < i; i5++) {
            View view3 = this.d[i5];
            if (this.j.e(view3) != i6) {
                act act = (act) view3.getLayoutParams();
                Rect rect = act.d;
                i8 = ((rect.top + rect.bottom) + act.topMargin) + act.bottomMargin;
                i7 = ((rect.right + rect.left) + act.leftMargin) + act.rightMargin;
                i3 = f(act.a, act.b);
                if (this.i == 1) {
                    i7 = aef.a(i3, 1073741824, i7, act.width, false);
                    i4 = MeasureSpec.makeMeasureSpec(i6 - i8, 1073741824);
                } else {
                    i7 = MeasureSpec.makeMeasureSpec(i6 - i7, 1073741824);
                    i4 = aef.a(i3, 1073741824, i8, act.height, false);
                }
                a(view3, i7, i4, true);
            }
        }
        acz.a = i6;
        i4 = 0;
        if (this.i == 1) {
            if (ada.f == -1) {
                i4 = ada.b;
                i6 = i4 - i6;
                i7 = 0;
                i5 = 0;
            } else {
                i7 = ada.b;
                i4 = i7 + i6;
                i6 = i7;
                i7 = 0;
                i5 = 0;
            }
        } else if (ada.f == -1) {
            i5 = ada.b;
            i7 = i5;
            i5 -= i6;
            i6 = 0;
        } else {
            i5 = ada.b;
            i7 = i6 + i5;
            i6 = 0;
        }
        i8 = i4;
        c = i7;
        i7 = i5;
        i5 = i6;
        for (i2 = 0; i2 < i; i2++) {
            View view4 = this.d[i2];
            act act2 = (act) view4.getLayoutParams();
            if (this.i != 1) {
                i5 = this.c[act2.a] + C();
                i8 = i5 + this.j.f(view4);
            } else if (k()) {
                c = B() + this.c[this.b - act2.a];
                i7 = c - this.j.f(view4);
            } else {
                i7 = this.c[act2.a] + B();
                c = i7 + this.j.f(view4);
            }
            a(view4, i7, i5, c, i8);
            if (act2.d() || act2.e()) {
                acz.c = true;
            }
            acz.d |= view4.isFocusable();
        }
        Arrays.fill(this.d, null);
    }

    private void a(View view, int i, boolean z) {
        int a;
        act act = (act) view.getLayoutParams();
        Rect rect = act.d;
        int i2 = ((rect.top + rect.bottom) + act.topMargin) + act.bottomMargin;
        int i3 = act.rightMargin + ((rect.right + rect.left) + act.leftMargin);
        int f = f(act.a, act.b);
        if (this.i == 1) {
            f = aef.a(f, i, i3, act.width, false);
            a = aef.a(this.j.f(), y(), i2, act.height, true);
        } else {
            int a2 = aef.a(f, i, i2, act.height, false);
            f = aef.a(this.j.f(), x(), i3, act.width, true);
            a = a2;
        }
        a(view, f, a, z);
    }

    private void a(View view, int i, int i2, boolean z) {
        boolean a;
        aeg aeg = (aeg) view.getLayoutParams();
        if (z) {
            a = a(view, i, i2, aeg);
        } else {
            a = b(view, i, i2, aeg);
        }
        if (a) {
            view.measure(i, i2);
        }
    }

    private void a(aek aek, aep aep, int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = 1;
            i3 = 0;
        } else {
            i2 = i - 1;
            i = -1;
            i3 = i2;
            i2 = -1;
        }
        int i4 = 0;
        for (int i5 = i3; i5 != i; i5 += i2) {
            View view = this.d[i5];
            act act = (act) view.getLayoutParams();
            act.b = c(aek, aep, d(view));
            act.a = i4;
            i4 += act.b;
        }
    }

    private void l(int i) {
        if (i != this.b) {
            this.a = true;
            if (i <= 0) {
                throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
            }
            this.b = i;
            this.g.a();
            t();
        }
    }

    public View a(View view, int i, aek aek, aep aep) {
        View e = e(view);
        if (e == null) {
            return null;
        }
        act act = (act) e.getLayoutParams();
        int i2 = act.a;
        int i3 = act.a + act.b;
        if (super.a(view, i, aek, aep) == null) {
            return null;
        }
        int w;
        int i4;
        int i5;
        if (((d(i) == 1) != this.k ? 1 : null) != null) {
            w = w() - 1;
            i4 = -1;
            i5 = -1;
        } else {
            w = 0;
            i4 = 1;
            i5 = w();
        }
        Object obj = (this.i == 1 && k()) ? 1 : null;
        View view2 = null;
        int i6 = -1;
        int i7 = 0;
        int i8 = w;
        while (i8 != i5) {
            View g = g(i8);
            if (g == e) {
                break;
            }
            View view3;
            if (g.isFocusable()) {
                act = (act) g.getLayoutParams();
                int i9 = act.a;
                int i10 = act.a + act.b;
                if (i9 == i2 && i10 == i3) {
                    return g;
                }
                Object obj2 = null;
                if (view2 == null) {
                    obj2 = 1;
                } else {
                    int min = Math.min(i10, i3) - Math.max(i9, i2);
                    if (min > i7) {
                        obj2 = 1;
                    } else if (min == i7) {
                        if (obj == (i9 > i6 ? 1 : null)) {
                            obj2 = 1;
                        }
                    }
                }
                if (obj2 != null) {
                    i7 = act.a;
                    w = Math.min(i10, i3) - Math.max(i9, i2);
                    view3 = g;
                    i8 += i4;
                    view2 = view3;
                    i6 = i7;
                    i7 = w;
                }
            }
            w = i7;
            i7 = i6;
            view3 = view2;
            i8 += i4;
            view2 = view3;
            i6 = i7;
            i7 = w;
        }
        return view2;
    }

    public boolean f() {
        return this.n == null && !this.a;
    }
}
