package p000;

public final class orc extends nyx<orc> {
    public Integer f33857a;
    public Integer f33858b;
    public Integer f33859c;
    public Integer f33860d;
    public String f33861e;
    public String f33862f;
    public String f33863g;

    public /* synthetic */ nzf m39289a(nyt nyt) {
        return m39287b(nyt);
    }

    public orc() {
        m39288d();
    }

    private orc m39288d() {
        this.f33857a = null;
        this.f33858b = null;
        this.f33859c = null;
        this.f33860d = null;
        this.f33861e = null;
        this.f33862f = null;
        this.f33863g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39290a(nyu nyu) {
        if (this.f33857a != null) {
            nyu.m37168a(1, this.f33857a.intValue());
        }
        if (this.f33858b != null) {
            nyu.m37168a(2, this.f33858b.intValue());
        }
        if (this.f33859c != null) {
            nyu.m37168a(3, this.f33859c.intValue());
        }
        if (this.f33860d != null) {
            nyu.m37168a(4, this.f33860d.intValue());
        }
        if (this.f33861e != null) {
            nyu.m37170a(5, this.f33861e);
        }
        if (this.f33862f != null) {
            nyu.m37170a(6, this.f33862f);
        }
        if (this.f33863g != null) {
            nyu.m37170a(7, this.f33863g);
        }
        super.a(nyu);
    }

    protected int m39291b() {
        int b = super.b();
        if (this.f33857a != null) {
            b += nyu.m37147f(1, this.f33857a.intValue());
        }
        if (this.f33858b != null) {
            b += nyu.m37147f(2, this.f33858b.intValue());
        }
        if (this.f33859c != null) {
            b += nyu.m37147f(3, this.f33859c.intValue());
        }
        if (this.f33860d != null) {
            b += nyu.m37147f(4, this.f33860d.intValue());
        }
        if (this.f33861e != null) {
            b += nyu.m37137b(5, this.f33861e);
        }
        if (this.f33862f != null) {
            b += nyu.m37137b(6, this.f33862f);
        }
        if (this.f33863g != null) {
            return b + nyu.m37137b(7, this.f33863g);
        }
        return b;
    }

    private orc m39287b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33857a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f33858b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f33859c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f33860d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 42:
                    this.f33861e = nyt.m37117j();
                    continue;
                case 50:
                    this.f33862f = nyt.m37117j();
                    continue;
                case 58:
                    this.f33863g = nyt.m37117j();
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
