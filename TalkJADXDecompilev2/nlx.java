package defpackage;

public final class nlx extends nyx<nlx> {
    public Long a;
    public Long b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nlx() {
        d();
    }

    private nlx d() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.c(1, this.a.longValue());
        }
        if (this.b != null) {
            nyu.c(2, this.b.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.longValue();
            b += nyu.h(1) + 8;
        }
        if (this.b == null) {
            return b;
        }
        this.b.longValue();
        return b + (nyu.h(2) + 8);
    }

    private nlx b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.a = Long.valueOf(nyt.g());
                    continue;
                case wi.dK /*17*/:
                    this.b = Long.valueOf(nyt.g());
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
