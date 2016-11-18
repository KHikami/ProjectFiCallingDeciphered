package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aek {
    final ArrayList<aer> a = new ArrayList();
    public ArrayList<aer> b = null;
    final ArrayList<aer> c = new ArrayList();
    final /* synthetic */ RecyclerView d;
    private final List<aer> e = Collections.unmodifiableList(this.a);
    private int f = 2;
    private aej g;
    private u h;

    public aek(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    public void a() {
        this.a.clear();
        h();
    }

    public List<aer> b() {
        return this.e;
    }

    private boolean c(aer aer) {
        if (aer.n()) {
            return this.d.x.a();
        }
        if (aer.b < 0 || aer.b >= this.d.j.a()) {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + aer);
        } else if (!this.d.x.a() && this.d.j.a(aer.b) != aer.e) {
            return false;
        } else {
            if (!this.d.j.a) {
                return true;
            }
            if (aer.d == this.d.j.b(aer.b)) {
                return true;
            }
            return false;
        }
    }

    public int a(int i) {
        if (i >= 0 && i < this.d.x.d()) {
            return !this.d.x.a() ? i : this.d.d.c(i);
        } else {
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.d.x.d());
        }
    }

    public View b(int i) {
        return a(i, false);
    }

    private View a(int i, boolean z) {
        boolean z2 = true;
        if (i < 0 || i >= this.d.x.d()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + this.d.x.d());
        }
        aer e;
        boolean z3;
        aer aer;
        boolean z4;
        int c;
        boolean z5;
        aeb aeb;
        aep aep;
        int c2;
        ady ady;
        LayoutParams layoutParams;
        View view;
        aeg aeg;
        if (this.d.x.a()) {
            e = e(i);
            aer aer2 = e;
            z3 = e != null;
            aer = aer2;
        } else {
            aer = null;
            z3 = false;
        }
        if (aer == null) {
            aer = b(i, -1, false);
            if (aer != null) {
                if (c(aer)) {
                    z4 = true;
                } else {
                    aer.b(4);
                    if (aer.f()) {
                        this.d.removeDetachedView(aer.a, false);
                        aer.g();
                    } else if (aer.h()) {
                        aer.i();
                    }
                    a(aer);
                    aer = null;
                    z4 = z3;
                }
                if (aer == null) {
                    c = this.d.d.c(i);
                    if (c >= 0 || c >= this.d.j.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + c + ").state:" + this.d.x.d());
                    }
                    int a = this.d.j.a(c);
                    if (this.d.j.a) {
                        aer = a(this.d.j.b(c), a, false);
                        if (aer != null) {
                            aer.b = c;
                            z4 = true;
                        }
                    }
                    if (aer == null && this.h != null) {
                        View g = this.h.g();
                        if (g != null) {
                            aer = this.d.a(g);
                            if (aer == null) {
                                throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                            } else if (aer.c()) {
                                throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                            }
                        }
                    }
                    if (aer == null) {
                        e = i().a(a);
                        if (e != null) {
                            e.s();
                            if (RecyclerView.a && (e.a instanceof ViewGroup)) {
                                a((ViewGroup) e.a, false);
                            }
                        }
                        aer = e;
                    }
                    if (aer == null) {
                        ady ady2 = this.d.j;
                        ViewGroup viewGroup = this.d;
                        gwb.d("RV CreateView");
                        aer = ady2.a(viewGroup, a);
                        aer.e = a;
                        gwb.e();
                        e = aer;
                        z5 = z4;
                        if (z5 && !this.d.x.a() && e.a(8192)) {
                            e.a(0, 8192);
                            if (this.d.x.h) {
                                aeb.e(e);
                                aeb = this.d.v;
                                aep = this.d.x;
                                this.d.a(e, aeb.b(e, e.r()));
                            }
                        }
                        int i2;
                        if (!this.d.x.a() && e.m()) {
                            e.f = i;
                            i2 = 0;
                        } else if (e.m() || e.l() || e.k()) {
                            c2 = this.d.d.c(i);
                            e.o = this.d;
                            ady = this.d.j;
                            e.b = c2;
                            if (ady.a) {
                                e.d = ady.b(c2);
                            }
                            e.a(1, 519);
                            gwb.d("RV OnBindView");
                            e.r();
                            ady.b(e, c2);
                            e.q();
                            layoutParams = e.a.getLayoutParams();
                            if (layoutParams instanceof aeg) {
                                ((aeg) layoutParams).e = true;
                            }
                            gwb.e();
                            view = e.a;
                            if (this.d.n()) {
                                if (oa.c(view) == 0) {
                                    oa.c(view, 1);
                                }
                                if (!oa.a.j(view)) {
                                    oa.a(view, this.d.B.b());
                                }
                            }
                            if (this.d.x.a()) {
                                e.f = i;
                            }
                            z4 = true;
                        } else {
                            i2 = 0;
                        }
                        layoutParams = e.a.getLayoutParams();
                        if (layoutParams != null) {
                            aeg = (aeg) this.d.generateDefaultLayoutParams();
                            e.a.setLayoutParams(aeg);
                        } else if (this.d.checkLayoutParams(layoutParams)) {
                            aeg = (aeg) layoutParams;
                        } else {
                            aeg = (aeg) this.d.generateLayoutParams(layoutParams);
                            e.a.setLayoutParams(aeg);
                        }
                        aeg.c = e;
                        if (!z5 || r3 == 0) {
                            z2 = false;
                        }
                        aeg.f = z2;
                        return e.a;
                    }
                }
                e = aer;
                z5 = z4;
                e.a(0, 8192);
                if (this.d.x.h) {
                    aeb.e(e);
                    aeb = this.d.v;
                    aep = this.d.x;
                    this.d.a(e, aeb.b(e, e.r()));
                }
                if (!this.d.x.a()) {
                }
                if (e.m()) {
                }
                c2 = this.d.d.c(i);
                e.o = this.d;
                ady = this.d.j;
                e.b = c2;
                if (ady.a) {
                    e.d = ady.b(c2);
                }
                e.a(1, 519);
                gwb.d("RV OnBindView");
                e.r();
                ady.b(e, c2);
                e.q();
                layoutParams = e.a.getLayoutParams();
                if (layoutParams instanceof aeg) {
                    ((aeg) layoutParams).e = true;
                }
                gwb.e();
                view = e.a;
                if (this.d.n()) {
                    if (oa.c(view) == 0) {
                        oa.c(view, 1);
                    }
                    if (oa.a.j(view)) {
                        oa.a(view, this.d.B.b());
                    }
                }
                if (this.d.x.a()) {
                    e.f = i;
                }
                z4 = true;
                layoutParams = e.a.getLayoutParams();
                if (layoutParams != null) {
                    aeg = (aeg) this.d.generateDefaultLayoutParams();
                    e.a.setLayoutParams(aeg);
                } else if (this.d.checkLayoutParams(layoutParams)) {
                    aeg = (aeg) layoutParams;
                } else {
                    aeg = (aeg) this.d.generateLayoutParams(layoutParams);
                    e.a.setLayoutParams(aeg);
                }
                aeg.c = e;
                z2 = false;
                aeg.f = z2;
                return e.a;
            }
        }
        z4 = z3;
        if (aer == null) {
            c = this.d.d.c(i);
            if (c >= 0) {
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + c + ").state:" + this.d.x.d());
        }
        e = aer;
        z5 = z4;
        e.a(0, 8192);
        if (this.d.x.h) {
            aeb.e(e);
            aeb = this.d.v;
            aep = this.d.x;
            this.d.a(e, aeb.b(e, e.r()));
        }
        if (!this.d.x.a()) {
        }
        if (e.m()) {
        }
        c2 = this.d.d.c(i);
        e.o = this.d;
        ady = this.d.j;
        e.b = c2;
        if (ady.a) {
            e.d = ady.b(c2);
        }
        e.a(1, 519);
        gwb.d("RV OnBindView");
        e.r();
        ady.b(e, c2);
        e.q();
        layoutParams = e.a.getLayoutParams();
        if (layoutParams instanceof aeg) {
            ((aeg) layoutParams).e = true;
        }
        gwb.e();
        view = e.a;
        if (this.d.n()) {
            if (oa.c(view) == 0) {
                oa.c(view, 1);
            }
            if (oa.a.j(view)) {
                oa.a(view, this.d.B.b());
            }
        }
        if (this.d.x.a()) {
            e.f = i;
        }
        z4 = true;
        layoutParams = e.a.getLayoutParams();
        if (layoutParams != null) {
            aeg = (aeg) this.d.generateDefaultLayoutParams();
            e.a.setLayoutParams(aeg);
        } else if (this.d.checkLayoutParams(layoutParams)) {
            aeg = (aeg) this.d.generateLayoutParams(layoutParams);
            e.a.setLayoutParams(aeg);
        } else {
            aeg = (aeg) layoutParams;
        }
        aeg.c = e;
        z2 = false;
        aeg.f = z2;
        return e.a;
    }

    private void a(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(visibility);
    }

    public void a(View view) {
        aer d = RecyclerView.d(view);
        if (d.o()) {
            this.d.removeDetachedView(view, false);
        }
        if (d.f()) {
            d.g();
        } else if (d.h()) {
            d.i();
        }
        a(d);
    }

    private void h() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            d(size);
        }
        this.c.clear();
    }

    private void d(int i) {
        d((aer) this.c.get(i));
        this.c.remove(i);
    }

    void a(aer aer) {
        boolean z = true;
        int i = 0;
        if (aer.f() || aer.a.getParent() != null) {
            StringBuilder append = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:").append(aer.f()).append(" isAttached:");
            if (aer.a.getParent() == null) {
                z = false;
            }
            throw new IllegalArgumentException(append.append(z).toString());
        } else if (aer.o()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + aer);
        } else if (aer.c()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        } else {
            boolean z2;
            if ((aer.i & 16) == 0 && oa.a(aer.a)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.d.j != null && r2) {
                ady ady = this.d.j;
            }
            if (aer.t()) {
                boolean z3;
                if (!aer.a(14)) {
                    int size = this.c.size();
                    if (size >= this.f && size > 0) {
                        d(0);
                        size--;
                    }
                    if (size < this.f) {
                        this.c.add(aer);
                        z3 = true;
                        if (z3) {
                            d(aer);
                            i = 1;
                            z = z3;
                        } else {
                            z = z3;
                        }
                    }
                }
                z3 = false;
                if (z3) {
                    z = z3;
                } else {
                    d(aer);
                    i = 1;
                    z = z3;
                }
            } else {
                z = false;
            }
            this.d.f.g(aer);
            if (!z && r1 == 0 && r2) {
                aer.o = null;
            }
        }
    }

    private void d(aer aer) {
        oa.a(aer.a, null);
        e(aer);
        aer.o = null;
        i().a(aer);
    }

    void b(View view) {
        aer d = RecyclerView.d(view);
        d.l = null;
        d.m = false;
        d.i();
        a(d);
    }

    void c(View view) {
        aer d = RecyclerView.d(view);
        if (!d.a(12) && d.u()) {
            boolean z;
            RecyclerView recyclerView = this.d;
            if (recyclerView.v == null || recyclerView.v.a(d, d.r())) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                d.a(this, true);
                this.b.add(d);
                return;
            }
        }
        if (!d.k() || d.n() || this.d.j.a) {
            d.a(this, false);
            this.a.add(d);
            return;
        }
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
    }

    int c() {
        return this.a.size();
    }

    View c(int i) {
        return ((aer) this.a.get(i)).a;
    }

    void d() {
        this.a.clear();
        if (this.b != null) {
            this.b.clear();
        }
    }

    private aer e(int i) {
        int i2 = 0;
        if (this.b != null) {
            int size = this.b.size();
            if (size != 0) {
                aer aer;
                int i3 = 0;
                while (i3 < size) {
                    aer = (aer) this.b.get(i3);
                    if (aer.h() || aer.d() != i) {
                        i3++;
                    } else {
                        aer.b(32);
                        return aer;
                    }
                }
                if (this.d.j.a) {
                    int c = this.d.d.c(i);
                    if (c > 0 && c < this.d.j.a()) {
                        long b = this.d.j.b(c);
                        while (i2 < size) {
                            aer = (aer) this.b.get(i2);
                            if (aer.h() || aer.d != b) {
                                i2++;
                            } else {
                                aer.b(32);
                                return aer;
                            }
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }

    private aer b(int i, int i2, boolean z) {
        int i3 = 0;
        int size = this.a.size();
        int i4 = 0;
        while (i4 < size) {
            aer aer = (aer) this.a.get(i4);
            if (aer.h() || aer.d() != i || aer.k() || (!this.d.x.g && aer.n())) {
                i4++;
            } else {
                aer.b(32);
                return aer;
            }
        }
        if (!z) {
            View a = this.d.e.a(i, -1);
            if (a != null) {
                aer = RecyclerView.d(a);
                this.d.e.e(a);
                i3 = this.d.e.b(a);
                if (i3 == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + aer);
                }
                this.d.e.d(i3);
                c(a);
                aer.b(8224);
                return aer;
            }
        }
        i4 = this.c.size();
        while (i3 < i4) {
            aer = (aer) this.c.get(i3);
            if (aer.k() || aer.d() != i) {
                i3++;
            } else if (z) {
                return aer;
            } else {
                this.c.remove(i3);
                return aer;
            }
        }
        return null;
    }

    private aer a(long j, int i, boolean z) {
        int size;
        for (size = this.a.size() - 1; size >= 0; size--) {
            aer aer = (aer) this.a.get(size);
            if (aer.d == j && !aer.h()) {
                if (i == aer.e) {
                    aer.b(32);
                    if (!aer.n() || this.d.x.a()) {
                        return aer;
                    }
                    aer.a(2, 14);
                    return aer;
                } else if (!z) {
                    this.a.remove(size);
                    this.d.removeDetachedView(aer.a, false);
                    b(aer.a);
                }
            }
        }
        for (size = this.c.size() - 1; size >= 0; size--) {
            aer = (aer) this.c.get(size);
            if (aer.d == j) {
                if (i == aer.e) {
                    if (z) {
                        return aer;
                    }
                    this.c.remove(size);
                    return aer;
                } else if (!z) {
                    d(size);
                }
            }
        }
        return null;
    }

    private void e(aer aer) {
        if (this.d.K != null) {
            this.d.K;
        }
        if (this.d.j != null) {
            this.d.j.a(aer);
        }
        if (this.d.x != null) {
            this.d.f.g(aer);
        }
    }

    public void a(ady ady, ady ady2, boolean z) {
        a();
        i().a(ady, ady2, z);
    }

    public void a(int i, int i2) {
        int i3;
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
        int size = this.c.size();
        for (int i6 = 0; i6 < size; i6++) {
            aer aer = (aer) this.c.get(i6);
            if (aer != null && aer.b >= r3 && aer.b <= r2) {
                if (aer.b == i) {
                    aer.a(i2 - i, false);
                } else {
                    aer.a(i3, false);
                }
            }
        }
    }

    public void b(int i, int i2) {
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            aer aer = (aer) this.c.get(i3);
            if (aer != null && aer.b >= i) {
                aer.a(i2, true);
            }
        }
    }

    public void a(int i, int i2, boolean z) {
        int i3 = i + i2;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            aer aer = (aer) this.c.get(size);
            if (aer != null) {
                if (aer.b >= i3) {
                    aer.a(-i2, z);
                } else if (aer.b >= i) {
                    aer.b(8);
                    d(size);
                }
            }
        }
    }

    private aej i() {
        if (this.g == null) {
            this.g = new aej();
        }
        return this.g;
    }

    public void c(int i, int i2) {
        int i3 = i + i2;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            aer aer = (aer) this.c.get(size);
            if (aer != null) {
                int d = aer.d();
                if (d >= i && d < i3) {
                    aer.b(2);
                    d(size);
                }
            }
        }
    }

    public void e() {
        if (this.d.j == null || !this.d.j.a) {
            h();
            return;
        }
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            aer aer = (aer) this.c.get(i);
            if (aer != null) {
                aer.b(6);
                aer.a(null);
            }
        }
    }

    public void f() {
        int i;
        int i2 = 0;
        int size = this.c.size();
        for (i = 0; i < size; i++) {
            ((aer) this.c.get(i)).a();
        }
        size = this.a.size();
        for (i = 0; i < size; i++) {
            ((aer) this.a.get(i)).a();
        }
        if (this.b != null) {
            i = this.b.size();
            while (i2 < i) {
                ((aer) this.b.get(i2)).a();
                i2++;
            }
        }
    }

    public void g() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            aeg aeg = (aeg) ((aer) this.c.get(i)).a.getLayoutParams();
            if (aeg != null) {
                aeg.e = true;
            }
        }
    }

    public void b(aer aer) {
        if (aer.m) {
            this.b.remove(aer);
        } else {
            this.a.remove(aer);
        }
        aer.l = null;
        aer.m = false;
        aer.i();
    }
}
