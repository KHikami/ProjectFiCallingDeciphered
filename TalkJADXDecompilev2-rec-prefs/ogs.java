package p000;

public final class ogs extends nyx<ogs> {
    public String f32751a;
    public String f32752b;
    public Long f32753c;

    public /* synthetic */ nzf m38230a(nyt nyt) {
        return m38229b(nyt);
    }

    public ogs() {
        this.f32751a = null;
        this.f32752b = null;
        this.f32753c = null;
        this.cachedSize = -1;
    }

    public void m38231a(nyu nyu) {
        if (this.f32751a != null) {
            nyu.m37170a(1, this.f32751a);
        }
        if (this.f32752b != null) {
            nyu.m37170a(2, this.f32752b);
        }
        if (this.f32753c != null) {
            nyu.m37181b(3, this.f32753c.longValue());
        }
        super.a(nyu);
    }

    protected int m38232b() {
        int b = super.b();
        if (this.f32751a != null) {
            b += nyu.m37137b(1, this.f32751a);
        }
        if (this.f32752b != null) {
            b += nyu.m37137b(2, this.f32752b);
        }
        if (this.f32753c != null) {
            return b + nyu.m37148f(3, this.f32753c.longValue());
        }
        return b;
    }

    private ogs m38229b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32751a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32752b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f32753c = Long.valueOf(nyt.m37110e());
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
