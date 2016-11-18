package p000;

public final class knv extends nyx<knv> {
    private static volatile knv[] f22442j;
    public Integer f22443a;
    public String f22444b;
    public String f22445c;
    public String f22446d;
    public Boolean f22447e;
    public knv[] f22448f;
    public String f22449g;
    public String f22450h;
    public Integer f22451i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26723b(nyt);
    }

    public static knv[] m26724d() {
        if (f22442j == null) {
            synchronized (nzc.c) {
                if (f22442j == null) {
                    f22442j = new knv[0];
                }
            }
        }
        return f22442j;
    }

    public knv() {
        m26725g();
    }

    private knv m26725g() {
        this.f22444b = null;
        this.f22445c = null;
        this.f22446d = null;
        this.f22447e = null;
        this.f22448f = knv.m26724d();
        this.f22449g = null;
        this.f22450h = null;
        this.f22451i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22443a != null) {
            nyu.a(1, this.f22443a.intValue());
        }
        if (this.f22444b != null) {
            nyu.a(2, this.f22444b);
        }
        if (this.f22445c != null) {
            nyu.a(3, this.f22445c);
        }
        if (this.f22446d != null) {
            nyu.a(4, this.f22446d);
        }
        if (this.f22447e != null) {
            nyu.a(5, this.f22447e.booleanValue());
        }
        if (this.f22448f != null && this.f22448f.length > 0) {
            for (nzf nzf : this.f22448f) {
                if (nzf != null) {
                    nyu.b(6, nzf);
                }
            }
        }
        if (this.f22449g != null) {
            nyu.a(7, this.f22449g);
        }
        if (this.f22450h != null) {
            nyu.a(8, this.f22450h);
        }
        if (this.f22451i != null) {
            nyu.a(9, this.f22451i.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22443a != null) {
            b += nyu.f(1, this.f22443a.intValue());
        }
        if (this.f22444b != null) {
            b += nyu.b(2, this.f22444b);
        }
        if (this.f22445c != null) {
            b += nyu.b(3, this.f22445c);
        }
        if (this.f22446d != null) {
            b += nyu.b(4, this.f22446d);
        }
        if (this.f22447e != null) {
            this.f22447e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f22448f != null && this.f22448f.length > 0) {
            int i = b;
            for (nzf nzf : this.f22448f) {
                if (nzf != null) {
                    i += nyu.d(6, nzf);
                }
            }
            b = i;
        }
        if (this.f22449g != null) {
            b += nyu.b(7, this.f22449g);
        }
        if (this.f22450h != null) {
            b += nyu.b(8, this.f22450h);
        }
        if (this.f22451i != null) {
            return b + nyu.f(9, this.f22451i.intValue());
        }
        return b;
    }

    private knv m26723b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            this.f22443a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f22444b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22445c = nyt.j();
                    continue;
                case 34:
                    this.f22446d = nyt.j();
                    continue;
                case 40:
                    this.f22447e = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    int b = nzl.b(nyt, 50);
                    if (this.f22448f == null) {
                        a = 0;
                    } else {
                        a = this.f22448f.length;
                    }
                    Object obj = new knv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22448f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new knv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new knv();
                    nyt.a(obj[a]);
                    this.f22448f = obj;
                    continue;
                case 58:
                    this.f22449g = nyt.j();
                    continue;
                case 66:
                    this.f22450h = nyt.j();
                    continue;
                case 72:
                    this.f22451i = Integer.valueOf(nyt.f());
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
