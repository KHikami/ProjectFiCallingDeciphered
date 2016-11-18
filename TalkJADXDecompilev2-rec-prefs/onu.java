package p000;

public final class onu extends nyx<onu> {
    public onf f33329a;
    public onq f33330b;

    public /* synthetic */ nzf m38844a(nyt nyt) {
        return m38843b(nyt);
    }

    public onu() {
        this.cachedSize = -1;
    }

    public void m38845a(nyu nyu) {
        if (this.f33329a != null) {
            nyu.m37182b(1, this.f33329a);
        }
        if (this.f33330b != null) {
            nyu.m37182b(2, this.f33330b);
        }
        super.a(nyu);
    }

    protected int m38846b() {
        int b = super.b();
        if (this.f33329a != null) {
            b += nyu.m37145d(1, this.f33329a);
        }
        if (this.f33330b != null) {
            return b + nyu.m37145d(2, this.f33330b);
        }
        return b;
    }

    private onu m38843b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33329a == null) {
                        this.f33329a = new onf();
                    }
                    nyt.m37101a(this.f33329a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f33330b == null) {
                        this.f33330b = new onq();
                    }
                    nyt.m37101a(this.f33330b);
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
