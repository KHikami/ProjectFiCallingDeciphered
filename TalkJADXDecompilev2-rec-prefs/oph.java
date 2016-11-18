package p000;

public final class oph extends nyx<oph> {
    public oqz f33548a;
    public ora f33549b;
    public oqu f33550c;

    public /* synthetic */ nzf m39034a(nyt nyt) {
        return m39032b(nyt);
    }

    public oph() {
        m39033d();
    }

    private oph m39033d() {
        this.f33548a = null;
        this.f33549b = null;
        this.f33550c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39035a(nyu nyu) {
        if (this.f33548a != null) {
            nyu.m37182b(1, this.f33548a);
        }
        if (this.f33549b != null) {
            nyu.m37182b(2, this.f33549b);
        }
        if (this.f33550c != null) {
            nyu.m37182b(3, this.f33550c);
        }
        super.a(nyu);
    }

    protected int m39036b() {
        int b = super.b();
        if (this.f33548a != null) {
            b += nyu.m37145d(1, this.f33548a);
        }
        if (this.f33549b != null) {
            b += nyu.m37145d(2, this.f33549b);
        }
        if (this.f33550c != null) {
            return b + nyu.m37145d(3, this.f33550c);
        }
        return b;
    }

    private oph m39032b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33548a == null) {
                        this.f33548a = new oqz();
                    }
                    nyt.m37101a(this.f33548a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f33549b == null) {
                        this.f33549b = new ora();
                    }
                    nyt.m37101a(this.f33549b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f33550c == null) {
                        this.f33550c = new oqu();
                    }
                    nyt.m37101a(this.f33550c);
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
