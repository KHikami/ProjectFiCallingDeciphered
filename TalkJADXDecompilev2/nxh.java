package defpackage;

public class nxh {
    private static final nwd b = nwd.a();
    public volatile nxi a;
    private nvn c;
    private nwd d;
    private volatile nvn e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxh)) {
            return false;
        }
        nxh nxh = (nxh) obj;
        nxi nxi = this.a;
        nxi nxi2 = nxh.a;
        if (nxi == null && nxi2 == null) {
            return c().equals(nxh.c());
        }
        if (nxi != null && nxi2 != null) {
            return nxi.equals(nxi2);
        }
        if (nxi != null) {
            return nxi.equals(nxh.a(nxi.i_()));
        }
        return a(nxi2.i_()).equals(nxi2);
    }

    public int hashCode() {
        return 1;
    }

    public nxi a(nxi nxi) {
        c(nxi);
        return this.a;
    }

    public nxi b(nxi nxi) {
        nxi nxi2 = this.a;
        this.c = null;
        this.e = null;
        this.a = nxi;
        return nxi2;
    }

    public int b() {
        if (this.e != null) {
            return this.e.b();
        }
        if (this.c != null) {
            return this.c.b();
        }
        if (this.a != null) {
            return this.a.l();
        }
        return 0;
    }

    public nvn c() {
        if (this.e != null) {
            return this.e;
        }
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.e != null) {
                nvn nvn = this.e;
                return nvn;
            }
            if (this.a == null) {
                this.e = nvn.a;
            } else {
                this.e = this.a.a();
            }
            nvn = this.e;
            return nvn;
        }
    }

    protected void c(nxi nxi) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a != null) {
                    return;
                }
                try {
                    if (this.c != null) {
                        this.a = (nxi) nxi.c().c(this.c, this.d);
                        this.e = this.c;
                    } else {
                        this.a = nxi;
                        this.e = nvn.a;
                    }
                } catch (nxc e) {
                    this.a = nxi;
                    this.e = nvn.a;
                }
            }
        }
    }
}
