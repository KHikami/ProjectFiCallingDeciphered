package p000;

public final class nto extends nyx<nto> {
    public String f30758a;
    public nqi f30759b;
    public int f30760c;
    public nts f30761d;
    public String f30762e;
    public ntp f30763f;
    public odm f30764g;

    public /* synthetic */ nzf m36498a(nyt nyt) {
        return m36497b(nyt);
    }

    public nto() {
        this.f30758a = null;
        this.f30760c = nzf.UNSET_ENUM_VALUE;
        this.f30762e = null;
        this.cachedSize = -1;
    }

    public void m36499a(nyu nyu) {
        if (this.f30758a != null) {
            nyu.m37170a(1, this.f30758a);
        }
        if (this.f30759b != null) {
            nyu.m37182b(2, this.f30759b);
        }
        if (this.f30760c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(3, this.f30760c);
        }
        if (this.f30761d != null) {
            nyu.m37182b(4, this.f30761d);
        }
        if (this.f30762e != null) {
            nyu.m37170a(5, this.f30762e);
        }
        if (this.f30763f != null) {
            nyu.m37182b(6, this.f30763f);
        }
        if (this.f30764g != null) {
            nyu.m37182b(7, this.f30764g);
        }
        super.a(nyu);
    }

    protected int m36500b() {
        int b = super.b();
        if (this.f30758a != null) {
            b += nyu.m37137b(1, this.f30758a);
        }
        if (this.f30759b != null) {
            b += nyu.m37145d(2, this.f30759b);
        }
        if (this.f30760c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(3, this.f30760c);
        }
        if (this.f30761d != null) {
            b += nyu.m37145d(4, this.f30761d);
        }
        if (this.f30762e != null) {
            b += nyu.m37137b(5, this.f30762e);
        }
        if (this.f30763f != null) {
            b += nyu.m37145d(6, this.f30763f);
        }
        if (this.f30764g != null) {
            return b + nyu.m37145d(7, this.f30764g);
        }
        return b;
    }

    private nto m36497b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30758a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f30759b == null) {
                        this.f30759b = new nqi();
                    }
                    nyt.m37101a(this.f30759b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f30760c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f30761d == null) {
                        this.f30761d = new nts();
                    }
                    nyt.m37101a(this.f30761d);
                    continue;
                case 42:
                    this.f30762e = nyt.m37117j();
                    continue;
                case 50:
                    if (this.f30763f == null) {
                        this.f30763f = new ntp();
                    }
                    nyt.m37101a(this.f30763f);
                    continue;
                case 58:
                    if (this.f30764g == null) {
                        this.f30764g = new odm();
                    }
                    nyt.m37101a(this.f30764g);
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
