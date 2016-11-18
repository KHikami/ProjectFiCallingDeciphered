package p000;

public final class ohb extends nyx<ohb> {
    public Integer f32812a;
    public String f32813b;
    public String f32814c;
    public String f32815d;
    public String f32816e;

    public /* synthetic */ nzf m38314a(nyt nyt) {
        return m38313b(nyt);
    }

    public ohb() {
        this.f32812a = null;
        this.f32813b = null;
        this.f32814c = null;
        this.f32815d = null;
        this.f32816e = null;
        this.cachedSize = -1;
    }

    public void m38315a(nyu nyu) {
        if (this.f32812a != null) {
            nyu.m37180b(1, this.f32812a.intValue());
        }
        if (this.f32813b != null) {
            nyu.m37170a(2, this.f32813b);
        }
        if (this.f32814c != null) {
            nyu.m37170a(3, this.f32814c);
        }
        if (this.f32815d != null) {
            nyu.m37170a(4, this.f32815d);
        }
        if (this.f32816e != null) {
            nyu.m37170a(5, this.f32816e);
        }
        super.a(nyu);
    }

    protected int m38316b() {
        int b = super.b();
        if (this.f32812a != null) {
            this.f32812a.intValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f32813b != null) {
            b += nyu.m37137b(2, this.f32813b);
        }
        if (this.f32814c != null) {
            b += nyu.m37137b(3, this.f32814c);
        }
        if (this.f32815d != null) {
            b += nyu.m37137b(4, this.f32815d);
        }
        if (this.f32816e != null) {
            return b + nyu.m37137b(5, this.f32816e);
        }
        return b;
    }

    private ohb m38313b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f32812a = Integer.valueOf(nyt.m37115h());
                    continue;
                case wi.dH /*18*/:
                    this.f32813b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32814c = nyt.m37117j();
                    continue;
                case 34:
                    this.f32815d = nyt.m37117j();
                    continue;
                case 42:
                    this.f32816e = nyt.m37117j();
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
