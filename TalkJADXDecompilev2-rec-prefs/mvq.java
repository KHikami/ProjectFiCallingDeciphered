package p000;

public final class mvq extends nyx<mvq> {
    private static volatile mvq[] f28503f;
    public mvs[] f28504a;
    public mvt f28505b;
    public mvv f28506c;
    public mvu f28507d;
    public mvr f28508e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33113b(nyt);
    }

    public static mvq[] m33114d() {
        if (f28503f == null) {
            synchronized (nzc.c) {
                if (f28503f == null) {
                    f28503f = new mvq[0];
                }
            }
        }
        return f28503f;
    }

    public mvq() {
        m33115g();
    }

    private mvq m33115g() {
        this.f28504a = mvs.m33125d();
        this.f28505b = null;
        this.f28506c = null;
        this.f28507d = null;
        this.f28508e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28504a != null && this.f28504a.length > 0) {
            for (nzf nzf : this.f28504a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f28505b != null) {
            nyu.b(2, this.f28505b);
        }
        if (this.f28506c != null) {
            nyu.b(3, this.f28506c);
        }
        if (this.f28507d != null) {
            nyu.b(4, this.f28507d);
        }
        if (this.f28508e != null) {
            nyu.b(5, this.f28508e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28504a != null && this.f28504a.length > 0) {
            for (nzf nzf : this.f28504a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f28505b != null) {
            b += nyu.d(2, this.f28505b);
        }
        if (this.f28506c != null) {
            b += nyu.d(3, this.f28506c);
        }
        if (this.f28507d != null) {
            b += nyu.d(4, this.f28507d);
        }
        if (this.f28508e != null) {
            return b + nyu.d(5, this.f28508e);
        }
        return b;
    }

    private mvq m33113b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f28504a == null) {
                        a = 0;
                    } else {
                        a = this.f28504a.length;
                    }
                    Object obj = new mvs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28504a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mvs();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mvs();
                    nyt.a(obj[a]);
                    this.f28504a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f28505b == null) {
                        this.f28505b = new mvt();
                    }
                    nyt.a(this.f28505b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f28506c == null) {
                        this.f28506c = new mvv();
                    }
                    nyt.a(this.f28506c);
                    continue;
                case 34:
                    if (this.f28507d == null) {
                        this.f28507d = new mvu();
                    }
                    nyt.a(this.f28507d);
                    continue;
                case 42:
                    if (this.f28508e == null) {
                        this.f28508e = new mvr();
                    }
                    nyt.a(this.f28508e);
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
