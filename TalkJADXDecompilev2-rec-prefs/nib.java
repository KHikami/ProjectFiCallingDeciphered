package p000;

public final class nib extends nyx<nib> {
    public String f29870a;
    public Boolean f29871b;
    public Boolean f29872c;

    public /* synthetic */ nzf m35054a(nyt nyt) {
        return m35052b(nyt);
    }

    public nib() {
        m35053d();
    }

    private nib m35053d() {
        this.f29870a = null;
        this.f29871b = null;
        this.f29872c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35055a(nyu nyu) {
        if (this.f29870a != null) {
            nyu.m37170a(1, this.f29870a);
        }
        if (this.f29871b != null) {
            nyu.m37172a(2, this.f29871b.booleanValue());
        }
        if (this.f29872c != null) {
            nyu.m37172a(3, this.f29872c.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35056b() {
        int b = super.b();
        if (this.f29870a != null) {
            b += nyu.m37137b(1, this.f29870a);
        }
        if (this.f29871b != null) {
            this.f29871b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f29872c == null) {
            return b;
        }
        this.f29872c.booleanValue();
        return b + (nyu.m37154h(3) + 1);
    }

    private nib m35052b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29870a = nyt.m37117j();
                    continue;
                case 16:
                    this.f29871b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f29872c = Boolean.valueOf(nyt.m37116i());
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
