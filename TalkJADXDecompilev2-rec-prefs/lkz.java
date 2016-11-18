package p000;

public final class lkz extends nyx<lkz> {
    public lla[] f25292a;
    public Integer f25293b;
    public Integer f25294c;
    public Integer f25295d;
    public lks f25296e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29299b(nyt);
    }

    public lkz() {
        m29300d();
    }

    private lkz m29300d() {
        this.f25292a = lla.m29305d();
        this.f25294c = null;
        this.f25295d = null;
        this.f25296e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25292a != null && this.f25292a.length > 0) {
            for (nzf nzf : this.f25292a) {
                if (nzf != null) {
                    nyu.a(1, nzf);
                }
            }
        }
        if (this.f25293b != null) {
            nyu.a(15, this.f25293b.intValue());
        }
        if (this.f25294c != null) {
            nyu.a(16, this.f25294c.intValue());
        }
        if (this.f25295d != null) {
            nyu.a(17, this.f25295d.intValue());
        }
        if (this.f25296e != null) {
            nyu.b(18, this.f25296e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25292a != null && this.f25292a.length > 0) {
            for (nzf nzf : this.f25292a) {
                if (nzf != null) {
                    b += nyu.c(1, nzf);
                }
            }
        }
        if (this.f25293b != null) {
            b += nyu.f(15, this.f25293b.intValue());
        }
        if (this.f25294c != null) {
            b += nyu.f(16, this.f25294c.intValue());
        }
        if (this.f25295d != null) {
            b += nyu.f(17, this.f25295d.intValue());
        }
        if (this.f25296e != null) {
            return b + nyu.d(18, this.f25296e);
        }
        return b;
    }

    private lkz m29299b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 11:
                    int b = nzl.b(nyt, 11);
                    if (this.f25292a == null) {
                        a = 0;
                    } else {
                        a = this.f25292a.length;
                    }
                    Object obj = new lla[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25292a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lla();
                        nyt.a(obj[a], 1);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lla();
                    nyt.a(obj[a], 1);
                    this.f25292a = obj;
                    continue;
                case 120:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f25293b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 128:
                    this.f25294c = Integer.valueOf(nyt.f());
                    continue;
                case 136:
                    this.f25295d = Integer.valueOf(nyt.f());
                    continue;
                case 146:
                    if (this.f25296e == null) {
                        this.f25296e = new lks();
                    }
                    nyt.a(this.f25296e);
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
