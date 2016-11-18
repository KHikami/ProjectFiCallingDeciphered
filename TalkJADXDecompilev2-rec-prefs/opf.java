package p000;

public final class opf extends nyx<opf> {
    public String f33540a;
    public mrk f33541b;
    public String f33542c;
    public String f33543d;
    public String f33544e;
    public ozo f33545f;

    public /* synthetic */ nzf m39024a(nyt nyt) {
        return m39022b(nyt);
    }

    public opf() {
        m39023d();
    }

    private opf m39023d() {
        this.f33540a = null;
        this.f33541b = null;
        this.f33542c = null;
        this.f33543d = null;
        this.f33544e = null;
        this.f33545f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39025a(nyu nyu) {
        if (this.f33540a != null) {
            nyu.m37170a(1, this.f33540a);
        }
        if (this.f33541b != null) {
            nyu.m37182b(2, this.f33541b);
        }
        if (this.f33542c != null) {
            nyu.m37170a(3, this.f33542c);
        }
        if (this.f33543d != null) {
            nyu.m37170a(4, this.f33543d);
        }
        if (this.f33544e != null) {
            nyu.m37170a(5, this.f33544e);
        }
        if (this.f33545f != null) {
            nyu.m37182b(7, this.f33545f);
        }
        super.a(nyu);
    }

    protected int m39026b() {
        int b = super.b();
        if (this.f33540a != null) {
            b += nyu.m37137b(1, this.f33540a);
        }
        if (this.f33541b != null) {
            b += nyu.m37145d(2, this.f33541b);
        }
        if (this.f33542c != null) {
            b += nyu.m37137b(3, this.f33542c);
        }
        if (this.f33543d != null) {
            b += nyu.m37137b(4, this.f33543d);
        }
        if (this.f33544e != null) {
            b += nyu.m37137b(5, this.f33544e);
        }
        if (this.f33545f != null) {
            return b + nyu.m37145d(7, this.f33545f);
        }
        return b;
    }

    private opf m39022b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33540a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f33541b == null) {
                        this.f33541b = new mrk();
                    }
                    nyt.m37101a(this.f33541b);
                    continue;
                case wi.dx /*26*/:
                    this.f33542c = nyt.m37117j();
                    continue;
                case 34:
                    this.f33543d = nyt.m37117j();
                    continue;
                case 42:
                    this.f33544e = nyt.m37117j();
                    continue;
                case 58:
                    if (this.f33545f == null) {
                        this.f33545f = new ozo();
                    }
                    nyt.m37101a(this.f33545f);
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
