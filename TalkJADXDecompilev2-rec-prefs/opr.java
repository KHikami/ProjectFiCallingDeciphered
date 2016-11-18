package p000;

public final class opr extends nyx<opr> {
    public Boolean f33582a;
    public Boolean f33583b;
    public oqu f33584c;
    public Boolean f33585d;
    public oqu f33586e;
    public Boolean f33587f;

    public /* synthetic */ nzf m39087a(nyt nyt) {
        return m39085b(nyt);
    }

    public opr() {
        m39086d();
    }

    private opr m39086d() {
        this.f33582a = null;
        this.f33583b = null;
        this.f33584c = null;
        this.f33585d = null;
        this.f33586e = null;
        this.f33587f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39088a(nyu nyu) {
        if (this.f33582a != null) {
            nyu.m37172a(1, this.f33582a.booleanValue());
        }
        if (this.f33583b != null) {
            nyu.m37172a(2, this.f33583b.booleanValue());
        }
        if (this.f33584c != null) {
            nyu.m37182b(3, this.f33584c);
        }
        if (this.f33585d != null) {
            nyu.m37172a(4, this.f33585d.booleanValue());
        }
        if (this.f33586e != null) {
            nyu.m37182b(5, this.f33586e);
        }
        if (this.f33587f != null) {
            nyu.m37172a(6, this.f33587f.booleanValue());
        }
        super.a(nyu);
    }

    protected int m39089b() {
        int b = super.b();
        if (this.f33582a != null) {
            this.f33582a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f33583b != null) {
            this.f33583b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f33584c != null) {
            b += nyu.m37145d(3, this.f33584c);
        }
        if (this.f33585d != null) {
            this.f33585d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f33586e != null) {
            b += nyu.m37145d(5, this.f33586e);
        }
        if (this.f33587f == null) {
            return b;
        }
        this.f33587f.booleanValue();
        return b + (nyu.m37154h(6) + 1);
    }

    private opr m39085b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33582a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f33583b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dx /*26*/:
                    if (this.f33584c == null) {
                        this.f33584c = new oqu();
                    }
                    nyt.m37101a(this.f33584c);
                    continue;
                case 32:
                    this.f33585d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 42:
                    if (this.f33586e == null) {
                        this.f33586e = new oqu();
                    }
                    nyt.m37101a(this.f33586e);
                    continue;
                case 48:
                    this.f33587f = Boolean.valueOf(nyt.m37116i());
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
