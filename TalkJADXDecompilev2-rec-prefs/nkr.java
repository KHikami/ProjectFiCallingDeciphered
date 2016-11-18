package p000;

public final class nkr extends nyx<nkr> {
    public Boolean f30060a;
    public nmb f30061b;
    public nod f30062c;
    public nee f30063d;
    public nke f30064e;

    public /* synthetic */ nzf m35400a(nyt nyt) {
        return m35398b(nyt);
    }

    public nkr() {
        m35399d();
    }

    private nkr m35399d() {
        this.f30060a = null;
        this.f30061b = null;
        this.f30062c = null;
        this.f30063d = null;
        this.f30064e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35401a(nyu nyu) {
        if (this.f30060a != null) {
            nyu.m37172a(1, this.f30060a.booleanValue());
        }
        if (this.f30061b != null) {
            nyu.m37182b(2, this.f30061b);
        }
        if (this.f30062c != null) {
            nyu.m37182b(3, this.f30062c);
        }
        if (this.f30063d != null) {
            nyu.m37182b(4, this.f30063d);
        }
        if (this.f30064e != null) {
            nyu.m37182b(5, this.f30064e);
        }
        super.a(nyu);
    }

    protected int m35402b() {
        int b = super.b();
        if (this.f30060a != null) {
            this.f30060a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30061b != null) {
            b += nyu.m37145d(2, this.f30061b);
        }
        if (this.f30062c != null) {
            b += nyu.m37145d(3, this.f30062c);
        }
        if (this.f30063d != null) {
            b += nyu.m37145d(4, this.f30063d);
        }
        if (this.f30064e != null) {
            return b + nyu.m37145d(5, this.f30064e);
        }
        return b;
    }

    private nkr m35398b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30060a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30061b == null) {
                        this.f30061b = new nmb();
                    }
                    nyt.m37101a(this.f30061b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30062c == null) {
                        this.f30062c = new nod();
                    }
                    nyt.m37101a(this.f30062c);
                    continue;
                case 34:
                    if (this.f30063d == null) {
                        this.f30063d = new nee();
                    }
                    nyt.m37101a(this.f30063d);
                    continue;
                case 42:
                    if (this.f30064e == null) {
                        this.f30064e = new nke();
                    }
                    nyt.m37101a(this.f30064e);
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
