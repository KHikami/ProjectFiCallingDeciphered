package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aek {
    final ArrayList<aer> f391a = new ArrayList();
    public ArrayList<aer> f392b = null;
    final ArrayList<aer> f393c = new ArrayList();
    final /* synthetic */ RecyclerView f394d;
    private final List<aer> f395e = Collections.unmodifiableList(this.f391a);
    private int f396f = 2;
    private aej f397g;
    private u f398h;

    public aek(RecyclerView recyclerView) {
        this.f394d = recyclerView;
    }

    public void m806a() {
        this.f391a.clear();
        m803h();
    }

    public List<aer> m813b() {
        return this.f395e;
    }

    private boolean m798c(aer aer) {
        if (aer.m874n()) {
            return this.f394d.f1462x.m842a();
        }
        if (aer.f439b < 0 || aer.f439b >= this.f394d.f1448j.mo736a()) {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + aer);
        } else if (!this.f394d.f1462x.m842a() && this.f394d.f1448j.mo737a(aer.f439b) != aer.f442e) {
            return false;
        } else {
            if (!this.f394d.f1448j.f362a) {
                return true;
            }
            if (aer.f441d == this.f394d.f1448j.mo741b(aer.f439b)) {
                return true;
            }
            return false;
        }
    }

    public int m805a(int i) {
        if (i >= 0 && i < this.f394d.f1462x.m845d()) {
            return !this.f394d.f1462x.m842a() ? i : this.f394d.f1442d.m678c(i);
        } else {
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.f394d.f1462x.m845d());
        }
    }

    public View m812b(int i) {
        return m795a(i, false);
    }

    private View m795a(int i, boolean z) {
        boolean z2 = true;
        if (i < 0 || i >= this.f394d.f1462x.m845d()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + this.f394d.f1462x.m845d());
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
        if (this.f394d.f1462x.m842a()) {
            e = m801e(i);
            aer aer2 = e;
            z3 = e != null;
            aer = aer2;
        } else {
            aer = null;
            z3 = false;
        }
        if (aer == null) {
            aer = m797b(i, -1, false);
            if (aer != null) {
                if (m798c(aer)) {
                    z4 = true;
                } else {
                    aer.m862b(4);
                    if (aer.m866f()) {
                        this.f394d.removeDetachedView(aer.f438a, false);
                        aer.m867g();
                    } else if (aer.m868h()) {
                        aer.m869i();
                    }
                    m810a(aer);
                    aer = null;
                    z4 = z3;
                }
                if (aer == null) {
                    c = this.f394d.f1442d.m678c(i);
                    if (c >= 0 || c >= this.f394d.f1448j.mo736a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + c + ").state:" + this.f394d.f1462x.m845d());
                    }
                    int a = this.f394d.f1448j.mo737a(c);
                    if (this.f394d.f1448j.f362a) {
                        aer = m794a(this.f394d.f1448j.mo741b(c), a, false);
                        if (aer != null) {
                            aer.f439b = c;
                            z4 = true;
                        }
                    }
                    if (aer == null && this.f398h != null) {
                        View g = this.f398h.g();
                        if (g != null) {
                            aer = this.f394d.m3044a(g);
                            if (aer == null) {
                                throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                            } else if (aer.m863c()) {
                                throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                            }
                        }
                    }
                    if (aer == null) {
                        e = m804i().m791a(a);
                        if (e != null) {
                            e.m879s();
                            if (RecyclerView.f1420a && (e.f438a instanceof ViewGroup)) {
                                m796a((ViewGroup) e.f438a, false);
                            }
                        }
                        aer = e;
                    }
                    if (aer == null) {
                        ady ady2 = this.f394d.f1448j;
                        ViewGroup viewGroup = this.f394d;
                        gwb.m2147d("RV CreateView");
                        aer = ady2.mo738a(viewGroup, a);
                        aer.f442e = a;
                        gwb.m2175e();
                        e = aer;
                        z5 = z4;
                        if (z5 && !this.f394d.f1462x.m842a() && e.m860a(8192)) {
                            e.m854a(0, 8192);
                            if (this.f394d.f1462x.f422h) {
                                aeb.m310e(e);
                                aeb = this.f394d.f1460v;
                                aep = this.f394d.f1462x;
                                this.f394d.m3058a(e, aeb.mo743b(e, e.m878r()));
                            }
                        }
                        int i2;
                        if (!this.f394d.f1462x.m842a() && e.m873m()) {
                            e.f443f = i;
                            i2 = 0;
                        } else if (e.m873m() || e.m872l() || e.m871k()) {
                            c2 = this.f394d.f1442d.m678c(i);
                            e.f452o = this.f394d;
                            ady = this.f394d.f1448j;
                            e.f439b = c2;
                            if (ady.f362a) {
                                e.f441d = ady.mo741b(c2);
                            }
                            e.m854a(1, 519);
                            gwb.m2147d("RV OnBindView");
                            e.m878r();
                            ady.m748b(e, c2);
                            e.m877q();
                            layoutParams = e.f438a.getLayoutParams();
                            if (layoutParams instanceof aeg) {
                                ((aeg) layoutParams).f288e = true;
                            }
                            gwb.m2175e();
                            view = e.f438a;
                            if (this.f394d.m3100n()) {
                                if (oa.c(view) == 0) {
                                    oa.c(view, 1);
                                }
                                if (!oa.a.j(view)) {
                                    oa.a(view, this.f394d.f1423B.m885b());
                                }
                            }
                            if (this.f394d.f1462x.m842a()) {
                                e.f443f = i;
                            }
                            z4 = true;
                        } else {
                            i2 = 0;
                        }
                        layoutParams = e.f438a.getLayoutParams();
                        if (layoutParams != null) {
                            aeg = (aeg) this.f394d.generateDefaultLayoutParams();
                            e.f438a.setLayoutParams(aeg);
                        } else if (this.f394d.checkLayoutParams(layoutParams)) {
                            aeg = (aeg) layoutParams;
                        } else {
                            aeg = (aeg) this.f394d.generateLayoutParams(layoutParams);
                            e.f438a.setLayoutParams(aeg);
                        }
                        aeg.f286c = e;
                        if (!z5 || r3 == 0) {
                            z2 = false;
                        }
                        aeg.f289f = z2;
                        return e.f438a;
                    }
                }
                e = aer;
                z5 = z4;
                e.m854a(0, 8192);
                if (this.f394d.f1462x.f422h) {
                    aeb.m310e(e);
                    aeb = this.f394d.f1460v;
                    aep = this.f394d.f1462x;
                    this.f394d.m3058a(e, aeb.mo743b(e, e.m878r()));
                }
                if (!this.f394d.f1462x.m842a()) {
                }
                if (e.m873m()) {
                }
                c2 = this.f394d.f1442d.m678c(i);
                e.f452o = this.f394d;
                ady = this.f394d.f1448j;
                e.f439b = c2;
                if (ady.f362a) {
                    e.f441d = ady.mo741b(c2);
                }
                e.m854a(1, 519);
                gwb.m2147d("RV OnBindView");
                e.m878r();
                ady.m748b(e, c2);
                e.m877q();
                layoutParams = e.f438a.getLayoutParams();
                if (layoutParams instanceof aeg) {
                    ((aeg) layoutParams).f288e = true;
                }
                gwb.m2175e();
                view = e.f438a;
                if (this.f394d.m3100n()) {
                    if (oa.c(view) == 0) {
                        oa.c(view, 1);
                    }
                    if (oa.a.j(view)) {
                        oa.a(view, this.f394d.f1423B.m885b());
                    }
                }
                if (this.f394d.f1462x.m842a()) {
                    e.f443f = i;
                }
                z4 = true;
                layoutParams = e.f438a.getLayoutParams();
                if (layoutParams != null) {
                    aeg = (aeg) this.f394d.generateDefaultLayoutParams();
                    e.f438a.setLayoutParams(aeg);
                } else if (this.f394d.checkLayoutParams(layoutParams)) {
                    aeg = (aeg) layoutParams;
                } else {
                    aeg = (aeg) this.f394d.generateLayoutParams(layoutParams);
                    e.f438a.setLayoutParams(aeg);
                }
                aeg.f286c = e;
                z2 = false;
                aeg.f289f = z2;
                return e.f438a;
            }
        }
        z4 = z3;
        if (aer == null) {
            c = this.f394d.f1442d.m678c(i);
            if (c >= 0) {
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + c + ").state:" + this.f394d.f1462x.m845d());
        }
        e = aer;
        z5 = z4;
        e.m854a(0, 8192);
        if (this.f394d.f1462x.f422h) {
            aeb.m310e(e);
            aeb = this.f394d.f1460v;
            aep = this.f394d.f1462x;
            this.f394d.m3058a(e, aeb.mo743b(e, e.m878r()));
        }
        if (!this.f394d.f1462x.m842a()) {
        }
        if (e.m873m()) {
        }
        c2 = this.f394d.f1442d.m678c(i);
        e.f452o = this.f394d;
        ady = this.f394d.f1448j;
        e.f439b = c2;
        if (ady.f362a) {
            e.f441d = ady.mo741b(c2);
        }
        e.m854a(1, 519);
        gwb.m2147d("RV OnBindView");
        e.m878r();
        ady.m748b(e, c2);
        e.m877q();
        layoutParams = e.f438a.getLayoutParams();
        if (layoutParams instanceof aeg) {
            ((aeg) layoutParams).f288e = true;
        }
        gwb.m2175e();
        view = e.f438a;
        if (this.f394d.m3100n()) {
            if (oa.c(view) == 0) {
                oa.c(view, 1);
            }
            if (oa.a.j(view)) {
                oa.a(view, this.f394d.f1423B.m885b());
            }
        }
        if (this.f394d.f1462x.m842a()) {
            e.f443f = i;
        }
        z4 = true;
        layoutParams = e.f438a.getLayoutParams();
        if (layoutParams != null) {
            aeg = (aeg) this.f394d.generateDefaultLayoutParams();
            e.f438a.setLayoutParams(aeg);
        } else if (this.f394d.checkLayoutParams(layoutParams)) {
            aeg = (aeg) this.f394d.generateLayoutParams(layoutParams);
            e.f438a.setLayoutParams(aeg);
        } else {
            aeg = (aeg) layoutParams;
        }
        aeg.f286c = e;
        z2 = false;
        aeg.f289f = z2;
        return e.f438a;
    }

    private void m796a(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                m796a((ViewGroup) childAt, true);
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

    public void m811a(View view) {
        aer d = RecyclerView.m3038d(view);
        if (d.m875o()) {
            this.f394d.removeDetachedView(view, false);
        }
        if (d.m866f()) {
            d.m867g();
        } else if (d.m868h()) {
            d.m869i();
        }
        m810a(d);
    }

    private void m803h() {
        for (int size = this.f393c.size() - 1; size >= 0; size--) {
            m799d(size);
        }
        this.f393c.clear();
    }

    private void m799d(int i) {
        m800d((aer) this.f393c.get(i));
        this.f393c.remove(i);
    }

    void m810a(aer aer) {
        boolean z = true;
        int i = 0;
        if (aer.m866f() || aer.f438a.getParent() != null) {
            StringBuilder append = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:").append(aer.m866f()).append(" isAttached:");
            if (aer.f438a.getParent() == null) {
                z = false;
            }
            throw new IllegalArgumentException(append.append(z).toString());
        } else if (aer.m875o()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + aer);
        } else if (aer.m863c()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        } else {
            boolean z2;
            if ((aer.f446i & 16) == 0 && oa.a(aer.f438a)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f394d.f1448j != null && r2) {
                ady ady = this.f394d.f1448j;
            }
            if (aer.m880t()) {
                boolean z3;
                if (!aer.m860a(14)) {
                    int size = this.f393c.size();
                    if (size >= this.f396f && size > 0) {
                        m799d(0);
                        size--;
                    }
                    if (size < this.f396f) {
                        this.f393c.add(aer);
                        z3 = true;
                        if (z3) {
                            m800d(aer);
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
                    m800d(aer);
                    i = 1;
                    z = z3;
                }
            } else {
                z = false;
            }
            this.f394d.f1444f.m1015g(aer);
            if (!z && r1 == 0 && r2) {
                aer.f452o = null;
            }
        }
    }

    private void m800d(aer aer) {
        oa.a(aer.f438a, null);
        m802e(aer);
        aer.f452o = null;
        m804i().m793a(aer);
    }

    void m816b(View view) {
        aer d = RecyclerView.m3038d(view);
        d.f449l = null;
        d.f450m = false;
        d.m869i();
        m810a(d);
    }

    void m820c(View view) {
        aer d = RecyclerView.m3038d(view);
        if (!d.m860a(12) && d.m881u()) {
            boolean z;
            RecyclerView recyclerView = this.f394d;
            if (recyclerView.f1460v == null || recyclerView.f1460v.mo32a(d, d.m878r())) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.f392b == null) {
                    this.f392b = new ArrayList();
                }
                d.m857a(this, true);
                this.f392b.add(d);
                return;
            }
        }
        if (!d.m871k() || d.m874n() || this.f394d.f1448j.f362a) {
            d.m857a(this, false);
            this.f391a.add(d);
            return;
        }
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
    }

    int m817c() {
        return this.f391a.size();
    }

    View m818c(int i) {
        return ((aer) this.f391a.get(i)).f438a;
    }

    void m821d() {
        this.f391a.clear();
        if (this.f392b != null) {
            this.f392b.clear();
        }
    }

    private aer m801e(int i) {
        int i2 = 0;
        if (this.f392b != null) {
            int size = this.f392b.size();
            if (size != 0) {
                aer aer;
                int i3 = 0;
                while (i3 < size) {
                    aer = (aer) this.f392b.get(i3);
                    if (aer.m868h() || aer.m864d() != i) {
                        i3++;
                    } else {
                        aer.m862b(32);
                        return aer;
                    }
                }
                if (this.f394d.f1448j.f362a) {
                    int c = this.f394d.f1442d.m678c(i);
                    if (c > 0 && c < this.f394d.f1448j.mo736a()) {
                        long b = this.f394d.f1448j.mo741b(c);
                        while (i2 < size) {
                            aer = (aer) this.f392b.get(i2);
                            if (aer.m868h() || aer.f441d != b) {
                                i2++;
                            } else {
                                aer.m862b(32);
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

    private aer m797b(int i, int i2, boolean z) {
        int i3 = 0;
        int size = this.f391a.size();
        int i4 = 0;
        while (i4 < size) {
            aer aer = (aer) this.f391a.get(i4);
            if (aer.m868h() || aer.m864d() != i || aer.m871k() || (!this.f394d.f1462x.f421g && aer.m874n())) {
                i4++;
            } else {
                aer.m862b(32);
                return aer;
            }
        }
        if (!z) {
            View a = this.f394d.f1443e.m230a(i, -1);
            if (a != null) {
                aer = RecyclerView.m3038d(a);
                this.f394d.f1443e.m245e(a);
                i3 = this.f394d.f1443e.m238b(a);
                if (i3 == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + aer);
                }
                this.f394d.f1443e.m243d(i3);
                m820c(a);
                aer.m862b(8224);
                return aer;
            }
        }
        i4 = this.f393c.size();
        while (i3 < i4) {
            aer = (aer) this.f393c.get(i3);
            if (aer.m871k() || aer.m864d() != i) {
                i3++;
            } else if (z) {
                return aer;
            } else {
                this.f393c.remove(i3);
                return aer;
            }
        }
        return null;
    }

    private aer m794a(long j, int i, boolean z) {
        int size;
        for (size = this.f391a.size() - 1; size >= 0; size--) {
            aer aer = (aer) this.f391a.get(size);
            if (aer.f441d == j && !aer.m868h()) {
                if (i == aer.f442e) {
                    aer.m862b(32);
                    if (!aer.m874n() || this.f394d.f1462x.m842a()) {
                        return aer;
                    }
                    aer.m854a(2, 14);
                    return aer;
                } else if (!z) {
                    this.f391a.remove(size);
                    this.f394d.removeDetachedView(aer.f438a, false);
                    m816b(aer.f438a);
                }
            }
        }
        for (size = this.f393c.size() - 1; size >= 0; size--) {
            aer = (aer) this.f393c.get(size);
            if (aer.f441d == j) {
                if (i == aer.f442e) {
                    if (z) {
                        return aer;
                    }
                    this.f393c.remove(size);
                    return aer;
                } else if (!z) {
                    m799d(size);
                }
            }
        }
        return null;
    }

    private void m802e(aer aer) {
        if (this.f394d.f1428K != null) {
            this.f394d.f1428K;
        }
        if (this.f394d.f1448j != null) {
            this.f394d.f1448j.mo739a(aer);
        }
        if (this.f394d.f1462x != null) {
            this.f394d.f1444f.m1015g(aer);
        }
    }

    public void m809a(ady ady, ady ady2, boolean z) {
        m806a();
        m804i().m792a(ady, ady2, z);
    }

    public void m807a(int i, int i2) {
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
        int size = this.f393c.size();
        for (int i6 = 0; i6 < size; i6++) {
            aer aer = (aer) this.f393c.get(i6);
            if (aer != null && aer.f439b >= r3 && aer.f439b <= r2) {
                if (aer.f439b == i) {
                    aer.m856a(i2 - i, false);
                } else {
                    aer.m856a(i3, false);
                }
            }
        }
    }

    public void m814b(int i, int i2) {
        int size = this.f393c.size();
        for (int i3 = 0; i3 < size; i3++) {
            aer aer = (aer) this.f393c.get(i3);
            if (aer != null && aer.f439b >= i) {
                aer.m856a(i2, true);
            }
        }
    }

    public void m808a(int i, int i2, boolean z) {
        int i3 = i + i2;
        for (int size = this.f393c.size() - 1; size >= 0; size--) {
            aer aer = (aer) this.f393c.get(size);
            if (aer != null) {
                if (aer.f439b >= i3) {
                    aer.m856a(-i2, z);
                } else if (aer.f439b >= i) {
                    aer.m862b(8);
                    m799d(size);
                }
            }
        }
    }

    private aej m804i() {
        if (this.f397g == null) {
            this.f397g = new aej();
        }
        return this.f397g;
    }

    public void m819c(int i, int i2) {
        int i3 = i + i2;
        for (int size = this.f393c.size() - 1; size >= 0; size--) {
            aer aer = (aer) this.f393c.get(size);
            if (aer != null) {
                int d = aer.m864d();
                if (d >= i && d < i3) {
                    aer.m862b(2);
                    m799d(size);
                }
            }
        }
    }

    public void m822e() {
        if (this.f394d.f1448j == null || !this.f394d.f1448j.f362a) {
            m803h();
            return;
        }
        int size = this.f393c.size();
        for (int i = 0; i < size; i++) {
            aer aer = (aer) this.f393c.get(i);
            if (aer != null) {
                aer.m862b(6);
                aer.m858a(null);
            }
        }
    }

    public void m823f() {
        int i;
        int i2 = 0;
        int size = this.f393c.size();
        for (i = 0; i < size; i++) {
            ((aer) this.f393c.get(i)).m853a();
        }
        size = this.f391a.size();
        for (i = 0; i < size; i++) {
            ((aer) this.f391a.get(i)).m853a();
        }
        if (this.f392b != null) {
            i = this.f392b.size();
            while (i2 < i) {
                ((aer) this.f392b.get(i2)).m853a();
                i2++;
            }
        }
    }

    public void m824g() {
        int size = this.f393c.size();
        for (int i = 0; i < size; i++) {
            aeg aeg = (aeg) ((aer) this.f393c.get(i)).f438a.getLayoutParams();
            if (aeg != null) {
                aeg.f288e = true;
            }
        }
    }

    public void m815b(aer aer) {
        if (aer.f450m) {
            this.f392b.remove(aer);
        } else {
            this.f391a.remove(aer);
        }
        aer.f449l = null;
        aer.f450m = false;
        aer.m869i();
    }
}
