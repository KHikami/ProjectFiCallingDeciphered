public final class mvw extends nyx<mvw> {
    public int a;
    public boolean b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mvw() {
        d();
    }

    private mvw d() {
        this.a = 0;
        this.b = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != 0) {
            nyu.a(1, this.a);
        }
        if (this.b) {
            nyu.a(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != 0) {
            b += nyu.f(1, this.a);
        }
        if (!this.b) {
            return b;
        }
        boolean z = this.b;
        return b + (nyu.h(2) + 1);
    }

    private mvw b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dI /*16*/:
                    this.b = nyt.i();
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
