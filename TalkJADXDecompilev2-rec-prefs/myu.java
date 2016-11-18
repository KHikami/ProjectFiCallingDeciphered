package p000;

public final class myu extends nyx<myu> {
    private static volatile myu[] f29179h;
    public String f29180a;
    public naq f29181b;
    public String[] f29182c;
    public String f29183d;
    public myl[] f29184e;
    public nbu f29185f;
    public myt[] f29186g;

    public /* synthetic */ nzf m33866a(nyt nyt) {
        return m33863b(nyt);
    }

    public static myu[] m33864d() {
        if (f29179h == null) {
            synchronized (nzc.f31309c) {
                if (f29179h == null) {
                    f29179h = new myu[0];
                }
            }
        }
        return f29179h;
    }

    public myu() {
        m33865g();
    }

    private myu m33865g() {
        this.f29180a = null;
        this.f29181b = null;
        this.f29182c = nzl.f31332f;
        this.f29183d = null;
        this.f29184e = myl.m33819d();
        this.f29185f = null;
        this.f29186g = myt.m33858d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33867a(nyu nyu) {
        int i = 0;
        if (this.f29180a != null) {
            nyu.m37170a(1, this.f29180a);
        }
        if (this.f29181b != null) {
            nyu.m37182b(2, this.f29181b);
        }
        if (this.f29182c != null && this.f29182c.length > 0) {
            for (String str : this.f29182c) {
                if (str != null) {
                    nyu.m37170a(3, str);
                }
            }
        }
        if (this.f29183d != null) {
            nyu.m37170a(4, this.f29183d);
        }
        if (this.f29184e != null && this.f29184e.length > 0) {
            for (nzf nzf : this.f29184e) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        if (this.f29185f != null) {
            nyu.m37182b(6, this.f29185f);
        }
        if (this.f29186g != null && this.f29186g.length > 0) {
            while (i < this.f29186g.length) {
                nzf nzf2 = this.f29186g[i];
                if (nzf2 != null) {
                    nyu.m37182b(7, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m33868b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f29180a != null) {
            b += nyu.m37137b(1, this.f29180a);
        }
        if (this.f29181b != null) {
            b += nyu.m37145d(2, this.f29181b);
        }
        if (this.f29182c != null && this.f29182c.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f29182c) {
                if (str != null) {
                    i4++;
                    i3 += nyu.m37140b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f29183d != null) {
            b += nyu.m37137b(4, this.f29183d);
        }
        if (this.f29184e != null && this.f29184e.length > 0) {
            i = b;
            for (nzf nzf : this.f29184e) {
                if (nzf != null) {
                    i += nyu.m37145d(5, nzf);
                }
            }
            b = i;
        }
        if (this.f29185f != null) {
            b += nyu.m37145d(6, this.f29185f);
        }
        if (this.f29186g != null && this.f29186g.length > 0) {
            while (i2 < this.f29186g.length) {
                nzf nzf2 = this.f29186g[i2];
                if (nzf2 != null) {
                    b += nyu.m37145d(7, nzf2);
                }
                i2++;
            }
        }
        return b;
    }

    private myu m33863b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29180a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f29181b == null) {
                        this.f29181b = new naq();
                    }
                    nyt.m37101a(this.f29181b);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    a = this.f29182c == null ? 0 : this.f29182c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29182c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f29182c = obj;
                    continue;
                case 34:
                    this.f29183d = nyt.m37117j();
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f29184e == null) {
                        a = 0;
                    } else {
                        a = this.f29184e.length;
                    }
                    obj = new myl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29184e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myl();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myl();
                    nyt.m37101a(obj[a]);
                    this.f29184e = obj;
                    continue;
                case 50:
                    if (this.f29185f == null) {
                        this.f29185f = new nbu();
                    }
                    nyt.m37101a(this.f29185f);
                    continue;
                case 58:
                    b = nzl.m37265b(nyt, 58);
                    if (this.f29186g == null) {
                        a = 0;
                    } else {
                        a = this.f29186g.length;
                    }
                    obj = new myt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29186g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myt();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myt();
                    nyt.m37101a(obj[a]);
                    this.f29186g = obj;
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
