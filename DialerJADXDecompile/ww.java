import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public final class ww extends aac {
    ArrayList a;
    ArrayList b;
    ArrayList c;
    ArrayList d;
    ArrayList e;
    ArrayList f;
    ArrayList g;
    private ArrayList m;
    private ArrayList n;
    private ArrayList o;
    private ArrayList p;

    public ww() {
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public final void a() {
        int i;
        int i2;
        int i3;
        int i4 = !this.m.isEmpty() ? 1 : 0;
        if (this.o.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        if (this.p.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (this.n.isEmpty()) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (i4 != 0 || i != 0 || i3 != 0 || i2 != 0) {
            ArrayList arrayList;
            Runnable wxVar;
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                zk zkVar = (zk) it.next();
                lv l = kn.l(zkVar.a);
                this.f.add(zkVar);
                l.a(this.j).a(0.0f).a(new xa(this, zkVar, l)).b();
            }
            this.m.clear();
            if (i != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.o);
                this.b.add(arrayList);
                this.o.clear();
                wxVar = new wx(this, arrayList);
                if (i4 != 0) {
                    kn.a(((xg) arrayList.get(0)).a.a, wxVar, this.j);
                } else {
                    wxVar.run();
                }
            }
            if (i2 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.p);
                this.c.add(arrayList);
                this.p.clear();
                wxVar = new wy(this, arrayList);
                if (i4 != 0) {
                    kn.a(((xf) arrayList.get(0)).a.a, wxVar, this.j);
                } else {
                    wxVar.run();
                }
            }
            if (i3 != 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.n);
                this.a.add(arrayList2);
                this.n.clear();
                Runnable wzVar = new wz(this, arrayList2);
                if (i4 == 0 && i == 0 && i2 == 0) {
                    wzVar.run();
                    return;
                }
                long j;
                long j2;
                long j3;
                if (i4 != 0) {
                    j = this.j;
                } else {
                    j = 0;
                }
                if (i != 0) {
                    j2 = this.k;
                } else {
                    j2 = 0;
                }
                if (i2 != 0) {
                    j3 = this.l;
                } else {
                    j3 = 0;
                }
                kn.a(((zk) arrayList2.get(0)).a, wzVar, j + Math.max(j2, j3));
            }
        }
    }

    public final boolean a(zk zkVar) {
        g(zkVar);
        this.m.add(zkVar);
        return true;
    }

    public final boolean b(zk zkVar) {
        g(zkVar);
        kn.c(zkVar.a, 0.0f);
        this.n.add(zkVar);
        return true;
    }

    public final boolean a(zk zkVar, int i, int i2, int i3, int i4) {
        View view = zkVar.a;
        int h = (int) (((float) i) + kn.h(zkVar.a));
        int i5 = (int) (((float) i2) + kn.i(zkVar.a));
        g(zkVar);
        int i6 = i3 - h;
        int i7 = i4 - i5;
        if (i6 == 0 && i7 == 0) {
            e(zkVar);
            return false;
        }
        if (i6 != 0) {
            kn.a(view, (float) (-i6));
        }
        if (i7 != 0) {
            kn.b(view, (float) (-i7));
        }
        this.o.add(new xg(zkVar, h, i5, i3, i4));
        return true;
    }

    public final boolean a(zk zkVar, zk zkVar2, int i, int i2, int i3, int i4) {
        if (zkVar == zkVar2) {
            return a(zkVar, i, i2, i3, i4);
        }
        float h = kn.h(zkVar.a);
        float i5 = kn.i(zkVar.a);
        float e = kn.e(zkVar.a);
        g(zkVar);
        int i6 = (int) (((float) (i3 - i)) - h);
        int i7 = (int) (((float) (i4 - i2)) - i5);
        kn.a(zkVar.a, h);
        kn.b(zkVar.a, i5);
        kn.c(zkVar.a, e);
        if (zkVar2 != null) {
            g(zkVar2);
            kn.a(zkVar2.a, (float) (-i6));
            kn.b(zkVar2.a, (float) (-i7));
            kn.c(zkVar2.a, 0.0f);
        }
        this.p.add(new xf(zkVar, zkVar2, i, i2, i3, i4));
        return true;
    }

    private final void a(List list, zk zkVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            xf xfVar = (xf) list.get(size);
            if (a(xfVar, zkVar) && xfVar.a == null && xfVar.b == null) {
                list.remove(xfVar);
            }
        }
    }

    private final void a(xf xfVar) {
        if (xfVar.a != null) {
            a(xfVar, xfVar.a);
        }
        if (xfVar.b != null) {
            a(xfVar, xfVar.b);
        }
    }

    private final boolean a(xf xfVar, zk zkVar) {
        if (xfVar.b == zkVar) {
            xfVar.b = null;
        } else if (xfVar.a != zkVar) {
            return false;
        } else {
            xfVar.a = null;
        }
        kn.c(zkVar.a, 1.0f);
        kn.a(zkVar.a, 0.0f);
        kn.b(zkVar.a, 0.0f);
        e(zkVar);
        return true;
    }

    public final void c(zk zkVar) {
        int size;
        View view = zkVar.a;
        kn.l(view).a();
        for (size = this.o.size() - 1; size >= 0; size--) {
            if (((xg) this.o.get(size)).a == zkVar) {
                kn.b(view, 0.0f);
                kn.a(view, 0.0f);
                e(zkVar);
                this.o.remove(size);
            }
        }
        a(this.p, zkVar);
        if (this.m.remove(zkVar)) {
            kn.c(view, 1.0f);
            e(zkVar);
        }
        if (this.n.remove(zkVar)) {
            kn.c(view, 1.0f);
            e(zkVar);
        }
        for (size = this.c.size() - 1; size >= 0; size--) {
            List list = (ArrayList) this.c.get(size);
            a(list, zkVar);
            if (list.isEmpty()) {
                this.c.remove(size);
            }
        }
        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.b.get(size2);
            int size3 = arrayList.size() - 1;
            while (size3 >= 0) {
                if (((xg) arrayList.get(size3)).a == zkVar) {
                    kn.b(view, 0.0f);
                    kn.a(view, 0.0f);
                    e(zkVar);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.b.remove(size2);
                    }
                } else {
                    size3--;
                }
            }
        }
        for (size = this.a.size() - 1; size >= 0; size--) {
            arrayList = (ArrayList) this.a.get(size);
            if (arrayList.remove(zkVar)) {
                kn.c(view, 1.0f);
                e(zkVar);
                if (arrayList.isEmpty()) {
                    this.a.remove(size);
                }
            }
        }
        this.f.remove(zkVar);
        this.d.remove(zkVar);
        this.g.remove(zkVar);
        this.e.remove(zkVar);
        c();
    }

    private final void g(zk zkVar) {
        ce.a.a(zkVar.a);
        c(zkVar);
    }

    public final boolean b() {
        return (this.n.isEmpty() && this.p.isEmpty() && this.o.isEmpty() && this.m.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    final void c() {
        if (!b()) {
            e();
        }
    }

    public final void d() {
        int size;
        for (size = this.o.size() - 1; size >= 0; size--) {
            xg xgVar = (xg) this.o.get(size);
            View view = xgVar.a.a;
            kn.b(view, 0.0f);
            kn.a(view, 0.0f);
            e(xgVar.a);
            this.o.remove(size);
        }
        for (size = this.m.size() - 1; size >= 0; size--) {
            e((zk) this.m.get(size));
            this.m.remove(size);
        }
        for (size = this.n.size() - 1; size >= 0; size--) {
            zk zkVar = (zk) this.n.get(size);
            kn.c(zkVar.a, 1.0f);
            e(zkVar);
            this.n.remove(size);
        }
        for (size = this.p.size() - 1; size >= 0; size--) {
            a((xf) this.p.get(size));
        }
        this.p.clear();
        if (b()) {
            int size2;
            ArrayList arrayList;
            int size3;
            for (size2 = this.b.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.b.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    xg xgVar2 = (xg) arrayList.get(size3);
                    View view2 = xgVar2.a.a;
                    kn.b(view2, 0.0f);
                    kn.a(view2, 0.0f);
                    e(xgVar2.a);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.b.remove(arrayList);
                    }
                }
            }
            for (size2 = this.a.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.a.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    zk zkVar2 = (zk) arrayList.get(size3);
                    kn.c(zkVar2.a, 1.0f);
                    e(zkVar2);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.a.remove(arrayList);
                    }
                }
            }
            for (size2 = this.c.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.c.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    a((xf) arrayList.get(size3));
                    if (arrayList.isEmpty()) {
                        this.c.remove(arrayList);
                    }
                }
            }
            a(this.f);
            a(this.e);
            a(this.d);
            a(this.g);
            e();
        }
    }

    private static void a(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            kn.l(((zk) list.get(size)).a).a();
        }
    }

    public final boolean a(zk zkVar, List list) {
        return !list.isEmpty() || super.a(zkVar, list);
    }
}
