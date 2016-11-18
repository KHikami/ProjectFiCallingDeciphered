package p000;

public final class nhh extends nyx<nhh> {
    public nhi f29832a;

    public /* synthetic */ nzf m34947a(nyt nyt) {
        return m34945b(nyt);
    }

    public nhh() {
        m34946d();
    }

    private nhh m34946d() {
        this.f29832a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34948a(nyu nyu) {
        if (this.f29832a != null) {
            nyu.m37182b(2, this.f29832a);
        }
        super.a(nyu);
    }

    protected int m34949b() {
        int b = super.b();
        if (this.f29832a != null) {
            return b + nyu.m37145d(2, this.f29832a);
        }
        return b;
    }

    private nhh m34945b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f29832a == null) {
                        this.f29832a = new nhi();
                    }
                    nyt.m37101a(this.f29832a);
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
