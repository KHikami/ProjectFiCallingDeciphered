package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import oa;
import pn;

/* renamed from: abw */
public final class abw extends afi {
    ArrayList<ArrayList<aer>> a;
    ArrayList<ArrayList<acg>> b;
    ArrayList<ArrayList<acf>> c;
    ArrayList<aer> d;
    ArrayList<aer> e;
    ArrayList<aer> f;
    ArrayList<aer> g;
    private ArrayList<aer> i;
    private ArrayList<aer> j;
    private ArrayList<acg> k;
    private ArrayList<acf> l;

    public abw() {
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public void a() {
        int i;
        int i2;
        int i3;
        int i4 = !this.i.isEmpty() ? 1 : 0;
        if (this.k.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        if (this.l.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (this.j.isEmpty()) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (i4 != 0 || i != 0 || i3 != 0 || i2 != 0) {
            Runnable abx;
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                aer aer = (aer) obj;
                pn m = oa.m(aer.a);
                this.f.add(aer);
                m.a(g()).a(0.0f).a(new aca(this, aer, m)).c();
            }
            this.i.clear();
            if (i != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.k);
                this.b.add(arrayList);
                this.k.clear();
                abx = new abx(this, arrayList);
                if (i4 != 0) {
                    oa.a(((acg) arrayList.get(0)).a.a, abx, g());
                } else {
                    abx.run();
                }
            }
            if (i2 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.l);
                this.c.add(arrayList);
                this.l.clear();
                abx = new aby(this, arrayList);
                if (i4 != 0) {
                    oa.a(((acf) arrayList.get(0)).a.a, abx, g());
                } else {
                    abx.run();
                }
            }
            if (i3 != 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.j);
                this.a.add(arrayList2);
                this.j.clear();
                Runnable abz = new abz(this, arrayList2);
                if (i4 == 0 && i == 0 && i2 == 0) {
                    abz.run();
                    return;
                }
                long e;
                long h;
                long g = i4 != 0 ? g() : 0;
                if (i != 0) {
                    e = e();
                } else {
                    e = 0;
                }
                if (i2 != 0) {
                    h = h();
                } else {
                    h = 0;
                }
                oa.a(((aer) arrayList2.get(0)).a, abz, g + Math.max(e, h));
            }
        }
    }

    public boolean a(aer aer) {
        h(aer);
        this.i.add(aer);
        return true;
    }

    public boolean b(aer aer) {
        h(aer);
        oa.c(aer.a, 0.0f);
        this.j.add(aer);
        return true;
    }

    public boolean a(aer aer, int i, int i2, int i3, int i4) {
        View view = aer.a;
        int i5 = (int) (((float) i) + oa.i(aer.a));
        int j = (int) (((float) i2) + oa.j(aer.a));
        h(aer);
        int i6 = i3 - i5;
        int i7 = i4 - j;
        if (i6 == 0 && i7 == 0) {
            f(aer);
            return false;
        }
        if (i6 != 0) {
            oa.a(view, (float) (-i6));
        }
        if (i7 != 0) {
            oa.b(view, (float) (-i7));
        }
        this.k.add(new acg(aer, i5, j, i3, i4));
        return true;
    }

    public boolean a(aer aer, aer aer2, int i, int i2, int i3, int i4) {
        if (aer == aer2) {
            return a(aer, i, i2, i3, i4);
        }
        float i5 = oa.i(aer.a);
        float j = oa.j(aer.a);
        float a = oa.a.a(aer.a);
        h(aer);
        int i6 = (int) (((float) (i3 - i)) - i5);
        int i7 = (int) (((float) (i4 - i2)) - j);
        oa.a(aer.a, i5);
        oa.b(aer.a, j);
        oa.c(aer.a, a);
        if (aer2 != null) {
            h(aer2);
            oa.a(aer2.a, (float) (-i6));
            oa.b(aer2.a, (float) (-i7));
            oa.c(aer2.a, 0.0f);
        }
        this.l.add(new acf(aer, aer2, i, i2, i3, i4));
        return true;
    }

    private void a(List<acf> list, aer aer) {
        for (int size = list.size() - 1; size >= 0; size--) {
            acf acf = (acf) list.get(size);
            if (a(acf, aer) && acf.a == null && acf.b == null) {
                list.remove(acf);
            }
        }
    }

    private void a(acf acf) {
        if (acf.a != null) {
            a(acf, acf.a);
        }
        if (acf.b != null) {
            a(acf, acf.b);
        }
    }

    private boolean a(acf acf, aer aer) {
        if (acf.b == aer) {
            acf.b = null;
        } else if (acf.a != aer) {
            return false;
        } else {
            acf.a = null;
        }
        oa.c(aer.a, 1.0f);
        oa.a(aer.a, 0.0f);
        oa.b(aer.a, 0.0f);
        f(aer);
        return true;
    }

    public void c(aer aer) {
        int size;
        View view = aer.a;
        oa.m(view).b();
        for (size = this.k.size() - 1; size >= 0; size--) {
            if (((acg) this.k.get(size)).a == aer) {
                oa.b(view, 0.0f);
                oa.a(view, 0.0f);
                f(aer);
                this.k.remove(size);
            }
        }
        a(this.l, aer);
        if (this.i.remove(aer)) {
            oa.c(view, 1.0f);
            f(aer);
        }
        if (this.j.remove(aer)) {
            oa.c(view, 1.0f);
            f(aer);
        }
        for (size = this.c.size() - 1; size >= 0; size--) {
            List list = (ArrayList) this.c.get(size);
            a(list, aer);
            if (list.isEmpty()) {
                this.c.remove(size);
            }
        }
        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.b.get(size2);
            int size3 = arrayList.size() - 1;
            while (size3 >= 0) {
                if (((acg) arrayList.get(size3)).a == aer) {
                    oa.b(view, 0.0f);
                    oa.a(view, 0.0f);
                    f(aer);
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
            if (arrayList.remove(aer)) {
                oa.c(view, 1.0f);
                f(aer);
                if (arrayList.isEmpty()) {
                    this.a.remove(size);
                }
            }
        }
        this.f.remove(aer);
        this.d.remove(aer);
        this.g.remove(aer);
        this.e.remove(aer);
        c();
    }

    private void h(aer aer) {
        cm.a.a(aer.a);
        c(aer);
    }

    public boolean b() {
        return (this.j.isEmpty() && this.l.isEmpty() && this.k.isEmpty() && this.i.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    void c() {
        if (!b()) {
            i();
        }
    }

    public void d() {
        int size;
        for (size = this.k.size() - 1; size >= 0; size--) {
            acg acg = (acg) this.k.get(size);
            View view = acg.a.a;
            oa.b(view, 0.0f);
            oa.a(view, 0.0f);
            f(acg.a);
            this.k.remove(size);
        }
        for (size = this.i.size() - 1; size >= 0; size--) {
            f((aer) this.i.get(size));
            this.i.remove(size);
        }
        for (size = this.j.size() - 1; size >= 0; size--) {
            aer aer = (aer) this.j.get(size);
            oa.c(aer.a, 1.0f);
            f(aer);
            this.j.remove(size);
        }
        for (size = this.l.size() - 1; size >= 0; size--) {
            a((acf) this.l.get(size));
        }
        this.l.clear();
        if (b()) {
            int size2;
            ArrayList arrayList;
            int size3;
            for (size2 = this.b.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.b.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    acg acg2 = (acg) arrayList.get(size3);
                    View view2 = acg2.a.a;
                    oa.b(view2, 0.0f);
                    oa.a(view2, 0.0f);
                    f(acg2.a);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.b.remove(arrayList);
                    }
                }
            }
            for (size2 = this.a.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.a.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    aer aer2 = (aer) arrayList.get(size3);
                    oa.c(aer2.a, 1.0f);
                    f(aer2);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.a.remove(arrayList);
                    }
                }
            }
            for (size2 = this.c.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.c.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    a((acf) arrayList.get(size3));
                    if (arrayList.isEmpty()) {
                        this.c.remove(arrayList);
                    }
                }
            }
            abw.a(this.f);
            abw.a(this.e);
            abw.a(this.d);
            abw.a(this.g);
            i();
        }
    }

    private static void a(List<aer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            oa.m(((aer) list.get(size)).a).b();
        }
    }

    public boolean a(aer aer, List<Object> list) {
        return !list.isEmpty() || super.a(aer, list);
    }
}
