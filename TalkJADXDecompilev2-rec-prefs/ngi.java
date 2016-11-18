package p000;

public final class ngi extends nyx<ngi> {
    public ngk f29786a;
    public ngl f29787b;
    public ngm f29788c;
    public ngn f29789d;
    public ngj f29790e;

    public /* synthetic */ nzf m34816a(nyt nyt) {
        return m34814b(nyt);
    }

    public ngi() {
        m34815d();
    }

    private ngi m34815d() {
        this.f29786a = null;
        this.f29787b = null;
        this.f29788c = null;
        this.f29789d = null;
        this.f29790e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34817a(nyu nyu) {
        if (this.f29786a != null) {
            nyu.m37182b(1, this.f29786a);
        }
        if (this.f29787b != null) {
            nyu.m37182b(2, this.f29787b);
        }
        if (this.f29788c != null) {
            nyu.m37182b(3, this.f29788c);
        }
        if (this.f29789d != null) {
            nyu.m37182b(4, this.f29789d);
        }
        if (this.f29790e != null) {
            nyu.m37182b(5, this.f29790e);
        }
        super.a(nyu);
    }

    protected int m34818b() {
        int b = super.b();
        if (this.f29786a != null) {
            b += nyu.m37145d(1, this.f29786a);
        }
        if (this.f29787b != null) {
            b += nyu.m37145d(2, this.f29787b);
        }
        if (this.f29788c != null) {
            b += nyu.m37145d(3, this.f29788c);
        }
        if (this.f29789d != null) {
            b += nyu.m37145d(4, this.f29789d);
        }
        if (this.f29790e != null) {
            return b + nyu.m37145d(5, this.f29790e);
        }
        return b;
    }

    private ngi m34814b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29786a == null) {
                        this.f29786a = new ngk();
                    }
                    nyt.m37101a(this.f29786a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29787b == null) {
                        this.f29787b = new ngl();
                    }
                    nyt.m37101a(this.f29787b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29788c == null) {
                        this.f29788c = new ngm();
                    }
                    nyt.m37101a(this.f29788c);
                    continue;
                case 34:
                    if (this.f29789d == null) {
                        this.f29789d = new ngn();
                    }
                    nyt.m37101a(this.f29789d);
                    continue;
                case 42:
                    if (this.f29790e == null) {
                        this.f29790e = new ngj();
                    }
                    nyt.m37101a(this.f29790e);
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
