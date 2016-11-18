package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class abw extends afi {
    ArrayList<ArrayList<aer>> f183a = new ArrayList();
    ArrayList<ArrayList<acg>> f184b = new ArrayList();
    ArrayList<ArrayList<acf>> f185c = new ArrayList();
    ArrayList<aer> f186d = new ArrayList();
    ArrayList<aer> f187e = new ArrayList();
    ArrayList<aer> f188f = new ArrayList();
    ArrayList<aer> f189g = new ArrayList();
    private ArrayList<aer> f190i = new ArrayList();
    private ArrayList<aer> f191j = new ArrayList();
    private ArrayList<acg> f192k = new ArrayList();
    private ArrayList<acf> f193l = new ArrayList();

    public void mo28a() {
        int i;
        int i2;
        int i3;
        int i4 = !this.f190i.isEmpty() ? 1 : 0;
        if (this.f192k.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        if (this.f193l.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (this.f191j.isEmpty()) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (i4 != 0 || i != 0 || i3 != 0 || i2 != 0) {
            Runnable abx;
            ArrayList arrayList = this.f190i;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                aer aer = (aer) obj;
                pn m = oa.m(aer.f438a);
                this.f188f.add(aer);
                m.a(m328g()).a(0.0f).a(new aca(this, aer, m)).c();
            }
            this.f190i.clear();
            if (i != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.f192k);
                this.f184b.add(arrayList);
                this.f192k.clear();
                abx = new abx(this, arrayList);
                if (i4 != 0) {
                    oa.a(((acg) arrayList.get(0)).f224a.f438a, abx, m328g());
                } else {
                    abx.run();
                }
            }
            if (i2 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.f193l);
                this.f185c.add(arrayList);
                this.f193l.clear();
                abx = new aby(this, arrayList);
                if (i4 != 0) {
                    oa.a(((acf) arrayList.get(0)).f218a.f438a, abx, m328g());
                } else {
                    abx.run();
                }
            }
            if (i3 != 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f191j);
                this.f183a.add(arrayList2);
                this.f191j.clear();
                Runnable abz = new abz(this, arrayList2);
                if (i4 == 0 && i == 0 && i2 == 0) {
                    abz.run();
                    return;
                }
                long e;
                long h;
                long g = i4 != 0 ? m328g() : 0;
                if (i != 0) {
                    e = m325e();
                } else {
                    e = 0;
                }
                if (i2 != 0) {
                    h = m330h();
                } else {
                    h = 0;
                }
                oa.a(((aer) arrayList2.get(0)).f438a, abz, g + Math.max(e, h));
            }
        }
    }

    public boolean mo29a(aer aer) {
        m346h(aer);
        this.f190i.add(aer);
        return true;
    }

    public boolean mo34b(aer aer) {
        m346h(aer);
        oa.c(aer.f438a, 0.0f);
        this.f191j.add(aer);
        return true;
    }

    public boolean mo30a(aer aer, int i, int i2, int i3, int i4) {
        View view = aer.f438a;
        int i5 = (int) (((float) i) + oa.i(aer.f438a));
        int j = (int) (((float) i2) + oa.j(aer.f438a));
        m346h(aer);
        int i6 = i3 - i5;
        int i7 = i4 - j;
        if (i6 == 0 && i7 == 0) {
            m327f(aer);
            return false;
        }
        if (i6 != 0) {
            oa.a(view, (float) (-i6));
        }
        if (i7 != 0) {
            oa.b(view, (float) (-i7));
        }
        this.f192k.add(new acg(aer, i5, j, i3, i4));
        return true;
    }

    public boolean mo31a(aer aer, aer aer2, int i, int i2, int i3, int i4) {
        if (aer == aer2) {
            return mo30a(aer, i, i2, i3, i4);
        }
        float i5 = oa.i(aer.f438a);
        float j = oa.j(aer.f438a);
        float a = oa.a.a(aer.f438a);
        m346h(aer);
        int i6 = (int) (((float) (i3 - i)) - i5);
        int i7 = (int) (((float) (i4 - i2)) - j);
        oa.a(aer.f438a, i5);
        oa.b(aer.f438a, j);
        oa.c(aer.f438a, a);
        if (aer2 != null) {
            m346h(aer2);
            oa.a(aer2.f438a, (float) (-i6));
            oa.b(aer2.f438a, (float) (-i7));
            oa.c(aer2.f438a, 0.0f);
        }
        this.f193l.add(new acf(aer, aer2, i, i2, i3, i4));
        return true;
    }

    private void m344a(List<acf> list, aer aer) {
        for (int size = list.size() - 1; size >= 0; size--) {
            acf acf = (acf) list.get(size);
            if (m345a(acf, aer) && acf.f218a == null && acf.f219b == null) {
                list.remove(acf);
            }
        }
    }

    private void m342a(acf acf) {
        if (acf.f218a != null) {
            m345a(acf, acf.f218a);
        }
        if (acf.f219b != null) {
            m345a(acf, acf.f219b);
        }
    }

    private boolean m345a(acf acf, aer aer) {
        if (acf.f219b == aer) {
            acf.f219b = null;
        } else if (acf.f218a != aer) {
            return false;
        } else {
            acf.f218a = null;
        }
        oa.c(aer.f438a, 1.0f);
        oa.a(aer.f438a, 0.0f);
        oa.b(aer.f438a, 0.0f);
        m327f(aer);
        return true;
    }

    public void mo35c(aer aer) {
        int size;
        View view = aer.f438a;
        oa.m(view).b();
        for (size = this.f192k.size() - 1; size >= 0; size--) {
            if (((acg) this.f192k.get(size)).f224a == aer) {
                oa.b(view, 0.0f);
                oa.a(view, 0.0f);
                m327f(aer);
                this.f192k.remove(size);
            }
        }
        m344a(this.f193l, aer);
        if (this.f190i.remove(aer)) {
            oa.c(view, 1.0f);
            m327f(aer);
        }
        if (this.f191j.remove(aer)) {
            oa.c(view, 1.0f);
            m327f(aer);
        }
        for (size = this.f185c.size() - 1; size >= 0; size--) {
            List list = (ArrayList) this.f185c.get(size);
            m344a(list, aer);
            if (list.isEmpty()) {
                this.f185c.remove(size);
            }
        }
        for (int size2 = this.f184b.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f184b.get(size2);
            int size3 = arrayList.size() - 1;
            while (size3 >= 0) {
                if (((acg) arrayList.get(size3)).f224a == aer) {
                    oa.b(view, 0.0f);
                    oa.a(view, 0.0f);
                    m327f(aer);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.f184b.remove(size2);
                    }
                } else {
                    size3--;
                }
            }
        }
        for (size = this.f183a.size() - 1; size >= 0; size--) {
            arrayList = (ArrayList) this.f183a.get(size);
            if (arrayList.remove(aer)) {
                oa.c(view, 1.0f);
                m327f(aer);
                if (arrayList.isEmpty()) {
                    this.f183a.remove(size);
                }
            }
        }
        this.f188f.remove(aer);
        this.f186d.remove(aer);
        this.f189g.remove(aer);
        this.f187e.remove(aer);
        m354c();
    }

    private void m346h(aer aer) {
        cm.f5615a.mo1032a(aer.f438a);
        mo35c(aer);
    }

    public boolean mo33b() {
        return (this.f191j.isEmpty() && this.f193l.isEmpty() && this.f192k.isEmpty() && this.f190i.isEmpty() && this.f187e.isEmpty() && this.f188f.isEmpty() && this.f186d.isEmpty() && this.f189g.isEmpty() && this.f184b.isEmpty() && this.f183a.isEmpty() && this.f185c.isEmpty()) ? false : true;
    }

    void m354c() {
        if (!mo33b()) {
            m331i();
        }
    }

    public void mo36d() {
        int size;
        for (size = this.f192k.size() - 1; size >= 0; size--) {
            acg acg = (acg) this.f192k.get(size);
            View view = acg.f224a.f438a;
            oa.b(view, 0.0f);
            oa.a(view, 0.0f);
            m327f(acg.f224a);
            this.f192k.remove(size);
        }
        for (size = this.f190i.size() - 1; size >= 0; size--) {
            m327f((aer) this.f190i.get(size));
            this.f190i.remove(size);
        }
        for (size = this.f191j.size() - 1; size >= 0; size--) {
            aer aer = (aer) this.f191j.get(size);
            oa.c(aer.f438a, 1.0f);
            m327f(aer);
            this.f191j.remove(size);
        }
        for (size = this.f193l.size() - 1; size >= 0; size--) {
            m342a((acf) this.f193l.get(size));
        }
        this.f193l.clear();
        if (mo33b()) {
            int size2;
            ArrayList arrayList;
            int size3;
            for (size2 = this.f184b.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.f184b.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    acg acg2 = (acg) arrayList.get(size3);
                    View view2 = acg2.f224a.f438a;
                    oa.b(view2, 0.0f);
                    oa.a(view2, 0.0f);
                    m327f(acg2.f224a);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.f184b.remove(arrayList);
                    }
                }
            }
            for (size2 = this.f183a.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.f183a.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    aer aer2 = (aer) arrayList.get(size3);
                    oa.c(aer2.f438a, 1.0f);
                    m327f(aer2);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.f183a.remove(arrayList);
                    }
                }
            }
            for (size2 = this.f185c.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.f185c.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    m342a((acf) arrayList.get(size3));
                    if (arrayList.isEmpty()) {
                        this.f185c.remove(arrayList);
                    }
                }
            }
            abw.m343a(this.f188f);
            abw.m343a(this.f187e);
            abw.m343a(this.f186d);
            abw.m343a(this.f189g);
            m331i();
        }
    }

    private static void m343a(List<aer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            oa.m(((aer) list.get(size)).f438a).b();
        }
    }

    public boolean mo32a(aer aer, List<Object> list) {
        return !list.isEmpty() || super.mo32a(aer, list);
    }
}
