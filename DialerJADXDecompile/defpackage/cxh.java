package defpackage;

/* compiled from: PG */
/* renamed from: cxh */
public final class cxh implements cxc {
    final Object a;
    cxg b;
    cxc c;
    boolean d;
    private cxf e;

    public cxh(int i, cxf cxf) {
        this.a = new Object();
        this.b = new cxg(i);
        this.e = cxf;
    }

    public final void a(dln dln) {
        synchronized (this.a) {
            if (this.d) {
            } else if (this.c != null) {
                this.c.a(dln);
            } else {
                Object obj;
                cxg cxg = this.b;
                if (cxg.a.size() < cxg.b) {
                    cxg.a.add(dln);
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj == null) {
                    a();
                    if (this.e != null) {
                        this.e.a();
                    }
                }
            }
        }
    }

    final void a() {
        synchronized (this.a) {
            this.d = true;
            this.b = null;
        }
    }
}
