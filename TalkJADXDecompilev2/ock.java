package defpackage;

public final class ock extends nyx<ock> {
    private static volatile ock[] l;
    public Long a;
    public int b;
    public String c;
    public byte[] d;
    public byte[] e;
    public ocv f;
    public ocj g;
    public byte[] h;
    public Integer i;
    public byte[] j;
    public byte[] k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ock[] d() {
        if (l == null) {
            synchronized (nzc.c) {
                if (l == null) {
                    l = new ock[0];
                }
            }
        }
        return l;
    }

    public ock() {
        this.a = null;
        this.b = nzf.UNSET_ENUM_VALUE;
        this.c = null;
        this.d = null;
        this.e = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a.longValue());
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        if (this.i != null) {
            nyu.b(9, this.i.intValue());
        }
        if (this.j != null) {
            nyu.a(10, this.j);
        }
        if (this.k != null) {
            nyu.a(11, this.k);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.longValue());
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null) {
            b += nyu.b(8, this.h);
        }
        if (this.i != null) {
            this.i.intValue();
            b += nyu.h(9) + 4;
        }
        if (this.j != null) {
            b += nyu.b(10, this.j);
        }
        if (this.k != null) {
            return b + nyu.b(11, this.k);
        }
        return b;
    }

    private ock b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.k();
                    continue;
                case 42:
                    this.e = nyt.k();
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new ocv();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new ocj();
                    }
                    nyt.a(this.g);
                    continue;
                case 66:
                    this.h = nyt.k();
                    continue;
                case 77:
                    this.i = Integer.valueOf(nyt.h());
                    continue;
                case 82:
                    this.j = nyt.k();
                    continue;
                case 90:
                    this.k = nyt.k();
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
