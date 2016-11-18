package p000;

public final class mvm extends nyx<mvm> {
    private static volatile mvm[] f28492f;
    public String f28493a;
    public mvn[] f28494b;
    public mvq[] f28495c;
    public mvh f28496d;
    public mvx[] f28497e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33097b(nyt);
    }

    public static mvm[] m33098d() {
        if (f28492f == null) {
            synchronized (nzc.c) {
                if (f28492f == null) {
                    f28492f = new mvm[0];
                }
            }
        }
        return f28492f;
    }

    public mvm() {
        m33099g();
    }

    private mvm m33099g() {
        this.f28493a = "";
        this.f28494b = mvn.m33104d();
        this.f28495c = mvq.m33114d();
        this.f28496d = null;
        this.f28497e = mvx.m33151d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (!(this.f28493a == null || this.f28493a.equals(""))) {
            nyu.a(1, this.f28493a);
        }
        if (this.f28494b != null && this.f28494b.length > 0) {
            for (nzf nzf : this.f28494b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f28495c != null && this.f28495c.length > 0) {
            for (nzf nzf2 : this.f28495c) {
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
            }
        }
        if (this.f28496d != null) {
            nyu.b(4, this.f28496d);
        }
        if (this.f28497e != null && this.f28497e.length > 0) {
            while (i < this.f28497e.length) {
                nzf nzf3 = this.f28497e[i];
                if (nzf3 != null) {
                    nyu.b(5, nzf3);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (!(this.f28493a == null || this.f28493a.equals(""))) {
            b += nyu.b(1, this.f28493a);
        }
        if (this.f28494b != null && this.f28494b.length > 0) {
            i = b;
            for (nzf nzf : this.f28494b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f28495c != null && this.f28495c.length > 0) {
            i = b;
            for (nzf nzf2 : this.f28495c) {
                if (nzf2 != null) {
                    i += nyu.d(3, nzf2);
                }
            }
            b = i;
        }
        if (this.f28496d != null) {
            b += nyu.d(4, this.f28496d);
        }
        if (this.f28497e != null && this.f28497e.length > 0) {
            while (i2 < this.f28497e.length) {
                nzf nzf3 = this.f28497e[i2];
                if (nzf3 != null) {
                    b += nyu.d(5, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private mvm m33097b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28493a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f28494b == null) {
                        a = 0;
                    } else {
                        a = this.f28494b.length;
                    }
                    obj = new mvn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28494b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mvn();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mvn();
                    nyt.a(obj[a]);
                    this.f28494b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f28495c == null) {
                        a = 0;
                    } else {
                        a = this.f28495c.length;
                    }
                    obj = new mvq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28495c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mvq();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mvq();
                    nyt.a(obj[a]);
                    this.f28495c = obj;
                    continue;
                case 34:
                    if (this.f28496d == null) {
                        this.f28496d = new mvh();
                    }
                    nyt.a(this.f28496d);
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f28497e == null) {
                        a = 0;
                    } else {
                        a = this.f28497e.length;
                    }
                    obj = new mvx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28497e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mvx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mvx();
                    nyt.a(obj[a]);
                    this.f28497e = obj;
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
