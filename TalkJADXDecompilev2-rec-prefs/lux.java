package p000;

public final class lux extends nyx<lux> {
    public log f26547a;
    public ltv f26548b;
    public lpu f26549c;
    public lpl f26550d;
    public lpm f26551e;
    public luu f26552f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30673b(nyt);
    }

    public lux() {
        m30674d();
    }

    private lux m30674d() {
        this.f26547a = null;
        this.f26548b = null;
        this.f26549c = null;
        this.f26550d = null;
        this.f26551e = null;
        this.f26552f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26547a != null) {
            nyu.b(1, this.f26547a);
        }
        if (this.f26548b != null) {
            nyu.b(2, this.f26548b);
        }
        if (this.f26549c != null) {
            nyu.b(3, this.f26549c);
        }
        if (this.f26550d != null) {
            nyu.b(4, this.f26550d);
        }
        if (this.f26551e != null) {
            nyu.b(5, this.f26551e);
        }
        if (this.f26552f != null) {
            nyu.b(6, this.f26552f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26547a != null) {
            b += nyu.d(1, this.f26547a);
        }
        if (this.f26548b != null) {
            b += nyu.d(2, this.f26548b);
        }
        if (this.f26549c != null) {
            b += nyu.d(3, this.f26549c);
        }
        if (this.f26550d != null) {
            b += nyu.d(4, this.f26550d);
        }
        if (this.f26551e != null) {
            b += nyu.d(5, this.f26551e);
        }
        if (this.f26552f != null) {
            return b + nyu.d(6, this.f26552f);
        }
        return b;
    }

    private lux m30673b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26547a == null) {
                        this.f26547a = new log();
                    }
                    nyt.a(this.f26547a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26548b == null) {
                        this.f26548b = new ltv();
                    }
                    nyt.a(this.f26548b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26549c == null) {
                        this.f26549c = new lpu();
                    }
                    nyt.a(this.f26549c);
                    continue;
                case 34:
                    if (this.f26550d == null) {
                        this.f26550d = new lpl();
                    }
                    nyt.a(this.f26550d);
                    continue;
                case 42:
                    if (this.f26551e == null) {
                        this.f26551e = new lpm();
                    }
                    nyt.a(this.f26551e);
                    continue;
                case 50:
                    if (this.f26552f == null) {
                        this.f26552f = new luu();
                    }
                    nyt.a(this.f26552f);
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
