package defpackage;

public final class npu extends nyx<npu> {
    private static volatile npu[] h;
    public Integer a;
    public npw b;
    public String c;
    public String d;
    public nlz e;
    public nqa f;
    public Integer g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static npu[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new npu[0];
                }
            }
        }
        return h;
    }

    public npu() {
        g();
    }

    private npu g() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.a(4, this.c);
        }
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        if (this.e != null) {
            nyu.b(6, this.e);
        }
        if (this.f != null) {
            nyu.b(7, this.f);
        }
        if (this.g != null) {
            nyu.a(8, this.g.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(4, this.c);
        }
        if (this.d != null) {
            b += nyu.b(5, this.d);
        }
        if (this.e != null) {
            b += nyu.d(6, this.e);
        }
        if (this.f != null) {
            b += nyu.d(7, this.f);
        }
        if (this.g != null) {
            return b + nyu.f(8, this.g.intValue());
        }
        return b;
    }

    private npu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 6:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new npw();
                    }
                    nyt.a(this.b);
                    continue;
                case 34:
                    this.c = nyt.j();
                    continue;
                case 42:
                    this.d = nyt.j();
                    continue;
                case 50:
                    if (this.e == null) {
                        this.e = new nlz();
                    }
                    nyt.a(this.e);
                    continue;
                case 58:
                    if (this.f == null) {
                        this.f = new nqa();
                    }
                    nyt.a(this.f);
                    continue;
                case 64:
                    this.g = Integer.valueOf(nyt.f());
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
