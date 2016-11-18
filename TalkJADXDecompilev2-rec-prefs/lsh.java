package p000;

public final class lsh extends nyx<lsh> {
    private static volatile lsh[] f26314h;
    public String f26315a;
    public String f26316b;
    public String f26317c;
    public muu f26318d;
    public String f26319e;
    public lsi[] f26320f;
    public byte[] f26321g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30302b(nyt);
    }

    public static lsh[] m30303d() {
        if (f26314h == null) {
            synchronized (nzc.c) {
                if (f26314h == null) {
                    f26314h = new lsh[0];
                }
            }
        }
        return f26314h;
    }

    public lsh() {
        m30304g();
    }

    private lsh m30304g() {
        this.f26315a = null;
        this.f26316b = null;
        this.f26317c = null;
        this.f26318d = null;
        this.f26319e = null;
        this.f26320f = lsi.m30309d();
        this.f26321g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26315a != null) {
            nyu.a(1, this.f26315a);
        }
        if (this.f26316b != null) {
            nyu.a(2, this.f26316b);
        }
        if (this.f26317c != null) {
            nyu.a(3, this.f26317c);
        }
        if (this.f26319e != null) {
            nyu.a(4, this.f26319e);
        }
        if (this.f26321g != null) {
            nyu.a(5, this.f26321g);
        }
        if (this.f26320f != null && this.f26320f.length > 0) {
            for (nzf nzf : this.f26320f) {
                if (nzf != null) {
                    nyu.b(6, nzf);
                }
            }
        }
        if (this.f26318d != null) {
            nyu.b(7, this.f26318d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26315a != null) {
            b += nyu.b(1, this.f26315a);
        }
        if (this.f26316b != null) {
            b += nyu.b(2, this.f26316b);
        }
        if (this.f26317c != null) {
            b += nyu.b(3, this.f26317c);
        }
        if (this.f26319e != null) {
            b += nyu.b(4, this.f26319e);
        }
        if (this.f26321g != null) {
            b += nyu.b(5, this.f26321g);
        }
        if (this.f26320f != null && this.f26320f.length > 0) {
            int i = b;
            for (nzf nzf : this.f26320f) {
                if (nzf != null) {
                    i += nyu.d(6, nzf);
                }
            }
            b = i;
        }
        if (this.f26318d != null) {
            return b + nyu.d(7, this.f26318d);
        }
        return b;
    }

    private lsh m30302b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26315a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26316b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f26317c = nyt.j();
                    continue;
                case 34:
                    this.f26319e = nyt.j();
                    continue;
                case 42:
                    this.f26321g = nyt.k();
                    continue;
                case 50:
                    int b = nzl.b(nyt, 50);
                    if (this.f26320f == null) {
                        a = 0;
                    } else {
                        a = this.f26320f.length;
                    }
                    Object obj = new lsi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26320f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsi();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsi();
                    nyt.a(obj[a]);
                    this.f26320f = obj;
                    continue;
                case 58:
                    if (this.f26318d == null) {
                        this.f26318d = new muu();
                    }
                    nyt.a(this.f26318d);
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
