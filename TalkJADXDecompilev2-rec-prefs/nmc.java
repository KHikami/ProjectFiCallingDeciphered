package p000;

public final class nmc extends nyx<nmc> {
    public niq f30205a;
    public oyl f30206b;
    public nti f30207c;
    public String f30208d;
    public String f30209e;

    public /* synthetic */ nzf m35600a(nyt nyt) {
        return m35598b(nyt);
    }

    public nmc() {
        m35599d();
    }

    private nmc m35599d() {
        this.f30205a = null;
        this.f30206b = null;
        this.f30207c = null;
        this.f30208d = null;
        this.f30209e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35601a(nyu nyu) {
        if (this.f30205a != null) {
            nyu.m37182b(1, this.f30205a);
        }
        if (this.f30206b != null) {
            nyu.m37182b(4, this.f30206b);
        }
        if (this.f30208d != null) {
            nyu.m37170a(5, this.f30208d);
        }
        if (this.f30209e != null) {
            nyu.m37170a(6, this.f30209e);
        }
        if (this.f30207c != null) {
            nyu.m37182b(7, this.f30207c);
        }
        super.a(nyu);
    }

    protected int m35602b() {
        int b = super.b();
        if (this.f30205a != null) {
            b += nyu.m37145d(1, this.f30205a);
        }
        if (this.f30206b != null) {
            b += nyu.m37145d(4, this.f30206b);
        }
        if (this.f30208d != null) {
            b += nyu.m37137b(5, this.f30208d);
        }
        if (this.f30209e != null) {
            b += nyu.m37137b(6, this.f30209e);
        }
        if (this.f30207c != null) {
            return b + nyu.m37145d(7, this.f30207c);
        }
        return b;
    }

    private nmc m35598b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30205a == null) {
                        this.f30205a = new niq();
                    }
                    nyt.m37101a(this.f30205a);
                    continue;
                case 34:
                    if (this.f30206b == null) {
                        this.f30206b = new oyl();
                    }
                    nyt.m37101a(this.f30206b);
                    continue;
                case 42:
                    this.f30208d = nyt.m37117j();
                    continue;
                case 50:
                    this.f30209e = nyt.m37117j();
                    continue;
                case 58:
                    if (this.f30207c == null) {
                        this.f30207c = new nti();
                    }
                    nyt.m37101a(this.f30207c);
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
