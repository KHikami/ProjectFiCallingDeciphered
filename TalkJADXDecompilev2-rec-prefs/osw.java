package p000;

public final class osw extends nyx<osw> {
    private static volatile osw[] f34196f;
    public String f34197a;
    public ost[] f34198b;
    public ost f34199c;
    public ost f34200d;
    public oqu f34201e;

    public /* synthetic */ nzf m39636a(nyt nyt) {
        return m39633b(nyt);
    }

    public static osw[] m39634d() {
        if (f34196f == null) {
            synchronized (nzc.f31309c) {
                if (f34196f == null) {
                    f34196f = new osw[0];
                }
            }
        }
        return f34196f;
    }

    public osw() {
        m39635g();
    }

    private osw m39635g() {
        this.f34197a = null;
        this.f34198b = ost.m39616d();
        this.f34199c = null;
        this.f34200d = null;
        this.f34201e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39637a(nyu nyu) {
        nyu.m37170a(1, this.f34197a);
        if (this.f34198b != null && this.f34198b.length > 0) {
            for (nzf nzf : this.f34198b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f34199c != null) {
            nyu.m37182b(3, this.f34199c);
        }
        if (this.f34200d != null) {
            nyu.m37182b(4, this.f34200d);
        }
        if (this.f34201e != null) {
            nyu.m37182b(5, this.f34201e);
        }
        super.a(nyu);
    }

    protected int m39638b() {
        int b = nyu.m37137b(1, this.f34197a) + super.b();
        if (this.f34198b != null && this.f34198b.length > 0) {
            for (nzf nzf : this.f34198b) {
                if (nzf != null) {
                    b += nyu.m37145d(2, nzf);
                }
            }
        }
        if (this.f34199c != null) {
            b += nyu.m37145d(3, this.f34199c);
        }
        if (this.f34200d != null) {
            b += nyu.m37145d(4, this.f34200d);
        }
        if (this.f34201e != null) {
            return b + nyu.m37145d(5, this.f34201e);
        }
        return b;
    }

    private osw m39633b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34197a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f34198b == null) {
                        a = 0;
                    } else {
                        a = this.f34198b.length;
                    }
                    Object obj = new ost[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34198b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ost();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ost();
                    nyt.m37101a(obj[a]);
                    this.f34198b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f34199c == null) {
                        this.f34199c = new ost();
                    }
                    nyt.m37101a(this.f34199c);
                    continue;
                case 34:
                    if (this.f34200d == null) {
                        this.f34200d = new ost();
                    }
                    nyt.m37101a(this.f34200d);
                    continue;
                case 42:
                    if (this.f34201e == null) {
                        this.f34201e = new oqu();
                    }
                    nyt.m37101a(this.f34201e);
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
