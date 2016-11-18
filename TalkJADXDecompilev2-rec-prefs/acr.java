package p000;

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
    boolean f276a = false;
    int f277b = -1;
    int[] f278c;
    View[] f279d;
    final SparseIntArray f280e = new SparseIntArray();
    final SparseIntArray f281f = new SparseIntArray();
    acu f282g = new acs();
    final Rect f283h = new Rect();

    public acr(Context context, int i) {
        super(context);
        m581l(1);
    }

    public int mo64a(aek aek, aep aep) {
        if (this.i == 0) {
            return this.f277b;
        }
        if (aep.m845d() <= 0) {
            return 0;
        }
        return m573a(aek, aep, aep.m845d() - 1) + 1;
    }

    public int mo75b(aek aek, aep aep) {
        if (this.i == 1) {
            return this.f277b;
        }
        if (aep.m845d() <= 0) {
            return 0;
        }
        return m573a(aek, aep, aep.m845d() - 1) + 1;
    }

    public void mo71a(aek aek, aep aep, View view, ql qlVar) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof act) {
            act act = (act) layoutParams;
            int a = m573a(aek, aep, act.m613f());
            if (this.i == 0) {
                int a2 = act.m614a();
                int b = act.m615b();
                boolean z = this.f277b > 1 && act.m615b() == this.f277b;
                qlVar.b(qw.a(a2, b, a, 1, z, false));
                return;
            }
            int a3 = act.m614a();
            int b2 = act.m615b();
            boolean z2 = this.f277b > 1 && act.m615b() == this.f277b;
            qlVar.b(qw.a(a, 1, a3, b2, z2, false));
            return;
        }
        super.m433a(view, qlVar);
    }

    public void mo52c(aek aek, aep aep) {
        if (aep.m842a()) {
            int w = m503w();
            for (int i = 0; i < w; i++) {
                act act = (act) m484g(i).getLayoutParams();
                int f = act.m613f();
                this.f280e.put(f, act.m615b());
                this.f281f.put(f, act.m614a());
            }
        }
        super.mo52c(aek, aep);
        this.f280e.clear();
        this.f281f.clear();
    }

    public void mo43a(aep aep) {
        super.mo43a(aep);
        this.f276a = false;
    }

    public void mo68a() {
        this.f282g.m606a();
    }

    public void mo76b() {
        this.f282g.m606a();
    }

    public void mo77c() {
        this.f282g.m606a();
    }

    public void mo73a(RecyclerView recyclerView, int i, int i2) {
        this.f282g.m606a();
    }

    public void mo78d() {
        this.f282g.m606a();
    }

    public aeg mo55e() {
        if (this.i == 0) {
            return new act(-2, -1);
        }
        return new act(-1, -2);
    }

    public aeg mo65a(Context context, AttributeSet attributeSet) {
        return new act(context, attributeSet);
    }

    public aeg mo66a(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new act((MarginLayoutParams) layoutParams);
        }
        return new act(layoutParams);
    }

    public boolean mo74a(aeg aeg) {
        return aeg instanceof act;
    }

    private void m571L() {
        int z;
        if (m561j() == 1) {
            z = (m506z() - m401D()) - m399B();
        } else {
            z = (m398A() - m402E()) - m400C();
        }
        m580k(z);
    }

    public void mo72a(Rect rect, int i, int i2) {
        if (this.f278c == null) {
            super.mo72a(rect, i, i2);
        }
        int D = m401D() + m399B();
        int C = m400C() + m402E();
        if (this.i == 1) {
            C = aef.m394a(i2, C + rect.height(), m406I());
            D = aef.m394a(i, D + this.f278c[this.f278c.length - 1], m405H());
        } else {
            D = aef.m394a(i, D + rect.width(), m405H());
            C = aef.m394a(i2, C + this.f278c[this.f278c.length - 1], m406I());
        }
        m476e(D, C);
    }

    private void m580k(int i) {
        int i2 = 0;
        int[] iArr = this.f278c;
        int i3 = this.f277b;
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
        this.f278c = iArr;
    }

    private int m579f(int i, int i2) {
        if (this.i == 1 && m562k()) {
            return this.f278c[this.f277b - i] - this.f278c[(this.f277b - i) - i2];
        }
        return this.f278c[i + i2] - this.f278c[i];
    }

    void mo69a(aek aek, aep aep, acy acy, int i) {
        Object obj = 1;
        super.mo69a(aek, aep, acy, i);
        m571L();
        if (aep.m845d() > 0 && !aep.m842a()) {
            if (i != 1) {
                obj = null;
            }
            int b = m577b(aek, aep, acy.f309a);
            if (obj != null) {
                while (b > 0 && acy.f309a > 0) {
                    acy.f309a--;
                    b = m577b(aek, aep, acy.f309a);
                }
            } else {
                int d = aep.m845d() - 1;
                int i2 = acy.f309a;
                int i3 = b;
                while (i2 < d) {
                    b = m577b(aek, aep, i2 + 1);
                    if (b <= i3) {
                        break;
                    }
                    i2++;
                    i3 = b;
                }
                acy.f309a = i2;
            }
        }
        m572M();
    }

    private void m572M() {
        if (this.f279d == null || this.f279d.length != this.f277b) {
            this.f279d = new View[this.f277b];
        }
    }

    public int mo41a(int i, aek aek, aep aep) {
        m571L();
        m572M();
        return super.mo41a(i, aek, aep);
    }

    public int mo48b(int i, aek aek, aep aep) {
        m571L();
        m572M();
        return super.mo48b(i, aek, aep);
    }

    View mo67a(aek aek, aep aep, int i, int i2, int i3) {
        int i4;
        View view = null;
        m563l();
        int c = this.j.mo91c();
        int d = this.j.mo93d();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view2 = null;
        while (i != i2) {
            View view3;
            View g = m484g(i);
            int d2 = m468d(g);
            if (d2 >= 0 && d2 < i3 && m577b(aek, aep, d2) == 0) {
                if (((aeg) g.getLayoutParams()).m611d()) {
                    if (view2 == null) {
                        view3 = view;
                        i += i4;
                        view = view3;
                        view2 = g;
                    }
                } else if (this.j.mo88a(g) < d && this.j.mo90b(g) >= c) {
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

    private int m573a(aek aek, aep aep, int i) {
        if (!aep.m842a()) {
            return this.f282g.m608c(i, this.f277b);
        }
        int a = aek.m805a(i);
        if (a != -1) {
            return this.f282g.m608c(a, this.f277b);
        }
        new StringBuilder("Cannot find span size for pre layout position. ").append(i);
        return 0;
    }

    private int m577b(aek aek, aep aep, int i) {
        if (!aep.m842a()) {
            return this.f282g.m607b(i, this.f277b);
        }
        int i2 = this.f281f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        i2 = aek.m805a(i);
        if (i2 != -1) {
            return this.f282g.m607b(i2, this.f277b);
        }
        new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i);
        return 0;
    }

    private int m578c(aek aek, aep aep, int i) {
        if (!aep.m842a()) {
            return 1;
        }
        int i2 = this.f280e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (aek.m805a(i) != -1) {
            return 1;
        }
        new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i);
        return 1;
    }

    void mo70a(aek aek, aep aep, ada ada, acz acz) {
        boolean z;
        int i;
        int i2 = this.j.mo101i();
        Object obj = i2 != 1073741824 ? 1 : null;
        int i3 = m503w() > 0 ? this.f278c[this.f277b] : 0;
        if (obj != null) {
            m571L();
        }
        if (ada.f323e == 1) {
            z = true;
        } else {
            z = false;
        }
        int i4 = this.f277b;
        if (z) {
            i = 0;
        } else {
            i4 = m577b(aek, aep, ada.f322d) + m578c(aek, aep, ada.f322d);
            i = 0;
        }
        while (i < this.f277b && ada.m647a(aep) && i4 > 0) {
            int i5 = ada.f322d;
            int c = m578c(aek, aep, i5);
            if (c <= this.f277b) {
                i4 -= c;
                if (i4 < 0) {
                    break;
                }
                View a = ada.m645a(aek);
                if (a == null) {
                    break;
                }
                this.f279d[i] = a;
                i++;
            } else {
                throw new IllegalArgumentException("Item at position " + i5 + " requires " + c + " spans but GridLayoutManager has only " + this.f277b + " spans.");
            }
        }
        if (i == 0) {
            acz.f315b = true;
            return;
        }
        int i6;
        int i7;
        i5 = 0;
        float f = 0.0f;
        m574a(aek, aep, i, z);
        int i8 = 0;
        while (i8 < i) {
            View view = this.f279d[i8];
            if (ada.f329k == null) {
                if (z) {
                    m452b(view);
                } else {
                    m453b(view, 0);
                }
            } else if (z) {
                m426a(view);
            } else {
                m427a(view, 0);
            }
            m454b(view, this.f283h);
            m576a(view, i2, false);
            i4 = this.j.mo96e(view);
            if (i4 > i5) {
                i5 = i4;
            }
            float f2 = (((float) this.j.mo98f(view)) * 1.0f) / ((float) ((act) view.getLayoutParams()).f291b);
            if (f2 <= f) {
                f2 = f;
            }
            i8++;
            f = f2;
        }
        if (obj != null) {
            m580k(Math.max(Math.round(((float) this.f277b) * f), i3));
            i6 = 0;
            i7 = 0;
            while (i7 < i) {
                View view2 = this.f279d[i7];
                m576a(view2, 1073741824, true);
                i4 = this.j.mo96e(view2);
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
            View view3 = this.f279d[i5];
            if (this.j.mo96e(view3) != i6) {
                act act = (act) view3.getLayoutParams();
                Rect rect = act.d;
                i8 = ((rect.top + rect.bottom) + act.topMargin) + act.bottomMargin;
                i7 = ((rect.right + rect.left) + act.leftMargin) + act.rightMargin;
                i3 = m579f(act.f290a, act.f291b);
                if (this.i == 1) {
                    i7 = aef.m395a(i3, 1073741824, i7, act.width, false);
                    i4 = MeasureSpec.makeMeasureSpec(i6 - i8, 1073741824);
                } else {
                    i7 = MeasureSpec.makeMeasureSpec(i6 - i7, 1073741824);
                    i4 = aef.m395a(i3, 1073741824, i8, act.height, false);
                }
                m575a(view3, i7, i4, true);
            }
        }
        acz.f314a = i6;
        i4 = 0;
        if (this.i == 1) {
            if (ada.f324f == -1) {
                i4 = ada.f320b;
                i6 = i4 - i6;
                i7 = 0;
                i5 = 0;
            } else {
                i7 = ada.f320b;
                i4 = i7 + i6;
                i6 = i7;
                i7 = 0;
                i5 = 0;
            }
        } else if (ada.f324f == -1) {
            i5 = ada.f320b;
            i7 = i5;
            i5 -= i6;
            i6 = 0;
        } else {
            i5 = ada.f320b;
            i7 = i6 + i5;
            i6 = 0;
        }
        i8 = i4;
        c = i7;
        i7 = i5;
        i5 = i6;
        for (i2 = 0; i2 < i; i2++) {
            View view4 = this.f279d[i2];
            act act2 = (act) view4.getLayoutParams();
            if (this.i != 1) {
                i5 = this.f278c[act2.f290a] + m400C();
                i8 = i5 + this.j.mo98f(view4);
            } else if (m562k()) {
                c = m399B() + this.f278c[this.f277b - act2.f290a];
                i7 = c - this.j.mo98f(view4);
            } else {
                i7 = this.f278c[act2.f290a] + m399B();
                c = i7 + this.j.mo98f(view4);
            }
            m429a(view4, i7, i5, c, i8);
            if (act2.m611d() || act2.m612e()) {
                acz.f316c = true;
            }
            acz.f317d |= view4.isFocusable();
        }
        Arrays.fill(this.f279d, null);
    }

    private void m576a(View view, int i, boolean z) {
        int a;
        act act = (act) view.getLayoutParams();
        Rect rect = act.d;
        int i2 = ((rect.top + rect.bottom) + act.topMargin) + act.bottomMargin;
        int i3 = act.rightMargin + ((rect.right + rect.left) + act.leftMargin);
        int f = m579f(act.f290a, act.f291b);
        if (this.i == 1) {
            f = aef.m395a(f, i, i3, act.width, false);
            a = aef.m395a(this.j.mo97f(), m505y(), i2, act.height, true);
        } else {
            int a2 = aef.m395a(f, i, i2, act.height, false);
            f = aef.m395a(this.j.mo97f(), m504x(), i3, act.width, true);
            a = a2;
        }
        m575a(view, f, a, z);
    }

    private void m575a(View view, int i, int i2, boolean z) {
        boolean a;
        aeg aeg = (aeg) view.getLayoutParams();
        if (z) {
            a = m442a(view, i, i2, aeg);
        } else {
            a = m456b(view, i, i2, aeg);
        }
        if (a) {
            view.measure(i, i2);
        }
    }

    private void m574a(aek aek, aep aep, int i, boolean z) {
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
            View view = this.f279d[i5];
            act act = (act) view.getLayoutParams();
            act.f291b = m578c(aek, aep, m468d(view));
            act.f290a = i4;
            i4 += act.f291b;
        }
    }

    private void m581l(int i) {
        if (i != this.f277b) {
            this.f276a = true;
            if (i <= 0) {
                throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
            }
            this.f277b = i;
            this.f282g.m606a();
            m500t();
        }
    }

    public View mo42a(View view, int i, aek aek, aep aep) {
        View e = m474e(view);
        if (e == null) {
            return null;
        }
        act act = (act) e.getLayoutParams();
        int i2 = act.f290a;
        int i3 = act.f290a + act.f291b;
        if (super.mo42a(view, i, aek, aep) == null) {
            return null;
        }
        int w;
        int i4;
        int i5;
        if (((m550d(i) == 1) != this.k ? 1 : null) != null) {
            w = m503w() - 1;
            i4 = -1;
            i5 = -1;
        } else {
            w = 0;
            i4 = 1;
            i5 = m503w();
        }
        Object obj = (this.i == 1 && m562k()) ? 1 : null;
        View view2 = null;
        int i6 = -1;
        int i7 = 0;
        int i8 = w;
        while (i8 != i5) {
            View g = m484g(i8);
            if (g == e) {
                break;
            }
            View view3;
            if (g.isFocusable()) {
                act = (act) g.getLayoutParams();
                int i9 = act.f290a;
                int i10 = act.f290a + act.f291b;
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
                    i7 = act.f290a;
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

    public boolean mo57f() {
        return this.n == null && !this.f276a;
    }
}
