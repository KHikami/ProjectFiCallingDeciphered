package p000;

public final class kzo extends nyx<kzo> {
    public String f24281a;
    public String f24282b;
    public String f24283c;
    public Long f24284d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28255b(nyt);
    }

    public kzo() {
        m28256d();
    }

    private kzo m28256d() {
        this.f24281a = null;
        this.f24282b = null;
        this.f24283c = null;
        this.f24284d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24281a != null) {
            nyu.a(1, this.f24281a);
        }
        if (this.f24282b != null) {
            nyu.a(2, this.f24282b);
        }
        if (this.f24283c != null) {
            nyu.a(3, this.f24283c);
        }
        if (this.f24284d != null) {
            nyu.b(4, this.f24284d.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24281a != null) {
            b += nyu.b(1, this.f24281a);
        }
        if (this.f24282b != null) {
            b += nyu.b(2, this.f24282b);
        }
        if (this.f24283c != null) {
            b += nyu.b(3, this.f24283c);
        }
        if (this.f24284d != null) {
            return b + nyu.f(4, this.f24284d.longValue());
        }
        return b;
    }

    private kzo m28255b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24281a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24282b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24283c = nyt.j();
                    continue;
                case 32:
                    this.f24284d = Long.valueOf(nyt.e());
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
