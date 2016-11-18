package p000;

public final class lvr extends nyx<lvr> {
    public ltz f26612a;
    public lpt f26613b;
    public lpl f26614c;
    public lth f26615d;
    public lrz f26616e;
    public lwh f26617f;
    public lws f26618g;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30773b(nyt);
    }

    public lvr() {
        m30774d();
    }

    private lvr m30774d() {
        this.requestHeader = null;
        this.f26612a = null;
        this.f26613b = null;
        this.f26614c = null;
        this.f26615d = null;
        this.f26616e = null;
        this.f26617f = null;
        this.f26618g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26612a != null) {
            nyu.b(2, this.f26612a);
        }
        if (this.f26613b != null) {
            nyu.b(3, this.f26613b);
        }
        if (this.f26614c != null) {
            nyu.b(5, this.f26614c);
        }
        if (this.f26615d != null) {
            nyu.b(6, this.f26615d);
        }
        if (this.f26616e != null) {
            nyu.b(7, this.f26616e);
        }
        if (this.f26617f != null) {
            nyu.b(8, this.f26617f);
        }
        if (this.f26618g != null) {
            nyu.b(9, this.f26618g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26612a != null) {
            b += nyu.d(2, this.f26612a);
        }
        if (this.f26613b != null) {
            b += nyu.d(3, this.f26613b);
        }
        if (this.f26614c != null) {
            b += nyu.d(5, this.f26614c);
        }
        if (this.f26615d != null) {
            b += nyu.d(6, this.f26615d);
        }
        if (this.f26616e != null) {
            b += nyu.d(7, this.f26616e);
        }
        if (this.f26617f != null) {
            b += nyu.d(8, this.f26617f);
        }
        if (this.f26618g != null) {
            return b + nyu.d(9, this.f26618g);
        }
        return b;
    }

    private lvr m30773b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26612a == null) {
                        this.f26612a = new ltz();
                    }
                    nyt.a(this.f26612a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26613b == null) {
                        this.f26613b = new lpt();
                    }
                    nyt.a(this.f26613b);
                    continue;
                case 42:
                    if (this.f26614c == null) {
                        this.f26614c = new lpl();
                    }
                    nyt.a(this.f26614c);
                    continue;
                case 50:
                    if (this.f26615d == null) {
                        this.f26615d = new lth();
                    }
                    nyt.a(this.f26615d);
                    continue;
                case 58:
                    if (this.f26616e == null) {
                        this.f26616e = new lrz();
                    }
                    nyt.a(this.f26616e);
                    continue;
                case 66:
                    if (this.f26617f == null) {
                        this.f26617f = new lwh();
                    }
                    nyt.a(this.f26617f);
                    continue;
                case 74:
                    if (this.f26618g == null) {
                        this.f26618g = new lws();
                    }
                    nyt.a(this.f26618g);
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
