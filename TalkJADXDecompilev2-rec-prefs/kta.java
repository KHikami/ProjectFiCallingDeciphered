package p000;

public final class kta extends nyx<kta> {
    public String f23195a;
    public String f23196b;
    public String f23197c;
    public String f23198d;
    public String f23199e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27405b(nyt);
    }

    public kta() {
        this.f23195a = null;
        this.f23196b = null;
        this.f23197c = null;
        this.f23198d = null;
        this.f23199e = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23195a != null) {
            nyu.a(1, this.f23195a);
        }
        if (this.f23196b != null) {
            nyu.a(2, this.f23196b);
        }
        if (this.f23197c != null) {
            nyu.a(3, this.f23197c);
        }
        if (this.f23198d != null) {
            nyu.a(4, this.f23198d);
        }
        if (this.f23199e != null) {
            nyu.a(5, this.f23199e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23195a != null) {
            b += nyu.b(1, this.f23195a);
        }
        if (this.f23196b != null) {
            b += nyu.b(2, this.f23196b);
        }
        if (this.f23197c != null) {
            b += nyu.b(3, this.f23197c);
        }
        if (this.f23198d != null) {
            b += nyu.b(4, this.f23198d);
        }
        if (this.f23199e != null) {
            return b + nyu.b(5, this.f23199e);
        }
        return b;
    }

    private kta m27405b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23195a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23196b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23197c = nyt.j();
                    continue;
                case 34:
                    this.f23198d = nyt.j();
                    continue;
                case 42:
                    this.f23199e = nyt.j();
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
