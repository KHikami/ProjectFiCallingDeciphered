package p000;

public final class mxv extends nyx<mxv> {
    public Long f29100a;
    public Long f29101b;

    public /* synthetic */ nzf m33738a(nyt nyt) {
        return m33737b(nyt);
    }

    public mxv() {
        this.f29100a = null;
        this.f29101b = null;
        this.cachedSize = -1;
    }

    public void m33739a(nyu nyu) {
        if (this.f29100a != null) {
            nyu.m37181b(1, this.f29100a.longValue());
        }
        if (this.f29101b != null) {
            nyu.m37181b(2, this.f29101b.longValue());
        }
        super.a(nyu);
    }

    protected int m33740b() {
        int b = super.b();
        if (this.f29100a != null) {
            b += nyu.m37148f(1, this.f29100a.longValue());
        }
        if (this.f29101b != null) {
            return b + nyu.m37148f(2, this.f29101b.longValue());
        }
        return b;
    }

    private mxv m33737b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29100a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f29101b = Long.valueOf(nyt.m37110e());
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
