package p000;

public final class mze extends nyx<mze> {
    public Integer f29221a;
    public Integer f29222b;
    public Integer f29223c;
    public mzc[] f29224d;
    public mzc[] f29225e;
    public mzb f29226f;
    public myu f29227g;
    public myt[] f29228h;

    public /* synthetic */ nzf m33919a(nyt nyt) {
        return m33917b(nyt);
    }

    public mze() {
        m33918d();
    }

    private mze m33918d() {
        this.f29221a = null;
        this.f29222b = null;
        this.f29223c = null;
        this.f29224d = mzc.m33907d();
        this.f29225e = mzc.m33907d();
        this.f29226f = null;
        this.f29227g = null;
        this.f29228h = myt.m33858d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33920a(nyu nyu) {
        int i = 0;
        if (this.f29221a != null) {
            nyu.m37168a(1, this.f29221a.intValue());
        }
        if (this.f29222b != null) {
            nyu.m37168a(2, this.f29222b.intValue());
        }
        if (this.f29223c != null) {
            nyu.m37168a(3, this.f29223c.intValue());
        }
        if (this.f29224d != null && this.f29224d.length > 0) {
            for (nzf nzf : this.f29224d) {
                if (nzf != null) {
                    nyu.m37182b(4, nzf);
                }
            }
        }
        if (this.f29225e != null && this.f29225e.length > 0) {
            for (nzf nzf2 : this.f29225e) {
                if (nzf2 != null) {
                    nyu.m37182b(5, nzf2);
                }
            }
        }
        if (this.f29226f != null) {
            nyu.m37182b(6, this.f29226f);
        }
        if (this.f29227g != null) {
            nyu.m37182b(7, this.f29227g);
        }
        if (this.f29228h != null && this.f29228h.length > 0) {
            while (i < this.f29228h.length) {
                nzf nzf3 = this.f29228h[i];
                if (nzf3 != null) {
                    nyu.m37182b(8, nzf3);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m33921b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f29221a != null) {
            b += nyu.m37147f(1, this.f29221a.intValue());
        }
        if (this.f29222b != null) {
            b += nyu.m37147f(2, this.f29222b.intValue());
        }
        if (this.f29223c != null) {
            b += nyu.m37147f(3, this.f29223c.intValue());
        }
        if (this.f29224d != null && this.f29224d.length > 0) {
            i = b;
            for (nzf nzf : this.f29224d) {
                if (nzf != null) {
                    i += nyu.m37145d(4, nzf);
                }
            }
            b = i;
        }
        if (this.f29225e != null && this.f29225e.length > 0) {
            i = b;
            for (nzf nzf2 : this.f29225e) {
                if (nzf2 != null) {
                    i += nyu.m37145d(5, nzf2);
                }
            }
            b = i;
        }
        if (this.f29226f != null) {
            b += nyu.m37145d(6, this.f29226f);
        }
        if (this.f29227g != null) {
            b += nyu.m37145d(7, this.f29227g);
        }
        if (this.f29228h != null && this.f29228h.length > 0) {
            while (i2 < this.f29228h.length) {
                nzf nzf3 = this.f29228h[i2];
                if (nzf3 != null) {
                    b += nyu.m37145d(8, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private mze m33917b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29221a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f29222b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f29223c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f29224d == null) {
                        a = 0;
                    } else {
                        a = this.f29224d.length;
                    }
                    obj = new mzc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29224d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mzc();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new mzc();
                    nyt.m37101a(obj[a]);
                    this.f29224d = obj;
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f29225e == null) {
                        a = 0;
                    } else {
                        a = this.f29225e.length;
                    }
                    obj = new mzc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29225e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mzc();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new mzc();
                    nyt.m37101a(obj[a]);
                    this.f29225e = obj;
                    continue;
                case 50:
                    if (this.f29226f == null) {
                        this.f29226f = new mzb();
                    }
                    nyt.m37101a(this.f29226f);
                    continue;
                case 58:
                    if (this.f29227g == null) {
                        this.f29227g = new myu();
                    }
                    nyt.m37101a(this.f29227g);
                    continue;
                case 66:
                    b = nzl.m37265b(nyt, 66);
                    if (this.f29228h == null) {
                        a = 0;
                    } else {
                        a = this.f29228h.length;
                    }
                    obj = new myt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29228h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myt();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myt();
                    nyt.m37101a(obj[a]);
                    this.f29228h = obj;
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
