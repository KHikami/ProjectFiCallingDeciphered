package p000;

public class nxh {
    private static final nwd f31206b = nwd.m36919a();
    public volatile nxi f31207a;
    private nvn f31208c;
    private nwd f31209d;
    private volatile nvn f31210e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxh)) {
            return false;
        }
        nxh nxh = (nxh) obj;
        nxi nxi = this.f31207a;
        nxi nxi2 = nxh.f31207a;
        if (nxi == null && nxi2 == null) {
            return m37026c().equals(nxh.m37026c());
        }
        if (nxi != null && nxi2 != null) {
            return nxi.equals(nxi2);
        }
        if (nxi != null) {
            return nxi.equals(nxh.m37023a(nxi.i_()));
        }
        return m37023a(nxi2.i_()).equals(nxi2);
    }

    public int hashCode() {
        return 1;
    }

    public nxi m37023a(nxi nxi) {
        m37027c(nxi);
        return this.f31207a;
    }

    public nxi m37025b(nxi nxi) {
        nxi nxi2 = this.f31207a;
        this.f31208c = null;
        this.f31210e = null;
        this.f31207a = nxi;
        return nxi2;
    }

    public int m37024b() {
        if (this.f31210e != null) {
            return this.f31210e.b();
        }
        if (this.f31208c != null) {
            return this.f31208c.b();
        }
        if (this.f31207a != null) {
            return this.f31207a.l();
        }
        return 0;
    }

    public nvn m37026c() {
        if (this.f31210e != null) {
            return this.f31210e;
        }
        if (this.f31208c != null) {
            return this.f31208c;
        }
        synchronized (this) {
            if (this.f31210e != null) {
                nvn nvn = this.f31210e;
                return nvn;
            }
            if (this.f31207a == null) {
                this.f31210e = nvn.a;
            } else {
                this.f31210e = this.f31207a.a();
            }
            nvn = this.f31210e;
            return nvn;
        }
    }

    protected void m37027c(nxi nxi) {
        if (this.f31207a == null) {
            synchronized (this) {
                if (this.f31207a != null) {
                    return;
                }
                try {
                    if (this.f31208c != null) {
                        this.f31207a = (nxi) nxi.c().mo3979c(this.f31208c, this.f31209d);
                        this.f31210e = this.f31208c;
                    } else {
                        this.f31207a = nxi;
                        this.f31210e = nvn.a;
                    }
                } catch (nxc e) {
                    this.f31207a = nxi;
                    this.f31210e = nvn.a;
                }
            }
        }
    }
}
