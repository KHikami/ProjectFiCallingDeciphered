package p000;

public final class nud extends nyx<nud> {
    private static volatile nud[] f30819d;
    public nua[] f30820a;
    public nuf[] f30821b;
    public nuc[] f30822c;

    public /* synthetic */ nzf m36570a(nyt nyt) {
        return m36567b(nyt);
    }

    public static nud[] m36568d() {
        if (f30819d == null) {
            synchronized (nzc.f31309c) {
                if (f30819d == null) {
                    f30819d = new nud[0];
                }
            }
        }
        return f30819d;
    }

    public nud() {
        m36569g();
    }

    private nud m36569g() {
        this.f30820a = nua.m36551d();
        this.f30821b = nuf.m36579d();
        this.f30822c = nuc.m36562d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36571a(nyu nyu) {
        int i = 0;
        if (this.f30820a != null && this.f30820a.length > 0) {
            for (nzf nzf : this.f30820a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f30821b != null && this.f30821b.length > 0) {
            for (nzf nzf2 : this.f30821b) {
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
            }
        }
        if (this.f30822c != null && this.f30822c.length > 0) {
            while (i < this.f30822c.length) {
                nzf nzf3 = this.f30822c[i];
                if (nzf3 != null) {
                    nyu.m37182b(3, nzf3);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m36572b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f30820a != null && this.f30820a.length > 0) {
            i = b;
            for (nzf nzf : this.f30820a) {
                if (nzf != null) {
                    i += nyu.m37145d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f30821b != null && this.f30821b.length > 0) {
            i = b;
            for (nzf nzf2 : this.f30821b) {
                if (nzf2 != null) {
                    i += nyu.m37145d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.f30822c != null && this.f30822c.length > 0) {
            while (i2 < this.f30822c.length) {
                nzf nzf3 = this.f30822c[i2];
                if (nzf3 != null) {
                    b += nyu.m37145d(3, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private nud m36567b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f30820a == null) {
                        a = 0;
                    } else {
                        a = this.f30820a.length;
                    }
                    obj = new nua[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30820a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nua();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nua();
                    nyt.m37101a(obj[a]);
                    this.f30820a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f30821b == null) {
                        a = 0;
                    } else {
                        a = this.f30821b.length;
                    }
                    obj = new nuf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30821b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nuf();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nuf();
                    nyt.m37101a(obj[a]);
                    this.f30821b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f30822c == null) {
                        a = 0;
                    } else {
                        a = this.f30822c.length;
                    }
                    obj = new nuc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30822c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nuc();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nuc();
                    nyt.m37101a(obj[a]);
                    this.f30822c = obj;
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
