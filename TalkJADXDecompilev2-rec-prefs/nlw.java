package p000;

public final class nlw extends nyx<nlw> {
    private static volatile nlw[] f30186c;
    public nma f30187a;
    public nly[] f30188b;

    public /* synthetic */ nzf m35569a(nyt nyt) {
        return m35566b(nyt);
    }

    public static nlw[] m35567d() {
        if (f30186c == null) {
            synchronized (nzc.f31309c) {
                if (f30186c == null) {
                    f30186c = new nlw[0];
                }
            }
        }
        return f30186c;
    }

    public nlw() {
        m35568g();
    }

    private nlw m35568g() {
        this.f30187a = null;
        this.f30188b = nly.m35578d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35570a(nyu nyu) {
        if (this.f30187a != null) {
            nyu.m37182b(1, this.f30187a);
        }
        if (this.f30188b != null && this.f30188b.length > 0) {
            for (nzf nzf : this.f30188b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m35571b() {
        int b = super.b();
        if (this.f30187a != null) {
            b += nyu.m37145d(1, this.f30187a);
        }
        if (this.f30188b == null || this.f30188b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f30188b) {
            if (nzf != null) {
                i += nyu.m37145d(2, nzf);
            }
        }
        return i;
    }

    private nlw m35566b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30187a == null) {
                        this.f30187a = new nma();
                    }
                    nyt.m37101a(this.f30187a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f30188b == null) {
                        a = 0;
                    } else {
                        a = this.f30188b.length;
                    }
                    Object obj = new nly[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30188b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nly();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nly();
                    nyt.m37101a(obj[a]);
                    this.f30188b = obj;
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
