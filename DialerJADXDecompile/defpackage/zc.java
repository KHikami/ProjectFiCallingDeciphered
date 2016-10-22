package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: zc */
public final class zc {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    final List d;
    public final /* synthetic */ RecyclerView e;
    private int f;
    private zb g;

    public zc(RecyclerView recyclerView) {
        this.e = recyclerView;
        this.a = new ArrayList();
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(this.a);
        this.f = 2;
    }

    public final void a() {
        this.a.clear();
        b();
    }

    final void a(ViewGroup viewGroup, boolean z) {
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

    public final void a(View view) {
        zk b = RecyclerView.b(view);
        if (b.n()) {
            this.e.removeDetachedView(view, false);
        }
        if (b.e()) {
            b.f();
        } else if (b.g()) {
            b.h();
        }
        a(b);
    }

    public final void b() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            a(size);
        }
        this.c.clear();
    }

    public final void a(int i) {
        c((zk) this.c.get(i));
        this.c.remove(i);
    }

    final void a(zk zkVar) {
        boolean z = true;
        int i = 0;
        if (zkVar.e() || zkVar.a.getParent() != null) {
            StringBuilder append = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:").append(zkVar.e()).append(" isAttached:");
            if (zkVar.a.getParent() == null) {
                z = false;
            }
            throw new IllegalArgumentException(append.append(z).toString());
        } else if (zkVar.n()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + zkVar);
        } else if (zkVar.b()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        } else {
            boolean z2;
            if ((zkVar.i & 16) == 0 && kn.b(zkVar.a)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.e.j != null && r2) {
                ys ysVar = this.e.j;
            }
            if (zkVar.r()) {
                boolean z3;
                if (!zkVar.a(14)) {
                    int size = this.c.size();
                    if (size >= this.f && size > 0) {
                        a(0);
                        size--;
                    }
                    if (size < this.f) {
                        this.c.add(zkVar);
                        z3 = true;
                        if (z3) {
                            c(zkVar);
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
                    c(zkVar);
                    i = 1;
                    z = z3;
                }
            } else {
                z = false;
            }
            this.e.f.d(zkVar);
            if (!z && r1 == 0 && r2) {
                zkVar.m = null;
            }
        }
    }

    private void c(zk zkVar) {
        kn.a(zkVar.a, null);
        if (null != null) {
            null;
        }
        if (this.e.j != null) {
            this.e.j.a(zkVar);
        }
        if (this.e.A != null) {
            this.e.f.d(zkVar);
        }
        zkVar.m = null;
        zb c = c();
        int i = zkVar.e;
        ArrayList arrayList = (ArrayList) c.a.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            c.a.put(i, arrayList);
            if (c.b.indexOfKey(i) < 0) {
                c.b.put(i, 5);
            }
        }
        if (c.b.get(i) > arrayList.size()) {
            zkVar.q();
            arrayList.add(zkVar);
        }
    }

    final void b(View view) {
        zk b = RecyclerView.b(view);
        b.j = null;
        b.k = false;
        b.h();
        a(b);
    }

    final void c(View view) {
        zk b = RecyclerView.b(view);
        if (!b.a(12) && b.s()) {
            boolean z;
            RecyclerView recyclerView = this.e;
            if (recyclerView.y == null || recyclerView.y.a(b, b.p())) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                b.a(this, true);
                this.b.add(b);
                return;
            }
        }
        if (!b.j() || b.m() || this.e.j.b) {
            b.a(this, false);
            this.a.add(b);
            return;
        }
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
    }

    final zk b(int i) {
        int i2 = 0;
        if (this.b != null) {
            int size = this.b.size();
            if (size != 0) {
                zk zkVar;
                int i3 = 0;
                while (i3 < size) {
                    zkVar = (zk) this.b.get(i3);
                    if (zkVar.g() || zkVar.c() != i) {
                        i3++;
                    } else {
                        zkVar.b(32);
                        return zkVar;
                    }
                }
                if (this.e.j.b) {
                    int c = this.e.d.c(i);
                    if (c > 0 && c < this.e.j.a()) {
                        long b = this.e.j.b(c);
                        while (i2 < size) {
                            zkVar = (zk) this.b.get(i2);
                            if (zkVar.g() || zkVar.d != b) {
                                i2++;
                            } else {
                                zkVar.b(32);
                                return zkVar;
                            }
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }

    final zk a(int i, int i2, boolean z) {
        int i3 = 0;
        int size = this.a.size();
        int i4 = 0;
        while (i4 < size) {
            zk zkVar = (zk) this.a.get(i4);
            if (zkVar.g() || zkVar.c() != i || zkVar.j() || (!this.e.A.g && zkVar.m())) {
                i4++;
            } else {
                zkVar.b(32);
                return zkVar;
            }
        }
        if (!z) {
            View view;
            wq wqVar = this.e.e;
            int size2 = wqVar.c.size();
            for (i4 = 0; i4 < size2; i4++) {
                View view2 = (View) wqVar.c.get(i4);
                zk b = wqVar.a.b(view2);
                if (b.c() == i && !b.j() && !b.m()) {
                    view = view2;
                    break;
                }
            }
            view = null;
            if (view != null) {
                zkVar = RecyclerView.b(view);
                wq wqVar2 = this.e.e;
                i3 = wqVar2.a.a(view);
                if (i3 < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                } else if (wqVar2.b.c(i3)) {
                    wqVar2.b.b(i3);
                    wqVar2.b(view);
                    int c = this.e.e.c(view);
                    if (c == -1) {
                        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + zkVar);
                    }
                    this.e.e.d(c);
                    c(view);
                    zkVar.b(8224);
                    return zkVar;
                } else {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
            }
        }
        i4 = this.c.size();
        while (i3 < i4) {
            zkVar = (zk) this.c.get(i3);
            if (zkVar.j() || zkVar.c() != i) {
                i3++;
            } else if (z) {
                return zkVar;
            } else {
                this.c.remove(i3);
                return zkVar;
            }
        }
        return null;
    }

    final zk a(long j, int i, boolean z) {
        int size;
        for (size = this.a.size() - 1; size >= 0; size--) {
            zk zkVar = (zk) this.a.get(size);
            if (zkVar.d == j && !zkVar.g()) {
                if (i == zkVar.e) {
                    zkVar.b(32);
                    if (!zkVar.m() || this.e.A.g) {
                        return zkVar;
                    }
                    zkVar.a(2, 14);
                    return zkVar;
                } else if (!z) {
                    this.a.remove(size);
                    this.e.removeDetachedView(zkVar.a, false);
                    b(zkVar.a);
                }
            }
        }
        for (size = this.c.size() - 1; size >= 0; size--) {
            zkVar = (zk) this.c.get(size);
            if (zkVar.d == j) {
                if (i == zkVar.e) {
                    if (z) {
                        return zkVar;
                    }
                    this.c.remove(size);
                    return zkVar;
                } else if (!z) {
                    a(size);
                }
            }
        }
        return null;
    }

    public final zb c() {
        if (this.g == null) {
            this.g = new zb();
        }
        return this.g;
    }

    public final void b(zk zkVar) {
        if (zkVar.k) {
            this.b.remove(zkVar);
        } else {
            this.a.remove(zkVar);
        }
        zkVar.j = null;
        zkVar.k = false;
        zkVar.h();
    }
}
