package p000;

public final class oet extends nyx<oet> {
    public String f32485a;
    public String f32486b;
    public oeq f32487c;
    public oer f32488d;
    public long f32489e;

    public /* synthetic */ nzf m37990a(nyt nyt) {
        return m37988b(nyt);
    }

    public oet() {
        m37989d();
    }

    private oet m37989d() {
        this.f32485a = "";
        this.f32486b = "";
        this.f32487c = null;
        this.f32488d = null;
        this.f32489e = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37991a(nyu nyu) {
        if (!(this.f32485a == null || this.f32485a.equals(""))) {
            nyu.m37170a(1, this.f32485a);
        }
        if (!(this.f32486b == null || this.f32486b.equals(""))) {
            nyu.m37170a(2, this.f32486b);
        }
        if (this.f32487c != null) {
            nyu.m37182b(3, this.f32487c);
        }
        if (this.f32488d != null) {
            nyu.m37182b(4, this.f32488d);
        }
        if (this.f32489e != 0) {
            nyu.m37181b(5, this.f32489e);
        }
        super.a(nyu);
    }

    protected int m37992b() {
        int b = super.b();
        if (!(this.f32485a == null || this.f32485a.equals(""))) {
            b += nyu.m37137b(1, this.f32485a);
        }
        if (!(this.f32486b == null || this.f32486b.equals(""))) {
            b += nyu.m37137b(2, this.f32486b);
        }
        if (this.f32487c != null) {
            b += nyu.m37145d(3, this.f32487c);
        }
        if (this.f32488d != null) {
            b += nyu.m37145d(4, this.f32488d);
        }
        if (this.f32489e != 0) {
            return b + nyu.m37148f(5, this.f32489e);
        }
        return b;
    }

    private oet m37988b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32485a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32486b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f32487c == null) {
                        this.f32487c = new oeq();
                    }
                    nyt.m37101a(this.f32487c);
                    continue;
                case 34:
                    if (this.f32488d == null) {
                        this.f32488d = new oer();
                    }
                    nyt.m37101a(this.f32488d);
                    continue;
                case 40:
                    this.f32489e = nyt.m37110e();
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
