package p000;

public final class niv extends nyx<niv> {
    private static volatile niv[] f29923n;
    public njo f29924a;
    public String f29925b;
    public String f29926c;
    public String f29927d;
    public String f29928e;
    public String f29929f;
    public nig f29930g;
    public nhw f29931h;
    public nob f29932i;
    public njk f29933j;
    public njm f29934k;
    public njm f29935l;
    public njj f29936m;

    public /* synthetic */ nzf m35158a(nyt nyt) {
        return m35155b(nyt);
    }

    public static niv[] m35156d() {
        if (f29923n == null) {
            synchronized (nzc.f31309c) {
                if (f29923n == null) {
                    f29923n = new niv[0];
                }
            }
        }
        return f29923n;
    }

    public niv() {
        m35157g();
    }

    private niv m35157g() {
        this.f29924a = null;
        this.f29925b = null;
        this.f29926c = null;
        this.f29927d = null;
        this.f29928e = null;
        this.f29929f = null;
        this.f29930g = null;
        this.f29931h = null;
        this.f29932i = null;
        this.f29933j = null;
        this.f29934k = null;
        this.f29935l = null;
        this.f29936m = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35159a(nyu nyu) {
        if (this.f29925b != null) {
            nyu.m37170a(1, this.f29925b);
        }
        if (this.f29926c != null) {
            nyu.m37170a(2, this.f29926c);
        }
        if (this.f29927d != null) {
            nyu.m37170a(3, this.f29927d);
        }
        if (this.f29929f != null) {
            nyu.m37170a(4, this.f29929f);
        }
        if (this.f29931h != null) {
            nyu.m37182b(5, this.f29931h);
        }
        if (this.f29924a != null) {
            nyu.m37182b(6, this.f29924a);
        }
        if (this.f29932i != null) {
            nyu.m37182b(7, this.f29932i);
        }
        if (this.f29933j != null) {
            nyu.m37182b(8, this.f29933j);
        }
        if (this.f29934k != null) {
            nyu.m37182b(10, this.f29934k);
        }
        if (this.f29936m != null) {
            nyu.m37182b(11, this.f29936m);
        }
        if (this.f29935l != null) {
            nyu.m37182b(12, this.f29935l);
        }
        if (this.f29930g != null) {
            nyu.m37182b(13, this.f29930g);
        }
        if (this.f29928e != null) {
            nyu.m37170a(15, this.f29928e);
        }
        super.a(nyu);
    }

    protected int m35160b() {
        int b = super.b();
        if (this.f29925b != null) {
            b += nyu.m37137b(1, this.f29925b);
        }
        if (this.f29926c != null) {
            b += nyu.m37137b(2, this.f29926c);
        }
        if (this.f29927d != null) {
            b += nyu.m37137b(3, this.f29927d);
        }
        if (this.f29929f != null) {
            b += nyu.m37137b(4, this.f29929f);
        }
        if (this.f29931h != null) {
            b += nyu.m37145d(5, this.f29931h);
        }
        if (this.f29924a != null) {
            b += nyu.m37145d(6, this.f29924a);
        }
        if (this.f29932i != null) {
            b += nyu.m37145d(7, this.f29932i);
        }
        if (this.f29933j != null) {
            b += nyu.m37145d(8, this.f29933j);
        }
        if (this.f29934k != null) {
            b += nyu.m37145d(10, this.f29934k);
        }
        if (this.f29936m != null) {
            b += nyu.m37145d(11, this.f29936m);
        }
        if (this.f29935l != null) {
            b += nyu.m37145d(12, this.f29935l);
        }
        if (this.f29930g != null) {
            b += nyu.m37145d(13, this.f29930g);
        }
        if (this.f29928e != null) {
            return b + nyu.m37137b(15, this.f29928e);
        }
        return b;
    }

    private niv m35155b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29925b = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f29926c = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f29927d = nyt.m37117j();
                    continue;
                case 34:
                    this.f29929f = nyt.m37117j();
                    continue;
                case 42:
                    if (this.f29931h == null) {
                        this.f29931h = new nhw();
                    }
                    nyt.m37101a(this.f29931h);
                    continue;
                case 50:
                    if (this.f29924a == null) {
                        this.f29924a = new njo();
                    }
                    nyt.m37101a(this.f29924a);
                    continue;
                case 58:
                    if (this.f29932i == null) {
                        this.f29932i = new nob();
                    }
                    nyt.m37101a(this.f29932i);
                    continue;
                case 66:
                    if (this.f29933j == null) {
                        this.f29933j = new njk();
                    }
                    nyt.m37101a(this.f29933j);
                    continue;
                case 82:
                    if (this.f29934k == null) {
                        this.f29934k = new njm();
                    }
                    nyt.m37101a(this.f29934k);
                    continue;
                case 90:
                    if (this.f29936m == null) {
                        this.f29936m = new njj();
                    }
                    nyt.m37101a(this.f29936m);
                    continue;
                case 98:
                    if (this.f29935l == null) {
                        this.f29935l = new njm();
                    }
                    nyt.m37101a(this.f29935l);
                    continue;
                case 106:
                    if (this.f29930g == null) {
                        this.f29930g = new nig();
                    }
                    nyt.m37101a(this.f29930g);
                    continue;
                case 122:
                    this.f29928e = nyt.m37117j();
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
