package p000;

public final class ltb extends nyx<ltb> {
    private static volatile ltb[] f26362c;
    public ofu[] f26363a;
    public ofm[] f26364b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30408b(nyt);
    }

    public static ltb[] m30409d() {
        if (f26362c == null) {
            synchronized (nzc.c) {
                if (f26362c == null) {
                    f26362c = new ltb[0];
                }
            }
        }
        return f26362c;
    }

    public ltb() {
        m30410g();
    }

    private ltb m30410g() {
        this.f26363a = ofu.d();
        this.f26364b = ofm.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f26363a != null && this.f26363a.length > 0) {
            for (nzf nzf : this.f26363a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f26364b != null && this.f26364b.length > 0) {
            while (i < this.f26364b.length) {
                nzf nzf2 = this.f26364b[i];
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f26363a != null && this.f26363a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f26363a) {
                if (nzf != null) {
                    i2 += nyu.d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f26364b != null && this.f26364b.length > 0) {
            while (i < this.f26364b.length) {
                nzf nzf2 = this.f26364b[i];
                if (nzf2 != null) {
                    b += nyu.d(2, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private ltb m30408b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f26363a == null) {
                        a = 0;
                    } else {
                        a = this.f26363a.length;
                    }
                    obj = new ofu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26363a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ofu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ofu();
                    nyt.a(obj[a]);
                    this.f26363a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f26364b == null) {
                        a = 0;
                    } else {
                        a = this.f26364b.length;
                    }
                    obj = new ofm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26364b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ofm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ofm();
                    nyt.a(obj[a]);
                    this.f26364b = obj;
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
