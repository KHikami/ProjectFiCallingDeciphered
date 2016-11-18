package p000;

public final class mxo extends nyx<mxo> {
    private static volatile mxo[] f28696c;
    public mxy f28697a;
    public mxp[] f28698b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33356b(nyt);
    }

    public static mxo[] m33357d() {
        if (f28696c == null) {
            synchronized (nzc.c) {
                if (f28696c == null) {
                    f28696c = new mxo[0];
                }
            }
        }
        return f28696c;
    }

    public mxo() {
        m33358g();
    }

    private mxo m33358g() {
        this.f28697a = null;
        this.f28698b = mxp.m33363d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28697a != null) {
            nyu.b(1, this.f28697a);
        }
        if (this.f28698b != null && this.f28698b.length > 0) {
            for (nzf nzf : this.f28698b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28697a != null) {
            b += nyu.d(1, this.f28697a);
        }
        if (this.f28698b == null || this.f28698b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f28698b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private mxo m33356b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f28697a == null) {
                        this.f28697a = new mxy();
                    }
                    nyt.a(this.f28697a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f28698b == null) {
                        a = 0;
                    } else {
                        a = this.f28698b.length;
                    }
                    Object obj = new mxp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28698b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mxp();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mxp();
                    nyt.a(obj[a]);
                    this.f28698b = obj;
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
