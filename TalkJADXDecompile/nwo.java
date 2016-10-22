public abstract class nwo<MessageType extends nwo<MessageType, BuilderType>, BuilderType extends nwn<MessageType, BuilderType>> extends nwi<MessageType, BuilderType> implements nxk {
    public nwf<nwh> d;

    public nwo() {
        this.d = new nwf();
    }

    /* synthetic */ void a(nwt nwt, nwi nwi) {
        nwi = (nwo) nwi;
        super.a(nwt, nwi);
        this.d = nwt.a(this.d, nwi.d);
    }

    public boolean i() {
        return this.d.e();
    }

    public final void d() {
        super.d();
        this.d.a();
    }

    public nwp j() {
        return new nwp(this, true);
    }

    public int k() {
        return this.d.f();
    }

    public <MessageType extends nxi> boolean a(MessageType messageType, nvw nvw, nwd nwd, int i) {
        boolean z;
        boolean z2;
        nxi nxi;
        nxj f;
        Object i2;
        int n;
        nww a;
        int i3 = i & 7;
        int i4 = i >>> 3;
        nwb a2 = nwd.a(messageType, i4);
        if (a2 != null) {
            if (i3 == nwf.a(a2.d.b(), false)) {
                z = false;
                z2 = false;
            } else if (a2.d.d && a2.d.c.c() && i3 == nwf.a(a2.d.b(), true)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                return a(i, nvw);
            }
            if (z) {
                switch (nwj.a[a2.d.c().ordinal()]) {
                    case wi.j /*1*/:
                        if (!a2.d.d()) {
                            nxi = (nxi) this.d.a(a2.d);
                            if (nxi != null) {
                                f = nxi.f();
                                if (f == null) {
                                    f = a2.b().g();
                                }
                                if (a2.d.b() != nyi.j) {
                                    nvw.a(a2.a(), f, nwd);
                                } else {
                                    nvw.a(f, nwd);
                                }
                                i2 = f.i();
                                break;
                            }
                        }
                        f = null;
                        if (f == null) {
                            f = a2.b().g();
                        }
                        if (a2.d.b() != nyi.j) {
                            nvw.a(f, nwd);
                        } else {
                            nvw.a(a2.a(), f, nwd);
                        }
                        i2 = f.i();
                    case wi.l /*2*/:
                        n = nvw.n();
                        i2 = a2.d.g().a(n);
                        if (i2 == null) {
                            a(i4, n);
                            return true;
                        }
                        break;
                    default:
                        i2 = nwf.a(nvw, a2.d.b(), false);
                        break;
                }
                if (a2.d.d()) {
                    this.d.a(a2.d, a2.a(i2));
                } else {
                    this.d.b(a2.d, a2.a(i2));
                }
            } else {
                i3 = nvw.b(nvw.s());
                if (a2.d.b() != nyi.n) {
                    while (nvw.u() > 0) {
                        a = a2.d.g().a(nvw.n());
                        if (a == null) {
                            return true;
                        }
                        this.d.b(a2.d, a2.a(a));
                    }
                } else {
                    while (nvw.u() > 0) {
                        this.d.b(a2.d, nwf.a(nvw, a2.d.b(), false));
                    }
                }
                nvw.c(i3);
            }
            return true;
        }
        z = false;
        z2 = true;
        if (z2) {
            return a(i, nvw);
        }
        if (z) {
            switch (nwj.a[a2.d.c().ordinal()]) {
                case wi.j /*1*/:
                    if (a2.d.d()) {
                        nxi = (nxi) this.d.a(a2.d);
                        if (nxi != null) {
                            f = nxi.f();
                            if (f == null) {
                                f = a2.b().g();
                            }
                            if (a2.d.b() != nyi.j) {
                                nvw.a(a2.a(), f, nwd);
                            } else {
                                nvw.a(f, nwd);
                            }
                            i2 = f.i();
                            break;
                        }
                    }
                    f = null;
                    if (f == null) {
                        f = a2.b().g();
                    }
                    if (a2.d.b() != nyi.j) {
                        nvw.a(f, nwd);
                    } else {
                        nvw.a(a2.a(), f, nwd);
                    }
                    i2 = f.i();
                case wi.l /*2*/:
                    n = nvw.n();
                    i2 = a2.d.g().a(n);
                    if (i2 == null) {
                        a(i4, n);
                        return true;
                    }
                    break;
                default:
                    i2 = nwf.a(nvw, a2.d.b(), false);
                    break;
            }
            if (a2.d.d()) {
                this.d.a(a2.d, a2.a(i2));
            } else {
                this.d.b(a2.d, a2.a(i2));
            }
        } else {
            i3 = nvw.b(nvw.s());
            if (a2.d.b() != nyi.n) {
                while (nvw.u() > 0) {
                    this.d.b(a2.d, nwf.a(nvw, a2.d.b(), false));
                }
            } else {
                while (nvw.u() > 0) {
                    a = a2.d.g().a(nvw.n());
                    if (a == null) {
                        return true;
                    }
                    this.d.b(a2.d, a2.a(a));
                }
            }
            nvw.c(i3);
        }
        return true;
    }

    public /* synthetic */ nxj f() {
        nwk nwk = (nwk) a(nws.f);
        nwk.b(this);
        return nwk;
    }

    public /* synthetic */ nxj g() {
        return (nwk) a(nws.f);
    }

    public /* synthetic */ nxi i_() {
        return (nwi) a(nws.g);
    }
}
