package defpackage;

public final class lzr extends nyx<lzr> {
    private static volatile lzr[] i;
    public Integer a;
    public String b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public lzs[] h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lzr[] d() {
        if (i == null) {
            synchronized (nzc.c) {
                if (i == null) {
                    i = new lzr[0];
                }
            }
        }
        return i;
    }

    public lzr() {
        g();
    }

    private lzr g() {
        this.a = null;
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = lzs.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.intValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g.intValue());
        }
        if (this.h != null && this.h.length > 0) {
            for (nzf nzf : this.h) {
                if (nzf != null) {
                    nyu.b(8, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.f(6, this.f.intValue());
        }
        if (this.g != null) {
            b += nyu.f(7, this.g.intValue());
        }
        if (this.h == null || this.h.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.h) {
            if (nzf != null) {
                i += nyu.d(8, nzf);
            }
        }
        return i;
    }

    private lzr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    this.g = Integer.valueOf(nyt.f());
                    continue;
                case 66:
                    int b = nzl.b(nyt, 66);
                    if (this.h == null) {
                        a = 0;
                    } else {
                        a = this.h.length;
                    }
                    Object obj = new lzs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzs();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzs();
                    nyt.a(obj[a]);
                    this.h = obj;
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
