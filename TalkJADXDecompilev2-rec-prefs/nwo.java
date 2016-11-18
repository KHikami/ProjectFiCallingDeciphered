package p000;

public abstract class nwo<MessageType extends nwo<MessageType, BuilderType>, BuilderType extends nwn<MessageType, BuilderType>> extends nwi<MessageType, BuilderType> implements nxk {
    public nwf<nwh> f28719d = new nwf();

    /* synthetic */ void mo3953a(nwt nwt, nwi nwi) {
        nwi = (nwo) nwi;
        super.mo3953a(nwt, nwi);
        this.f28719d = nwt.a(this.f28719d, nwi.f28719d);
    }

    public boolean m33448i() {
        return this.f28719d.m33417e();
    }

    public final void mo3954d() {
        super.mo3954d();
        this.f28719d.m33410a();
    }

    public nwp m33449j() {
        return new nwp(this, true);
    }

    public int m33450k() {
        return this.f28719d.m33418f();
    }

    public <MessageType extends nxi> boolean m33444a(MessageType messageType, nvw nvw, nwd nwd, int i) {
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
            if (i3 == nwf.m33398a(a2.d.m33422b(), false)) {
                z = false;
                z2 = false;
            } else if (a2.d.f28715d && a2.d.f28714c.c() && i3 == nwf.m33398a(a2.d.m33422b(), true)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                return m33436a(i, nvw);
            }
            if (z) {
                switch (nwj.a[a2.d.m33423c().ordinal()]) {
                    case 1:
                        if (!a2.d.m33424d()) {
                            nxi = (nxi) this.f28719d.m33409a(a2.d);
                            if (nxi != null) {
                                f = nxi.mo3950f();
                                if (f == null) {
                                    f = a2.b().mo3951g();
                                }
                                if (a2.d.m33422b() != nyi.j) {
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
                            f = a2.b().mo3951g();
                        }
                        if (a2.d.m33422b() != nyi.j) {
                            nvw.a(f, nwd);
                        } else {
                            nvw.a(a2.a(), f, nwd);
                        }
                        i2 = f.i();
                    case 2:
                        n = nvw.n();
                        i2 = a2.d.m33427g().a(n);
                        if (i2 == null) {
                            m33434a(i4, n);
                            return true;
                        }
                        break;
                    default:
                        i2 = nwf.m33400a(nvw, a2.d.m33422b(), false);
                        break;
                }
                if (a2.d.m33424d()) {
                    this.f28719d.m33412a(a2.d, a2.a(i2));
                } else {
                    this.f28719d.m33413b(a2.d, a2.a(i2));
                }
            } else {
                i3 = nvw.b(nvw.s());
                if (a2.d.m33422b() != nyi.n) {
                    while (nvw.u() > 0) {
                        a = a2.d.m33427g().a(nvw.n());
                        if (a == null) {
                            return true;
                        }
                        this.f28719d.m33413b(a2.d, a2.a(a));
                    }
                } else {
                    while (nvw.u() > 0) {
                        this.f28719d.m33413b(a2.d, nwf.m33400a(nvw, a2.d.m33422b(), false));
                    }
                }
                nvw.c(i3);
            }
            return true;
        }
        z = false;
        z2 = true;
        if (z2) {
            return m33436a(i, nvw);
        }
        if (z) {
            switch (nwj.a[a2.d.m33423c().ordinal()]) {
                case 1:
                    if (a2.d.m33424d()) {
                        nxi = (nxi) this.f28719d.m33409a(a2.d);
                        if (nxi != null) {
                            f = nxi.mo3950f();
                            if (f == null) {
                                f = a2.b().mo3951g();
                            }
                            if (a2.d.m33422b() != nyi.j) {
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
                        f = a2.b().mo3951g();
                    }
                    if (a2.d.m33422b() != nyi.j) {
                        nvw.a(f, nwd);
                    } else {
                        nvw.a(a2.a(), f, nwd);
                    }
                    i2 = f.i();
                case 2:
                    n = nvw.n();
                    i2 = a2.d.m33427g().a(n);
                    if (i2 == null) {
                        m33434a(i4, n);
                        return true;
                    }
                    break;
                default:
                    i2 = nwf.m33400a(nvw, a2.d.m33422b(), false);
                    break;
            }
            if (a2.d.m33424d()) {
                this.f28719d.m33412a(a2.d, a2.a(i2));
            } else {
                this.f28719d.m33413b(a2.d, a2.a(i2));
            }
        } else {
            i3 = nvw.b(nvw.s());
            if (a2.d.m33422b() != nyi.n) {
                while (nvw.u() > 0) {
                    this.f28719d.m33413b(a2.d, nwf.m33400a(nvw, a2.d.m33422b(), false));
                }
            } else {
                while (nvw.u() > 0) {
                    a = a2.d.m33427g().a(nvw.n());
                    if (a == null) {
                        return true;
                    }
                    this.f28719d.m33413b(a2.d, a2.a(a));
                }
            }
            nvw.c(i3);
        }
        return true;
    }

    public /* synthetic */ nxj mo3950f() {
        nwk nwk = (nwk) m33431a(nws.f);
        nwk.b(this);
        return nwk;
    }

    public /* synthetic */ nxj mo3951g() {
        return (nwk) m33431a(nws.f);
    }

    public /* synthetic */ nxi i_() {
        return (nwi) m33431a(nws.g);
    }
}
