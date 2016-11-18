package defpackage;

public final class oqw extends nyx<oqw> {
    private static volatile oqw[] l;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public oqu f;
    public String g;
    public String h;
    public String i;
    public oqu j;
    public oqy[] k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oqw[] d() {
        if (l == null) {
            synchronized (nzc.c) {
                if (l == null) {
                    l = new oqw[0];
                }
            }
        }
        return l;
    }

    public oqw() {
        g();
    }

    private oqw g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = oqy.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b);
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.f != null) {
            nyu.b(4, this.f);
        }
        if (this.g != null) {
            nyu.a(5, this.g);
        }
        if (this.i != null) {
            nyu.a(6, this.i);
        }
        if (this.j != null) {
            nyu.b(7, this.j);
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        if (this.k != null && this.k.length > 0) {
            for (nzf nzf : this.k) {
                if (nzf != null) {
                    nyu.b(9, nzf);
                }
            }
        }
        if (this.a != null) {
            nyu.a(10, this.a);
        }
        if (this.d != null) {
            nyu.a(11, this.d);
        }
        if (this.e != null) {
            nyu.a(12, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.b(1, this.b);
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.f != null) {
            b += nyu.d(4, this.f);
        }
        if (this.g != null) {
            b += nyu.b(5, this.g);
        }
        if (this.i != null) {
            b += nyu.b(6, this.i);
        }
        if (this.j != null) {
            b += nyu.d(7, this.j);
        }
        if (this.h != null) {
            b += nyu.b(8, this.h);
        }
        if (this.k != null && this.k.length > 0) {
            int i = b;
            for (nzf nzf : this.k) {
                if (nzf != null) {
                    i += nyu.d(9, nzf);
                }
            }
            b = i;
        }
        if (this.a != null) {
            b += nyu.b(10, this.a);
        }
        if (this.d != null) {
            b += nyu.b(11, this.d);
        }
        if (this.e != null) {
            return b + nyu.b(12, this.e);
        }
        return b;
    }

    private oqw b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    if (this.f == null) {
                        this.f = new oqu();
                    }
                    nyt.a(this.f);
                    continue;
                case 42:
                    this.g = nyt.j();
                    continue;
                case 50:
                    this.i = nyt.j();
                    continue;
                case 58:
                    if (this.j == null) {
                        this.j = new oqu();
                    }
                    nyt.a(this.j);
                    continue;
                case 66:
                    this.h = nyt.j();
                    continue;
                case 74:
                    int b = nzl.b(nyt, 74);
                    if (this.k == null) {
                        a = 0;
                    } else {
                        a = this.k.length;
                    }
                    Object obj = new oqy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqy();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oqy();
                    nyt.a(obj[a]);
                    this.k = obj;
                    continue;
                case 82:
                    this.a = nyt.j();
                    continue;
                case 90:
                    this.d = nyt.j();
                    continue;
                case 98:
                    this.e = nyt.j();
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
