package p000;

public final class oom extends nyx<oom> {
    public Long f33411a;

    public /* synthetic */ nzf m38924a(nyt nyt) {
        return m38923b(nyt);
    }

    public oom() {
        this.f33411a = null;
        this.cachedSize = -1;
    }

    public void m38925a(nyu nyu) {
        if (this.f33411a != null) {
            nyu.m37181b(1, this.f33411a.longValue());
        }
        super.a(nyu);
    }

    protected int m38926b() {
        int b = super.b();
        if (this.f33411a != null) {
            return b + nyu.m37148f(1, this.f33411a.longValue());
        }
        return b;
    }

    private oom m38923b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33411a = Long.valueOf(nyt.m37110e());
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
